import java.util.*;

class Node
{
    public int data;
    Node link;

    public Node(int data)
    {
        this.data = data;
        // this.link = null;
    }
}

class Linkedlist
{
    Node Head;

    public Node createNode(int data)
    {
        Node newNode = new Node(data);
        newNode.link = null;
        return newNode;
    }

    public boolean insertNodeAtFront(int data)
    {
        Node curNode = createNode(data);
        if(Head == null)
        {
            Head = curNode;
            System.out.println("Inserted the First Node with data : " + curNode.data);
            return true;
        }
        Node temp = Head;

        while(temp.link != null)
        {
            temp = temp.link;
        }
        temp.link = curNode;
        System.out.println("Successfully Inserted the Next Nodewith data : " + curNode.data);
        return true;
    }

    public boolean insertNodeAtEnd(int data)
    {
        Node newNode= createNode(data);
        if(newNode != null)
        {
            if(Head == null)
            {
                Head = newNode;
                System.out.println("Inserted the First Node ");
                return true;
            }
            newNode.link = Head;
            Head = newNode;
            System.out.println("Inserted " +newNode.data +" at the End ");        
        }
       return true;
    }

    // public Node searchNode(int data)
    // {
    //     Node temp = Head;
    //     if(Head == null)
    //     {
    //         System.out.println("The List is Empty ");
    //         return Head;

            
    //     }

    //     while(temp != null && temp.data != data)
    //     {
    //         temp=temp.link;
    //     }

    //     if(temp == null)
    //     {
    //         return temp;
    //     }

    //     return temp;

    // }

    public boolean deleteNode(int data)
    {
        Node temp = Head, prev = null;
        if(Head == null)
        {
            System.out.println("The List is Empty ");
            return false;
        }

        while(temp.link != null && temp.data != data)
        {
            prev = temp;
            temp = temp.link;
        }
        System.out.println("Deleted : "+temp.data);
        prev.link = temp.link;
        return true;
    }

    public boolean deleteFirstNode()
    {
        Node temp = Head;

        if(temp == null)
        {
            return false;
        }
        Head = temp.link;
        return true;
    }

    public boolean deleteLastNode()
    {
        Node temp = Head, prev = null;
        if(temp != null)
        {
            while(temp.link != null)
            {
                prev = temp;
                temp = temp.link;
            }
            prev.link = null;
            
        }
        return true;
    }

    public boolean displayNode()
    {
        if(Head == null)
        {
            System.out.println("The List is Empty");
            return false;
        }
        Node temp = Head;

        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp=temp.link;            
        }
        System.out.println("NULL");

        return true;

    }

    public int countNodes()
    {
        Node temp = Head;
        int count = 0;

        while(temp!= null)
        {
            count++;
            temp = temp.link;
        }

        return count;

    }

    public boolean insetertbefore(int key,int data)
    {
        Node newNode = createNode(data);
        Node  tempNode = Head, prev = null;

        while(tempNode.link != null &&tempNode.data != key)
        {
            prev = tempNode;
            tempNode = tempNode.link;
        }
        prev.link = newNode;
        newNode.link=tempNode;

        return true;

    }

    public boolean insetertAfter(int key, int data)
    {
        Node newNode = createNode(data);
        Node  tempNode = Head;

        while(tempNode.link != null &&tempNode.data != key)
        {
            // priv = tempNode;
            tempNode = tempNode.link;
        }
         newNode.link = tempNode.link;
         tempNode.link = newNode;

        return true;
    }
}

public class SLL
{
    public static void main(String[] adhi)
    {
        Linkedlist linkList = new Linkedlist();
        // linkList.insertNode(10);
        // linkList.insertNode(12);
        // linkList.insertNode(13);
        // linkList.insertNode(23);
        // linkList.insertNode(34);
        // linkList.insertNode(45);

        linkList.insertNodeAtFront(1);
        linkList.insertNodeAtFront(2);
        linkList.insertNodeAtFront(3);
        linkList.insertNodeAtFront(4);
        linkList.insertNodeAtEnd(5);
        linkList.insertNodeAtEnd(6);

        linkList.displayNode();

        // linkList.deleteFirstNode();
        // linkList.deleteLastNode();

        linkList.insetertbefore(3, 12);
        linkList.insetertAfter(2, 98);





        linkList.displayNode();

        System.out.println("Count :" + linkList.countNodes());

    }
}


    