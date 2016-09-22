public class ReverseString{
  public static String reverseString(String s) {
        if(s == null || s.length() < 2){
            return s;
        }
        char[] chars = s.toCharArray();
        int length = s.length();
        for(int i = 0;i< length/2;i++){
            char temp = chars[i];
            chars[i] = chars[length-i-1];
            chars[length-i-1] = temp;
        }
        return new String(chars);
  }
  public static void main(String[] args){
    String result = reverseString("hello");
    System.out.println(result);
  }
}
