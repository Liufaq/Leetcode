/**
 * 给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标
 * 如果所给格子的颜色是白色，请你返回 true，如果是黑色，请返回 false 。
 *
 * 给定坐标一定代表国际象棋棋盘上一个存在的格子。坐标第一个字符是字母，第二个字符是数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/determine-color-of-a-chessboard-square
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SquareIsWhite {
    public boolean solution(String coordinates){

        int c = (int)coordinates.charAt(0);
        int d = (int)coordinates.charAt(1);
        if((c%2 == 0 && d%2 ==0 )|| (c%2 != 0 && d%2 !=0 )){
            return false;
        }
        return true;
    }
}
