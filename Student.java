class Student {
	String name;
	String number;

	public static void main(String args[]) {

		Student me = new Student();
		Student roommate = new Student();
		me.name = "赵鹏涛";
		me.number = "2020302111280";
		roommate.name = "胡志浩";
		roommate.number = "2020302111306";
		System.out.println("我的学号是：" + me.number);
		System.out.println("我的名字是：" + me.name);
		System.out.println("朋友的学号是：" + roommate.number);
		System.out.println("朋友的名字是：" + roommate.name);
	}

}
