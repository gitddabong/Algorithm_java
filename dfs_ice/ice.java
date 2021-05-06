package dfs_ice;
import java.util.Scanner;

public class ice {
    static int n, m;
    static int[][] arr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];

        for(int i = 0; i < n; i++){
            String[] input = sc.next().split("");

            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(i,j)){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }

    public static boolean dfs(int x, int y){
        if(x <= -1 || x >= n || y <= -1 || y >= m){
            return false;
        }

        //방문하지 않은 경우
        if(arr[x][y] == 0){
            arr[x][y] = 1;

            dfs(x-1, y);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x, y+1);

            return true;
        }

        return false;
    }
    
}
