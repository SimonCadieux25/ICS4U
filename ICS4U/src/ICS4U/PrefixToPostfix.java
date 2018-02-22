package ICS4U;

import java.util.Scanner;

public class PrefixToPostfix {

	static Scanner scan = new Scanner(System.in);
	static String Post = "";
	public static String PreToPost(String Pre, int loc, Boolean Prev) {
		
		Pre = Pre.replaceAll(" ", "");
		Post = Post.replaceAll(" ", "");
		String temp = " ";
		do{
		
		
		if(Character.isDigit(Pre.charAt(loc)) && Prev == false) {
			
			Post += Pre.charAt(loc)+ PreToPost(Pre, loc+1,true);
			System.out.println(Post);
			return Post;
		}
		else if(Character.isDigit(Pre.charAt(loc)) && Prev == true) {
			temp = temp + Pre.charAt(loc);
			System.out.println(temp);
			return temp;
		}
		else if(Pre.charAt(loc) == '-') {
			Post += PreToPost(Pre, loc+1,false) + Pre.charAt(loc);
		}
		else if(Pre.charAt(loc) == '+'){
			Post += PreToPost(Pre, loc+1,false) + Pre.charAt(loc);
		}
		System.out.println(Post);
		Post = Post.replaceAll(" ", "");
		System.out.println(Post);
		loc = Post.length();
		} while(loc <= Pre.length());
		return Post;
	}
	
	
	public static void main(String args[]) {
		
		String s = scan.nextLine();
		s = PreToPost(s, 0, false);
		System.out.print(s);
		
	}
}
