//import java.io to input the FILE for lesson1
import java.io.File

fun main(){
    println("\nWelcome!\n")

    //Assign Lesson 1 to the lesson_1.txt file
    val lesson1 = "src/Lessons/lesson_1.txt"

    //Assign lesson1 file to a list
    val lines: List<String> = File(lesson1).readLines()

    //Print set of characters, by line
    lines.forEach {char -> println(char)

        //Collect user input
       var userInput = readLine()

      //NEEDS TO BE EDITED FOR HIGHLIGHTING ERRORS
       /*
       if (userInput != char) run {
         Change char into an "X"
         print("X")
        }
        */

        println("\n")
    }
}