
public class DoublyLinkedList {
	Node start=null;
	Node getStart(){
		return start;
	}
	int getStartInfo(){
		return start.info;
	}
	void insertAtStart(int a){
		Node p=getnode();
		p.next=start;
		p.prev=null;
		p.info=a;
		if(start!=null)
			start.prev=p;
		start=p;
	}
	void insertAtEnd(int a){
		if(start==null){
			insertAtStart(a);
			return;
		}
			
		Node temp=start;
		while(temp.next!=null)
			temp=temp.next;
		Node p=getnode();
		p.info=a;
		p.next=null;
		temp.next=p;
		p.prev=temp;
		
	}
	void insertAfter(int a,int b){
		Node temp=start;
		while(temp.info!=b && temp!=null)
			temp=temp.next;
		if(temp==null)
			System.out.println("ELEMENT "+b+" NOT FOUND.");
		else{
			Node p=getnode();
			p.info=a;
			p.prev=p.next=null;
			p.next=temp.next;
			if(temp.next!=null)
				temp.next.prev=p;
			p.prev=temp;
			temp.next=p;
				
		}
	}
	void delete(int a){
		Node temp=start;
		if(start==null){
			System.out.println("DLL IS EMPTY");
			return;
		}
		while(temp.info!=a && temp!=null)
			temp=temp.next;
		if(temp==null)
			System.out.println("ELEMENT "+a+" NOT FOUND.");
		else{
			if(temp.prev!=null){
				temp.prev.next=temp.next;
				System.out.println("DELETE FUNC.");
			}
				
			else
				start=temp.next;
				
			if(temp.next!=null)
				temp.next.prev=temp.prev;
			freenode(temp);
		}
		
		
	}
	int deleteAtStart(){
		int x=start.info;
		delete(x);
		return x;
		
	}
	int deleteAtEnd(){
		Node temp=start;
		if(temp==null){
			System.out.println("DLL IS EMPTY.");
			return '\0';
		}
			
		while(temp.next!=null)
			temp=temp.next;
		if(temp.prev!=null)
			temp.prev.next=null;
		else
			start=null;
		int x=temp.info;
		freenode(temp);
		return x;
	}
	int length(){
		int l=0;
		Node temp=start;
		while(temp!=null){
			l++;
			temp=temp.next;
		}
		return l;	
	}
	void print(){
		Node temp=start;
		
		System.out.println();
		while(temp!=null){
			System.out.print(temp.info+" ");
			temp=temp.next;
		}
	}
	Node getnode(){
		Node p=new Node();
		return p;
	}
	void freenode(Node x){
		x=null;
	}
	DoublyLinkedList rev(){
		DoublyLinkedList l2=new DoublyLinkedList();
		//System.out.println("CAN YOU READ THIS");
		Node temp=start;
		
		while(temp!=null){
			l2.insertAtStart(temp.info);
			//System.out.println("AND THIS?");
			temp=temp.next;
		}
		return l2;
	}
	void insertAsc(int a){
		Node temp=start;
		if(temp==null){
			insertAtStart(a);
			return;
		}
		while(temp.info<a && temp!=null){
			temp=temp.next;
			if(temp==null)
				break;
			//System.out.println("IN WHILE LOOP");
		}
			
		
		if(temp==null){
			//System.out.println("temp is null");
			insertAtEnd(a);
		}
			
		else{
			if(temp.prev!=null)
				insertAfter(a,temp.prev.info);
			else
				insertAtStart(a);
		}
		
		
	}
	
	
	public static void main(String[] args){
		DoublyLinkedList l=new DoublyLinkedList();
		l.insertAsc(-1);
		l.insertAsc(0);
		l.insertAsc(6);
		l.insertAsc(-8);
		l.insertAsc(5);
		
		l.insertAsc(6);
		l.print();
		DoublyLinkedList l3=l.rev();
		l3.print();
		
	}
	
	

}
