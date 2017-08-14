package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharaterClass {
	public static void main(String args[])
	{
		//regular expression pattern to match in text
		Pattern p =Pattern.compile("[^abc]");
		//specify the text to search for pattern
		Matcher m = p.matcher("radfkjvxjvvxxc");
		//m.find() searches for the pattern if found returns true else return false
		//m.start return starting index of matched pattern
		//m.end() returns ending indes of matched pattern
		//m.group() returns matched pattern
		while(m.find())
		{
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
