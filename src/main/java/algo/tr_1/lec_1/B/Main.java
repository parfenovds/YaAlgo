package algo.tr_1.lec_1.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println(isTriangleExists(a, b, c));
  }

  public static String isTriangleExists(int a, int b, int c) {
    if((a < b + c) && (b < a + c) && (c < a + b)) {
      return "YES";
    }
    return "NO";
  }
}


class FastScanner {
  private BufferedReader br;
  private StringTokenizer st;

  FastScanner(InputStream stream) {
    try {
      br = new BufferedReader(new InputStreamReader(stream));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String next() {
    while (st == null || !st.hasMoreTokens()) {
      try {
        st = new StringTokenizer(br.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return st.nextToken();
  }

  public int nextInt() {
    return Integer.parseInt(next());
  }

  public long nextLong() {
    return Long.parseLong(next());
  }
}