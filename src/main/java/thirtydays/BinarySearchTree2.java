package thirtydays;

import java.util.*;

class TreeNode2{
    TreeNode2 left,right;
    int data;
    TreeNode2(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution11 {

    enum Side {
        LEFT,
        RIGHT
    }
    static void levelOrder(TreeNode2 root){
        Queue<TreeNode2> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode2 current = queue.remove();
            System.out.print(current.data+" ");
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
    }

    public static TreeNode2 insert(TreeNode2 root,int data){
        if(root==null){
            return new TreeNode2(data);
        }
        else{
            TreeNode2 cur;
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
        TreeNode2 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
