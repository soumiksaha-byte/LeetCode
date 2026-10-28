class Node{
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key, int val){
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    int cap;
    Map<Integer,Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.cache= new HashMap<>();
        this.head= new Node(0,0);
        this.tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
            insert(cache.get(key));
            return cache.get(key).val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node n=cache.get(key);
            n.val=value;
            remove(n);
            insert(n);
            return;
        }
        if(cache.size()>=cap){
                Node lru=tail.prev;
                remove(lru);
                cache.remove(lru.key);
        }
        Node n= new Node(key, value);
        insert(n);
        cache.put(key,n);
    }
     void remove(Node n){
            Node prev= n.prev;
            Node next= n.next;
            prev.next=next;
            next.prev=prev;
        }
     void insert(Node n){
            Node next= head.next;
            head.next=n;
            n.prev=head;
            next.prev=n;
            n.next=next;;
        }
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
