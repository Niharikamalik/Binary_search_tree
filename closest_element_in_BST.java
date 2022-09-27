class Ans{
    int ans = Integer.MAX_VALUE;
}
class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer
    static void min(Node root, int x, Ans a){
        if(root==null) return;
        min(root.left,x,a);
        a.ans = Math.min(a.ans,Math.abs(x-root.data));
        min(root.right,x,a);
    }
    static int minDiff(Node  root, int x) 
    { 
        // Write your code here
        Ans a = new Ans();
        min(root,x,a);
        return a.ans;
    }
}
