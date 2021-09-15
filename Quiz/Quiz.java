import java.io.*;
import java.util.*;
class User{
	public String name;
	public String password;
	
	User(){
		
	}
	
	User(String name, String password)
	{
		this.name=name;
		this.password=password;
	}
	boolean login(String name, String password)
	{
		if(name.equals(this.name)&& password.equals(this.password))
			return true;
		else
			return false;
	}
}


class Admin extends User{
	Admin(){
		
	}
	Admin(String name, String password)
	{
		this.name=name;
		this.password=password;
	}
	void addQuestion(question q)
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

class quizTaker extends User{
	quizTaker(String name, String password)
	{
		this.name=name;
		this.password=password;
	}
}


class question {
	String ques;
	String answer;
	question(){
		
	}
	question(String ques, String answer)
	{
		this.ques=ques;
		this.answer=answer;
	}

void printQuestion(){
	System.out.println(ques);
	System.out.println("\na)YES \nb)NO \n3)Not Sure");
}

boolean checkAnswer(String a)
{
	if(answer.equals(a)){
		return true;
	}
	else{
		return false;
}
}
}

 
 class Quiz{
	
	 
	 public static void main(String args[])
	{
		User u[] = new User[10];
		u[0]= new Admin(" admin1" , "vjti@123");
		u[1]= new Admin(" admin2" , "vjti@123");
		u[2]= new Admin(" admin3" , "vjti@123");
		u[3]= new Admin(" admin4" , "vjti@123");
		u[4]= new Admin("" , "");
		u[5]= new quizTaker("abc","123");
		u[6]= new quizTaker("xyz" , "456");
		u[7]= new quizTaker("pqr" , "789");
		question q[] = new question[10];
		q[0]= new question("Is Narendra Modi, the prime minister of INDIA? " , "a");
		q[1]=new question("Did Spain won the 2014 FIFA world cup?" , "b");
		q[2]= new question("Do you want this bonus question to give you free score?",  "a");
		q[3]= new question("" , "");
		q[4]= new question("" , "");
		q[5]= new question("" , "");
		
		int admincount = 1;
		int quizTakerCount=8,questionCount=3, i=7;
		User abc = new User();
		Admin ad = new Admin();
		boolean success = false;
		int logchoice = 0;
		int marks = 0;
		String anschoice;
		while(logchoice!=3)
		{
			System.out.println("1) SIGN UP \n2) SIGN IN \n3) QUIT");
			Scanner ob= new Scanner(System.in);
			logchoice = ob.nextInt();
			if(logchoice==1)
			{
				System.out.println("Enter the new username:");
				String name = new String(ob.next());
				System.out.println("Enter the password:");
				String pass= new String(ob.next());
				u[quizTakerCount++]= new quizTaker(name,pass);
				success = true;
			}
			if(logchoice==2)
			{
				System.out.println("Enter the username:");
				String name= new String(ob.next());
				System.out.println("Enter the password:");
				String pass= new String(ob.next());
				for(i=0;i<8;i++)
				{
					
					if(u[i].login(name,pass))
						{
						success= true;
						}
					 break;
				}
				if(success == false)System.out.print("LOGIN FAILED!!");
				
				}
			else if(logchoice==3)
			{
				System.out.println("GOODBYE");
				break;
			}

			
			int choice=0;
			if(success && i>3)
			{
				while(choice!=2)
				{
					System.out.println("1)Take Quiz \n2)Log Out");
					choice= ob.nextInt();
					if(choice==1)
					{
						question xyz = new question();
						for(int j =0 ; j<questionCount ; j++)
						{
							xyz=q[j];
							q[j].printQuestion();
							anschoice=ob.next();
							if(xyz.checkAnswer(anschoice))
							{
								marks++;
							}
							
						}
						System.out.println("Your marks are " +marks+ "out of" +questionCount);
					}
					else if(choice==2);
					else System.out.println("Invalid Choice"); 
					
				}
				
			}
			else if(success && i<3)
			{
				i=7;
				while(choice!=2)
				{
					System.out.println("1)Take Quiz \n2)Log Out");
					choice= ob.nextInt();
					if(choice==1)
					{
						ad.addQuestion(q[questionCount++]);
					}
					else if (choice==2);
					else System.out.println("Invalid Choice");
				}
				
			}
			}
			}
}
		
	





