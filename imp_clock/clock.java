package imp_clock;
import java.util.Scanner;

public class clock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();

        int cnt = 0;
        Integer hour = 0, min = 0, sec = 0;

        for( ; hour < 24; ){
            String str_hour = hour.toString();
            String str_min = min.toString();
            String str_sec = sec.toString();

            if(str_hour.contains(n)){
                cnt++;
            } else if(str_min.contains(n)){
                cnt++;
            } else if(str_sec.contains(n)){
                cnt++;
            }

            sec++;
            if(sec == 60){
                min++;
                sec = 0;
            }
            if(min == 60){
                hour++;
                min = 0;
            }

        }

        System.out.println(cnt);


    }
    
}
