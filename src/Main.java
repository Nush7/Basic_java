import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = scanner.next().toCharArray();
        int ans = minSwaps(arr, 0, n - 1);
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    static boolean help(char[] arr) {
        int n = arr.length;
        Set<Character> set = new HashSet<>();
        set.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (set.contains(arr[i])) {
                return false;
            }
            set.add(arr[i]);
        }
        return true;
    }

    static int minSwaps(char[] arr, int l, int r) {
        if (l >= r) {
            if (help(arr)) {
                return 0;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        int minSwaps = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (i != l) {
                swap(arr, i, l);
                int currSwaps = minSwaps(arr, l + 1, r);
                if (currSwaps != Integer.MAX_VALUE) {
                    minSwaps = Math.min(minSwaps, currSwaps + 1);
                }
                swap(arr, i, l);
            }
        }
        return minSwaps;
    }

    static void swap(char[] arr, int i, int j) {
        if (i != j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

