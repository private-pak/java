package com.bilbil.xx.Jiudian;

public class Hotel {
/*
 * 酒店对象，酒店中有二维数组，二维数组模拟大厦。
 * 
 * *房间编号
*1楼:101 102 103 104  105  106..
*2楼:201 202  203  204  205 206..
*3楼:301 302 303 304  305  306..
*

 */
	
	
	private String name;
	//二维数组
	
	private Room[][] rooms;

	public Hotel() {
		super();
		rooms = new Room[3][10];//3行10列。3层楼，每层10个房间。
		//二维数组遍历
		for (int i = 0; i < rooms.length; i++) {// i是下标0 1 2.. i+1是楼层 1.2.3...
			for (int j = 0; j < rooms[i].length; j++) {
				if(i  == 0) {//1层 
				rooms[i][j]  = new Room((i+1)*100+j+1,"标准间",true);
			}else if(i  == 1) {//2层
				rooms[i][j]  = new Room((i+1)*100+j+1,"单人间",true);
			}else if(i ==  2){//3层
				rooms[i][j]  = new Room((i+1)*100+j+1,"总统套房",true);
			}
		}

	}
	
	}
	////在酒店对象上提供一个打印房间列表的方法
	public  void print() {
		//打印所有房间状态，就是遍历二维数组
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				Room  room = rooms[i][j];
				System.out.print(room.toString());
			}
			System.out.println();//换行
		}
	}
	/*
	 * *订房方法。
			roomID调用此方法时需要传一个房间编号过来。这个房间编号是前台小姐姐输入的。
	 */
	public void order(int  roomID) {
		//订房最主要的是房间对象的status修改为false。
		//Room对象的status修改为faLse。
		//假设房间是207 下标是【1】【6】
		
		Room room  =  rooms[roomID / 100   -1][roomID  %  100 -1];
		room.setStatus(false);
		System.out.println(roomID+"房间已被预定");
	}
	//退房
	public void exit(int roomID) {
		Room room  =  rooms[roomID / 100   -1][roomID  %  100 -1];
		room.setStatus(true);
		System.out.println(roomID+"已经退房");
	}
	
}



