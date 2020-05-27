package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	String friend;
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요.");
    	for(int i = 0; i < 3; i++) {
    		friend = scan.nextLine();
    		
    		String[] f = friend.split(" ");
   			Friend ff = new Friend(f[0], f[1], f[2]);
   			
   			fList.add(ff);
    	}
    	
    	for(Friend ff: fList)
    		ff.showInfo();
    }

}
