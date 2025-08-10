package com.wipro.basics;

public class exercise18 {
	public static void main(String[] args) {
		String orgstr="Madam";
		String revstr="";
		for(int i=orgstr.length()-1;i>=0;i--) {
			revstr+=orgstr.charAt(i);	
		}
		System.out.println(revstr);
		if(orgstr.equalsIgnoreCase(revstr)) {
			System.out.println("palandrome");
		}
		else {
			System.out.println("not palandrome");
		}
	}

}
