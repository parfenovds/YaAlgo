package algo.tr_1.lec_1.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    List<String> numbers = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      numbers.add(sc.next());
      numbers.set(i, numbers.get(i).replaceAll("[-(+)]", ""));
      if(numbers.get(i).length() == 11) {
        numbers.set(i, numbers.get(i).substring(1));
      } else if(numbers.get(i).length() == 7){
        numbers.set(i, "495" + numbers.get(i));
      }
    }
    for (int i = 1; i < numbers.size(); i++) {
      if(numbers.get(i).equals(numbers.get(0))) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
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