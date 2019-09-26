import java.util.Arrays;

public class LC_1 {
	public static void main(String args[]) {
		int arr[] = {3,3};
		int target = 6;
		System.out.println("Input: " + Arrays.toString(arr));
		
		System.out.println("Output: " + Arrays.toString(twoSum(arr, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target && (i != j)) {
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}
		}
		
		return arr;
	}
}
