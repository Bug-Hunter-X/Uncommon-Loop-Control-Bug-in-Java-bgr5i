public class UncommonBugSolution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5 || i == 8) {
                continue; // Skip iterations for i = 5 and i = 8
            }
            System.out.println(i);
        }
    }
}