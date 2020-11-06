import java.util.Scanner;

    public class Opgave1 {
        public static void main(String[] args) {


            for (int i = 0; i < 120;i++) {
                System.out.println("Enter your score ");
                Scanner input = new Scanner(System.in);
                int x = input.nextInt();

                if (x >= 60) System.out.println("You pass the exam");
                else System.out.println("you don't pass the exam");

            }}}
