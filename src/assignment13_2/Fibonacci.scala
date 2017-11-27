//package declaration
package assignment13_2

//importing scanner class for taking user input
import java.util.Scanner;

//scala object declaration
object Fibonacci 
{
  //Fibonacci Series Using Recursion
  def fibo_recursion(N :Int) :Int = 
   { 
  
     if(N==0) return 0 
  
     else if(N==1) return 1
  
     else return (fibo_recursion(N-1) + fibo_recursion(N-2))
   }//end of  fibo_recursion function definition
  
  //Fibonacci Series Using Standard Method
  def fibo_standard(N: Int): Int =
   {
          var a = 0
          var b = 1
          if( N == 0) a
          else 
          {
            for(i <- 2 to N) 
            {
             val c = a + b
             a = b
             b = c
            }
             b
          }          
   }//end of fibo_standard for loop function definition
}
  
  object main{
   def main(args: Array[String]) = 
   {
     println(" -----------FIBONACCI SERIES-------------")   
     println("Enter the Nth digit in the sequence")  
     var input = scala.io.StdIn.readInt()     
     println("Fibonnaci Series Using Recursion Output:")
     var First_num = Fibonacci.fibo_recursion(input)
     println(First_num)     
     println("Fibonacci Series Using Standard For Loop Output")  
     var Second_num = Fibonacci.fibo_standard(input)
      println(Second_num)   
    }
  }

