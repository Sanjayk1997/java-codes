package javaCodes;

public class linkedListOperations {
	
	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	static void insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node existingNode = head;
		while(existingNode.next != null) {
			existingNode = existingNode.next;
		}
		existingNode.next = newNode;
	}
	
    static void print(Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    static void reverseList(Node nodeHead) {
    	Node prevHead = null;
        while(nodeHead != null){
            Node recordNext = nodeHead.next;
            nodeHead.next = prevHead;
            prevHead = nodeHead;
            nodeHead = recordNext;
        }
        head = prevHead;
    }
    
    public static void main(String[] args) {
    	insertNode(2);
    	insertNode(3);
    	insertNode(4);
    	insertNode(5);
    	System.out.print("After insertion at head: ");
        print(head);
        reverseList(head);
    	System.out.print("After reversal: ");
        print(head);
    }

}
