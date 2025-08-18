public class Anagrams {
    
public static void main(String[] args) { 
String str1 = "Listen"; 
String str2 = "Silent"; 
str1 = str1.toLowerCase(); 
str2 = str2.toLowerCase(); 
if (str1.length() != str2.length()) { 
System.out.println("Not anagrams"); 
return; 
} 
int[] count = new int[26];  
for (int i = 0; i < str1.length(); i++) 
{ 
count[str1.charAt(i) - 'a']++; 
count[str2.charAt(i) - 'a']--; 
} 
boolean isAnagram = true; 
for (int i = 0; i < 26; i++) { 
if (count[i] != 0) { 
isAnagram = false; 
break; 
} 
} 
if (isAnagram) { 
System.out.println("The strings are anagrams"); 
} else { 
System.out.println("The strings are not anagrams"); 
} 

}
}
