package top.jasonpang.solution.jz61_序列化二叉树;

import top.jasonpang.solution.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * description:
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 *
 * 二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。
 * 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，
 * 序列化时通过 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。
 *
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 *
 * 例如，我们可以把一个只有根节点为1的二叉树序列化为"1,"，然后通过自己的函数来解析回这个二叉树
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class Solution001 {
    private String dStr;
    public String Serialize(TreeNode root) {
        if(root == null){
            return "#";
        }
        return root.val + "!" +Serialize(root.left) + "!" + Serialize(root.right);
    }
    public TreeNode Deserialize(String str) {
        dStr = str;
        return Deserialize();
    }

    private TreeNode Deserialize(){
        if(dStr.length()==0){
            return null;
        }
        int index=dStr.indexOf("!");
        String nodeStr = index == -1 ? dStr : dStr.substring(0, index);
        dStr=index==-1? "!" : dStr.substring(index+1);
        if(nodeStr.equals("#")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodeStr));
        node.left = Deserialize() ;
        node.right = Deserialize() ;
        return node;
    }
}
