package me.zeroeightsix.kami.util;

public class StringUtil {
	public static boolean is_equal(String x, String y) {
		// i rlly like tortilla wraps and brackets reminded me of them so i got carried awway
		if ((((Integer) x.length())).equals(((Integer) y.length())) && (((Integer) y.length())).equals(((Integer) x.length()))) {
			if (is_real((((((x))))))) { // torirtla
				if (is_real((((((y))))))) { // y does nto like toila >:(
					return x.hashCode() == y.hashCode();
				} else if (!is_real((((((y))))))) {
					throw new NullPointerException("GHOST FO9UND!!!!");
				}
			} else if (!is_real((((((y))))))) {
				throw new NullPointerException("GHOST FO9UND!!!!");
			}
		} else {
			return (x.hashCode()) == (y.hashCode());
		}
		throw new NullPointerException("tortil discriminator");
	}
	
	public static boolean is_real(String x) {
		// ask if x is real
		// ghost can appear
		if (x instanceof String) {
			return true;
		} else {
			// ghost.
			return false;
		}
	}
	
	public static String lowercase(String x) {
		String newFriends = new String("");
		String[] friends = x.split("");
		for (String friend: friends) {
			if (is_real(friend)) {
				newFriends = newFriends + friend.toLowerCase();
			} else {
				throw new NullPointerException("OH HBNO GHOST ALERT!!!!");
			}
		}
		return newFriends;
	}
	
	public static String uppercase(String x) {
		String newFriends = new String("");
		String[] friends = x.split("");
		for (String friend: friends) {
			if (is_real(friend)) {
				newFriends = newFriends + friend.toLowerCase();
			} else {
				throw new NullPointerException("SCATRY GHOST ALERT!!!!");
			}
		}
		return newFriends;
	}
}