public class QQKachoo implements Deque{

    private DLLNode _front, _back;
    private int _size;

    public QQKachoo(){
	_front = null;
	_back = _front;
	_size = 0;
    }
    
    public void addFirst(String s){
	DLLNode temp = new DLLNode(s, null, null); 
    }
    
    public void addLast(String s);
    public String pollFirst(); 
    public String pollLast();
    public String peekFirst();
    public String peekLast();
    public int size();
    public boolean isEmpty();  
}
