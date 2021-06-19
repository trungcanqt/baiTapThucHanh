package bailuyentapthuchanh;

import java.util.Scanner;

public class TimSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so thang : ");
        int month = Integer.parseInt(scanner.nextLine());

        String dateMonth;
        switch (month){
            case 2:
                dateMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dateMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dateMonth = "30";
                break;
            default:
                dateMonth = "";
                break;
        }
        if (dateMonth != "") System.out.printf("The month '%d' has %s days!", month, dateMonth);
        else System.out.print("Invalid input!");
        }
    }

