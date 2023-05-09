package com.javase.xx.danlinbiao;


/*
 * 
 * 单链表中的节点。
节点是单向链表中基本的单元。
每一个节点Node部有两个属性：
		一个属性：是存估的数据
		另一个属性：是下一个节点的内存地址
 */
public class Node {
	
	//存储的数据
	Object element;
	
	//下一个节点的内存地址
	Node next;

	public Node(Object element, Node next) {
		super();
		this.element = element;
		this.next = next;
	}

	public Node() {
		super();
	}

}
