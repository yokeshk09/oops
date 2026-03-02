public class OopsBanner  {

    public static void main(String[] args) {

        String O1 = " ***** ";
        String O2 = "*     *";
        String O3 = "*     *";
        String O4 = "*     *";
        String O5 = " ***** ";

        String P1 = "****** ";
        String P2 = "*     *";
        String P3 = "****** ";
        String P4 = "*      ";
        String P5 = "*      ";

        // Line 1
        System.out.println(String.join("   ", O1, O1, P1, P1));

        // Line 2
        System.out.println(String.join("   ", O2, O2, P2, P2));

        // Line 3
        System.out.println(String.join("   ", O3, O3, P3, P3));

        // Line 4
        System.out.println(String.join("   ", O4, O4, P4, P4));

        // Line 5
        System.out.println(String.join("   ", O5, O5, P5, P5));
    }
}