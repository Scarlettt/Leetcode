package leetcode;

/***
����һ����������������Ĳ����������ǶԸ����Ķ����Ʊ�ʾȡ����
ע��:
������������֤��32λ�����������ķ�Χ�ڡ�
����Լٶ���������������ǰ����λ��
476
***/

public class ComplementNumber {
	public int findComplement(int num) {
        int temp = num;
        int i = 0;
        while(temp > 0){
            temp = temp >> 1;
            i = (i << 1) + 1;
        }
        return num^i;
    }
}
