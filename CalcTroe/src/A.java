import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
     boolean error=true;
     double a=0;
     double b=0;
     String operator=null;

          do {
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("podaj cyfre 1");
             a = sc.nextDouble();
            System.out.println("podaj cyfre 2");
             b = sc.nextDouble();
            System.out.println("znak");
             operator = sc.next();
             error=false;
        }catch (InputMismatchException e){
            System.out.println("podano bledna dane");
        }

        }  while (error);


        try {
            double sum = Calc.calc(a, b, operator);
            System.out.println(sum);

        }catch (ArithmeticException |UnknownOperatorException e ){
            System.out.println(e.getMessage());
        }


    }
}
