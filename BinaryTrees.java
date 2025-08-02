public class BinaryTrees{
    static class node {
        int data;
        node left;
        node right;
        node(int data){
        this.data= data;
        this.left= null;
        this.right= null;}
    }static class BinaryTree{
     static  int idx=-1;
    public static node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx]==-1) {
                return  null;
            }node newNode = new node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
    }}public static boolean isIdentical(node root,node subroot){
        if (subroot== null) {
            return  true;}
        if (root==null||subroot==null) {
            return  false;}
        if (root.data==subroot.data){
            return  isIdentical(root.left, subroot.left)&&
            isIdentical(root.right, subroot.right);
        }return  false;}
        public static  boolean isSubtree(node root, node subroot){
            if (root == null) {
             return false;}
            if (subroot== null){
                return true;}
            if (root== null) {
                return true;}
            if (isIdentical(root, subroot)) {
                return true;}
            return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);}
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        node root=tree.BuildTree(nodes);
        node subtree= new node(1);
        subtree.left= new node(2);
        subtree.left= new node (3);
        boolean result= isSubtree(BinaryTree.BuildTree(nodes),subtree);
        if (result) {
        System.out.println("Subtree Found");  
        }else{
        System.out.println("subtree not found");}}}