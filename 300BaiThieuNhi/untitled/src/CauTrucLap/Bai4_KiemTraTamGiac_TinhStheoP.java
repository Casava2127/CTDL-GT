package CauTrucLap;

public class Bai4_KiemTraTamGiac_TinhStheoP {
    public static  void main(String[] args){
        ToaDoXY A = new ToaDoXY(0,0);
        ToaDoXY B = new ToaDoXY(4,0);
        ToaDoXY C = new ToaDoXY(0,3);
        double AB = ToaDoXY.tinhKhoangCach(A,B);
        double BC = ToaDoXY.tinhKhoangCach(B,C);
        double CA = ToaDoXY.tinhKhoangCach(C,A);
        if (AB + BC > CA && AB + CA > BC && BC + CA > AB){
            System.out.println("Ba điểm tạo thành tam giác");
            double p = (AB + BC + CA)/2;
            double S = Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
            System.out.println("Diện tích tam giác là: " + S);
        } else {
            System.out.println("Ba điểm không tạo thành tam giác");
        }
    }
}
