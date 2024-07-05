import java.util.HashSet;

class Solution3 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}