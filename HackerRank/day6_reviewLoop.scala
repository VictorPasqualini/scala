object Solution {
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        var T = scala.io.StdIn.readInt()
        
        for(i <- 0 until T) {
            var S = scala.io.StdIn.readLine()
            var N = S.length
            
            for(i <- 0 until N) {
                if(i == 0 || (i % 2 == 0)) print(S.charAt(i))
            }
            
            print(" ")
            
            for(i <- 1 until N) {
                if(i % 2 != 0) print(S.charAt(i))
            }
            
            System.out.println()
        }
    }
}
