import java.util.HashMap;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {

        // No elements
        if (left > right) {
            return null;
        }

        // First element in preorder is root
        int rootValue = preorder[preIndex++];

        TreeNode root = new TreeNode(rootValue);

        // Find root position in inorder
        int index = map.get(rootValue);

        // Build left subtree
        root.left = build(preorder, left, index - 1);

        // Build right subtree
        root.right = build(preorder, index + 1, right);

        return root;
    }
}