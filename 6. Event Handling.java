import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("            Simple Calculator");
        System.out.println("-----------------------------------");

        System.out.print("First Number : ");
        double num1 = sc.nextDouble();

        System.out.print("Second Number : ");
        double num2 = sc.nextDouble();

        System.out.print("Click : ");
        String operation = sc.next();

        switch (operation) {
            case "Add":
                System.out.println("Result : " + (num1 + num2));
                break;

            case "Sub":
                System.out.println("Result : " + (num1 - num2));
                break;

            case "Mul":
                System.out.println("Result : " + (num1 * num2));
                break;

            case "Divide":
                if (num2 == 0)
                    System.out.println("Result : Cannot divide by zero");
                else
                    System.out.println("Result : " + (num1 / num2));
                break;

            default:
                System.out.println("Result : Invalid operation");
        }

        sc.close();
    }
}
