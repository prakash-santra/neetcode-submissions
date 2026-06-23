class MyCircularQueue {
    Node head;
    Node tail;
    int size;
    int cap;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public MyCircularQueue(int k) {
        this.size = 0;
        this.cap = k;
        this.head = null;
        this.tail = null;
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
        Node node = new Node(value);
        if(size == 0){
            head = node;
            tail = node;
            node.next = node;
        }else{
        node.next = tail;
        head.next = node; 
        head = node;
        }
        size ++;
        return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            if(head == tail){
                head = null;
                tail = null;
            }else{
            tail = tail.next;
            head.next = tail;
            }
            size--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return tail.val;        
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return head.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */