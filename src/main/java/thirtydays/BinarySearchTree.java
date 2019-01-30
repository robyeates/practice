package thirtydays;

import java.util.*;


class TreeNode {
    TreeNode left,right;
    int data;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution10 {

    public static int getHeight(TreeNode node) {
        return traverse(node) - 1;
    }

    public static int traverse(TreeNode node) {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = traverse(node.left);
            int rDepth = traverse(node.right);
            if (lDepth > rDepth)
                return (++lDepth);
            else
                return (++rDepth);
        }
    }

    public static TreeNode insert(TreeNode root, int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}