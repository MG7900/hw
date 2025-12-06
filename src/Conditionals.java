import javax.swing.*;

public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();

    }//main method

    public Conditionals() {

        String question = "Is school going to get canceled next week?";
        System.out.println(question);

        int randomInt = (int) (Math.random() * 10);

        if (randomInt == 2) {
            System.out.println("heck no");
        } else if (randomInt < 6 && randomInt > 3) {
            System.out.println("The world works in mysterious ways");
        }else if (randomInt == 7) {
            System.out.println("As sure as the sun will rise tomorrow");
        }else if (randomInt == 8 || randomInt == 3) {
            System.out.println("Yes if you get an A in Bio");
        }else if (randomInt == 9) {
            System.out.println("Snap out of your dream buddy");
        }else {
            System.out.println("Whatever happens will happen");
        }

    }//constructor method

}
