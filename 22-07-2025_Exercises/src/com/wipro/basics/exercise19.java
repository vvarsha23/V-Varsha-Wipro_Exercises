package com.wipro.basics;

public class exercise19 {
	    public static void main(String[] args) {
	        String orgstr = "Madam";
	        StringBuilder sb = new StringBuilder(orgstr);
	        String revstr = sb.reverse().toString();

	        System.out.println(revstr);

	        if (orgstr.equalsIgnoreCase(revstr)) {
	            System.out.println("palindrome");
	        } else {
	            System.out.println("not palindrome");
	        }
	    }
}
