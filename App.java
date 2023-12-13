import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame= new JFrame("Snake Game");

        //to make frame visible
        frame.setVisible(true);

        //size of frame
        frame.setSize(boardWidth, boardHeight);

        //to display at center
        frame.setLocationRelativeTo(null);

        frame.setResizable(false);

        //program will terminate when user clicks on X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*running until here you can get a white window*/

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();

        //this will listen to key presses
        snakeGame.requestFocus();

    }
}
