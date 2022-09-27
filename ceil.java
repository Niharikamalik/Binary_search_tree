    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int res =0;
       while (root!=null)
       { 
           if(root.data == key)return root.data;
        
        else if(root.data < key)
        root = root.right;
        else {
            res = root.data;
            root = root.left;
        }
           
       }
        return res;
    }
