package leetcode;
/***
 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
注意，一开始你手头没有任何零钱。
如果你能给每位顾客正确找零，返回 true ，否则返回 false 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/lemonade-change
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
