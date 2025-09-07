package leetcode;

import java.util.ArrayList;
import java.util.List;

public class hamUocNguyenTo {
    // iin ra cac uoc so cua n
    // luu vao 1 mang roi in ra
    public static List<Integer> tachUocSo(int n){
        List<Integer> uocSo = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                uocSo.add(i);
            }
        }
        return uocSo;
    }
}
