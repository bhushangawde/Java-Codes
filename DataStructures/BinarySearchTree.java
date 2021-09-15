import java.util.Scanner;
import java.util.Stack;


public class BinarySearchTree {
	Node root;
	int l=0;
	private static Scanner cin=new Scanner(System.in);
	public BinarySearchTree(){
		root=null;
	}
	Node getRoot(){
		return root;
		
	}
	void insert(int a){
		Node p=new Node(a);
		Node temp=root,q=null;
		//System.out.println(root);
		if(temp==null){
			root=p;
			//System.out.println("YOU ARE HERE SINCE TEMP IS NULL "+temp);
			return;
		}/*
		while(temp.left!=null || temp.right!=null){
			if(a<temp.info){
				temp=temp.left;
			}
			else
				temp=temp.right;
			
		}
		if(a<temp.info)
			temp.left=p;
		else
			temp.right=p;*/
		while(temp!=null){
			if(a<temp.info){
				q=temp;
				temp=temp.left;
			}
			else{
				q=temp;
				temp=temp.right;
			}
				
				
		}
		if(a<q.info)
			q.left=p;
		else
			q.right=p;
		
		
	}
	boolean delete(int a){
		return true;
	}
	private int getno(Node x){
		
		
		if(x!=null){
			getno(x.left);
			l++;
			getno(x.right);
		}
		return l;
	}
	void inorder(Node x){
		if(x!=null){
			inorder(x.left);
			System.out.println(x.info);
			inorder(x.right);
		
		}
	}
	void preorder(Node x){
		if(x!=null){
			System.out.println(x.info);
			preorder(x.left);
			preorder(x.right);
		}
	}
	void postorder(Node x){
		if(x!=null){
			
			postorder(x.left);
			postorder(x.right);
			System.out.println(x.info);
		}
	}
	int search(int a){
		return 0;
	}
	int min(Node x){
		
		Node q = null,temp=root;
		if(temp==null){
			System.out.println("BST IS EMPTY");
			return 0;
		}
		
		while(temp!=null){
			q=temp;
			temp=temp.left;
		}
			
		
		return q.info;
	}
	int max(Node x){
		Node q = null,temp=root;
		if(temp==null){
			System.out.println("BST IS EMPTY");
			return 0;
		}
		
		while(temp!=null){
			q=temp;
			temp=temp.right;
		}
			
		
		return q.info;
		
	}
	void inorderStack(Node x){
		Stack j=new Stack();
		
		Node current=x;
		System.out.println("NON-RECURSIVE INORDER");
		for(int i=0;i<getno(x)-1;i++){
			j.push(current);
			while(current.left!=null){
				j.push(current.left);
				current=current.left;
				//i=0;
			}
			current=(Node) j.pop();
			System.out.print(current.info+" ");
			while(current.right==null){
				if(!j.empty()){
					current=(Node)j.pop();
					System.out.print(current.info+" ");
				}
			}
			current=current.right;
		}
		
		
	}
	public static void main(String[] args){
		BinarySearchTree b=new BinarySearchTree();
		System.out.println("HOW MANY ELEMNTS DO YOU WANT TO INPUT?");
		int n=cin.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("ENTER THE "+i+"th ELEMENT. ");
			b.insert(cin.nextInt());
		}
		/*b.insert(31);
		b.insert(13);
		b.insert(54);
		b.insert(53);
		b.insert(23);
		b.insert(0);
		b.insert(92);
		b.insert(47);*/
		//System.out.println(b.max(b.getRoot())+" "+b.min(b.getRoot()));
		b.inorder(b.getRoot());
		System.out.println("NO OF ELEMENTS "+b.getno(b.getRoot()));
		b.inorderStack(b.getRoot());
	}
}