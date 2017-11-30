/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superbalancedbinarytree;

/**
 *
 * @author Ali
 */
public class Node 
{
    public int value;
    public Node left;
    public Node right;

    public Node(int value) 
    {
        this.value = value;
    }

    public Node insertLeft(int leftValue) 
    {
        this.left = new Node(leftValue);
        return this.left;
    }

    public Node insertRight(int rightValue)
    {
        this.right = new Node(rightValue);
        return this.right;
    }
}
