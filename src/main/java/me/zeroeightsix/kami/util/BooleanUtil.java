package me.zeroeightsix.kami.util;

public class BooleanUtil {
	public static boolean flip(boolean x) {
		if (x == true) {
			x = false;
			return false;
		} else if (x == false) {
			x = true;
			return true;
		}
		return true;
	}
	
	public static boolean set_true(boolean x) {
		if (x == false) {
			x = true;
			return true;
		}
		return false;
	}
	
	public static boolean set_false(boolean x) {
		if (x == true) {
			x = false;
			return false;
		}
		return true;
	}
}