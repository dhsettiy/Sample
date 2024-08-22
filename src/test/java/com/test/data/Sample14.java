package com.test.data;



public class Sample14 {
	public static void main(String[] args) {
		A value = new A();
		value.getData();
		B b=new B();
		b.start();
	}
}
class A{
	public void getData() {
		System.out.println("first Inner Class");
		System.out.println(Thread.currentThread().getId());
	}
}
class B extends Thread{
	
		public void run() {
			System.out.println("Second inner Class");
			System.out.println(Thread.currentThread().getId());
		}
	 
}

