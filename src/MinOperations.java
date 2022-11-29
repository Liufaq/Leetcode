/**
 * 给你一个仅由字符 '0' 和 '1' 组成的字符串 s 。一步操作中，你可以将任一 '0' 变成 '1' ，或者将 '1' 变成 '0' 。
 *
 * 交替字符串 定义为：如果字符串中不存在相邻两个字符相等的情况，那么该字符串就是交替字符串。例如，字符串 "010" 是交替字符串，而字符串 "0100" 不是。
 *
 * 返回使 s 变成 交替字符串 所需的 最少 操作数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-changes-to-make-alternating-binary-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class MinOperations {
    public int solution(String s){
        int num = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != (char)('0'+i%2)){
                num++;
            }
        }
        return Math.min(num,s.length()-num);
    }

    public static void main(String[] args) {
        MinOperations m = new MinOperations();
        String s = "1111";
        System.out.println(m.solution(s));
    }
}
