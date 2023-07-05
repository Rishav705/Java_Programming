public class MissingNumber {
    public static int missingNumber(int[] nums)
    {
        int sum = ((nums.length+1)*(nums.length+2))/2;
        for(int i =0;i<nums.length;i++)
        {
            sum = sum-nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
