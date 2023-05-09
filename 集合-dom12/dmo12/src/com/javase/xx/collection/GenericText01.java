package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 * 
 * 1、JDK5.0之后推出的新特性：泛型
 * 
	2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参的。（运行阶段泛型没用！）

3、使用了泛型好处是什么？
	第一：集合中存估的元素类型统一了。
	第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”！

4、泛型的缺点是什么？
	导致集合中存储的元素缺乏多样性

 */
public class GenericText01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
			List  mylist = new ArrayList<>();
			
			Cat  cat = new Cat();
			BIrd bird = new BIrd();
			
			mylist.add(cat);
			mylist.add(bird);
			
			Iterator it = mylist.iterator();
			while(it.hasNext()) {
				Object obj = it.next();
				
				if (obj instanceof Arimal) {
					Arimal a = (Arimal)obj;
					a.move();
				}
			}
			*/
		
		//使用JDK5之后的泛型机制
		//使用泛型List<AnimaL>之后，表示List集合中只允许存Animal类型的数据。
		//用泛型来指定集合中存储的数据类型。
		List<Arimal> mylist = new ArrayList<Arimal>();
		
		//指定List集合中只能存储Animal，那么存储String就编译报错了。
		//mylist.add("ada");
		
		Cat  cat = new Cat();
		BIrd bird = new BIrd();
		mylist.add(cat);
		mylist.add(bird);
		
		//获取送代器
		//这个表示送代器送代的是AnimaL类型。
		Iterator<Arimal> it = mylist.iterator();
		while(it.hasNext()){
			//使用泛型之后，每一次选代返回的数据都是AnimaL类型。
		//	Arimal a = it.next();
			//这里不需要进行强制类型转换了。直接调用。
		//	a.move();
			
			//调用子类型特有的方法还是需要向下转换的！
			Arimal a = it.next();
			if(a instanceof Cat) {
				Cat x = (Cat)a;
				x.catmouse();
			}
			if(a instanceof BIrd) {
				BIrd y = (BIrd)a;
				y.fiy();
			}
		}
	}//690

}
class  Arimal{
	public void move() {
		System.out.println("动物有");

	}
	
}
class Cat  extends Arimal{
	public void catmouse() {
		System.out.println("小猫");
	}
}
class BIrd  extends Arimal{
	public void fiy() {
		System.out.println("小鸟");
	}
}