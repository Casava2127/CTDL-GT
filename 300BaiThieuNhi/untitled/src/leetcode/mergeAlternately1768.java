package leetcode;

public class mergeAlternately1768 {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        //apbqcr
        //true
        System.out.println(mergeAlternately(word1, word2));
    }

    private static boolean mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j++));
            }
        }
        System.out.println(merged.toString());
        return true;
    }
}
// phan biet strign va stringbuilder
// string: immutable (ko the thay doi dc) => toan bo phai tao moi
// stringbuilder: mutable (co the thay doi dc) => ko can tao moi
// https://leetcode.com/problems/merge-strings-alternately/description/
// https://leetcode.com/problems/merge-strings-alternately/solutions/3738493/java-c-python-easy-to-understand/
// vi du String s = "abc"; // tuc la bientham chieu s tro den vung nho chua "abc"
// s = s + "d"; // tuc la ta tao ra vung nho moi chua "abcd" va bien s tro den vung nho moi
// StringBuilder sb = new StringBuilder("abc"); // tuc la bien sb tro den vung nho chua "abc"
// sb.append("d"); // tuc la ta them "d" vao vung nho hien tai chua "abcd", khong can tao vung nho moi
