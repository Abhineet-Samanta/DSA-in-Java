import java.util.ArrayList;
public class BST {
    static class node {
        int data;
        node left;
        node right;
        node (int data){
            this.data= data;
            this.left= null;
            this.right= null;}
    }//function to insert numbers in BST
    public static  node insert(node root,int value){
        if (root== null) {
            root= new node (value);
            return root;
        }if (root.data>value){//left subtree
            root.left= insert(root.left,value);
        }else{//right subtree
            root.right= insert(root.right,value);
        }return root;
    }//to check whether our BST is correctly built
public static void inorder(node root) {
        if (root==null) {
            return;}
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }//function for root to leaf paths 
   public static void printPath(ArrayList<Integer>path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");}
        System.out.println();}
    public static void RootToLeaf(node root ,ArrayList<Integer>path) {
        if (root==null) {
        return;}
        path.add(root.data);
        //leaf node condition
        if (root.left==null&&root.right==null) {
            printPath(path);
        }else {//non leaf nodes 
            RootToLeaf(root.left, path);
            RootToLeaf(root.right, path);
        }path.remove(path.size()-1);}
public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        node root=null;
        for (int i = 0; i < values.length; i++) {
            root= insert(root,values[i]);
        }inorder(root);
        System.out.println();
        RootToLeaf(root, new ArrayList<>());}}
