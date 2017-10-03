//import BinaryTree.Node;

public class BinaryTree {
	 private Node root;             // root of BST

	    /**
	     * Private node class.
	     */
	    private class Node {
	        private Node left, right;  // left and right subtrees
	        private int N;             // number of nodes in subtree

	        public Node(int N) {
	            this.N = N;
	        }
	    }
	    
	    public static void createTree(int [] array)
	    {
	    	int mid;
	    	BinaryTree tree = new BinaryTree();
	    	mid = findRoot(array);
	    	putRoot(array[mid], tree);
	    	
	    	
	    }
	    
	    public static int findRoot(int [] array)
	    {
	    	int mid = 0;
	    	if(array.length == 0 || array.length == 1)
	    	{
	    		return 0;
	    	}
	    	else
	    	{
	    		mid = ((array.length)/2)-1;
	    		return mid;
	    	}
	    }
	    
	    public static void putRoot(int N, BinaryTree tree)
	    {
	    	Node node = new Node(N);
	    	tree.root = node;  
	    }
	    
	    public void add(BinaryTree tree, int val, Node N)
	    {
	    	
	    }

}
