package leetcode;

/***
����һ��Excel����е������ƣ���������Ӧ������š�
���磬
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/excel-sheet-column-number
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
***/

public class ExcelNumber {
	public int titleToNumber(String s) {
        int init = 0;
        int number = 0;
        int len = s.length();
        for(int i = 0;i < len;i++){
            number = s.charAt(i)-'A'+1;
            init = init * 26 + number;
        }
        return init;
    }
}
