package CauTrucLap;

import java.util.Scanner;

public class Bai10_SinArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("SIN (0 de thoat) : ");
            int n = sc.nextInt();
            if(n == 0){
                System.out.print("Thoat chuong trinh.");
                break;
            }
            // tach cac chu so vao mang , a0 la so dau tien
            int []arr = new int[9];
            int temp = n;
            for(int i = 0; i < 9; i++){
                arr[i] = temp%10;
                temp = temp/10;
            }

            int checkDigit = arr[0];
            int sumChan = 0, sumLe = 0;

//           // tinh s1, s2
            for(int i = 1; i < 9; i++){
                int digit = arr[i];
                if(i%2 == 1) { // vi tri chan cua so goc = vi tri le cua mang
                    int  doubled = digit * 2;
                    if(doubled > 9){
                        doubled = (doubled/10) + (doubled%10);
                    }
                    sumChan += doubled;
                }else {
                    sumLe += digit;
                }
            }
            int total = checkDigit + sumChan + sumLe;
            if(total % 10 == 0){
                System.out.println("So hop le");
            } else {
                System.out.println("So khong hop le");
            }
        }
    }
}
