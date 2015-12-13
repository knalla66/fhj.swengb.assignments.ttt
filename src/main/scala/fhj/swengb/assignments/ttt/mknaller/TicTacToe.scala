package fhj.swengb.assignments.ttt.mknaller

import fhj.swengb.assignments.ttt.mknaller

import scala.collection.Set

/**
  * models the different moves the game allows
  *
  * each move is made by either player a or player b.
  */
sealed trait TMove {
  def idx: Int
}

case object TopLeft extends TMove {
  override def idx: Int = 0
}

case object TopCenter extends TMove {
  override def idx: Int = 1
}

case object TopRight extends TMove {
  override def idx: Int = 2
}

case object MiddleLeft extends TMove {
  override def idx: Int = 3
}

case object MiddleCenter extends TMove {
  override def idx: Int = 4
}

case object MiddleRight extends TMove {
  override def idx: Int = 5
}

case object BottomLeft extends TMove {
  override def idx: Int = 6
}

case object BottomCenter extends TMove {
  override def idx: Int = 7
}

case object BottomRight extends TMove {
  override def idx: Int = 8
}


/**
  * for a tic tac toe game, there are two players, player A and player B
  */
sealed trait Player

case object PlayerA extends Player

case object PlayerB extends Player

object TicTacToe {

  /**
    * creates an empty tic tac toe game
    * @return
    */
  def apply(): TicTacToe = TicTacToe()

  /**
    * For a given tic tac toe game, this function applies all moves to the game.
    * The first element of the sequence is also the first move.
    *
    * @param t
    * @param moves
    * @return
    */
  def play(t: TicTacToe, moves: Seq[TMove]): TicTacToe = ???

  /**
    * creates all possible games.
    * @return
    */
  def mkGames(): Map[Seq[TMove], TicTacToe] = ???

}

/**
  * Models the well known tic tac toe game.
  *
  * The map holds the information which player controls which field.
  *
  * The nextplayer parameter defines which player makes the next move.
  */
case class TicTacToe(moveHistory: Map[TMove, Player],
                     nextPlayer: Player = PlayerA) {

  /**
    * outputs a representation of the tic tac toe like this:
    *
    * |---|---|---|
    * | x | o | x |
    * |---|---|---|
    * | o | x | x |
    * |---|---|---|
    * | x | o | o |
    * |---|---|---|
    *
    *
    * @return
    */
  def asString(): String = {

    val topl = if (moveHistory.contains(TopLeft) && nextPlayer == PlayerA)  "x"  else " "
    val topc = if (moveHistory.contains(TopCenter) && nextPlayer == PlayerA)  "x"  else " "
    val topr = if (moveHistory.contains(TopRight) && nextPlayer == PlayerA)  "x"  else " "
    val midl = if (moveHistory.contains(MiddleLeft) && nextPlayer == PlayerA)  "x"  else " "
    val midc = if (moveHistory.contains(MiddleCenter) && nextPlayer == PlayerA)  "x"  else " "
    val midr = if (moveHistory.contains(MiddleRight) && nextPlayer == PlayerA)  "x"  else " "
    val botl = if (moveHistory.contains(BottomLeft) && nextPlayer == PlayerA)  "x"  else " "
    val botc = if (moveHistory.contains(BottomCenter) && nextPlayer == PlayerA)  "x"  else " "
    val botr = if (moveHistory.contains(BottomRight) && nextPlayer == PlayerA)  "x"  else " "


    "|---|---|---|\n"+ "| "+topl+" | "+topc+" | "+topr+" |\n|---|---|---|\n"+ "| "+midl+" | "+midc+" | "+midr+" |\n|---|---|---|\n"+ "| "+botl+" | "+botc+" | "+botr+" |\n|---|---|---|"

  }


  /**
    * is true if the game is over.
    *
    * The game is over if either of a player wins or there is a draw.
    */
//  val gameOver : Boolean = ???

  /**
    * the moves which are still to be played on this tic tac toe.
    */
  val remainingMoves: Set[TMove] = Set(TopLeft, TopCenter, TopRight, MiddleLeft, MiddleCenter, MiddleRight, BottomLeft, BottomCenter, BottomRight)
  // alle die nicht mehr gebraucht werden können dann ja immer gedroppt werden.

  /**
    * given a tic tac toe game, this function returns all
    * games which can be derived by making the next turn. that means one of the
    * possible turns is taken and added to the set.
    */
  lazy val nextGames: Set[TicTacToe] = ???

  /**
    * Either there is no winner, or PlayerA or PlayerB won the game.
    *
    * The set of moves contains all moves which contributed to the result.
    */
  def winner: Option[(Player, Set[TMove])] = ???

  /**
    * returns a copy of the current game, but with the move applied to the tic tac toe game.
    *
    * @param move to be played
    * @param player the player
    * @return
    */
  def turn(p: TMove, player: Player): TicTacToe = ???

}


