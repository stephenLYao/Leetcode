// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
// Examples:
//
// s = "leetcode"
// return 0.
//
// s = "loveleetcode",
// return 2.
// Note: You may assume the string contain only lowercase letters.

public class FirstUniqueCharacterInAString{
  public int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c) + 1);
            }else{
                hashMap.put(c,1);
            }
        }

        for(int i=0;i<s.length();i++ ){
            Character c = s.charAt(i);
            if(hashMap.get(c) == 1) return i;
        }

        return -1;
    }
}
