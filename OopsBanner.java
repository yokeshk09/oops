public class OopsBanner {
    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        String[] banner = new String[5];

        for (int i = 0; i < 5; i++) {
            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method to build letter O
    public static String[] buildO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method to build letter P
    public static String[] buildP() {
        return new String[] {
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Static method to build letter S
    public static String[] buildS() {
        return new String[] {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}