package leetcode;

/***
 ����һ���ַ��� text������Ҫʹ�� text �е���ĸ��ƴ�վ����ܶ�ĵ��� "balloon"�����򣩡�
�ַ��� text �е�ÿ����ĸ���ֻ�ܱ�ʹ��һ�Ρ����㷵��������ƴ�ճ����ٸ����� "balloon"��

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/maximum-number-of-balloons
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
1189
***/

public class MaxBalloons {
	public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for(int i = 0;i < text.length();i++){
            count[text.charAt(i) - 'a']++;
        }
        count[11] /= 2;
        count[14] /= 2;
        int[] idx = new int[]{0,1,11,13,14};
        int res = Integer.MAX_VALUE;
        for(int i : idx){
            res = Math.min(res,count[i]);
        }
        return res;
    }
}
