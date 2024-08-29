package LinkedList_Ques;

public class LinkedListQue {
    private int size;
    private Node head;
    private Node tail;
    
    public LinkedListQue(){
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(){}

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size +=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
        
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //questions :
    //que 1: insert using rec
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }

    //que 2: remove duplicate from sorted list 
    //Leetcode-83
    //ans 1 : this is for understanding(do not submit this on LC)
    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //ans 2: to submit on LC
    public Node deleteDuplicate(Node node){
        if(node == null){
            return node;
        }
        Node head = node;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }

    //que 3: merge tow sorted list
    //LC-21
    //ans 1: for understanding
    public static LinkedListQue merge(LinkedListQue first, LinkedListQue second){
        Node f = first.head;
        Node s = second.head;
        LinkedListQue ans = new LinkedListQue();
        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }
            else{
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;
    }
    //ans 2: submit on LC - 21

    //que 4: Linked list cycle
    // LC - 141
    //ans: for understanding
    public boolean isCycle(Node node){
        Node fast = node;
        Node slow = node;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //que 5: cycle length
    //ans:
    public int cycleLen(Node node){
        Node fast = node;
        Node slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    //que 6: Linked List II cycle
    //LC - 142
    //ans: understanding
    public Node detectCycle(Node node){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }

        return null;
    }

    //que 7: happy num
    //LC - 202
    //ans:
    public boolean isHappy(int n){
        int fast = n;
        int slow = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int n){
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }

    //que 8: Middle of LL
    //LC - 876
    //ans 
    public Node middleLL(Node node){
        Node fast = node;
        Node slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //que 9: sort list
    //LC - 148
    //ans 1: sort list using merge sort
    public Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        return mergeList(left, right);
    }
    private Node getMid(Node head){
        Node midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null)?head:midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    private Node mergeList(Node list1, Node list2){
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null)? list1 : list2;
        return dummyHead.next;
    }

    //ans 2: sort list using bubble sort
    public void sortList2() {
        bubbleSort(size-1, 0);
    }
    private void bubbleSort(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            Node first = getNode(col);
            Node second = getNode(col+1);
            if(first.val > second.val){
                //swapping : 3 cases
                //case 1: first is head
                if(first == head){
                    second = head;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail){
                    Node prev = getNode(col-1);
                    prev.next = second;
                    tail = first;
                    second.next = tail;
                    tail.next = null;
                }else{
                    Node prev = getNode(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
        }
    }
    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //que 10: reverse a LL
    //ans1; rev using recurssion
    public void reverse1(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse1(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    //que 11: rev LL using iterative 
    //LC- 206
    //ans2: 
    public Node reverse2(Node node){
        if(node == null){
            return node;
        }
        Node prev = null;
        Node pres = node;
        Node next = pres.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            next = next.next;
        }
        head = prev;
        return head;
    }

    //que 12: rev LL II
    //LC - 92
    public Node reverseBet(Node node, int left, int right){
        if(left == right){
            return node;
        }
        //skip the initial ele till left
        Node prev = null;
        Node pres = node;
        for (int i = 0; pres != null && i < left - 1; i++) {
            prev = pres;
            pres = pres.next;
        }
        Node newEnd = pres;
        Node last = prev;

        //rev the ele bet left and right
        Node next = pres.next;
        for (int i = 0; pres != null && i < right-left+1; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = pres;
        return head;
    }

    //que 13: is LL a palindrom - true/false
    //LC - 234
    //ans 1: using LL 
    public boolean isPalindrome(Node node){
        //find the mid ele
        Node mid = middleLL(node);
        Node headSecond = reverse2(mid);
        Node revHead = headSecond;
        while(node != null && headSecond != null){
            if(node.val != headSecond.val){
                break;
            }
            node = node.next;
            headSecond = headSecond.next;
        }
        reverse2(revHead);
        return node == null || headSecond == null;
    }
    //ans 2: using arr
    private static final int[] arr = new int[100_00];
    public boolean isPalindrome2(Node node){
        if(node == null || node.next == null){
            return true;
        }
        Node h = node;
        final int[] arr1 = arr;
        int size = 0;
        while(h != null){
            arr[size] = h.val;
            size++;
            h = h.next;
        }
        int mid = size/2;
        for (int i = 0; i < mid; i++) {
            if(arr[i] != arr[--size]){
                return false;
            }
        }
        return true;
    }
    //que14: reorder ll
    //lc - 143
    // ans:
    public void reorder(Node node){
        if(node == null || node.next == null){
            return;
        }
        Node mid = middleLL(node);
        Node hf = head;
        Node hs = reverse2(mid);
        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }

    //que 15: revers node in k group
    //LC- 25
    //ans:
    public Node revKgrp(Node node, int k){
        if(k <= 1 || head == null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        int size = findSize(node);
        for (int i = 0; i < size/k; i++) {
            Node last = prev;
            Node newEnd = curr;
            Node next = curr.next;
            for (int j = 0; curr != null && j < k; j++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;
            if(curr == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
    private int findSize(Node node){
        int size = 0;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
    }

    //que 16: rev alternate k groups in LL
    //ans: 
    public Node revAltKGroups(Node node, int k){
        if(k <= 1 || node == null){
            return node;
        }
        Node curr = node;
        Node prev = null;
        while(curr != null){
            Node last = prev;
            Node newEnd = curr;
            Node next = curr.next;
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;
            for (int i = 0; curr != null && i < k; i++) {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    //que 17: rotate list;
    //LC - 61
    //ans :
    public Node rotateRight(Node head, int k){
        if(k == 0 || head == null || head.next == null){
            return head;
        }
        Node last = head;
        int len = 1;
        while(last.next != null){
            len++;
            last = last.next;
        }
        last.next = head;
        int rotate = k%len;
        int skip = len - rotate;
        Node newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }


    public static void main(String[] args) {
        LinkedListQue first = new LinkedListQue();
        LinkedListQue second = new LinkedListQue();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);
        first.insertLast(9);
        first.display();

       second.insertLast(1);
       second.insertLast(2);
       second.insertLast(9);
       second.insertLast(14);
       second.insertLast(15);
       second.display();

       LinkedListQue ans = LinkedListQue.merge(first, second);
       ans.display();
    }
}
