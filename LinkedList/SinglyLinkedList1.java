package LinkedList;

import java.util.Scanner;
import java.util.ArrayList;

public class SinglyLinkedList1 {
    static Scanner sc = new Scanner(System.in);

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {

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

    }

    public void insertMiddle(int position) {
        System.out.println("enter data of new Node");
        Node newNode = new Node(sc.nextInt());
        if (position <= 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int index = 0;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            System.out.println("position  greater than linked list length");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void updateData(int position, int data) // set method
    {
        if (position < 0) {
            System.out.println("wrong position");
            return;
        }
        int index = 0;
        Node temp = head;
        if (index < position && temp != null) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            System.out.println("wrong position");
            return;
        }
        temp.data = data;
    }

    public void searchNode(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("node found");
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("node not found");
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void getLast() {
        if (head == null) {
            System.out.println("list doesn't contain any node");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void getFirst() {
        if (head == null) {
            System.out.println("list doesn't contain any node");
            return;
        }
        System.out.println(head.data);
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node deleteNode = head;
        Node currentNode = head;
        while (deleteNode.next != null) {
            currentNode = deleteNode;
            deleteNode = deleteNode.next;
        }
        if (deleteNode == currentNode) {
            head = null;
            return;
        }
        currentNode.next = null;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        head = head.next;
    }

    public void maxNode() {
        int max = Integer.MIN_VALUE;
        Node maxNode = null;
        Node temp = head;
        while (temp != null) {
            if (max < temp.data) {
                max = temp.data;
                maxNode = temp;
            }
            temp = temp.next;
        }
        System.out.println(maxNode);
    }

    public void getMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("mid:" + slow.data);
    }

    public void reverseLinkedList() {
        if (head == null) {
            return;
        }
        Node priviousNode = head;
        Node currentNode = head.next;
        Node nextNode = currentNode;
        head.next = null;

        while (nextNode != null) {
            nextNode = nextNode.next;
            currentNode.next = priviousNode;
            priviousNode = currentNode;
            currentNode = nextNode;
        }
        head = priviousNode;
    }

    public void sortList() {
        int length = length();
        int i, j;
        i = j = 0;
        while (i < length) {
            Node currNode = head;
            Node nextNode = currNode.next;
            Node temp;
            while (j < length - 1 - i) {
                if (currNode.data > nextNode.data) {
                    temp = currNode;
                    currNode.data = nextNode.data;
                    nextNode.data = temp.data;
                    currNode.next = nextNode.next;
                    nextNode.next = temp;

                    temp = nextNode;
                    nextNode = currNode.next;
                    currNode = temp;
                }
                temp = nextNode;
                nextNode = currNode.next;
                currNode = temp;
                j++;
            }
            i++;
        }
    }

    public int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void mergePoint(SinglyLinkedList1 l1, SinglyLinkedList1 l2) {
        Node pointer1 = l1.head;
        Node pointer2 = l2.head;
        int i = 0;
        while (pointer1 != pointer2) {
            pointer1 = (pointer1 == null) ? l2.head : pointer1.next;
            pointer2 = (pointer2 == null) ? l1.head : pointer2.next;
            i++;
        }
        if (pointer1 != null) {
            System.out.println("Merge point data: " + pointer1.data);
            System.out.println(i);
        } else {
            System.out.println("No merge point.");
        }
    }

    public int searchNodeRecursive(int data, Node temp, int posotion) {
        if (temp == null) {
            return 0;
        }
        if (data == temp.data) {
            return posotion;
        }
        return searchNodeRecursive(data, temp.next, posotion + 1);

    }

    public void removeNodeFromlast(int position) {
        if (head == null) {
            return;
        }
        if (position >= length()) {
            return;
        }
        int index = length() - position - 1;
        if (index == 0) {
            head = head.next;
            return;
        }
        int i = 1;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public boolean isPalindrom1() {
        ArrayList<Integer> al = new ArrayList<>();
        if (head == null) {
            return true;
        }
        Node temp = head;
        while (temp != null) {
            al.add(temp.data);
            temp = temp.next;
        }
        for (int i = 0; i < al.size() / 2; i++) {
            if (al.get(i) != al.get(al.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrom2() {
        if (head == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node currNode = slow.next;
        Node privious = null;
        Node next = slow;
        slow.next = null;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = privious;
            privious = currNode;
            currNode = next;
        }
        Node temp = head;
        while (privious != null) {
            if (temp.data != privious.data) {
                return false;
            }
            privious = privious.next;
            temp = temp.next;
        }
        return true;
    }

    public boolean isLoop() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        Node slow = head;
        Node fast = head;
        int i = 0;
        while (fast.next != null && fast.next.next != null) {
            if (slow == fast && i != 0) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
            i++;
        }
        return false;
    }

    public void loopRemoval() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        Node slow = head;
        Node loop = null;
        boolean isLoop = false;
        ArrayList<Node> list = new ArrayList<>();
        while (isLoop == false) {
            int i = 0;
            while (i < list.size() && loop == null) {
                if (slow == list.get(i)) {
                    loop = slow;
                    break;
                }
                i++;
            }
            if (loop == null) {
                list.add(slow);
            }
            slow = slow.next;
            if (slow.next == loop) {
                isLoop = true;
                System.out.println("slow.data:" + slow.data);
                slow.next = null;
                break;
            }

        }

    }

    public void loopRemoval2() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        Node slow = head;
        Node fast = head;
        boolean isLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isLoop = true;
                break;
            }
        }
        if (!isLoop) {
            return; 
        }
        slow = head;
        Node prev = null;
        if (slow == fast) {
            while (fast.next != head) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public SinglyLinkedList1  devide(SinglyLinkedList1 l) {

        if(l.head.next==null) {
            return l;
        }
        SinglyLinkedList1 leftPart = new SinglyLinkedList1();
        SinglyLinkedList1 rightPart = new SinglyLinkedList1();
        Node slow = l.head;
        Node fast = l.head;
       

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        leftPart.head=l.head;
        rightPart.head=slow.next;
        slow.next=null;
        leftPart=devide(leftPart);
        rightPart=devide(rightPart);
        return concurr(leftPart, rightPart);
        
    }

    public SinglyLinkedList1 concurr(SinglyLinkedList1 leftPart, SinglyLinkedList1 rightPart) {
        SinglyLinkedList1 ll = new SinglyLinkedList1();
        Node leftTemp = leftPart.head;
        Node rightTemp = rightPart.head;
        while (leftTemp != null && rightTemp != null) {
            if(leftTemp.data <= rightTemp.data) {
                if(ll.tail==null)
                {
                    ll.head=leftTemp;
                    ll.tail=leftTemp;
                    
                }
                else{
                    ll.tail.next=leftTemp;
                    ll.tail=ll.tail.next;
                }
                leftTemp = leftTemp.next;
            } 
            else {
                 if(ll.tail==null)
                {
                    ll.head=rightTemp;
                    ll.tail=rightTemp;
                }
                else{
                    ll.tail.next=rightTemp;
                    ll.tail=ll.tail.next;
                }
                rightTemp = rightTemp.next;
            }
        }
        while (leftTemp!= null) {
           if(ll.tail==null)
                {
                    ll.head=leftTemp;
                    ll.tail=leftTemp;
                 
                }
                else{
                    ll.tail.next=leftTemp;
                    ll.tail=ll.tail.next;
                }
                leftTemp = leftTemp.next;
        }
        while (rightTemp!= null) {
            if(ll.tail==null)
                {
                    ll.head=rightTemp;
                    ll.tail=rightTemp;
                }
                else{
                    ll.tail.next=rightTemp;
                    ll.tail=ll.tail.next;
                }
                rightTemp = rightTemp.next;
        }
        return ll;
    }
    public SinglyLinkedList1 zigZag()
    {
        ArrayList<Node> list = new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list.add(temp);
            temp=temp.next;
        }
        int size=list.size()/2;
        SinglyLinkedList1 ll=new SinglyLinkedList1();
        for(int i=0;i<Math.ceil((list.size()/2.0));i++)
        {
            ll.addLast(list.get(i).data);
            if(list.size()-1-i!=i){
            ll.addLast(list.get(list.size()-1-i).data);
            }
        }
        return ll;
    }
    public void zigzag1()
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node current=slow.next;
        Node nextNode;
        slow.next=null; 
        Node privious=null;
        while(current!=null)
        {
            nextNode=current.next;
            current.next=privious;
            privious=current;
            current=nextNode;
        }
        Node first=head;
        Node last=privious;
        Node temp1;
        Node temp2;
        while(last!=null)
        {
            temp1=first.next;
            temp2=last.next;
            first.next=last;
            last.next=temp1;
            first=temp1;
            last=temp2;
        }
    }
   public SinglyLinkedList1 evenOdd(SinglyLinkedList1 l) {
        SinglyLinkedList1 evenSL = new SinglyLinkedList1();
        SinglyLinkedList1 oddSL = new SinglyLinkedList1();
        Node temp = head;
        Node evenDummy=new Node(0);
        Node oddDummy=new Node(0);
        evenSL.head = evenDummy;
        oddSL.head = oddDummy;
        evenSL.tail=evenDummy;
        oddSL.tail=oddDummy;
        while (temp != null) {
            if (temp.data % 2 == 0) // 10 12 5 4 1 6
            {
                evenSL.tail.next = new Node(temp.data);
                evenSL.tail = evenSL.tail.next;
            } else {
                    oddSL.tail.next = new Node(temp.data);
                    oddSL.tail = oddSL.tail.next;
            }
            temp = temp.next;
        }
        if(evenSL.head.next==null)
        {
            oddSL.tail.next=null;
            oddSL.head=oddSL.head.next;
            return oddSL;
        }
        evenSL.tail.next=oddSL.head.next;
        evenSL.head=evenSL.head.next;
        oddSL.tail.next=null;
        System.out.println("orignal:");
        l.display();
        return evenSL;
    }
        public void deleteNNodesAfterMNodes(int m, int n) {
        int orignalM = m;
        int orignalN = n;
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            if (m == 0) {
                if (temp == head) {
                    while (n != 0) {
                        temp = head;
                        head = head.next;
                        n--;
                    }
                    m = orignalM;
                    n = orignalN;
                } else {
                    while (n != 0 && temp != null) {
                        previous.next = temp.next;
                        temp = temp.next;
                        n--;

                    }
                    m = orignalM - 1;
                    n = orignalN;
                }
            } else {
                m--;
            }
            previous = temp;
            temp = temp.next;
        }
    }

    public void deleteNNodesAfterMNodesBest(int m, int n) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            for (int i = 0; i < m && current != null; i++) {
                previous = current;
                current = current.next;
            }
            if (current == null) {
                break;
            }
            Node temp = current;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            if (current == head) {
                if (temp == current) {
                    current = current.next;
                    head = current;
                } else {
                    current = temp;
                    head = current;
                }
            } else {
                previous.next = temp;
                current = temp;
            }
        }
    }

