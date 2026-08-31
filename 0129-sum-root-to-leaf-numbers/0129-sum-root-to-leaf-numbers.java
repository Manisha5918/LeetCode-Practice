class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        // Build the number represented by the current path
        current = current * 10 + node.val;

        // If leaf, this is a complete root-to-leaf number
        if (node.left == null && node.right == null) {
            return current;
        }

        // Sum numbers from both subtrees
        return dfs(node.left, current) + dfs(node.right, current);
    }
}