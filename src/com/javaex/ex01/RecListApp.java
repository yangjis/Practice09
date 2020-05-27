package com.javaex.ex01;

import java.util.ArrayList;
import java.util.List;

public class RecListApp {

	static List<Rectangle> rList = new ArrayList<Rectangle>();
	
	public static void main(String[] args) {

		double sum = 0;
		
		Rectangle r01 = new Rectangle(1,1);
		Rectangle r02 = new Rectangle(2,2);
		Rectangle r03 = new Rectangle(3,3);
		Rectangle r04 = new Rectangle(4,5);
		
		
		System.out.println("#사각형 4개 리스트에 추가=========================================");
		rList.add(r01);
		rList.add(r02);
		rList.add(r03);
		rList.add(r04);
		
		for(Rectangle rr: rList) 
			rr.draw();

		System.out.println("#3번째 사각형(3, 3) 삭제==========================================");

		rList.remove(2);
		
		for(Rectangle rr: rList) 
			rr.draw();
		
		System.out.println("#4번째 사각형(4, 5)-->(9, 5)로 width 값 변경======================");
		
		rList.get(2).setWidth(9);
		rList.get(2).setHeight(5);

		for(Rectangle rr: rList) 
			rr.draw();
		
		System.out.println("#모든 사각형의 넓이 합 출력=======================================");
		
		for(Rectangle rr: rList)
			sum += rr.area();
		
		System.out.println("모든 사각형의 넓이는 " + sum + " 입니다.");
		
	}
	
	public static void listAllDraw(List<Rectangle> list) {
		for(Rectangle rr: rList) 
			rr.draw();
	}
	
}
