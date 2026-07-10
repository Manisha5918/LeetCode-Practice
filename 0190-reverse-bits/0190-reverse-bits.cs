public class Solution {
    public int ReverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++)
        {
            // Extract the last bit of n
            int bit = n & 1;

            // Shift result left to make space
            result <<= 1;

            // Add the extracted bit
            result |= bit;

            // Move to the next bit of n
            n >>= 1;
        }

        return result;
    }
}