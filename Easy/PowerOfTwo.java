// Given an integer, write a function to determine if it is a power of two.

public class PowerOfTwo{
  public boolean isPowerOfTwo(int n){
    // 2's power only has one bit  for 1
     return n > 0 && Integer.bitCount(n) == 1;
  }
}
