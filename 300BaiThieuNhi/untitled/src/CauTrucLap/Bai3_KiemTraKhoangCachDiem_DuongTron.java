package CauTrucLap;

import java.util.Scanner;

public class Bai3_KiemTraKhoangCachDiem_DuongTron {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ToaDoXY tam = new ToaDoXY();
        ToaDoXY diem = new ToaDoXY();
        System.out.println("Nhập tọa độ tâm đường tròn (x y): ");
        tam.setX(sc.nextDouble());
        tam.setY(sc.nextDouble());
        System.out.println("Nhập bán kính đường tròn: ");
        double r = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm (x y): ");
        diem.setX(sc.nextDouble());
        diem.setY(sc.nextDouble());
        double khoangCach = ToaDoXY.tinhKhoangCach(tam,diem);
        if (khoangCach > r){
            System.out.println("Điểm nằm ngoài đường tròn");
        } else if (khoangCach < r) {
            System.out.println("Điểm nằm trong đường tròn");
        } else {
            System.out.println("Điểm nằm trên đường tròn");
        }
    }
}