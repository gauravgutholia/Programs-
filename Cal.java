import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        float first = reader.nextFloat();
        float second = reader.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        float result;

        switch(operator)
        {
            case '+':
                result = first + second;
                System.out.println(result);
                break;

            case '-':
                result = first - second;
                System.out.println(result);
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}