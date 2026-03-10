import java.util.HashMap;
import java.util.Map;

/**
 * OopsBannerApp - UC8: Use Map for Character Patterns and Render via Function
 *
 * <p>Displays "OOPS" in a banner format using * and spaces.
 * Uses a {@link HashMap} to store each character's 7-line banner pattern
 * as a key-value pair ({@code Map<Character, String[]>}), enabling
 * efficient O(1) lookup and eliminating the need for manual linear search.</p>
 *
 * <p>Key Concepts: HashMap, StringBuilder, Static Methods, Nested Loops.</p>
 * <p>Key Benefits: Encapsulation, Modularity, Separation of Concerns.</p>
 *
 * @author  OOPS Banner App
 * @version 8.0
 */
public class OopsBannerApp {

    // ----------------------------------------------------------------
    // Part 2 – Utility Static Methods
    // ----------------------------------------------------------------

    /**
     * Builds and returns a {@code HashMap} that maps each supported
     * character to its corresponding 7-line banner pattern.
     *
     * <p>Each entry in the map uses a {@code Character} key (e.g. 'O')
     * and a {@code String[]} value containing exactly 7 elements, where
     * each element represents one row of the character in banner format.</p>
     *
     * @return a {@code Map<Character, String[]>} containing patterns
     *         for the characters O, P, and S
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for character 'O'
        patternMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        // Pattern for character 'P'
        patternMap.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        // Pattern for character 'S'
        patternMap.put('S', new String[]{
            " *** ",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            " *** "
        });

        return patternMap;
    }

    /**
     * Renders the given word as a multi-line ASCII banner by looking up
     * each character's pattern in the supplied {@code patternMap} and
     * assembling rows side-by-side using a {@link StringBuilder}.
     *
     * <p>Uses nested loops: the outer loop iterates over the 7 banner
     * rows; the inner loop iterates over each character in the word,
     * retrieves its row slice from the map, and appends it to the line.</p>
     *
     * @param patternMap a {@code Map<Character, String[]>} containing
     *                   banner patterns for every character in {@code word}
     * @param word       the word to display in banner format (e.g. "OOPS")
     */
    public static void displayBanner(Map<Character, String[]> patternMap, String word) {

        // Outer loop – iterate over each of the 7 banner rows
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            // Inner loop – iterate over each character in the word
            for (int col = 0; col < word.length(); col++) {

                char ch = word.charAt(col);

                // O(1) lookup via HashMap – no linear search needed
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]);
                }

                // Add spacing between characters (except after the last one)
                if (col < word.length() - 1) {
                    line.append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // ----------------------------------------------------------------
    // Part 3 – Main Method
    // ----------------------------------------------------------------

    /**
     * Entry point for the OopsBannerApp.
     *
     * <p>Calls {@link #buildPatternMap()} to populate the HashMap,
     * then calls {@link #displayBanner(Map, String)} to print "OOPS"
     * in banner format. Output is identical to UC2 – only the
     * internal pattern management mechanism has changed.</p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Build the HashMap of character → 7-line pattern
        Map<Character, String[]> patternMap = buildPatternMap();

        // Display the banner for the word "OOPS"
        System.out.println("OOPS Banner - UC8: Use Map for Character Patterns and Render via Function");
        System.out.println("==========================================================================");
        System.out.println();

        displayBanner(patternMap, "OOPS");
    }
}