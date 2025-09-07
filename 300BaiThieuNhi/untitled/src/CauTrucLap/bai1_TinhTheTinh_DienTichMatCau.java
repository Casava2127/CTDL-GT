package CauTrucLap;

import java.util.Scanner;

public class bai1_TinhTheTinh_DienTichMatCau {

    // Tính bán kính từ diện tích mặt cầu
    public static double tinhBanKinh(double dienTich) {
        return Math.sqrt(dienTich / (4 * Math.PI));
    }

    // Tính thể tích từ diện tích mặt cầu
    public static double tinhTheTich(double dienTich) {
        double r = tinhBanKinh(dienTich);
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập diện tích S: ");
        double dienTich = sc.nextDouble();

        double theTich = tinhTheTich(dienTich);
        System.out.printf("Thể tích V: %.6f%n", theTich);

        sc.close();
    }
}
