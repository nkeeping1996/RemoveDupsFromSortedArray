import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args){
        int[] arr = new int[] {1,1,2,2,2,3,3,4,7,8,8,9};
        int k = removeDuplicates(arr);
    }
    public static int removeDuplicates(int[] nums) {

        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                int k = nums[j];
                nums[j] = nums[i];
                nums[i] = k;
            }
        }

        //For testing purposes:
//        Set<Integer> numSet = new HashSet<Integer>();
//        for(int num : nums){
//            numSet.add(num);
//        }
//        System.out.println("size of sorted array without duplicates: " + numSet.size());
//        System.out.println("the set created: " + numSet);
//        System.out.println("the array in its final form:");
//        for(int num : nums){
//            System.out.print(num + " ");
//        }

        return i+1;

    }
}