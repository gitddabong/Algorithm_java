package greedy_forthe1;
import java.util.Scanner;

public class forthe1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        int cnt = 0;
        while(true){
            if(n % k != 0){
                n -= 1;
            }
            else if(n % k == 0){
                n /= k;
            }

            cnt++;

            if(n == 1){
                break;
            }
        }

        System.out.println(cnt);

    }
}
