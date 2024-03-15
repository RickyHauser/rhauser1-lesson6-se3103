package view.statePattern;

import java.awt.Graphics2D;

import controller.App;
import model.Marking;
import view.AppWindow;

public class GameStatePlaying implements GameState {

    @Override
    public void goNext(AppWindow context) {
        context.setGameState(new GameStateDone());
    }

    @Override
    public void updateWindow() {
        App.win.newGameButton.setEnabled(false);
        App.win.vsHumanButton.setEnabled(false);
        App.win.vsComputerButton.setEnabled(false);
        for (int i = 0; i < App.game.getBoard().length; i++){
            App.win.markingButtons[i].setEnabled(App.game.getBoard()[i] == Marking.U);
        }
        App.win.canvas.repaint();

        
    }

    @Override
    public void updateCanvas(Graphics2D g2) {
        
    }
    
}
