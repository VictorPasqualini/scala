// Read values of another integer, double, and string variables
// Note use scala.io.StdIn to read from stdin
// Print the sum of both the integer variables
// Print the sum of both the double variables
// Concatenate and print the string variables
// The 's' variable above should be printed first.

object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

        val i2 = scala.io.StdIn.readInt()
        val d2 = scala.io.StdIn.readDouble()
        val s2 = scala.io.StdIn.readLine()

        print(i + i2 + "\n")
        print(d + d2 + "\n")
        print(s + s2)
    }
}