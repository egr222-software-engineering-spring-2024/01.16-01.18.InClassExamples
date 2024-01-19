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
            for (int i=1; i<=-2*line+8; i++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int i=1; i<=4*line-4; i++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int i=1; i<=-2*line+8; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottomHalf() { System.out.println("bottomHalf"); }
}