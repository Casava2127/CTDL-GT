package CauTrucLap;

public class DuongThangAB extends ToaDoXY {
    private ToaDoXY A;
    private ToaDoXY B;

    public DuongThangAB(ToaDoXY A, ToaDoXY B) {
        this.A = A;
        this.B = B;
    }
//    get- set
    public ToaDoXY getA() {
        return A;
    }
    public void setA(ToaDoXY A) {
        this.A = A;
    }
    public ToaDoXY getB() {
        return B;
    }
    public void setB(ToaDoXY B) {
        this.B = B;
    }

    public void heSoDuongThang() {
        double a = A.getY() - B.getY();
        double b = B.getX() - A.getX();
        double c = A.getX() * B.getY() - B.getX() * A.getY();

        System.out.printf("Phương trình đường thẳng: %.2fx + %.2fy + %.2f = 0\n", a, b, c);
        System.out.println("Hệ số a = " + a);
        System.out.println("Hệ số b = " + b);
        System.out.println("Hệ số c = " + c);
    }
}
