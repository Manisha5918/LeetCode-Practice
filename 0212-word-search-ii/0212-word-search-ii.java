class Solution {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();

        // Build Trie
        for (String word : words) {
            TrieNode curr = root;

            for (char ch : word.toCharArray()) {
                int index = ch - 'a';

                if (curr.children[index] == null) {
                    curr.children[index] = new TrieNode();
                }

                curr = curr.children[index];
            }

            curr.word = word;
        }

        List<String> result = new ArrayList<>();

        int m = board.length;
        int n = board[0].length;

        // Start DFS from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, root, result);
            }
        }

        return result;
    }

    private void dfs(
        char[][] board,
        int row,
        int col,
        TrieNode parent,
        List<String> result
    ) {

        char ch = board[row][col];

        if (ch == '#') {
            return;
        }

        int index = ch - 'a';

        TrieNode node = parent.children[index];

        // Current path is not a prefix of any word
        if (node == null) {
            return;
        }

        // Found a complete word
        if (node.word != null) {
            result.add(node.word);

            // Prevent duplicate results
            node.word = null;
        }

        // Mark cell as visited
        board[row][col] = '#';

        // Down
        if (row + 1 < board.length) {
            dfs(board, row + 1, col, node, result);
        }

        // Up
        if (row - 1 >= 0) {
            dfs(board, row - 1, col, node, result);
        }

        // Right
        if (col + 1 < board[0].length) {
            dfs(board, row, col + 1, node, result);
        }

        // Left
        if (col - 1 >= 0) {
            dfs(board, row, col - 1, node, result);
        }

        // Restore cell
        board[row][col] = ch;

        // Pruning:
        // If this Trie node has no children and no word,
        // remove it from its parent.
        if (node.word == null && hasNoChildren(node)) {
            parent.children[index] = null;
        }
    }

    private boolean hasNoChildren(TrieNode node) {
        for (TrieNode child : node.children) {
            if (child != null) {
                return false;
            }
        }
        return true;
    }
}