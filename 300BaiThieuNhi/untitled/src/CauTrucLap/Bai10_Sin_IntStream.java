package CauTrucLap;

import java.util.stream.IntStream;

public class Bai10_Sin_IntStream {
    public static boolean validateLuhnStream(String number){
        if(number == null || number.length() < 2 || !number.matches("\\d+")) {
            return false; // Invalid input
        }
        int len = number.length();
        int checkDigit = number.charAt(len -1 ) - '0';

        int sum = IntStream.range(0, len - 1)
                .map(i -> {
                    int digit = number.charAt(len - 2 - i)- '0';
                    if(i % 2 == 0){ // vi tri chan cua so goc = vi tri le cua so tach ra
                        int doubled = digit * 2;
                        return (doubled > 9) ? (doubled / 10 + doubled % 10) : doubled;
                    } else {
                        return digit;
                    }

                }).sum();
        return  (checkDigit + sum) % 10 == 0;
    }
    public static void main(String[] args) {
        System.out.println(validateLuhnStream("193456787")); // ví dụ Luhn
    }
}
