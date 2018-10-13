package prime20;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên tố cần in ra: ");
        Scanner input = new Scanner(System.in);
        int count;
        count = input.nextInt();
        int n = 0;

        for (int i =2;; i++){
            if (isPrime(i)){
                n++;
                System.out.print(i + " ");
                if (count == n){
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
