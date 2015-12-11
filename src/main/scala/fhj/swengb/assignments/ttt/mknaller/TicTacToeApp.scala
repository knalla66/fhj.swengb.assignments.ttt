package fhj.swengb.assignments.ttt.mknaller

/**
  * Implement here your TicTacToe JavaFX App.
  */


object TicTacToeApp {

  def main (args: Array[String]){

    val history:Map[TMove, Player] = Map()
    println(TicTacToe.apply(history).asString())

    val shistory:Map[TMove, Player] = Map(TopLeft->PlayerA, TopRight ->PlayerB)
    println(TicTacToe.apply(shistory).asString())

    for ((m, p) <- shistory) if (p==PlayerA) println("x") else println("o")

  }


}