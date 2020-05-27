package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요.(종료 q)");
    	while(true) {
    		String goods = scan.nextLine();
    		
    		if(goods.equals("q")) break;
    		
    		String[] gg = goods.split(",");
    		Goods gL = new Goods(gg[0], Integer.parseInt(gg[1]), Integer.parseInt(gg[2]));
    		gList.add(gL);
    		
    		sum += Integer.parseInt(gg[2]);
    	}
    	
    	System.out.println("[입력을 완료]");
    	System.out.println("===============================");
    	
    	for(Goods g: gList) 
    		g.showInfo();
    	
    	System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
    	
    }

}
