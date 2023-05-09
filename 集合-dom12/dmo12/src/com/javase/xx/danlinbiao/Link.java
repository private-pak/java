package com.javase.xx.danlinbiao;

public class Link {

	//头节点
	Node harder = null;
	
	int size = 1;
	
	public int size() {
		return size;
		
	}
	
	//向链表中添加元素方法
	//向链表中添加元素的方法（向未尾添加）
	public void add(Object obj ) {
		//创建一个新的节点对象
		//让之前单链表的末尾节点next指向新节点对象。
		//有可能这个元素是第一个，也可能是第二个，也可能是第三个。

		
		if(harder ==  null) {
			//说明还没有节点。
			//new一个新的节点对象，作为头节点对象。
			//这个时候的头节点既是一个头节点，又是一个末尾节点。

			harder  =  new Node(obj,null);
			
		}else {
			
			//说明头不是空！
			//头节点已经存在了！
			//找出当前未居节点，让当前末居节点的next是新节点。

			Node currentLastNode  =  findLast(harder);
			currentLastNode.next  =  new Node(obj,null);
		}
		
		size++;
		
	}
	
	private Node findLast(Node node) {
		// 专门查找未居节点的方法
		
		//如果一个节点的next是nuLl
		//说明这个节点就是未尾节点。

		if(node.next  == null) {
			return node;
		}
		//程序能够到这里说明：node不是末尾节点。
		return findLast(node.next);// 递归
	}

	//向链表删除元素的方法 
	public void remove(Object objs) {
		

	}
	
	//修改链表某一个数据的方法
	public  void modif(Object newobj) {
		// TODO 自动生成的方法存根

	}
	
	
	//查找链表中某个元素的 方法 
	public int find (Object obj) {
		return 1;
	}
}
