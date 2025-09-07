package CauTrucLap;

public class Bai10_Generalized {
    //Hàm validateLuhn có thể tái sử dụng cho bất kỳ chuỗi số nào.
    //Tham số doubleOddPositions cho phép tùy chỉnh vị trí nhân đôi (lẻ hoặc chẵn).
    public static boolean validateLuhn(String numbers, boolean doubleOddPositions) {
        char[] digits = numbers.toCharArray();
        int len = digits.length;
        int checDigit = Character.getNumericValue(digits[len - 1]);
        int sumChan = 0, sumLe = 0;

        for (int i = len - 2, position = 1; i >= 0; i--, position++) {
            int digit = Character.getNumericValue(digits[i]);
            if ((position % 2 == 1) == doubleOddPositions) {
                int doubled = digit * 2;
                if (doubled > 9) {
                    doubled = (doubled / 10) + (doubled % 10);
                }
                sumChan += doubled;
            } else {
                sumLe += digit;
            }
        }
        int total = checDigit + sumChan + sumLe;
        return total % 10 == 0;
    }
   public static void main(String args[]){
       String sin = "193456782"; // example SIN
       String creditCard = "4532015112830366"; // example credit card number

       boolean isSinValid = validateLuhn(sin, true); // double odd positions for SIN
       boolean isCreditCardValid = validateLuhn(creditCard, false); // double even positions for credit card

       System.out.println("SIN " + sin + " is valid: " + isSinValid);
       System.out.println("Credit Card " + creditCard + " is valid: " + isCreditCardValid);
   }
}
