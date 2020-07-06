import java.util.Map;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, 1);
        }
        for(int i; ; i++){
            if(map.get(i)==null)
                return i;
        }
    }
}