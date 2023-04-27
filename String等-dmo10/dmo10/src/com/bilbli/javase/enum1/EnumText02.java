package com.bilbli.javase.enum1;

//采用枚举方法修改程序
/*
 * 总结：
1、枚举是一种引用数据类型
2、举类型怎么定义，语法是？

	enum枚举类型名{
		枚举值1，枚举值2
		}
3、结果只有两种情况的，建议使用布尔类型。结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举

 */
public class EnumText02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Result rlt  = divie(10, 20);
		System.out.println(rlt  ==  Result.success ?  "计算成功":"计算失败");
		
		
	}
	
	
	
	/**计算二个int 类型的商
	 * @param a int
	 * @param b int
	 * @return
	 */
	public static Result divie(int a,int b) {
		try {
			int c = a / b;
			return Result.success;
		}catch(Exception e){
			return Result.FaIl;
		}
	}

}
//枚举：一救一救可以列举出来的，才建议使用枚举类型。
//枚举编译之后也是生成cLass文件。
//枚举也是一种引用数据类型。
//枚举中的每一个值可以看做是常量。
enum Result{
	//SUCCESS是救举ResuLt类型中的一个值
	//FAIL是枚举Result类型中的一个倍
	//枚举中的每一个值，可以看做是“常量"
	success,FaIl
}
