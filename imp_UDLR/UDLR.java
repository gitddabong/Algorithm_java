package imp_UDLR;
import java.util.Scanner;

public class UDLR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int row = 1, column = 1;
        
        while(true){
            String move = sc.next();
            if(move.equals("E")){
                break;
            }
            
            if(move.equals("L")){ 
                 if(column - 1 < 1){
                     continue;
                 }
                 column--;

            } else if(move.equals("R")){
                if(column + 1 > n){
                    continue;
                }
                column++;

            } else if(move.equals("U")){
                if(row - 1 < 1){
                    continue;
                }
                row--;

            } else if(move.equals("D")){
                if(row + 1 > n){
                    continue;
                }
                row++;

            }

        }
        
        System.out.println(row + " " + column);



    }
    
}
