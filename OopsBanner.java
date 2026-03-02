import java.util.HashMap;
import java.util.Map;

public class OopsBanner {

    // Centralized pattern storage
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Initialize patterns
        initializePatterns();

        // Render banner word
        renderBanner("OOPS");
    }

    // Initialize all character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
        });

        patternMap.put('P', new String[]{
                "****  ",
                "*   * ",
                "****  ",
                "*     ",
                "*     "
        });

        patternMap.put('S', new String[]{
                " **** ",
                "*     ",
                " ***  ",
                "     *",
                "****  "
        });
    }

    // Render banner using nested loops
    private static void renderBanner(String text) {

        text = text.toUpperCase();

        int height = 5; // Each pattern has 5 rows

        for (int row = 0; row < height; row++) {

            for (int col = 0; col < text.length(); col++) {

                char currentChar = text.charAt(col);

                String[] pattern = patternMap.get(currentChar);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("       ");
                }
            }

            System.out.println();
        }
    }
}