/**
 * Created by miqi on 2017/8/30.
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name){
        this.root = new TreeNode(name);
    }

    public static void main(String[] args){
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);

        System.out.println("Build the tree finished!");
    }
}
