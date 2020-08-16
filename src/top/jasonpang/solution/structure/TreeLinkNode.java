package top.jasonpang.solution.structure;

/**
 * description:
 *
 * @author Jason
 * Created in  2020/7/20 23:36
 */
public class TreeLinkNode {
    public int val;
    public TreeLinkNode left = null;
    public TreeLinkNode right = null;
    /**
     * 父节点
     */
    public TreeLinkNode next = null;

    public TreeLinkNode(int val) {
        this.val = val;
    }
}
