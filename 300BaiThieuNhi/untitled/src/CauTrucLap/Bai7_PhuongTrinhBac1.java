package CauTrucLap;

public class Bai7_PhuongTrinhBac1 {
    public static void main(String[] args) {
        int a = 2, b = 4;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = (float) -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}
