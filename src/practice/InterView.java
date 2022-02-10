package practice;

public class InterView {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String x = "AB";
        String y = "AB";
        int result = 0;
        if (x.length() % y.length() != 0) {
            result = -1;
        } else {
            for (int i = 0; i < x.length() ; i += y.length()) {
                if (x.substring(i, i + 2).equals(y)) {
                    result += 1;
                } else {
                    result = -1;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
