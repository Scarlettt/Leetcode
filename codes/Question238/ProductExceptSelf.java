package leetcode;

/***
 给定长度为 n 的整数数组 nums，其中 n > 1，
 返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/product-of-array-except-self
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
238
***/

public class ProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int k = 1;
        for(int i = 0;i < n;i++){
            output[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for(int i = n - 1;i >= 0;i--){
            output[i] *= k;
            k *= nums[i];
        }
        return output;
    }
}
