import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<>();
        String initialString = br.readLine();

        for (char c : initialString.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iterator = list.listIterator(list.size());
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            char cmd = command.charAt(0);

            if (cmd == 'P') {
                char c = command.charAt(2);
                iterator.add(c);
            } else if (cmd == 'L') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if (cmd == 'D') {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            } else if (cmd == 'B') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : list) {
            ans.append(c);
        }

        System.out.println(ans.toString());
    }
}
