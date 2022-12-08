package variableAndDataType;

import java.util.HashSet;

public class RemoveDublicateFromString {

	public static void main(String[] args) {
		String str = "abbaaccdd";
		char [] ch = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			if(set.contains(ch[i])) {
				continue;
			}
			else {
				set.add(ch[i]);
			}
		}
	}

}
