import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        s.pop();
    }
    
}
