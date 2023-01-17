package allmemberList;

import java.util.ArrayList;

import englishMembers.EnglishMembers;
import mathMembers.*;

public final class AllmemberList
{
	MathMemberList ms = new MathMemberList();
	EnglishMembers es = new EnglishMembers();
	
	public ArrayList<String> allMembers = new ArrayList<>();
	
	
	
	public ArrayList<String> allMemberListT()
	{
		
		
		allMembers.addAll(ms.methMembers);
		allMembers.addAll(es.englishMembers);
		
		System.out.println("테스트"+allMembers);
		
		return allMembers;
	}
	
}
