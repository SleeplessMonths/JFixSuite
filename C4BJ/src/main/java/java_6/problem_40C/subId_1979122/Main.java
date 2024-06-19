package java_6.problem_40C.subId_1979122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public Main() throws IOException {
		String input;

		input = br.readLine();
		work(input, 0);

		System.out.print(sb);
	}

	private void work(String input, int t) {
		//debug(t, input);
		String[] inputArray = input.split(" ");
		int n = Integer.valueOf(inputArray[0]);
		int x = Integer.valueOf(inputArray[1]);
		int m = Integer.valueOf(inputArray[2]);
		int y = Integer.valueOf(inputArray[3]);
		int ret = 1;
		int yPos = y;
		int yPosOrg = y;
		int num = 0;
		int direct = 0;

		if (x == y) {
			sb.append(ret + Math.max(n, m));
			return;
		}

		ret += n + m;

		if (x > y) {
			direct = 1;
			if ((x - n) >= y) {
				yPos += (x - n - y);
			}
		} else if (y > x) {
			direct = -1;
			if ((x + n) <= y) {
				yPos -= (y - n - x);
			}
		}

		if (Math.abs(yPos - y) >= m) {
			sb.append(ret);
			return;
		}

		yPosOrg = yPos;
		yPos += direct;
		num = 1;
		ret += num;
		while (Math.abs(yPos - y) < m) {
			if (Math.abs(yPos - yPosOrg) < Math.abs(x - yPosOrg)) {
				num += 2;
			} else if (Math.abs(yPos - yPosOrg) == Math.abs(x - yPosOrg)) {
				num -= 1;
			} else {
				num -= 2;
			}

			if (Math.abs(yPosOrg - (yPos - yPosOrg) - x) <= n) {
				num += 2;
			}

			if (num > 0)
				ret += num;

			yPos += direct;
		}

		sb.append(ret);
	}

	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
			new Main();
	}

	public static void debug(Object... arr) {
		System.err.println(Arrays.deepToString(arr));
	}
}