package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House Holds: \n" + this.game.getHouseCards().toString());
        System.out.println("You Hold: \n" + this.game.getYourCards().toString());
    }

  @Override
    public boolean hitMe() {
        System.out.println("Would you like a hit? (y/n)");
        String input = user.nextLine();
        boolean answer = false;
        
        if (input.equals("y")){
            answer = true;
        }
        else if (input.equals("n")){
            answer = false;
        }
        else{
            System.out.println("Please enter 'y' or 'n'.");
        }
        return answer;
    }

  @Override
    public void gameOver() {
        this.display();
        int playerScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("House Score: " + houseScore);
        System.out.println("Your Score: " + playerScore);
    }

}