import java.util.*;

public class PuzzleSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] pieces = new int[n];

        for (int i = 0; i < n; i++) {
            pieces[i] = scanner.nextInt();
        }

        Set<String> combinations = new HashSet<>();
        backtrack(combinations, "", pieces, target, 0);

        System.out.println(combinations.size());
    }

    static void backtrack(Set<String> combinations, String current, int[] pieces, int target, int index) {
        if (index == pieces.length) {
            return;
        }
      if (!current.isEmpty()) {
            int sum = Arrays.stream(current.split(" ")).mapToInt(Integer::parseInt).sum();
            if (sum == target) {
                combinations.add(current);
            }
        }

        backtrack(combinations, current + pieces[index] + " ", pieces, target, index + 1);
        backtrack(combinations, current, pieces, target, index + 1);
    }
}

