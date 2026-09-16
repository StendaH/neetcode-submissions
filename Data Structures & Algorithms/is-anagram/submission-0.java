class Solution {
    public boolean isAnagram(String s, String t) {

        // Anagrams must be the same length
        if ( s.length() != t.length() ) {

            return false;

        }

        Map<Character, Integer> map = new HashMap<>();

        // Count each character in s
        for ( char c : s.toCharArray() ) {

            // If the character is already in the map, increment its count
            if ( map.containsKey( c ) ) {

                map.put( c, map.get( c ) + 1 );

            } else { // If the character is not in the map, add it with a count of 1

                map.put( c, 1 );

            }

        }

        // Cancel out each character found in t
        for ( char c : t.toCharArray() ) {

            // If the character is in the map, decrement its count
            if ( map.containsKey( c ) ) {

                map.put( c, map.get( c ) - 1 );

            } else { // If the character is not in the map, s and t are not anagrams

                return false;

            }

        }

        // If every count cancelled to zero, s and t are anagrams
        for ( int count : map.values() ) {

            // If any count is not zero, s and t are not anagrams
            if ( count != 0 ) {

                return false;

            }

        }

        return true;

    }
}
