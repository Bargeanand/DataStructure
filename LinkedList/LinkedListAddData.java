import java.util.Scanner;
public class LinkedListAddData{
    Scanner sc=new Scanner(System.in);
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFirst(int data)
        {
            Node newNode=new Node( data);
            size++;
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addLast(int data)
        {
            Node newNode=new Node( data);
            size++;
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print()
        {
            if(head==null)
            {
                System.out.println("null");
                return;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void addAccordingIndex(int data)
        {
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            System.out.println("enter a index where you wangt to insert node");
            int index=sc.nextInt();
            if(index==0)
            {
                addFirst(data);
                return;
            }
            while(i<index-1)
            {
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public void removeFirst()
        {
            if(size==0)
            {
                System.out.println("LinkList is empty");
                return;
            }
            else if(size==1)
            {
                head=tail=null;
                size--;
            }
            head=head.next;
            size--;
        }
        public void removeLast()
        {
            Node temp=head;
            int i=0;
            if(size==0)
            {
                System.out.println("null");
            }
            else if(size==1)
            {
                head=tail=null;     //only for size calculation
                size--;
            }
            while(i<size-2)
            {
                temp=temp.next;
                i++;
            }
            temp.next=null;
            size--;
        }
        public void removeAccordingToPosition(int position)
        {
            int i=0;
            Node temp=head;
          if(size==0)
          {
             size--;
          }
          if(size==1)              //only for size calculation
          {
            size--;
          }
            while(i<position-2)
            {
                temp=temp.next;
                i++;
            }
           Node prvious=temp.next;
           temp.next=prvious.next;
           size--;
        }
        public void searchData(int key)
        {
            int position=1;
            Node temp=head;
            boolean found=false;
            while(found==false && temp!=null)
            {
                if(key==temp.data)
                {
                    System.out.println("key found at:"+position);
                    found=true;
                    return;
                }
                temp=temp.next;
                position++;
            }
            if(found==false)
            {
                System.out.println("key not found");
            }

        }
        // public void ReverseLL()
        // {
        //     Node temp=head;
        //     Node Privious=temp;
        //     int swap;
        //     int i=0;
        //     while(i!=size-1)
        //     {
        //          temp=head;
                
        //         int j=0;
        //         while(j<size-i-1)
        //         {
        //             Privious=temp.next;
        //             swap=temp.data;
        //             temp.data=Privious.data;
        //             Privious.data=swap;
        //             temp=temp.next;
        //             j++;
        //         }
        //         i++;
        //     }
        // }
        public void ReverseLL()
        {
            Node Privious=null;
            Node current=head;
            Node Next;
            while(current!=null)
            {
                Next=current.next;
                current.next=Privious;
                Privious=current;
               
                current=Next;
            }
            head=Privious;
        }
    public static  void main(String args[])
    {
        LinkedListAddData ll=new LinkedListAddData();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addAccordingIndex(6);
        ll.print();
        System.out.println("size:"+size);
      //  ll.removeAccordingToPosition(4);
        ll.print();
        System.out.println("size:"+size);
        ll.searchData(5);
         ll.ReverseLL();
        ll.print();
    }
}