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
        int n = 5;
        System.out.print("\n"+search(root ,n));
    }
    ////////////////////////////  inorder /////////////////////////
    static void PrintTree(Node root){
       
        if(root!=null){
        PrintTree(root.left);
        System.out.print(root.key+ " ");
        PrintTree(root.right);
        }
        
    }
    static boolean search(Node root ,int x){
            if(root == null ) return false ;
            else if(root.key == x)return true ;
            else if(root.key < x)return search(root.right,x);
            else return search(root.left,x);
    }
}
