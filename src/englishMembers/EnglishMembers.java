package englishMembers;

import java.util.ArrayList;
import java.util.Arrays;

public class EnglishMembers
{ 
	public static ArrayList<String> englishMembers =
		new ArrayList<>(Arrays.asList("김재형","루시안"));
	ArrayList<String>EnglishMemberAdd(String name)
	{
	
	englishMembers.add(name);
	return englishMembers;
	}

}
