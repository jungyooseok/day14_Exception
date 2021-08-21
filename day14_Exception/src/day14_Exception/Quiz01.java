package day14_Exception;

import java.util.*;
class Auth{
	private String age;
	public String getAge(){ return age; }
	public boolean check(int age){
		this.age = age+"";
		if(this.age.length() == 6){
			if(this.age.charAt(0)<'9'){
				System.out.println("가입 가능");
				return true;
			}else{
				System.out.println("가입 불가");
			}
		}else{
			System.out.println("길이가 틀렸습니다.");
		}
		return false;
	}
	public int inputAge(){
		Scanner input = new Scanner(System.in);
		int age;
		String chkAge;
		System.out.print("나이 입력 : ");
		try{
			age=input.nextInt();
			return age;
		}catch(InputMismatchException e){
			System.err.println("숫자를 입력 하세요!!!");
			return -1;
		}
	}
	public void display(){
		boolean boo=false;
		System.out.println("인증 프로그램 입니다.");
		int age=-1;
		while(boo != true){	
			age = inputAge();
			if(age != -1)
				boo=check(age);
		}
	}
}
public class Quiz01 {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	Auth au = new Auth();
	au.display();
	
	
}
}

