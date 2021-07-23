package com.linkedlist;

public class LinkedList {

private ListNode head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	// Lists are FIFO
	// will add node at end of List
	public void add(String data) {
		//if head is null, this is first item on list	
		//make data the head
		if(head == null) {
			head = new ListNode(data, null);
			return;
		}
		//find last node (tail)
		ListNode cNode = head;
		while(cNode.getNextNode() != null) {
			cNode = cNode.getNextNode();
		}
		
		//add new node as tail
		cNode.setNextNode(new ListNode(data, null));
	}
	
	public void addToStart(String data) {
		
		//make data the head if null
		if(head == null) {
			head = new ListNode(data, null);
			return;
		}
		
		ListNode oldHead = head;
		ListNode newNode = new ListNode(data, oldHead);
		head = newNode;
	}
	
	public void add(int index, String data) {
		//get node at index to add, reassign a new node at that index
		ListNode nodeToMove = this.get(index - 1);
		ListNode newNode = new ListNode(data, nodeToMove.getNextNode());
		nodeToMove.setNextNode(newNode);
	}

	//return # of nodes in list
	public int size() {
		
		int count = 0;
		ListNode cNode = head;
		while(cNode != null) {
			count++;
			cNode = cNode.getNextNode();
		}
		
		return count; 
	}
	
	public void clear() {
		head = null;
	}
	
	//delete node at front of list
	//return null if list is empty
	
	public String remove() {
		//TODO: change this to return boolean
		if(head == null) {
			return null;
		}
		
		ListNode oldHead = head;
		head = oldHead.getNextNode();
		
		return oldHead.getData();
	}
	
	public boolean remove(String data) {
		
		if(this.contains(data)) {
			ListNode cNode = head;
			while(cNode != null) {
				if(cNode.getData().equals(data)) {
					ListNode nodeToRemove = cNode;
					cNode = nodeToRemove.getNextNode();
					return true;
				}
			}
		}
		return false;
		
	}
	
	public String remove(int index) {
		
		if(index >= this.size()) {
			System.out.println("TODO: ERROR in remove");
			return null;
		}
		
		ListNode nodeToRemove = this.get(index);
		this.remove(nodeToRemove.getData());
		return nodeToRemove.getData();
	}

	//display all the data in the list
	public void showList() {
		ListNode cNode = head;
		while(cNode != null) {
			System.out.print(cNode.getData() + "-->");
			cNode = cNode.getNextNode();
		}
			
		System.out.println("NULL");
	}

	//returns whether item is in list or not
	public boolean contains(String data) {
		
		ListNode cNode = head;
		while(cNode != null) {
			if(cNode.getData().equals(data)) {
				return true;
			}
			
			cNode = cNode.getNextNode();
		}
		
		return false;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public ListNode get(int index) {
		
		ListNode cNode = head;
		for(int i = 0; i < this.size(); i++) {
			if(i == index) {
				return cNode;
			}
			cNode = cNode.getNextNode();	
		}
		return null;
	}
	
	public String set(int index, String data) {
		
		ListNode nodeToSet = this.get(index);
		nodeToSet.setData(data);
		return nodeToSet.getData();
	}
}
