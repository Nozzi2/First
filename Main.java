package Grade1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("0");
		num1 = sc.nextBigInteger();
		num2 = sc.nextBigInteger();
		
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(num1.add(num2)).append('\n');
		sb.append(num1.subtract(num2)).append('\n');
		sb.append(num1.multiply(num2)).append('\n');
		//sb라는 인스턴스에 s1이라는 문자열을 추가하고 줄바꿈
		System.out.println(sb);
		
	}
}

