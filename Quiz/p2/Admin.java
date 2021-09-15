package p2;

import java.util.Scanner;

public class Admin extends User{
	public Admin(){
		
	}
	public Admin(String name, String password)
	{
		this.name=name;
		this.password=password;
	}
public 	void addQuestion(question q)
	{
		System.out.println(" Enter the question: ");
		Scanner ob = new Scanner(System.in);
		String adminq = ob.next();
		q.ques = adminq;
		System.out.println(" Enter the correct option: ");
		String admina = ob.next();
		q.answer = admina;
	}

}
