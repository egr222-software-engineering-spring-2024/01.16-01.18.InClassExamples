public class Mirror {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    public static void border() {
        System.out.println("border");
    }

    public static void topHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int j = 1; j <= -2 * line + 8; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }


    public static void bottomHalf() {
        System.out.println("bottomHalf");
    }
}