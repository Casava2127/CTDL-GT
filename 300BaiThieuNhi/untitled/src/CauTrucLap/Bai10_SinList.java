package CauTrucLap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10_SinList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("SIN (0 de thoat) : ");
            long n = sc.nextLong();
            if(n == 0) {
                System.out.print("Thoat chuong trinh.");
                break;
            }

            //luu so vao ArrayList
            List<Integer> digits = new ArrayList<>();
            while(n > 0){
                digits.add((int)(n % 10));
                n /= 10;
            }
            int checkDigit = digits.get(0);
            int sumChan = 0, sumLe = 0;
            for( int i = 1; i < digits.size(); i++){
                int digit = digits.get(i);
                if (i % 2 == 1) {
                    int doubled = digit * 2;
                    if(doubled > 9){
                        doubled = (doubled/10) + (doubled%10);
                    }
                    sumChan += doubled;
                } else {
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
//Ưu điểm:
//
//Linh hoạt với số có độ dài bất kỳ.
//Không cần xác định kích thước mảng trước.
//
//Nhược điểm:
//
//Chi phí bộ nhớ và hiệu suất thấp hơn so với mảng hoặc xử lý trực tiếp.