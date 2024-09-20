import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int ans =0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (j + S.length() < s.length()) {
                    if (S.equals(s.substring(j, j + S.length()))) {
                        ans++;
                        break;
                    }
                } else {
                    boolean flag = true;
                    for (int k = 0; k < S.length(); k++) {
                        if (S.charAt(k) != s.charAt((j + k) % s.length())) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag){
                        ans++;
                        break;
                    }
                }

            }
        }
        System.out.println(ans);

    }
}
