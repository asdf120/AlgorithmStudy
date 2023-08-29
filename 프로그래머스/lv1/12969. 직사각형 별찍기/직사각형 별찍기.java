import java.util.Scanner;
import java.lang.StringBuilder;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder star = new StringBuilder();
        
        for(int i = 0; i<a; i++){
            star.append("*");
        }
        
        for(int i = 0; i<b; i++){
            System.out.println(star);    
        }

        
    }
}