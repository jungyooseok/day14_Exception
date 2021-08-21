package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result;
		System.out.println("수 입력");
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
			System.out.println("x / y = "+result);
			return ;
		}catch(Exception e) {
			//System.out.println("0으로는 나눌수 없습니다");
			e.printStackTrace();
			return ;
		}finally {
			System.out.println("마지막에 수행할 내용");
		}
		//System.out.println("다음 문장들 실행~");
	}
}




