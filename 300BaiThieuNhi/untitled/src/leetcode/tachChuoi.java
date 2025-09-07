package leetcode;
import leetcode.hamUocNguyenTo.*;
import java.util.List;

public class tachChuoi {
    public static void main(String[] args) {
        String s = "ababab";
        int n = s.length();

        List<Integer> us = hamUocNguyenTo.tachUocSo(n);
        System.out.println("Các ước số của " + n + " là: " + us);

        boolean found = false;

        // duyệt qua tất cả ước số (trừ 1 và n)
        for (int u : us) {
            if (u == n) continue;  // bỏ qua ước số bằng chính độ dài
            if (u == 1) continue;  // bỏ qua 1 vì sub.length=1 thường chỉ hợp nếu chuỗi toàn ký tự lặp giống nhau

            String sub = s.substring(0, u);   // lấy chuỗi con đầu tiên có độ dài u
            StringBuilder temp = new StringBuilder();

            for (int j = 0; j < n / u; j++) {
                temp.append(sub);
            }

            if (temp.toString().equals(s)) {
                System.out.println("✅ Chuỗi con có thể sinh ra chuỗi theo quy luật: " + sub);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Không có chuỗi con nào có thể sinh ra chuỗi theo quy luật");
        }
    }
}
