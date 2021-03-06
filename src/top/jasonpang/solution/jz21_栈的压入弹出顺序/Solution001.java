package top.jasonpang.solution.jz21_栈的压入弹出顺序;

import java.util.Stack;

/**
 * description:
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author Jason
 * Created in 2020-08-03 20:49.
 */
public class Solution001 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length != popA.length){
            return false ;
        }
        Stack<Integer> stack = new Stack<>();
        int index1 = 0;
        int index2 = 0;
        stack.push(pushA[index1++]);
        while(!stack.isEmpty()){
            if(stack.peek() != popA[index2]){
                if(index1 < pushA.length){
                    stack.push(pushA[index1++]);
                }else{
                    return false ;
                }
            }else{
                stack.pop();
                index2 ++ ;
            }
        }
        return true;
    }
}
