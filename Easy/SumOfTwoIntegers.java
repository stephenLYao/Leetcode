// Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//
// Example:
// Given a = 1 and b = 2, return 3.

public class SumOfTwoIntegers{
  public static int getSum(int a, int b) {
       if(b == 0) return a;
       int sum = a^b;
       int carry = (a & b) << 1;
       return getSum(sum,carry);
   }

   public static void main(String[] args){
     System.out.println(getSum(2,3));
   }
}
