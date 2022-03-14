import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n,result;
    static int[] arr,ans;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        ans = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        func(0);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void func(int k){
        if(k==n){
            int sum = 0;
            for(int i=0; i<n-1; i++){
                sum = Math.abs(ans[i] - ans[i+1]);
            }
            result = Math.max(result, sum);
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                ans[k] = arr[i];
                visited[i] = true;
                func(k+1);
                visited[i] = false;
            }
        }
    }
}