package greedy_numcard;
import java.util.Scanner;

public class numcard {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
    
        int min = 10001, max = 0;
        Integer arr[] = new Integer[n];

        for(int i = 0; i < n; i++){
            min = 10001;
            for(int j = 0; j < m; j++){
                int input = sc.nextInt();
                if(min >= input){
                    min = input;
                }
            }
            arr[i] = min;
        }
        
        for(int i = 0; i < n; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);

    }


}
