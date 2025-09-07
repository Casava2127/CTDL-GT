package CauTrucLap;

import java.util.Scanner;

import static CauTrucLap.ToaDoXY.tinhKhoangCach;
//import static CauTrucLap.DuongThangAB.hienThiThongTin;

public class bai2_TinhKhoangCachToaDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ToaDoXY[] cacdiem = new ToaDoXY[2];
//        for (int i = 0; i < cacdiem.length; i++) {
//            System.out.print("Nhập tọa độ điểm thứ " + (i + 1) + " (x y): ");
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            cacdiem[i] = new ToaDoXY(x, y);
//        }
//        double khoangCach = tinhKhoangCach(cacdiem[0], cacdiem[1]);
//        System.out.println("Khoảng cách giữa hai điểm là: " + khoangCach);

        ToaDoXY p1 = new ToaDoXY(1, 2);
        ToaDoXY p2 = new ToaDoXY(4, 6);


        DuongThangAB dt = new DuongThangAB(p1, p2);
        dt.setA(new ToaDoXY(10,10));
        dt.heSoDuongThang();

    }
}
