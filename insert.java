class Node{
    Node root ;
    int key;
    Node left, right;
    Node(int x){
        key = x;
    }
}
class Main{
    public static void main (String [] args)
    {
        Node root = new Node(8);
        root.right = new Node(10);
        root.left = new Node (3);
        root.right.right= new Node(13);
        root.left.right = new Node(5);
        root.left.left= new Node(2);
        root.right.left= new Node(9);
        
        //   Binary Search Tree 
    /*             8
                 /  \
               3     10
             /  \   /  \
            2   5  9   13  */
            
        PrintTree(root);
        int x =20;
        root = insert(root,x);
        System.out.println();
        PrintTree (root);
        
    }
    ////////////////////////////  inorder /////////////////////////
    static void PrintTree(Node root){
       
        if(root!=null){
        PrintTree(root.left);
        System.out.print(root.key+ " ");
        PrintTree(root.right);
        }
        
    }
   
    // Function to insert a node in a BST.
    static Node insert(Node root, int x) {
        // your code here
        Node temp = new Node(x);
        if(root==null)return temp;
        if(root.key == x)return root;
        else if(root.key <x) 
        root.right = insert(root.right,x);
        else root.left = insert(root.left,x);
        
        return root;
    }

}
