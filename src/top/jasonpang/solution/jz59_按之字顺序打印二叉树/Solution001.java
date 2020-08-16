package top.jasonpang.solution.jz59_按之字顺序打印二叉树;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * description:
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
 * 其他行以此类推。
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    //      8
    //     6 10
    //   5 7 9 11
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null){
            return result;
        }
        //基数层放一号队列,子元素从右往左放入
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        //偶数层放二号队列,子元素从左往右放入
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(pRoot);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer> subRes1 = new ArrayList<>();
            ArrayList<Integer> subRes2 = new ArrayList<>();
            while(!stack1.isEmpty()){
                TreeNode node = stack1.pop();
                subRes1.add(node.val);
                if(node.left != null){
                    stack2.add(node.left);
                }
                if(node.right != null){
                    stack2.add(node.right);
                }
            }
            if(!subRes1.isEmpty()){
                result.add(subRes1);
            }
            while(!stack2.isEmpty()){
                TreeNode node = stack2.pop();
                subRes2.add(node.val);
                if(node.right != null){
                    stack1.add(node.right);
                }
                if(node.left != null){
                    stack1.add(node.left);
                }
            }
            if(!subRes2.isEmpty()){
                result.add(subRes2);
            }
        }
        return result;
    }
}
