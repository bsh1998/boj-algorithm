import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n,m,result;
    static int[] arr,ans;
    static boolean[] visit;
    
    public static void main(String[] args) throws IOException{
        
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        arr = new int[n];
        ans = new int[n];
        visit = new boolean[n];

        str = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        backtraking(0);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void backtraking(int k){
        if(k == 3){
            int sum = 0;
            for(int i=0; i<3; i++){
                sum += ans[i];
            }
            if(sum<=m && sum>result){
                result = sum;
            }
        }

        for(int i=0; i<n; i++){
            if(!visit[i]){
                ans[k] = arr[i];
                visit[i] = true;
                backtraking(k+1);
                visit[i] = false;
            }
        }
    }
}
