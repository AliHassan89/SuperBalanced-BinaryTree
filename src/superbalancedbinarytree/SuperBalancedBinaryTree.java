/*

Write a method to see if a binary tree ↴ is "superbalanced" (a new tree 
property we just made up).
A tree is "superbalanced" if the difference between the depths of any two leaf 
nodes ↴ is no greater than one.

Node class is provided

 */
package superbalancedbinarytree;

/**
 *
 * @author Ali
 */
public class SuperBalancedBinaryTree 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        Node right = root.insertLeft(9).insertLeft(7).insertLeft(5);
        Node left = root.insertRight(12);
        
        System.out.println(isSuperBalanced(root));
        
    }
    
    private static boolean isSuperBalanced(Node root)
    {
        if (root == null)
            return true;
        
        if (Math.abs(heightOfTree(root.left) - heightOfTree(root.right)) > 1)
            return false;
        
        return isSuperBalanced(root.left) && isSuperBalanced(root.right);
    }
    
    private static int heightOfTree(Node node)
    {
        if (node == null)
            return 1;
        
        return heightOfTree(node.left) + heightOfTree(node.right);
    }
}
