package leetcode;

/***
 ��������Ϊ n ���������� nums������ n > 1��
 ����������� output ������ output[i] ���� nums �г� nums[i] ֮�������Ԫ�صĳ˻���

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/product-of-array-except-self
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
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
