import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Frist Number : ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter The Operator : ");
        String operator = scanner.next();
        System.out.print("Enter The Second Number : ");
        float num2 = scanner.nextFloat();

        if (operator.equals("+")) {
            System.out.print(num1 + num2); }
        else if (operator.equals("-")) {
            System.out.print(num1 - num2); }
        else if (operator.equals("*")) {
            System.out.print(num1 * num2); }
        else if (operator.equals("/")) {
            System.out.print(num1 / num2); }
        
        else {
            System.out.print("Wrong Operactor Please Try Again!");

        scanner.close(); } } }