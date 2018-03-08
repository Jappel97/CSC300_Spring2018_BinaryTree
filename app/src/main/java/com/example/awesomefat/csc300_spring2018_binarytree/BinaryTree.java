package com.example.awesomefat.csc300_spring2018_binarytree;

/**
 * Created by awesomefat on 3/6/18.
 */

public class BinaryTree
{
    private Node root;

    public BinaryTree()
    {
        this.root = null;
    }

    /*
    public void add(int payload)
    {
        String directions = "";

        if(this.root == null)
        {
            this.root = new Node(payload);
            directions = "Root";
        }
        else {
            Node currNode = this.root;

            while (true) {
                if (payload <= currNode.getPayload()) {
                    if (currNode.getLeftChild() == null) {
                        currNode.setLeftChild(new Node(payload));
                        directions = directions + "Left ";
                        break;
                    } else {
                        currNode = currNode.getLeftChild();
                        directions = directions + "Left ";
                    }
                } else {
                    if (currNode.getRightChild() == null) {
                        currNode.setRightChild(new Node(payload));
                        directions = directions + "Right ";
                        break;
                    } else {
                        currNode = currNode.getRightChild();
                        directions = directions + "Right ";
                    }
                }
            }
        }
        System.out.println("***********" + directions);
    }
    */

    public void newAdd(int payload)
    {
        this.root.add(payload);
    }

    public void display()
    {
        if(this.root == null)
        {
            System.out.println("Empty Tree");
        }
        else
        {

        }
    }
}
