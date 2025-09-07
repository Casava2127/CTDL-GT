package CauTrucLap;

import java.util.Scanner;

public class Bai10_NotArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Sin (0 de thoat) :");
            long n = sc.nextLong();
            if(n == 0){
                System.out.print("Thoat chuong trinh.");
                break;
            }
            // tach chu so
            int checkDigit = (int)(n % 10);
            n = n / 10;
            int sumChan = 0, sumLe = 0;
            int position = 1; // vi tri cua chu so hien tai
            while(n > 0 && position < 9){
                int digit = (int)(n % 10);
                n /= 10;
                if(position %2 == 1){ // vi tri chan cua so goc = vi tri le cua so tach ra
                    int doubled = digit*2;
                    if(doubled > 9){
                        doubled = (doubled/10) + (doubled%10);
                    } sumChan += doubled;
                    position++;
                }else {
                    sumLe += digit;
                    position++;
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
// chi phu hop voi so co 9 chu so
// neu so co hon 9 chu so thi se khong chay duoc
// them buoc kiem tra so dau vao
// cau hoi -> vi sao dung long de luu so dau vao
