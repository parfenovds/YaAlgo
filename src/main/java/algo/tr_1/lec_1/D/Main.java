package algo.tr_1.lec_1.D;

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
    double c = sc.nextInt();
    if(c < 0) {
      System.out.println("NO SOLUTION");
    } else if(a == 0) {
      if(c * c == b) {
        System.out.println("MANY SOLUTIONS");
      } else {
        System.out.println("NO SOLUTION");
      }
    } else {
      double result = (c * c - b) / a;
      if(Math.round(result) == result) {
        System.out.println((int) result);
      } else {
        System.out.println("NO SOLUTION");
      }
    }
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