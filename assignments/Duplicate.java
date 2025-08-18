public class Duplicate { 
public static void main(String[] args) { 
String input = "Butterfly"; 
String result = ""; 
for (int i = 0; i < input.length(); i++) { 
char ch = input.charAt(i); 
if (result.indexOf(ch) == -1) { 
result += ch; 
} 
} 
System.out.println("Original: " + input); 
System.out.println("After removing duplicates: " + result); 
} 
}