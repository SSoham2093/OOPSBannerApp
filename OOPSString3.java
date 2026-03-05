public class OOPSBannerUC6 {

    
    static String[] getOPattern() {
        return new String[] {
            " *** ",   
            "*   *",   
            "*   *",   
            "*   *",   
            "*   *",   
            "*   *",  
            " *** "    
        };
    }


    static String[] getPPattern() {
        return new String[] {
            "**** ",   // Line 1 – top bar
            "*   *",   // Line 2
            "*   *",   // Line 3
            "**** ",   // Line 4 – close the bump
            "*    ",   // Line 5 – straight stem
            "*    ",   // Line 6
            "*    "    // Line 7
        };
    }

   
    static String[] getSPattern() {
        return new String[] {
            " ****",   // Line 1 – top curve
            "*    ",   // Line 2
            "*    ",   // Line 3
            " *** ",   // Line 4 – middle curve
            "    *",   // Line 5
            "    *",   // Line 6
            "**** "    // Line 7 – bottom curve
        };
    }

   
    public static void main(String[] args) {

    
        String[] oPattern = getOPattern();   // 1st  O
        String[] o2Pattern = getOPattern();  // 2nd  O  (DRY – same method, reused)
        String[] pPattern  = getPPattern();  // P
        String[] sPattern  = getSPattern();  // S

       
        String[] bannerLines = {
            String.join(" ", oPattern[0], o2Pattern[0], pPattern[0], sPattern[0]),  // Line 1
            String.join(" ", oPattern[1], o2Pattern[1], pPattern[1], sPattern[1]),  // Line 2
            String.join(" ", oPattern[2], o2Pattern[2], pPattern[2], sPattern[2]),  // Line 3
            String.join(" ", oPattern[3], o2Pattern[3], pPattern[3], sPattern[3]),  // Line 4
            String.join(" ", oPattern[4], o2Pattern[4], pPattern[4], sPattern[4]),  // Line 5
            String.join(" ", oPattern[5], o2Pattern[5], pPattern[5], sPattern[5]),  // Line 6
            String.join(" ", oPattern[6], o2Pattern[6], pPattern[6], sPattern[6])   // Line 7
        };

       
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}