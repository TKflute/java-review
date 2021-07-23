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
}
