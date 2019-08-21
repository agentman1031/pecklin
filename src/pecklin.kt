import java.io.File

fun main(){
    println("\nWelcome!\n")

    val lesson1 = "src/Lessons/lesson_1.txt"

    val lines: List<String> = File(lesson1).readLines()

    lines.forEach {lines -> println(lines)
       var userInput = readLine()

        println("\n")
    }
}