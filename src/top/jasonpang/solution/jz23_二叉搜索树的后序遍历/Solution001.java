package top.jasonpang.solution.jz23_二叉搜索树的后序遍历;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * description:
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author Jason
 * Created in 2020-07-26 11:02.
 */
public class Solution001 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        return helpVerify(sequence,0,sequence.length - 1) ;
    }

    private boolean helpVerify(int [] sequence ,int start ,int root){
        if(start >= root){
            return true;
        }
        //找出左子树与右子树
        int i = start;
        for (; i < root; i++) {
            if(sequence[i] > sequence[root]){
                break;
            }
        }
        //校验右子树是否合法
        for (int j = i; j < root; j++) {
            if(sequence[j] < sequence[root]){
                return false ;
            }
        }
        return helpVerify(sequence,start,i - 1) && helpVerify(sequence,i,root - 1) ;
    }
}
