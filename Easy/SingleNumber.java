public class SingleNumber{
  public static int singleNumber(int[] nums){
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0 ; i < nums.length; i++){
      if(!map.containsKey(nums[i])) map.put(nums[i],1);
      else map.remove(nums[i]);
    }

    int res = 0;
    for(Integer key : map.keySet()) res = key;
    return res;
  }

  public static void main(String[] args){
    int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7};
    System.out.println(singleNumber(nums));
  }
}
