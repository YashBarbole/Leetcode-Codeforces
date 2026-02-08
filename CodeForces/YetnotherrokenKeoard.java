package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class YetnotherrokenKeoard {
   
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();

            // Stores characters of final string
            ArrayList<Character> result = new ArrayList<>();

            // Stacks to store positions
            Stack<Integer> lower = new Stack<>();
            Stack<Integer> upper = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == 'b') {
                    if (!lower.isEmpty()) {
                        int idx = lower.pop();
                        result.set(idx, '#'); // mark deleted
                    }
                } else if (c == 'B') {
                    if (!upper.isEmpty()) {
                        int idx = upper.pop();
                        result.set(idx, '#'); // mark deleted
                    }
                } else {
                    result.add(c);
                    int pos = result.size() - 1;

                    if (Character.isLowerCase(c)) {
                        lower.push(pos);
                    } else {
                        upper.push(pos);
                    }
                }
            }

            // Build answer
            StringBuilder ans = new StringBuilder();
            for (char c : result) {
                if (c != '#') ans.append(c);
            }

            out.append(ans).append('\n');
        }

        System.out.print(out.toString());
    }
    }

