import java.util.Scanner;
public class stringint {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
         int n =kb.nextInt();
         int ans = 0;
         int original_n = n;
         for(original_n =n; original_n>0;){
            int sum = original_n % 10;
        ans +=sum;
         }
    
        System.out.println(ans);
    }
}
    
        
         
