package fhj.swengb.assignments.ttt.mknaller

import java.net.URL
import java.util.ResourceBundle
import javafx.application.Application
import javafx.fxml.{FXML, FXMLLoader, Initializable}
import javafx.scene.control.{Hyperlink, Label, Button}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

/**
  * Implement here your TicTacToe JavaFX App.
  */


object TicTacToeApp {

  def main (args: Array[String]){

    //Application.launch(classOf[TicTacToeApp], args: _*)

  }



}


abstract class TicTacToeApp extends Application {

  val Fxml = "/fhj/swengb/assignments/ttt/TicTacToeApp.fxml"
  val Css = "/fhj/swengb/assignments/ttt/TicTacToe.css"

  def FxmlLoader(fxml:String): FXMLLoader = {
    new FXMLLoader(getClass.getResource(fxml))
  }
/*
  override def start(stage: Stage): Unit =
    try {

    }
   catch {

    }
*/



class TicTacToeController extends Initializable {

  @FXML var topLeft: Button = _
  @FXML var topCenter: Button = _
  @FXML var topRight: Button = _
  @FXML var middleLeft: Button = _
  @FXML var middleCenter: Button = _
  @FXML var middleRight: Button = _
  @FXML var bottomLeft: Button = _
  @FXML var bottomCenter: Button = _
  @FXML var bottomRight: Button = _

  @FXML var gameStatus: Hyperlink = _
  @FXML var remainingMoves: Hyperlink = _
  @FXML var winnerPlayer: Hyperlink = _
  @FXML var movesNeeded: Hyperlink = _
  @FXML var winningMoves: Hyperlink = _

  @FXML var newGame: Button = _

  override def initialize(location: URL, resources: ResourceBundle): Unit = {


  }

}




