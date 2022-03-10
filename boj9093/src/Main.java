import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] strarr = br.readLine().split(" ");

            for(int j = 0; j < strarr.length; j++){
                bw.write(new StringBuffer(strarr[j]).reverse().toString()+" ");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
