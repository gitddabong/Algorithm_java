package greedy_change;

import java.util.Scanner;

public class change {

    public static void main(String[] args){
        int input, cash;
        int cnt_500 = 0, cnt_100 = 0, cnt_50 = 0, cnt_10 = 0;


        
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        cash = input; 
        

        if(cash >= 500){
            cnt_500 = cash / 500;
            cash = cash % 500;
        }
        
        if(cash >= 100){
            cnt_100 = cash / 100;
            cash = cash % 100;
        }

        if(cash >= 50){
            cnt_50 = cash / 50;
            cash = cash % 50;
        }

        if(cash >= 10){
            cnt_10 = cash / 10;
            cash = cash % 10;
        }

        System.out.println("500원 개수 : " + cnt_500);
        System.out.println("100원 개수 : " + cnt_100);
        System.out.println("50원 개수 : " + cnt_50);
        System.out.println("10원 개수 : " + cnt_10);
        System.out.println("동전의 최소 개수 : " + (cnt_500 + cnt_100 + cnt_50 + cnt_10));


    }
    
}