    public SinglyLinkedList1 mergeKSortedList(SinglyLinkedList1[] l1) {

        SinglyLinkedList1 mergerdList = new SinglyLinkedList1();
        for (int i = 0; i < l1.length; i++) {
            mergerdList = mergeList(mergerdList, l1[i]);
        }
        return mergerdList;
    }

    public SinglyLinkedList1 mergeList(SinglyLinkedList1 l1, SinglyLinkedList1 l2) {
        SinglyLinkedList1 l = new SinglyLinkedList1();
        Node leftTemp = l1.head;
        Node rightTemp = l2.head;
        Node dummy = new Node(0);
        l.head = dummy;
        l.tail = dummy;
        while (leftTemp != null && rightTemp != null) {
            if (leftTemp.data < rightTemp.data) {
                l.tail.next = new Node(leftTemp.data);
                l.tail = l.tail.next;
                leftTemp = leftTemp.next;
            } else if (leftTemp.data >= rightTemp.data) {

                l.tail.next = new Node(rightTemp.data);
                l.tail = l.tail.next;
                rightTemp = rightTemp.next;
            }
        }
        while (leftTemp != null) {

            l.tail.next = new Node(leftTemp.data);
            l.tail = l.tail.next;
            leftTemp = leftTemp.next;
        }
        while (rightTemp != null) {
            l.tail.next = new Node(rightTemp.data);
            l.tail = l.tail.next;
            rightTemp = rightTemp.next;
        }
        l.head = l.head.next;

        return l;
    }
    public static void main(String args[]) {
        SinglyLinkedList1 ll = new SinglyLinkedList1();
        ll.addLast(sc.nextInt());
        ll.addLast(sc.nextInt());
        ll.addLast(sc.nextInt());
        ll.addLast(sc.nextInt());
        ll.addLast(sc.nextInt());
        // ll.addLast(sc.nextInt());
        // ll.addLast(sc.nextInt());
        // ll.addLast();
        // SinglyLinkedList1 l2=new SinglyLinkedList1();
        // System.out.println("l2");
        // l2.addLast();
        // l2.addLast();
        // l2.addLast();
        // l2.addLast();
        // System.out.println("enter position you want o insert in miidel");
        // int position=sc.nextInt();
        // ll.insertMiddle(position);
        // ll.display();
        // ll.updateData(0,15);
        // System.out.println();
        // ll.display();
        // System.out.println();
        // ll.searchNode(60);
        // ll.removeLast();
        // ll.removeFirst();
        // ll.display();
        // ll.getMiddle();
        // ll.reverseLinkedList();
        // ll.display();
        // System.out.println();
        // l2.display();
        // // megePoint(ll,l2);
        // mergePoint(ll,l2);
        // System.out.println(ll.searchNodeRecursive(30,ll.head,0));
        // ll.removeNodeFromlast(3);
        ll.display();
        // System.out.println(ll.isPalindrom2());
        // System.out.println(ll.isLoop());
        // ll.loopRemoval2();
        // ll.display();
        // ll=ll.devide(ll);
        // ll.display();
        // ll=ll.zigZag();
        // // ll.display();
        ll.zigzag1();
        ll.display();
    }
}




