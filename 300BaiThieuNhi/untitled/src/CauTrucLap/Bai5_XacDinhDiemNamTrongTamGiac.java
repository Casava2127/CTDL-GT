package CauTrucLap;

public class Bai5_XacDinhDiemNamTrongTamGiac {
    static double area(ToaDoXY a, ToaDoXY b, ToaDoXY c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }
    public static void main(String[] args) {
        ToaDoXY A = new ToaDoXY(0, 5);
        ToaDoXY B = new ToaDoXY(3, 0);
        ToaDoXY C = new ToaDoXY(4, 7);
        ToaDoXY P = new ToaDoXY(2, 6);

        double areaABC = area(A, B, C);
        double areaPAB = area(P, A, B);
        double areaPBC = area(P, B, C);
        double areaPCA = area(P, C, A);
        if (areaABC == 0 || areaPAB == 0 || areaPBC == 0 || areaPCA == 0) {
            System.out.println("Diem P nam tren canh tam giac ABC");
        } else if (areaABC == areaPAB + areaPBC + areaPCA) {
            System.out.println("Diem P nam trong tam giac ABC");
        } else {
            System.out.println("Diem P khong nam trong tam giac ABC");
        }
    }
}
