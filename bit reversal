Solution 1

class Solution {
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse = (reverse << 1) | (n & 1);
            n = n >> 1;
        }
        return reverse;
    }
}

Solution 2: 1 liner using inbuild library class method

class Solution {
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
