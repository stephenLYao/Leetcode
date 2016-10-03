// Given two arrays, write a function to compute their intersection.
//
// Example:
// Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
//
// Note:
// Each element in the result must be unique.
// The result can be in any order.

public class IntersectionOfTwoArrays{
  public int[] intersection(int[] nums1, int[] nums2) {
       if(nums1.length > nums2.length){
           intersection(nums2,nums1);
       }
       Set<Integer> set = new HashSet<>(nums1.length);
       for(int n : nums1){
           set.add(n);
       }
       Set<Integer> intersect = new HashSet<>(nums1.length);
       for(int n : nums2){
           if(set.contains(n)){
               intersect.add(n);
           }
       }
       int[] result = new int[intersect.size()];
       int i = 0;
       for(Integer num : intersect){
           result[i++] = num;
       }

       return result;

   }
}
