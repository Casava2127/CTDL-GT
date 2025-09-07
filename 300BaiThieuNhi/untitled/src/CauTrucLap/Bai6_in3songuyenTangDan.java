package CauTrucLap;

import java.util.Scanner;

public class Bai6_in3songuyenTangDan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 so nguyen: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp;

        if(a > b){
            temp = a; a = b; b = temp;
        }
        if(b > c){
            temp = b; b = c; c = temp;
        }
        if(a > b){  // phải so lại a và b
            temp = a; a = b; b = temp;
        }
        // so a va b -> so lon dua lui 1 vi tri
        // so b va c thi so lon dua lui 1 vị tri
        // -> so lon nhat da o cuoi cung
        // so a va b lai lan nua

        System.out.println("3 so nguyen tang dan la: " + a + " " + b + " " + c);
    }
}
