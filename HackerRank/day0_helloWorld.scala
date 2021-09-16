// Read a string variable
// Print "Hello, World."
// Print the value of the string variable

object Solution {
    def main(args: Array[String]) {
        println("Hello, World.")

        val s = scala.io.StdIn.readLine()

        print(s)        
    }
}