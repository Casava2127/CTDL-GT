package CauTrucLap;

import java.util.Scanner;
import java.util.Random;

public class Bai11_bdk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = {'b', 'd', 'k'}; // gọn hơn

        int yourGoal = 0;
        int computerGoal = 0;

        while (true) {
            System.out.print("Nhap ky tu (b-d-k), ky tu khac de thoat: ");
            char c = sc.next().charAt(0);

            if (c != 'b' && c != 'd' && c != 'k') {
                System.out.println("Thoat chuong trinh.");
                break;
            }

            Random rand = new Random();
            char computer = arr[rand.nextInt(3)];

            System.out.println("May: " + computer);

            if (c == computer) {
                System.out.println("Hoa nhau");
                yourGoal++;
                computerGoal++;
            } else if ((c == 'b' && computer == 'k') ||
                    (c == 'd' && computer == 'b') ||
                    (c == 'k' && computer == 'd')) {
                System.out.println("Ban thang");
                yourGoal++;
            } else {
                System.out.println("May thang");
                computerGoal++;
            }

            System.out.println("Ty so: " + yourGoal + " - " + computerGoal);
        }
    }
}
