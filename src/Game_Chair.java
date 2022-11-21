import java.util.Scanner;

public class Game_Chair {
    public Player computer = new Player();
    public Player player2 = new Player();
    private boolean user_selected = true;
    public void start(){
        int counter = 5;
        computer.Play();
        Scanner in = new Scanner(System.in);
        String input;
        while(user_selected){
            player2.Play();
            counter--;
            System.out.println(player2.getCurrentCard());
            if(counter == 0){
                in.close();
                break;
            }
            System.out.println("another try?");
            input = in.next();
            if(input.equals("no")){
                in.close();
                user_selected = false;
            } else if (input.equals("yes")){
                user_selected = true; //unnecessary
            }
        }


    }
    public void FindWinner (Player computer, Player player2){
        if(computer.getCurrentCard() == player2.getCurrentCard()){
            System.out.println("draw");
        } else if (computer.getCurrentCard() > player2.getCurrentCard()){
            System.out.println("you lost");
        } else if (computer.getCurrentCard() < player2.getCurrentCard()){
            System.out.println("you won");
        }
    }
}
