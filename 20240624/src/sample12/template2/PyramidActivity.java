package sample12.template2;


import java.util.Scanner;

public class PyramidActivity extends Activity{

    private int number = 0;
    @Override
    protected void onStart() {
        System.out.println("PyramidActivity starts.");
    }

    @Override
    protected void onStop() {
        System.out.println("PyramidActivity stops.");
    }

    @Override
    protected void onInput(String input) {
        try {
            int rows = Integer.parseInt(input);
            for (int i = 1; i <= rows; i++) {
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i; k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Input a number.");
        }
    }


}
