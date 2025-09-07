package CauTrucLap;

public class ToaDoXY {
    protected double x;
    protected double y;
    // Constructor
    public  ToaDoXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public ToaDoXY(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return (int) y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }


    public static double tinhKhoangCach(ToaDoXY a, ToaDoXY b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }
    public static ToaDoXY trungDiem(ToaDoXY a, ToaDoXY b) {
        return new ToaDoXY((a.x + b.x) / 2, (a.y + b.y) / 2);
    }
    public static double doDoc(ToaDoXY a, ToaDoXY b){
        if (b.x - a.x == 0){
            return Double.POSITIVE_INFINITY; // Trả về vô cực nếu đường thẳng đứng
        }else{
            return (b.y - a.y) / (b.x - a.x); // Tính độ dốc
        }
    }
}
