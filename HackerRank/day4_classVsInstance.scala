class Person {
    var age: Int = 0

    def this(initialAge:Int) = {
        // Add some more code to run some checks on initialAge
        this()
        
        if (initialAge < 0) {
            this.age = 0
            println("Age is not valid, setting age to 0.")
        }
        else age = initialAge
    }        

    def amIOld(): Unit = {
       // Do some computations in here and print out the correct statement to the console 
        if (age < 13) println("You are young.")
        else if (age > 17) println("You are old.")
        else println("You are a teenager.")
    }

    def yearPasses(): Unit = {
        // Increment the age of the person in here
        age += 1
    }  
}

object Solution {
    def main(args: Array[String]) {
        var T = scala.io.StdIn.readInt()
        var i = 0

        for(i<-1 to T){        
             var age = scala.io.StdIn.readInt()
             var p = new Person(age)
             
             p.amIOld()
             
             var j=0
             for(j<-1 to 3){
                 p.yearPasses()
             }
             
             p.amIOld()
             System.out.println()
        }
    }
}