public class OopsBanner {
    public static void main(String[] args) {

        // Define character patterns
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

        // Store banner lines in array using String.join()
        String[] banner = {
                String.join("   ", O1, O1, P1, P1),
                String.join("   ", O2, O2, P2, P2),
                String.join("   ", O3, O3, P3, P3),
                String.join("   ", O4, O4, P4, P4),
                String.join("   ", O5, O5, P5, P5)
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}