import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            char[] input = br.readLine().toCharArray();
            LinkedList<Character> list = new LinkedList<>();
            int index = 0;
            for (char c:input){
                if (c == '-'){
                    index--;
                    index = Math.max(index, -1);
                    if (index>=0 && list.size()>0){
                        list.remove(index);
                    }
                    if (index==-1){
                        index++;
                    }
                }else if (c == '<') {
                    index--;
                    index = Math.max(index, 0);
                }else if (c == '>'){
                    index++;
                    index = Math.min(index, list.size());
                }else{
                    if (index==list.size()){
                        list.addLast(c);
                    }else if (index == 0) {
                        list.addFirst(c);                 
                    }else{
                        list.add(index,c);
                    }
                    index++;
                }
            }
            Object[] output = list.toArray();
            for (Object c:output){
                ans.append(c);
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}
