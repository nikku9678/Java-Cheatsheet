public class Arrays{
    public static void main(String[] args) {
        int[] nums = {10,20,30,42,46,38,23,15};

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        //Iterate the array
        for(int x: nums){
            System.out.print(x+" ");
        }
    }
}