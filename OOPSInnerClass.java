/**
 * OopsBannerApp - UC7: Store Character Pattern in a Class
 *
 * <p>Displays "OOPS" in a banner format using * and spaces.
 * Uses an inner static class {@code CharacterPatternMap} to encapsulate
 * each character and its corresponding 7-line banner pattern, providing
 * a scalable and reusable design based on OOP principles.</p>
 *
 * <p>Key OOP Principles: Encapsulation, Modularity, Abstraction,
 * Immutability, Single Responsibility, Separation of Concerns.</p>
 *
 * @author  OOPS Banner App
 * @version 7.0
 */
public class OopsBannerApp {

    // ----------------------------------------------------------------
    // Part 2 – Inner Static Class
    // ----------------------------------------------------------------

    /**
     * CharacterPatternMap encapsulates a single character and its
     * corresponding 7-line banner pattern.
     *
     * <p>Declared as a static nested class so it can be instantiated
     * without requiring an instance of the outer {@code OopsBannerApp}
     * class, making it act as a self-contained utility.</p>
     */
    static class CharacterPatternMap {

        /** The character represented by this pattern (e.g. 'O', 'P', 'S'). */
        private final char character;

        /** The 7-line banner pattern for the character. */
        private final String[] pattern;

        // ------------------------------------------------------------
        // Constructor
        // ------------------------------------------------------------

        /**
         * Constructs a {@code CharacterPatternMap} with the given character
         * and its associated banner pattern.
         *
         * @param character the character to store (e.g. 'O')
         * @param pattern   a 7-element String array representing each row
         *                  of the banner for this character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern   = pattern;
        }

        // ------------------------------------------------------------
        // Getter Methods
        // ------------------------------------------------------------

        /**
         * Returns the character stored in this pattern map.
         *
         * @return the character (e.g. 'O', 'P', 'S')
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the 7-line banner pattern for the stored character.
         *
         * @return a String array of 7 elements, each representing one
         *         row of the character in banner format
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // ----------------------------------------------------------------
    // Part 3 – Outer Class Utility Static Methods
    // ----------------------------------------------------------------

    /**
     * Searches the given array of {@code CharacterPatternMap} objects
     * for the entry matching {@code ch} and returns its pattern.
     *
     * <p>Abstracts the lookup mechanism from the caller, following the
     * Abstraction OOP principle.</p>
     *
     * @param patternMaps array of {@code CharacterPatternMap} instances
     * @param ch          the character whose pattern is requested
     * @return the 7-line String array for {@code ch}, or {@code null}
     *         if the character is not found in the array
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patternMaps, char ch) {
        for (CharacterPatternMap map : patternMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    /**
     * Assembles and prints the full "OOPS" banner by retrieving each
     * character's pattern from the supplied {@code CharacterPatternMap}
     * array and appending the rows side-by-side using a
     * {@link StringBuilder}.
     *
     * @param patternMaps array of {@code CharacterPatternMap} instances
     *                    containing patterns for every character in the word
     * @param word        the word to display in banner format (e.g. "OOPS")
     */
    public static void displayBanner(CharacterPatternMap[] patternMaps, String word) {
        // 7 rows in the banner
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            // Append each character's row pattern side-by-side
            for (int col = 0; col < word.length(); col++) {
                char ch = word.charAt(col);
                String[] pattern = getCharacterPattern(patternMaps, ch);
                if (pattern != null) {
                    line.append(pattern[row]);
                }
                // Add spacing between characters (except after last)
                if (col < word.length() - 1) {
                    line.append("  ");
                }
            }
            System.out.println(line);
        }
    }

    // ----------------------------------------------------------------
    // Part 4 – Main Method
    // ----------------------------------------------------------------

    /**
     * Entry point for the OopsBannerApp.
     *
     * <p>Creates {@code CharacterPatternMap} instances for O, P, and S,
     * stores them in an array, then calls {@link #displayBanner} to
     * print "OOPS" in banner format.</p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // --- Pattern definitions (7 rows each) -----------------------

        // Character 'O'
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        // Character 'P'
        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        // Character 'S'
        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
            " *** ",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            " *** "
        });

        // --- Populate array of CharacterPatternMap objects -----------
        // Word "OOPS" requires: O, O, P, S
        CharacterPatternMap[] patternMaps = { oPattern, pPattern, sPattern };

        // --- Display the banner --------------------------------------
        System.out.println("OOPS Banner - UC7: Store Character Pattern in a Class");
        System.out.println("=======================================================");
        System.out.println();

        displayBanner(patternMaps, "OOPS");
    }
}