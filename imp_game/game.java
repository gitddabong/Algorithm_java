package imp_game;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), column = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt(), look = sc.nextInt();

        int map[][] = new int[row][column];
        int dest_x = 0, dest_y = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                map[i][j] = sc.nextInt();
            }
        }

        int cnt = 1;   //직접 밟은 타일의 개수
        int walked = 0;    //방향 전환을 몇번 했는지 저장

        while(true){
            if(walked == 4){
                int back_x = 0, back_y = 0;
                if(look%4 == 0){
                    dest_x = x;
                    dest_y = y+1;
                } else if(look%4 == 1){
                    dest_x = x-1;
                    dest_y = y;
                } else if(look%4 == 2){
                    dest_x = x;
                    dest_y = y-1;
                } else if(look%4 == 3){
                    dest_x = x+1;
                    dest_y = y;
                }
                
                if(map[back_y][back_x] != 0){
                    break;
                }

            }

            if(look%4 == 0){
                dest_x = x-1;
                dest_y = y;
            } else if(look%4 == 1){
                dest_x = x;
                dest_y = y-1;
            } else if(look%4 == 2){
                dest_x = x+1;
                dest_y = y;
            } else if(look%4 == 3){
                dest_x = x;
                dest_y = y+1;
            }

            //갈 수 없는 지형
            if(map[dest_y][dest_x] != 0){
                walked++;
                look = look + 3;
            } else{ //갈 수 있는 지형
                map[y][x] = 2;
                x = dest_x;
                y = dest_y;
                cnt++;
                walked = 0;
            }

        }

        System.out.println(cnt);
        

    }
    
}
