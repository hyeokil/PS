import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 진폭의 개수
		int x = Integer.parseInt(st.nextToken());	// 목표 값

		long[] amplitude = new long[n];	// 진폭
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			amplitude[i] = Long.parseLong(st.nextToken());
		}

		// 평균 인지 음량
		long currentLoudness = 0;
		for (int i = 0; i < n; i++) {
			currentLoudness += amplitude[i] * amplitude[i];
		}
		double avg = (double) currentLoudness / n;

		if (x == 0) {
			for (int i = 0; i < n; i++) {
				sb.append(0).append(" ");
			}
		} else {
			// 정규화 상수 k 계산
			double k = Math.sqrt((double) x / avg);
	
			// 진폭 재정규화 및 출력
			for (int i = 0; i < n; i++) {
				if (amplitude[i] == 0) {
					sb.append(0).append(" ");
				} else {
					sb.append(amplitude[i] * k).append(" ");
				}
			}
		}

		// 출력
		br.close();
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}