package com.silent.people.fish;

import com.silent.people.animal.cat;

public class tuna extends cat{
	
	public void tunaWeightPrint() {
		//상속받았으니 객체생성 필요없음**
		System.out.println(age1);
		System.out.println(age2); //protected 상속받은곳 가능
		//System.out.println(age3);
		//System.out.println(age4);
		
		catAgePrint(); //cat이라는 이름의 부모클래스의 catAgePrint라는 메소드를 호출할수있다
		catAgePrint();
	}
}
