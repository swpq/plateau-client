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
	
	public static boolean is_real(boolean x) {
		if (x == true || x == false) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean is_true(boolean x) {
		// i just dont trust the jvm
		if (x == true && x != false) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean is_false(boolean x) {
		// i just dont trust the jvm
		if (x == false && x != true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean get_value(boolean x) {
		// i just dont trust the jvm
		if (x == true && x != false) {
			return true;
		} else if (x == false && x != true) {
			return false;
		}
		return false;
	}
}