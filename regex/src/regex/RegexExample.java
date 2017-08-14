package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String args[])
	{
		Pattern p = Pattern.compile("ab");
		Matcher m=p.matcher("aababbab");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		
		
		
		
	}
}
