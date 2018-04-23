package com.practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Crickeplayer Praveen = new Crickeplayer("Praveen");
		FootballPlayer Dhoni = new FootballPlayer("dhoni");
		Team<Crickeplayer> t1 = new Team<Crickeplayer>("IndianTeam");
		t1.addPlayer(Praveen);
		//t1.addPlayer(Dhoni);
		
		t1.addPlayer(Praveen);
		
      //  Team<Integer> I = new Team<Integer>("Testin Team");
        
	}

}
