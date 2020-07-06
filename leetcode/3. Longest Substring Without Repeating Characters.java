class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        int startPoint = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(map.get(c) != null && map.get(c) >= startPoint){
                startPoint = map.get(c)+1;
            }
            map.put(c, i);

            longestLength = Integer.max(longestLength, i-startPoint+1);

        }

        return longestLength;
    }
}