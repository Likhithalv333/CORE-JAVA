package com.satya.collections;

import java.util.LinkedList;

public class LinkedListex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> songs=new LinkedList<String>();
		songs.add("song1");
		songs.add("song2");
		songs.add("song3");
		songs.add("song4");
		songs.add("song5");
		System.out.println("playList..."+songs);
		songs.set(3, "new song");
		System.out.println(songs);
		songs.remove("songs3");
		System.out.println(songs);
		
		

	}

}
