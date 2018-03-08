package com.example.awesomefat.csc300_spring2018_binarytree;

/**
 * Created by awesomefat on 3/6/18.
 */

public class Node
{
    private int payload;
    private Node leftChild = null;
    private Node rightChild = null;

    public Node(int payload)
    {
        this.payload = payload;
        //this.leftChild = null;
        //this.rightChild = null;
    }

    public int getPayload() {
        return payload;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    private void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    private void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getRightChild() {

        return rightChild;
    }

    public void add(int newPay)
    {
        //determine right from left
        if(newPay <= this.payload)
        {
            //left case
            System.out.println("Went left <--");
            if(this.leftChild != null)
            {
                //pass the buck
                this.leftChild.add(newPay);
            }
            else
            {
                //create the left node
                this.setLeftChild(new Node(newPay));
                System.out.println("*******Set!*******");
            }
        }
        else
        {
            //right case
            System.out.println("Went Right -->");
            if(this.rightChild != null)
            {
                //pass the buck
                this.rightChild.add(newPay);
            }
            else
            {
                this.setRightChild(new Node(newPay));
                System.out.println("*******Set!*******");
            }
        }
    }


}
