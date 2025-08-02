class TreeNode {  
    int val;  
    TreeNode left, right;  
  
    TreeNode(int val) {  
        this.val = val;  
    }  
}  
  
class BinaryTreeSubtreeCheck {  
    public static boolean subtree(TreeNode main tree, TreeNode subtree) {  
        if (mainTree == null) {  
            return false;  
        }  
  
        if (isIdentical(mainTree, subtree)) {  
            return true;  
        }  
  
        return isSubtree(mainTree.left, subtree) || isSubtree(mainTree.right, subtree);  
    }  
  
    public static boolean isIdentical(TreeNode node1, TreeNode node2) {  
        if (node1 == null && node2 == null) {  
            return true;  
        }  
  
        if (node1 == null || node2 == null) {  
            return false;  
        }  
  
        return node1.val == node2.val &&  
               isIdentical(node1.left, node2.left) &&  
               isIdentical(node1.right, node2.right);  
    }  
  
    public static void main(String[] args) {  
        // Example usage:  
        TreeNode mainTree = new TreeNode(1);  
        mainTree.left = new TreeNode(2);  
        mainTree.right = new TreeNode(3);  
        mainTree.left.left = new TreeNode(4);  
        mainTree.left.right = new TreeNode(5);  
        mainTree.right.left = new TreeNode(6);  
        mainTree.right.right = new TreeNode(7);  
  
        TreeNode subtree = new TreeNode(2);  
        subtree.left = new TreeNode(4);  
        subtree.right = new TreeNode(5);  
  
        boolean result = isSubtree(mainTree, subtree);  
  
        if (result) {  
            System. out.println("Subtree found");  
        } else {  
            System. out.println("Subtree not found");  
        }  
    }  
}  