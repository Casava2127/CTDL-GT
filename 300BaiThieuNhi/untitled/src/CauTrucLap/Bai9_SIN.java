//package CauTrucLap;
//
//import java.util.Scanner;
//
//public class Bai9_SIN {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[9];
//        int sumChan = 0, sumLe = 0;
//
//        System.out.println("Nhap so nguyen: ");
//        int n = sc.nextInt();
//
//        int dem = 0;
//        while(n != 0){
//            arr[dem] = n % 10;
//            n = n / 10;
//            dem++;
//        }
//        System.out.println(arr[0]);
//
//        int trongSo = arr[0]; // chữ số cuối
//        for(int i = 1; i <= 8; i++){
//            if(i % 2 == 0){
//                int temp = arr[i-1] * 2;
//                if(temp > 9){
//                    temp = (int)temp / 10 + temp % 10;
//                }
//                sumChan += temp;
//            } else {
//                sumLe += arr[8-i+1];
//            }
//        }
//        System.out.println("C"+sumChan+"L"+sumLe+"T"+trongSo);
//
//        int tong = trongSo + sumChan + sumLe;
//        if(tong % 10 == 0){
//            System.out.println("So hop le");
//        } else {
//            System.out.println("So khong hop le");
//        }
//    }
//}


package CauTrucLap;

import java.util.Scanner;

public class Bai9_SIN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("SIN (0 de thoat): ");
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Thoat chuong trinh.");
                break;
            }

            // Tách các chữ số vào mảng, arr[0] = chữ số cuối (check digit)
            int[] arr = new int[9];
            int tempN = n;
            for (int i = 0; i < 9; i++) {
                arr[i] = tempN % 10;
                tempN /= 10;
            }

            int checkDigit = arr[0];
            int sumOdd = 0;   // tổng các chữ số vị trí lẻ (không tính check digit)
            int sumEven = 0;  // tổng các chữ số vị trí chẵn *2, nếu >9 thì cộng các chữ số

            // Tính s1 và s2
            for (int i = 1; i < 9; i++) {
                int digit = arr[i];
                if (i % 2 == 1) { // vị trí lẻ (từ phải sang trái, bỏ check digit)
                    sumOdd += digit;
                } else { // vị trí chẵn
                    int doubled = digit * 2;
                    if (doubled > 9) {
                        doubled = (doubled / 10) + (doubled % 10);
                    }
                    sumEven += doubled;
                }
            }

            int totalWeight = sumOdd + sumEven;
            int totalWithCheck = totalWeight + checkDigit;

            // In chi tiết
            System.out.println("s1 (tong vi tri le): " + sumOdd);
            System.out.println("s2 (tong vi tri chan nhan doi): " + sumEven);
            System.out.println("Trọng số s1 + s2: " + totalWeight);
            System.out.println("Tổng trọng số + check digit: " + totalWithCheck);

            if (totalWithCheck % 10 == 0) {
                System.out.println("SIN hop le!");
            } else {
                System.out.println("SIN khong hop le!");
            }

            System.out.println("---------------------------------");
        }

        sc.close();
    }
}

