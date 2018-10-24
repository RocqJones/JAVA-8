package pkg2.pkg4.dsarvbinarysearchtree;
// Java program to demonstrate insert operation in binary search tree
public class DSARvBinarySearchTree {
/*
    binary search tree (BST), sometimes also called an ordered or sorted binary tree, is a node-based binary tree data 
    structure which has the following properties:    
    i)The left subtree of a node contains only nodes with keys lesser than the node’s key.
    ii)The right subtree of a node contains only nodes with keys greater than the node’s key.
    iii)The left and right subtree each must also be a binary search tree.
    iv)There must be no duplicate nodes.  
    
    
    Searching a key
To search a given key in Binary Search Tree, we first compare it with root, if the key is present at root, we return root.
If key is greater than root’s key, we recur for right subtree of root node. Otherwise we recur for left subtree.
    */
    
    /*
    -->Illustration to search 6 in below tree:
1. Start from root.
2. Compare the inserting element with root, if less than root, then recurse for left, else recurse for right.
3. If element to search is found anywhere, return true, else return false.
    
    -->Insertion of a key
A new key is always inserted at leaf. We start searching a key from root till we hit a leaf node. Once a leaf node is found, 
the new node is added as a child of the leaf node.

         100                               100
        /   \        Insert 40            /    \
      20     500    --------->          20     500 
     /  \                              /  \  
    10   30                           10   30
                                              \   
                                              40

    */
    /* Class containing left and right child of current node and key value*/
        class Node { 
            int key; 
            Node left, right; 

            public Node(int item) { 
                key = item; 
                left = right = null; 
            } 
        } 

        // Root of BST 
        Node root; 

        // Constructor 
        DSARvBinarySearchTree() {  
            root = null;  
        } 

        // This method mainly calls insertRec() 
        void insert(int key) { 
           root = insertRec(root, key); 
        } 

        /* A recursive function to insert a new key in BST */
        Node insertRec(Node root, int key) { 

            /* If the tree is empty, return a new node */
            if (root == null) { 
                root = new Node(key); 
                return root; 
            } 

            /* Otherwise, recur down the tree */
            if (key < root.key) 
                root.left = insertRec(root.left, key); 
            else if (key > root.key) 
                root.right = insertRec(root.right, key); 

            /* return the (unchanged) node pointer */
            return root; 
        } 

        // This method mainly calls InorderRec() 
        void inorder()  { 
           inorderRec(root); 
        } 

        // A utility function to do inorder traversal of BST 
        void inorderRec(Node root) { 
            if (root != null) { 
                inorderRec(root.left); 
                System.out.println(root.key); 
                inorderRec(root.right); 
            } 
        } 

        // Driver Program to test above functions 
        public static void main(String[] args) { 
            DSARvBinarySearchTree tree = new DSARvBinarySearchTree(); 

            /* Let us create following BST 
                  50 
               /     \ 
              30      70 
             /  \    /  \ 
           20   40  60   80 */
            tree.insert(50); 
            tree.insert(30); 
            tree.insert(20); 
            tree.insert(40); 
            tree.insert(70); 
            tree.insert(60); 
            tree.insert(80); 

            // print inorder traversal of the BST 
            tree.inorder(); 
        } 
} 