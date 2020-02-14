package linkedlist;
class Node{
	int data;
	Node next=null;
	Node(int d){
		data=d;
	}
}
public class InsertAtHead {	
	static Node insertathead(Node head,int data) {
		if(head==null) {
			return new Node(data);
		}
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(5);
		Node second=new Node(6);
		Node third=new Node(7);
		
		head.next=second;
		second.next=third;
		//head.next.next=third;
		
		Node tmp=head;
		//while(tmp.next!=null) {
		
		while(tmp!=null) {
			System.out.print(tmp.data);
			tmp=tmp.next;
		}
		
		head=insertathead(head,4);
		tmp=head;
		
		System.out.println("");
		
		while(tmp!=null) {
			System.out.print(tmp.data);
			tmp=tmp.next;
		}
	}
}