public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                continue; // Skip iteration when i is 5
            }
            System.out.println(i);
            i++;
            if (i == 8) {
                break; // Exit the loop when i is 8
            }
        }
    }
}