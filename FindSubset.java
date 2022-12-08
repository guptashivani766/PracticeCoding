package variableAndDataType;

public class FindSubset { 
	public static void findSubset(String str,String ans,int i) {
		if(i==str.length()) {
			if(str.length()==0) {
				System.out.println("null");
			}
			else {
				System.out.println(ans);
			}
		}
		findSubset(str,ans+str.charAt(i),i+1);
		findSubset(str,ans,i+1);
		
	}

	public static void main(String[] args) {
		String str ="abc";
		findSubset(str,"",0);

	}

}
