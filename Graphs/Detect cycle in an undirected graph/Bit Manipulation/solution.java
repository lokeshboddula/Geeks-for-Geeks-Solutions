class Solution {
    static int setBits(int n) {
         int count = 0;
		while (n != 0) {
			if((n & 1) == 1) {
				count++;
			}
			n>>=1;
		}
		return count;
    }
}