

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if (a.length() != b.length())
            return false;

        java.util.HashMap<Character, Integer> counts = new java.util.HashMap<>();
        int count;

        for(Character c : a.toLowerCase().toCharArray()) {
            if (counts.containsKey(c))
                count = counts.get(c) + 1;
            else
                count = 1;
            counts.put(c, count);
        }

         for(Character c : b.toLowerCase().toCharArray()) {
            if (!counts.containsKey(c))
                return false;
            else {
                count = counts.get(c);
                if (count == 0) 
                    return false;
                else
                    counts.put(c, --count);             
            }
        }

        return true;
    }


