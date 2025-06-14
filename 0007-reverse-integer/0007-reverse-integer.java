class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            
            // Check for overflow/underflow before multiplying or adding
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            // Integer.MAX_VALUE is used to check if we are about to cross the max limit of an integer in Java.
            //    Prevents overflow errors during digit reversal.
            //    Used with MIN_VALUE for checking negative limits.

            ans = ans * 10 + rem;
        }
        return ans;
    }
}
