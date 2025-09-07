package CauTrucLap;

import java.util.Scanner;

public class Bai10_SinString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("SIN (0 de thoat) :");
            String input = sc.nextLine();
            if(input.equals("0")){
                System.out.print("Thoat chuong trinh.");
                break;
            }

            // chuyen chuoi thanh mang ky tu
            char[] digits = input.toCharArray();
            int len = digits.length;
            if(len != 9){
                System.out.println("So khong hop le. Vui long nhap so co 9 chu so.");
                continue;
            }
            int chekDigit = Character.getNumericValue(digits[len -1]); // ? tim hieu ve phuong thuc nay
            int sumChan = 0 , sumLe = 0;

            for(int i = len -2, position = 1; i >=0; i--, position++){
                int digit = Character.getNumericValue(digits[i]);
                if (position % 2 == 1) {
                    int doubled = digit*2;
                    if(doubled > 9){
                        doubled = (doubled/10) + (doubled%10);
                    } sumChan += doubled;
                }else {
                    sumLe += digit;
                }
            }
            int total = chekDigit + sumChan + sumLe;
            if(total % 10 == 0){
                System.out.println("So hop le");
            } else {
                System.out.println("So khong hop le");
            }
        }

    }
}
// dung String de luu so dau vao
// khong bi gioi han bo nho nhu long hay int
// tach chu so bang cach chuyen chuoi thanh mang ky tu
//de kiem tra dau vao co dung 9 chu so hay khong
// tach chu so bang Character.getNumericValue()
// vi tri chan cua so goc = vi tri le cua mang
//chuyen doi chuoi cham hon so voi notArrr