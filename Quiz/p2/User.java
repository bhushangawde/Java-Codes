package p2;
import java.util.Scanner;
import p1.*;
public class User {
	
		public String name;
		public String password;
		
		public User(){
			
		}
		
	public	User(String name, String password)
		{
			this.name=name;
			this.password=password;
		}
	public	boolean login(String name, String password)
		{
			if(name.equals(this.name)&& password.equals(this.password))
				return true;
			else
				return false;
		}
	}

 



	 

