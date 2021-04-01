package greedy_maxnumber;

import java.util.Scanner;

public class maxnumber {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String input[] = sc.nextLine().split(" ");
        final int n = Integer.parseInt(input[0]);
        final int m = Integer.parseInt(input[1]);
        final int k = Integer.parseInt(input[2]);

        Integer arr[] = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int min = 10000, index = 0;

            for(int j = i; j < n; j++){
                if(min >= arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        int sum = 0;
        int cnt1 = 0, cnt2 = 0;

        for(int i = 0; i < m; i++){
            if(cnt1 != 3){
                sum += arr[n-1];
                cnt1++;
                cnt2 = 0;
            }
            else if(cnt2 != 3){
                sum += arr[n-2];
                cnt2++;
                cnt1 = 0;
            }
            else{
                cnt1 = 0; cnt2 = 0;
            }

        }

        System.out.println(sum);

    }
}
