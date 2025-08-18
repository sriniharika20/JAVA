public class Palindrome { 
public static void main(String[] args) { 
String input = "ABA"; 
String original = input.toLowerCase(); 
String rev = ""; 
for (int i = original.length() - 1; i >= 0; i--) { 
rev += original.charAt(i); 
} 
if (original.equals(rev)) { 
System.out.println(input + " is a palindrome."); 
} else { 
System.out.println(input + " is not a palindrome."); 
} 
} 
}