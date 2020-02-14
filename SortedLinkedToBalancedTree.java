package linkedlist;

class SortedLinkedToBalancedTree {
	class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}	
	Node head;
	
	Node treeList() {
		int n=countnodes(head);
		return sortedlist(n);
	}
	
	Node sortedlist(int n) {
		if(n<=0) {
			return null;
		}
		Node left = sortedlist(n/2);
		Node root = head;
		root.left = left;
		head =head.right;
		root.right = sortedlist(n-n/2-1);
		return root;
	}
	
	void print() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data+" ");
			node=node.right;
		}
	}
	
	void push(int data) {
		Node newn=new Node(data);
		newn.left=null;
		newn.right=head;
		if(head!=null) {
			head.left=newn;
		}
		head=newn;
	}
	
	int countnodes(Node head) {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			temp=temp.right;
			count++;
		}
		return count;
	}
	
	void preorder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedLinkedToBalancedTree ob = new SortedLinkedToBalancedTree();
		ob.push(7);
		ob.push(6);
		ob.push(5);
		ob.push(4);
		ob.push(3);
		ob.push(2);
		ob.push(1);
		System.out.println("Linkec list is");
		ob.print();
		Node root = ob.treeList();
		System.out.println("balanced tree");
		ob.preorder(root);
	}
	

}
