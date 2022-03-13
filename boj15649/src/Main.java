import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n,m;
    static boolean[] visit;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new boolean[n+1];
        arr = new int[m];
        func(0);
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void func(int k) throws IOException{
        if(k==m){
            for(int i=0; i<m; i++){
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i=1; i<=n; i++){
            if(!visit[i]){
                arr[k]=i;
                visit[i]=true;
                func(k+1);
                visit[i]=false;
            }
            

        }
    }
}
