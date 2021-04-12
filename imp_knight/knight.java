package imp_knight;
import java.util.Scanner;

public class knight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String row_str = sc.next();
        int column = sc.nextInt();

        int cnt = 8;
        int row = 8;
        switch (row_str){
            case "a":
                row = 1;
                break;    
            case "b":
                row = 2;
                break;    
            case "c":
                row = 3;
                break;    
            case "d":
                row = 4;
                break;    
            case "e":
                row = 5;
                break;    
            case "f":
                row = 6;
                break;    
            case "g":
                row = 7;
                break;    
            case "h":
                row = 8;
                break;    
            default:
                break;
        }

        if(row-2 <= -1){
            cnt = cnt - 2;
        }
        if(row-2 <= 0){
            cnt = cnt - 2;
        }
        if(row+2 >= 9){
            cnt = cnt - 2;
        }
        if(row+2 >= 10){
            cnt = cnt - 2;
        }
        if(column-2 <= -1){
            cnt = cnt - 1;
        }
        if(column-2 <= 0){
            cnt = cnt - 1;
        }
        if(column+2 >= 9){
            cnt = cnt - 1;
        }
        if(column+2 >= 10){
            cnt = cnt - 1;
        }

        System.out.println(cnt);

    }
    
}
