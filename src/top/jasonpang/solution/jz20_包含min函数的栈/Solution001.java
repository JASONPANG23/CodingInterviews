package top.jasonpang.solution.jz20_包含min函数的栈;

import java.util.Stack;

/**
 * description:
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * @author Jason
 * Created in 2020-08-02 17:05.
 */
public class Solution001 {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> min = new Stack<>();
    public void push(int node) {
        data.push(node);
        if(min.isEmpty()){
            min.push(node);
        }else if(min.peek() < node){
            min.push(min.peek());
        }else{
            min.push(node);
        }
    }
    public void pop() {
        data.pop();
        min.pop();
    }
    public int top() {
        return data.peek();
    }
    public int min() {
        return min.peek();
    }
}
