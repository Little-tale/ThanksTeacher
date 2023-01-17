package mainProgram;

import java.util.ArrayList;
import java.util.Scanner;

import allmemberList.AllmemberList;
import englishMembers.EnglishMembers;
import explaneMode.ExplaneToEnglish;
import explaneMode.ExplaneToMath;
import mathMembers.MathMemberList;



public class Mainprogram {

	public static void main(String[] args)
	{//기본 필드
		int userCount = 9;// 사용자 선택용 변수
		String userName = null;
		
		//받아올 스트링 배열 3개
		ArrayList<String> newMathlist =new ArrayList<>();
		ArrayList<String> newEnglishlist =new ArrayList<>();
		
		
	//패키지 모음
		ExplaneToMath etm = new ExplaneToMath();
		ExplaneToEnglish ete = new ExplaneToEnglish();
		EnglishMembers ems = new EnglishMembers();
		MathMemberList mms = new MathMemberList();
		AllmemberList aml = new AllmemberList();
		
		
	//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//소개시작
		System.out.println
		("어서오세요 여러분의 학원 리미트입니다 \n"
			+"설명을 들으시려면 1번 바로 강의선택은 2번입니다.");
		userCount = sc.nextInt();
		// 1고를시 강의 설명 2고를시 바로 강의 선택시작
		first : switch (userCount) {
		case 1: {
			System.out.println
			("수학강의의 설명은 1번 \n"
				+"영어강의의 설명을 들으시려면 2번 입니다.");
			userCount = sc.nextInt();
			
			// 1고를시 수학을 2고를시 영어를 설명
			switch (userCount) {
			case 1:
			{
				etm.math();
				System.out.println("현재 수학강의 인원은 이렇게 구성됨");
				System.out.println(mms.methMembers);
				break;
			}
			case 2:
			{
				ete.english();
				System.out.println("현재 영어 강의 인원은 이렇게 구성됨");
				System.out.println(ems.englishMembers);
				break;
			}		
			default:
				throw new IllegalArgumentException("Unexpected value: " + userCount);
			}
		break;
		}
		case 2:
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + userCount);
		}
		
		//2번 선택 가정후 시작.
		System.out.println("강의를 선택합니다....\n수학은 1번 영어는 2번을 입려하세요");
		userCount = sc.nextInt();
		userCount = sc.nextInt();
		//
		if(userCount==1)
		{
			System.out.println("본인이름 입력바랍니다.");
			//스캐너 엔터인식 오류 방지 하나더
			userName = sc.nextLine();
			userName = sc.nextLine();
			mms.methMembers.add(userName);
			newMathlist.add(userName);
			
			System.out.println(mms.methMembers);
		}
		if(userCount==2)
		{
			System.out.println("본인이름 입력바랍니다.");
			userName = sc.nextLine();
			userName = sc.nextLine();
			
			newEnglishlist.add(userName);
			ems.englishMembers.add(userName);
			System.out.println(ems.englishMembers);
		}
		if((userCount !=1)&&(userCount !=2) )
		{
			System.out.println("잘못된 입력값입니다. ");
		}
		
		
		
		
		System.out.println("저희 학원에 오신것을 환영합니다 !!!");
		aml.allMemberListT();
		

	}

}
