package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤 (디자인패턴, MVC2)
		Iu iu=Iu.getInstance();
		iu.setName("iu");
		iu.setAge(30);
		
		String name = iu.getName();
		
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("==============");
		Iu iu2 = Iu.getInstance();
		System.out.println(iu.getName());
		System.out.println(iu.getAge());
		System.out.println(iu2);
		

	}

}
