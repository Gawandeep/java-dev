package com.designPatterns.flyweight;

import java.util.HashMap;

public class PlayerFactory {

	private static HashMap<PlayerType, Player> playerMap = new HashMap<>();

	public static Player getPlayer(PlayerType type) throws Exception {
		Player p = playerMap.get(type);
		if (p == null) {
			if (type.equals(PlayerType.TERRORIST)) {
				p = new Terrorist();
			} else if (type.equals(PlayerType.COUNTER_TERRORIST)) {
				p = new CounterTerrorist();
			} else {
				throw new Exception("Unknown type: " + type);
			}
			playerMap.put(type, p);
		}
		return p;
	}
}
