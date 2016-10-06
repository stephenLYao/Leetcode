// Given an integer, write a function to determine if it is a power of three.

public class PowerOfThree{
  public boolean isPowerOfThree(int n){
    return n > 0 && n == 1 && n % 3 == 0 && isPowerOfThree(n/3);
  }
}
