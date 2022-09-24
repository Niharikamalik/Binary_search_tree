class Node{
    Node root ;
    int data;
    Node left, right;
    Node(int x){
        data = x;
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
        int x =10;
        root = deleteNode(root,x);
        System.out.println();
        PrintTree (root);
        
    }
    ////////////////////////////  inorder /////////////////////////
    static void PrintTree(Node root){
       
        if(root!=null){
        PrintTree(root.left);
        System.out.print(root.data+ " ");
        PrintTree(root.right);
        }
        
    }
   
     // Function to delete a node from BST.
    public static Node deleteNode(Node root, int x) {
        // code here.
        if (root == null)return null;
        else if(root.data>x)
        root.left = deleteNode(root.left,x);
        else if(root.data<x)
        root.right = deleteNode(root.right,x);
        else{
            if(root.left == null) return root.right;
            else if(root.right == null)return root.left;
            else{
//               when root == x 
                Node succ = getSuc(root);
                root.data = succ.data;
                root.right = deleteNode(root.right,succ.data);
            }
        }
        return root;
        
    }
    static Node getSuc(Node root){
        Node curr = root.right;
        while(curr!= null && curr.left != null)
        curr= curr.left;
        return curr;
    }
}
