import java.util.*;
public class HarsadNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int sum = 0;
        int temp = a;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if(a%sum == 0){
            System.out.println("is Harsad Number");
        }
        else{
            System.out.println("not a Harsad number");
        }
    }
}

