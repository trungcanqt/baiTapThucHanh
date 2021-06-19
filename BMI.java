package bailuyentapthuchanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, BMI;
        System.out.println("nhap weight :");
        weight = scanner.nextDouble();
        System.out.println("nhap height :");
        height = scanner.nextDouble();

        BMI = weight/Math.pow(height,2);

        System.out.printf("%-20s%s", "BMI", "Interpretation\n");

        if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        else if (BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        else if (BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", BMI, "Obese");

    }
}
