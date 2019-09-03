

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String substr;
        for(int i = 0; (i + k) <= s.length(); i++){
            substr = s.substring(i, i + k);

            if (smallest.equals("") || substr.compareTo(smallest) < 0)
                smallest = substr;
            
            if (largest.equals("") || substr.compareTo(largest) > 0)
                largest = substr;

        }
        
        return smallest + "\n" + largest;
    }


