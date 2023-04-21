package com.bilbil.xx1;

public class ArraySearchText {
/*
 * 数组的元素查找
		数组元素查找有两种方式：
				第一种方式：一个一个换找，直到找到为止。
				
				第二种方式：二分法查找（算法），这个效率较高。

 */
	public static void main(String[] args) {
		int [] arr = {4,5,99,41,11};
		//需求：找出99的下标。如果没有返回-1
		//一个一个摸找。
		/*
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 99) {
				System.out.println("99元素的下标是  "  + i);
				return;
			}
		}
		//程序到这说明 没有找到99或者99不存在 
		System.out.println("99元素不存在 ");
		*/
		
		//最好以上程序封装一个 方法
	int index=	arraySearch(arr,99);
		System.out.println(index == -1 ?  "该元素不存在" : "该元素的下标是" + index);
		
		
	}

	/*
	 * 从数组中检索某个元素的下标//返回是arr数组第一个
*@param arr被检索的数组
@param eLe被检索的元素
@return大于等于e的数表示元素的下标，-1表示该元素不存在

	 */
	public static int arraySearch(int[] arr, int ele) {
		for (int j2 = 0; j2 < arr.length; j2++) {
				if(ele == arr[j2] ){
					return j2;
				}
			}
			return -1;
		}
	

}
