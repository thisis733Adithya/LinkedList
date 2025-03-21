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

    public boolean insertNode(int data)
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

    public boolean searchNode(int data)
    {
        Node temp = Head;
        if(Head == null)
        {
            System.out.println("The List is Empty ");
            return false;
        }

        while(temp != null && temp.data != data)
        {
            temp=temp.link;
        }

        if(temp == null)
        {
            System.out.println("Searching Failed");
        }else
        {
            System.out.println("Element found");
        }

        return true;

    }

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

}

public class ClassDemo
{
    public static void main(String[] adhi)
    {
        Linkedlist linkList = new Linkedlist();
        linkList.insertNode(10);
        linkList.insertNode(12);
        linkList.insertNode(13);
        linkList.insertNode(23);
        linkList.insertNode(34);
        linkList.insertNode(45);

        linkList.searchNode(10);
        linkList.searchNode(34);
      //  linkList.deleteNode(12);

        linkList.displayNode();

        System.out.println("Count :" + linkList.countNodes());

    }
}


    