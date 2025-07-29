package LinkedList;

import java.util.Scanner;

public class DoublleyLinkedList {
    static Scanner sc=new Scanner(System.in);
    public static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    public Node tail;
    public Node head;

    public void insertAtBegin(int data) { 
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.previous = temp;
    }

    public void insertAfter(int newData, int oldData) {
         if(head==null)
        {
          System.out.println("List is empty");
         return;
        }
        Node newNode = new Node(newData);
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldData) {
                newNode.next = temp.next;

                newNode.previous = temp;
                if (temp.next != null) {
                    temp.next.previous = newNode;
                }
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
            System.out.println("node not found");
    }
    public void insertBefore(int newData,int oldData)
    {
        if(head==null)
        {
          System.out.println("List is empty");
         return;
        }
        Node newNode=new Node(newData);
        if(head.data==oldData)
        {
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data==oldData)
            {
                newNode.next=temp.next;
                newNode.previous=temp;
                temp.next.previous=newNode;
                temp.next=newNode;
                return;
            }
            temp=temp.next;
        }
        System.out.println("node not found");
    }
    public void deleteEnd()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
           temp=temp.next;
        }
        temp.previous.next=null;       
    }
    public void deleteStart()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        head=head.next;
        head.previous=null;
    }
    public void deleteByValue(int data)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        else if(head.data==data && head.next!=null)
        {
            head=head.next;
            head.previous=null;
            return;
        }
        else if(head.data==data)
        {
            head=null;
            return;
        }
        Node temp=head.next;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                temp.previous.next=temp.next;
                if(temp.next!=null){
                temp.next.previous=temp.previous;}
              
                return;
            }
            temp=temp.next;
        }
        System.out.println("not not find");
    }

    public void display() {
        System.out.print("null<-");
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + "<->");
            } else {
                System.out.print(temp.data + "->");
            }

            temp = temp.next;
        }
        System.out.println("null");
    }
      public boolean isPlaindrome()
        {
            if(head==null)
            {
                return true;
            }
           Node start=head;
           Node end=head;
           while(end.next!=null)
           {
            end=end.next;
           }
           while(start!=end && start.previous!=end)
           {
                if(start.data!=end.data)
                {
                    return false;
                }
                start=start.next;
                end=end.previous;
           }
            return true;
        }
        public void reverse()
        {
            if(head==null)
            {
                return;
            }
            Node previous=null;
            Node next=null;
            Node current=head;
            while(current!=null)
            {
                next=current.next;
                current.next=previous;
                current.previous=next;
                previous=current;
                current=next;
            }
            head=previous;
        }
    public static void mergePoint(DoublleyLinkedList dl1,DoublleyLinkedList dl2)
    {
        Node pointer1=dl1.head;
        Node pointer2=dl2.head;
        while(pointer1!=pointer2)
        {
            if(pointer1!=null)
            {
                pointer1=pointer1.next;
            }
            else{
                pointer1=dl2.head;
            }
            if(pointer2!=null)
            {
                pointer2=pointer2.next;
            }
            else{
                pointer2=dl1.head;
            }
        }
        if(pointer1!=null)
        {
             System.out.println(pointer1.data);
        }
        else{
            System.out.println("no merge point");
        }
       
       
    }
    public static DoublleyLinkedList conact(DoublleyLinkedList dl1,DoublleyLinkedList dl2)
     {
            if(dl1.head==null && dl2.head==null)
            {
                return null;
            }
            if(dl1.head==null)
            {
                return dl2;
            }
            if(dl2.head==null)
            {
                return dl1;
            }
            Node temp=dl2.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=dl1.head;
            dl1.head.previous=temp;
            return dl2;   
       }
       public  void isLopp()
       {
            Node slow=head;
            Node fast=head;
            boolean hasLoop=false;
            while(fast.next!=null && fast.next.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast)
                {
                    hasLoop=true;                  
                    break;
                }
            }
            if(hasLoop==false)
            {
                return;
            }
             if(slow==fast)
                {
                    while(fast.next!=head)
                    {
                        fast=fast.next;
                    }
                    fast.next=null;
                    return;
                }
            Node previous=null;
            slow=head;
            while(slow!=fast)
            {
                previous=fast;
                slow=slow.next;
                fast=fast.next;
            }
            previous.next=null;
       }
       public static DoublleyLinkedList devide(DoublleyLinkedList dl)
       {
            DoublleyLinkedList leftDL=new DoublleyLinkedList();
            DoublleyLinkedList rightDL=new DoublleyLinkedList();
            if(dl.head.next==null)
            {
                return dl;
            }
            Node slow=dl.head;
            Node fast=dl.head;
            while(fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;                //null<-5<->4<->3<->2<->1->null
            }                                                      
            Node leftTemp=dl.head;
            Node rightTemp=slow.next;
            slow.next=null;
            rightTemp.previous=null;
            leftDL.head=leftTemp;
            rightDL.head=rightTemp;
            leftDL=devide(leftDL);
            rightDL=devide(rightDL);  
            return concurr(leftDL,rightDL);   
       }
       public static DoublleyLinkedList concurr(DoublleyLinkedList leftDL,DoublleyLinkedList rightDL)
       {
            DoublleyLinkedList dl=new DoublleyLinkedList();
            Node leftTemp=leftDL.head;
            Node rightTemp=rightDL.head;
            Node previous=null;
            while(leftTemp!=null && rightTemp!=null)
            {
                if(leftTemp.data<=rightTemp.data)
                {
                    
                    if(dl.head==null)
                    {
                        dl.head=leftTemp; 
                        dl.tail=dl.head;
                        dl.tail.previous=previous;
                        previous=dl.tail;         
                        leftTemp=leftTemp.next;
                    }
                    else{
                        dl.tail.next=leftTemp;
                        dl.tail=dl.tail.next;
                        dl.tail.previous=previous;
                        previous=dl.tail;
                        leftTemp=leftTemp.next;
                    }
                }
                else{
                      if(dl.head==null)
                    {
                        dl.head=rightTemp;
                        dl.tail=  dl.head;
                        dl.tail.previous=previous;
                        previous=dl.tail;
                        rightTemp=rightTemp.next;
                    }
                    else{
                        dl.tail.next=rightTemp;
                         dl.tail=dl.tail.next;
                        dl.tail.previous=previous;
                        previous=dl.tail;
                        rightTemp=rightTemp.next;
                    }
                }
            }
                while(leftTemp!=null)
                {
                    dl.tail.next=leftTemp;
                    dl.tail=dl.tail.next;
                    dl.tail.previous=previous;
                    previous=dl.tail;
                    leftTemp=leftTemp.next;
                }
                while(rightTemp!=null)
                {
                    dl.tail.next=rightTemp;
                    dl.tail=dl.tail.next;
                    dl.tail.previous=previous;
                    previous=dl.tail;
                    rightTemp=rightTemp.next;
                }
            return dl;
       }
    //    private void genricInsert(Node begin,Node mid,Node end)
    //    {
    //         if(begin!=null)
    //         {
    //             if(head==null)
    //             head=begin;
    //             else
    //             {
    //             begin.next=head;
    //             head.previous=begin;
    //             head=begin;
    //             }
    //         }
    //         else if(mid!=null)
    //         {
    //             Node slow=head;
    //             Node fast=head;
    //             while(fast.next!=null && fast.next.next!=null)
    //             {
    //                 slow=slow.next;
    //                 fast=fast.next.next;
    //             }
    //             slow.previous.next=mid;
    //             mid.next=slow;
    //             slow.previous=mid;
    //         }
    //         else if(end!=null)
    //         {
    //             Node temp=head;
    //             while(temp!=null)
    //             {
    //                 temp=temp.next;
    //             }
    //             temp.next=end;
    //             end.previous=temp;
    //         }
       }    
    public static void main(String args[]) {
        DoublleyLinkedList dl = new DoublleyLinkedList();
        DoublleyLinkedList dl2 = new DoublleyLinkedList();
        dl.insertAtEnd(50);
        dl.insertAtEnd(40);
        dl.insertAtEnd(10);
        dl.insertAtEnd(20);
        dl.insertAtEnd(30);
        dl.display();
        // dl.insertBefore(100, 70);
        // dl.deleteEnd();
        // dl.deleteStart();
        // dl.deleteByValue(50);
        // System.out.println(dl.isPlaindrome());
        // dl.reverse();
        // dl2.insertAtEnd(60);
        // dl2.insertAtEnd(70);
        // dl2.insertAtEnd(80);
        // dl2.display();
        // mergePoint(dl,dl2);
        // conact(dl, dl2);
        dl=devide(dl);
        dl.display();
    }
}
