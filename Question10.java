import java.util.Arrays;
public class Question10{
    public static int findDuplicate(int [] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {4,2,5,3,2,1};
        System.out.println("Duplicate"+"-"+findDuplicate(nums));
    }
}
