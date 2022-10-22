import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Wciscnik enter");
        String ro=sc.nextLine();

     String roling=   Dice.rool();
        System.out.println(roling);
    }
}
