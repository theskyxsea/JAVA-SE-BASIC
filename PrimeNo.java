package Practice;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        int lower = sc1.nextInt();
        System.out.println("Enter Higher Limit");
        int higher = sc1.nextInt();
        Operation1 o2 = new Operation1();
        o2.prime(lower,higher);
    }
}
class Operation1
{
    void prime(int lower,int higher){
        for(int a = lower;a<=higher;a++){
            int sum = 0;
            for(int j=1;j<=a;j++) {
                if (a % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum==(a+1)) {
                System.out.println(a);
            }
        }
    }
}
