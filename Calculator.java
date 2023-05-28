import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        int result;

        while(operand1 != 'C' || operand2 != 'C' || operation != 'C') {
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    operand1 = result;
                    System.out.println(result);
                    operation = scanner.next().charAt(0);
                    operand2 = scanner.nextInt();
                    //break;
                case '-':
                    result = operand1 - operand2;
                    operand1 = result;
                    System.out.println(result);
                    operation = scanner.next().charAt(0);
                    operand2 = scanner.nextInt();
                    //break;
                case '*':
                    result = operand1 * operand2;
                    operand1 = result;
                    System.out.println(result);
                    operation = scanner.next().charAt(0);
                    operand2 = scanner.nextInt();
                    //break;
                case '/':
                    result = operand1 / operand2;
                    operand1 = result;
                    System.out.println(result);
                    operation = scanner.next().charAt(0);
                    operand2 = scanner.nextInt();
                    //break;
                default:
                    System.out.println("Incorrect operator!");
            }

            if(operation == 'C' || operand1 == 'C' || operand2 == 'C') {
                break;
            }
        }
    }
}
