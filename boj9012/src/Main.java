import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            boolean b = false;
            
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);

                if(c == '('){
                    s.push(c);
                }
                else if(c == ')'){
                    if(!s.empty()){
                        s.pop();
                        b = true;
                    }
                    else{
                        if(s.empty()){
                            b = false;
                            break;
                        }
                        else{
                            break;
                        }
                    }
                }
                
            }
            if(s.empty()&&b){
                System.out.print("YES\n");
            }
            else{
                System.out.print("NO\n");
            }
            s.clear();
            b=false;
        }

        br.close();
    }
}
