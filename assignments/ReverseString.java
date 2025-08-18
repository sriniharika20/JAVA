public class ReverseString { 
public static void main(String[] args) { 
String original = "Sriniharika"; 
String rev = ""; 
for (int i = original.length() - 1; i >= 0; i--) { 
rev = rev + original.charAt(i); 
} 
System.out.println("Reversed String: " + rev); 
} 
} 