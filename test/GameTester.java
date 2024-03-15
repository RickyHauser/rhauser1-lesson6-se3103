package test;

import model.TicTacToeGame;

public class GameTester {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println(game);

        game.play(0);
        game.ChangeTurns();
        System.out.println(game);

        game.play(1);
        game.ChangeTurns();
        System.out.println(game);

        game.play(3);
        game.ChangeTurns();
        System.out.println(game);

        game.play(4);
        game.ChangeTurns();
        System.out.println(game);
        
        game.play(8);
        game.ChangeTurns();
        System.out.println(game);

        game.play(7);
        game.ChangeTurns();
        System.out.println(game);
    }
    
}
