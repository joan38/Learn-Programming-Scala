import scala.io.StdIn

object Game {
  def displayGame(subject: String, words: Map[String, Int], found: Array[String]) = {
    // Use ANSI escape codes:
    // print("\033[H\033[2J");
    // * 'H' means move to top of the screen
    // * '2J' means "clear entire screen"
    print("\033[H\033[2J")
    println("=====================================")
    println("================ 94% ================")
    println("=====================================")
    println
    println("Subject: " + subject)
    for (wordAndPercentage: (String, Int) <- words) {
      val word = wordAndPercentage._1
      val percentage = wordAndPercentage._2
      val display =
        if (found.contains(word)) "[" + word + " " + percentage + "%]"
        else "[ " + percentage + "% ]"
      println(display)
    }
  }

  def main(args: Array[String]): Unit = {
    val words = Map(
      "Mercedes" -> 30,
      "BMW" -> 30,
      "Renault" -> 20,
      "Citroen" -> 20
    )

    var found = Array.empty[String]

    while (found.size != words.size) {
      displayGame("Car brands", words, found)
      println("Suggest a word: ")
      val suggestedWord = StdIn.readLine()

      found =
        if (words.contains(suggestedWord)) found :+ suggestedWord
        else found
    }

    println
    println("You win!")
  }
}
