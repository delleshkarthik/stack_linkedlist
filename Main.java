class Main{
    public static void main(String[] args){
        stack s = new stack() ;
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        
        s.peek() ;
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

class Node{
    int val ;
    Node next ;
    
    public Node(int val){
        this.val =val ;
        this.next = null; 
    }
}
class stack{
    
    Node head ;
    int size ; 
    public stack(){
        head = null ;
        size = 0;
    }
    
    public void push(int x){
        Node temp = new Node(x) ;
        
        temp.next = head ;
        head = temp ;
        size++ ;
    }
    
    public int pop(){
        if(size == 0) return Integer.MIN_VALUE ;
        
        int res = head.val ;
        head = head.next ;
        size -- ;
        
        return res ;
    }
    
    public int peek(){
        if(size == 0 ) return Integer.MIN_VALUE ;
        
        return head.val ;
    }
    public boolean isEmpty(){
        return size==0 ;
    }
}
