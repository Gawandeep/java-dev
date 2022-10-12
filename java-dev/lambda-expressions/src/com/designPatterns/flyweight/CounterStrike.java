package com.designPatterns.flyweight;

public class CounterStrike {

	public static void main(String[] args) throws Exception {
		 final PlayerType[] types=PlayerType.values();
		 final WeaponType[] weaponType=WeaponType.values();
		 
		 for(int i=0;i<10;i++) {
			 //randomly get player and assign weapon.
			Player player= PlayerFactory.getPlayer(types[(int)(Math.random()* types.length)]);
			player.assignWeapon(weaponType[(int)(Math.random()*weaponType.length)].getValue());
			player.mission();
			System.out.println(player.hashCode());
		 }
	}
}
