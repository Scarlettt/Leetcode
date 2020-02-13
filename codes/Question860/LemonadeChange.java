package leetcode;
/***
 ������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ 5 ��Ԫ��
�˿��Ŷӹ�����Ĳ�Ʒ�������˵� bills ֧����˳��һ�ι���һ����
ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��������ÿ���˿���ȷ���㣬Ҳ����˵��������ÿλ�˿�����֧�� 5 ��Ԫ��
ע�⣬һ��ʼ����ͷû���κ���Ǯ��
������ܸ�ÿλ�˿���ȷ���㣬���� true �����򷵻� false ��

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/lemonade-change
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
860
***/
public class LemonadeChange {
	public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int i = 0;i < bills.length;i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five <= 0){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(ten <= 0){
                    if(five < 3){
                        return false;
                    }else{
                        five -= 3;
                    }
                }else{
                    if(five <= 0){
                            return false;
                        }else{
                            ten--;
                            five--;
                        }
                    }    
            }
        }
        return true;
    }
}
