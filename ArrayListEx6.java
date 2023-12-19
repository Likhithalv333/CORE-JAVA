package com.satya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cricket> players=new ArrayList<Cricket>();
		players.add(new Cricket (101,"dhoni",31,"csk"));
		players.add(new Cricket (102,"virat kohli",28,"rcb"));
		players.add(new Cricket (103,"rahul",22,"csk"));
		players.add(new Cricket (104,"rashid khan",25,"kkr"));
		players.add(new Cricket (105,"raina",21,"csk"));
		players.add(new Cricket (106,"andhreRussel",35,"kkr"));
		
		class AgeComp implements Comparator<Cricket>{
			@Override
			public int compare(Cricket c1, Cricket c2) {
				// TODO Auto-generated method stub
				return c1.getAge().compareTo(c2.getAge());
			}
			
		}
		
		//remove the hight AGE player
		Collections.sort(players,new AgeComp());
		System.out.println();
		
		System.out.println(" get the lowest age..."+players.get(0));
		
		players.remove(players.size()-1);
         for(Cricket player:players) {
			System.out.println(player);
		}
		//search for csk and add into new list
         for(Cricket player:players) {
 			if(player.getTeam().equalsIgnoreCase("csk")) {
 				System.out.println("csk team ......"+players);
 				break;
 			}
 		}
		
		for(Cricket player:players) {
			if(player.getPlayerName().equalsIgnoreCase("dhoni")) {
				System.out.println(player.getPlayerName()+" "+player.getAge()+" "+player.getPlayerId()+" "+player.getTeam());
			}
		}
		System.out.println("*********************");
		for(Cricket player:players) {
			if(player.getAge()>30)
			{
				System.out.println(player.getPlayerName()+" "+player.getAge()+" "+player.getPlayerId()+" "+player.getTeam());
			}
		}
		System.out.println("********************");
		for(Cricket player:players) {
			if(player.getPlayerId()==101) {
				player.playerName="MSDhoni";
				player.age=33;
				System.out.println(player.getPlayerName()+" "+player.getAge()+" "+player.getPlayerId()+" "+player.getTeam());
			}
		}
		 
		
		

	}

}
