import java.util.*;
class Solution {
    List<Integer>arr=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return balanced(0,arr.size()-1);
    }
    void inorder(TreeNode root){
        if(root==null){
            return;
              }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
      
    }
    TreeNode balanced(int left,int right){
        if (left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=balanced(left,mid-1);
        root.right=balanced(mid+1,right);
        return root;
        
    }
    }
