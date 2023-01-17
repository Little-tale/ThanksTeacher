package mathMembers;

import java.util.ArrayList;
import java.util.Arrays;

import javax.management.AttributeList;

public class MathMemberList
{
	public static ArrayList<String> methMembers =
			new ArrayList<>(Arrays.asList("김유신","가디언"));
	
	public ArrayList<String> methMemberAdd(String name)
	{
		
		methMembers.add(name);
		return methMembers;
	}
}
