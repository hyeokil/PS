import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long M = Long.parseLong(br.readLine());

        for (int n = 3; n <= 100; n++) {
            long totalBlocks = 0;
            long layerSize = 1;
            int s = 0;

            // 가능한 s 값을 찾기 위한 반복문
            while (totalBlocks < M) {
                s++;
                layerSize = 1; // 현재 계단의 초기 크기
                for (int j = 0; j < n - 1; j++) {
                    layerSize *= s; // 각 차원마다 크기 곱함
                    if (layerSize > M) break; // 오버플로우 방지
                }
                totalBlocks += layerSize; // 해당 계단의 블록 수를 더함

                if (totalBlocks ==M) {
                    System.out.println(n + " " + s);
                    return;
                }
            }
        }

        // 찾을 수 없는 경우
        System.out.println("impossible");
    }
}
