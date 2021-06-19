package bailuyentapthuchanh;

import java.util.Scanner;

public class GiaiPTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();
        

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        }else if(b==0){
            System.out.println("phuong trinh vo so nghiem");
        }else {
            System.out.println("phuong trinh vo nghiem");
        }


    }
}
