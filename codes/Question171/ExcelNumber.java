package leetcode;

/***
给定一个Excel表格中的列名称，返回其相应的列序号。
例如，
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/excel-sheet-column-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
