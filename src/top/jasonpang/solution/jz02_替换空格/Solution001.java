package top.jasonpang.solution.jz02_替换空格;

/**
 * description:
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author Jason
 * Created in 2020-07-25 12:49.
 */
public class Solution001 {
    public String replaceSpace(StringBuffer str) {
        int index = 0;
        StringBuilder result = new StringBuilder();
        while(index < str.length()){
            if(str.charAt(index) == ' '){
                result.append("%20");
            }else{
                result.append(str.charAt(index));
            }
            index ++ ;
        }
        return result.toString();
    }
}
