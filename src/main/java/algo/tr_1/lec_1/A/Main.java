package algo.tr_1.lec_1.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int roomTemp = Integer.parseInt(sc.next());
    int targetTemp = Integer.parseInt(sc.next());
    String mode = sc.next();
    System.out.println(calculateTemperature(roomTemp, targetTemp, mode));
  }

  public static int calculateTemperature(int roomTemp, int targetTemp, String mode) {
    return switch(mode) {
      case "heat" -> Math.max(roomTemp, targetTemp);
      case "freeze" -> Math.min(roomTemp, targetTemp);
      case "auto" -> targetTemp;
      case "fan" -> roomTemp;
      default -> throw new RuntimeException("Wrong mode");
    };
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
