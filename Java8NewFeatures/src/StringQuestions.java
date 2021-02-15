import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class StringQuestions {

	public static void main(String[] args) {
		String s = "I am am developer of java java";
		//removeDuplicateWord(s);
		//findDuplicateWord(s);
		//findDuplicateCharacter();
		//checkAnagram();
		//countNoOfWordsinString();
		//countTotalNumberOfOccourence();
		//firstNonRepeatedCharacter();
		//checkStringOnlyDigit();
		//reverseString();
		//reverseStringPreserveSpace();
		reverseEachWordOfString();
		noOfVowelAndConsonent();
	}
	public static void findDuplicateCharacter()
	{
		String s= "Rinkik";
		Map<String,Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if(map.get(c+"") != null)
			{
				map.put(c+"", Integer.valueOf(map.get(c+""))+1);
			}
			else
			{
				map.put(c+"", 1);
			}
		}
		map.forEach((k,v)->
		{
			if(v>1)
			{
				System.out.println(k+" "+v);
			}
		}
				);
		//map.entrySet().stream().filter((e)->e.getValue() > 1).forEach((e)->System.out.println(e.getKey()+"--"+e.getValue()));
	
	}
	
	public static void removeDuplicateWord(String s)
	{
		
		Set<String> set = new LinkedHashSet();
		for(String word : s.split(" "))
		{
			set.add(word);
		}
		set.forEach(str->System.out.println(str));
	}
	public static void findDuplicateWord(String s)
	{
		Map<String,Integer> map = new HashMap<>();
		for(String word : s.split(" "))
		{
			if(map.get(word) != null)
			{
				map.put(word, Integer.valueOf(map.get(word))+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		//map.forEach((k,v)->System.out.println("key::"+k+"Value::"+v));
		map.entrySet().stream().filter((e)->e.getValue() > 1).forEach((e)->System.out.println(e.getKey()+"--"+e.getValue()));
		/*
		 * Set<Entry<String, Integer>> set = map.entrySet();
		 * set.forEach((e)->System.out.println(e.getKey()+"--"+e.getValue()));
		 */
		
	}
	public static void checkAnagram()
	{
		String s1= "keep beep";
		String s2 = "peek  peeb";
		
		String str1 = s1.replaceAll("\\s","");
		String str2 = s2.replaceAll("\\s","");
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram");
			
		}
		else
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (char c : ch1) {
				System.out.println(c);
			}
			for (char c : ch2) {
				System.out.println(c);
			}
			if(Arrays.equals(ch1,ch2))
			{
				System.out.println("Anagrams");
				
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
	public static void countNoOfWordsinString()
	{
		String s = "I am a java developer hai";
		System.out.println("No of words=" + s.split(" ").length);
	}
	public static void countTotalNumberOfOccourence()
	{
		String s = "I am a java program";
		int noOfOcc = s.length()-s.replaceAll("a", "").length();
		System.out.println("number of occourences=" + noOfOcc);
		
	}
	public static void reverseString()
	{
		String s = "Rinki";
		StringBuffer st = new StringBuffer(s);
		System.out.println("REverse String= " + st.reverse());
		/*
		 * for (int i = s.length()-1; i > -1; i--) {
		 * 
		 * st.append(s.charAt(i)); } System.out.println("REverse String== " + st);
		 */
	}
	public static void firstNonRepeatedCharacter()
	{
		String s = "I aa an Engineer";
		
		Map<String, Integer> map = new LinkedHashMap<>();
		for (char c : s.toLowerCase().toCharArray()) {
			if(map.get(c+"") != null)
			{
				map.put(c+"", map.get(c+"")+1);
			}
			else
			{
				map.put(c+"", 1);
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet().stream().filter((e)->e.getValue() == 1).findFirst());
			
		
	}
	public static void checkStringOnlyDigit()
	{
		String s= "012309";
		boolean b = s.matches("^[0-9]*$");
		System.out.println("only digit= " +b);
		
	}
	public static void reverseStringPreserveSpace()
	{
		String s = "India Is my country";//yrtnu oc ym sIaidnI
		//char[] c= s.toCharArray();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i<s.length();i++) {
			if(s.charAt(i) == ' ')
			{
				list.add(i);
			}
		}
		System.out.println("List = " + list);
		StringBuffer sb = new StringBuffer(s.replaceAll(" ", ""));
		sb = sb.reverse();
		System.out.println(sb);
		for (Integer integer : list) {
			sb.insert(integer, " ");
		}
		System.out.println("string buffer after reverse and spaces = " + sb.toString());
	}
	public static void reverseEachWordOfString()
	{
		String s= " Rinki is girl "; //ikniR si lrig
		StringBuffer sb=  new StringBuffer();
		for (String st : s.split(" ")) {
			System.out.println("st="+st);
			StringBuffer sb1 = new StringBuffer(st);
			sb1 = sb1.reverse();
			sb.append(sb1+ " ");
		}
		System.out.println("String after reversing word=" + sb.toString());
	}
	public static void noOfVowelAndConsonent()
	{
		String s ="Rinki garg";
		int vowelCount = 0;
		int consonantCount = 0;
		for (char ch : s.toLowerCase().toCharArray()) {
			if((ch+"").matches("[aeiouAEIOU]"))
			{
				vowelCount++;
			}
			else if((ch+"").matches("[b-df-hj-np-tv-z]"))
			{
				consonantCount++;	
			}
		}
		System.out.println("vowelCount=" + vowelCount);
		System.out.println("Consonent count=" + consonantCount);
		
	}
}
 