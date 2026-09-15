public class Solution {

    public boolean hasDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        // Iterate through each number in the input array
        for( int num : nums ) { // for( int i = 0; i < nums.length; i++ ) {

            // Check if we have already seen this value
            if( seen.contains( num ) ) { // if( seen.contains( nums[i] ) ) {

                return true;

            }

            // Not seen before, add it
            seen.add( num ); // seen.add( nums[i] );

        }

        return false;

    }

}
