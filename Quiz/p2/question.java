package p2;

public class question {
	public String ques;
	 public String answer;
	public question(){
		
	}
	public question(String ques, String answer)
	{
		this.ques=ques;
		this.answer=answer;
	}

public void printQuestion(){
	System.out.println(ques);
	System.out.println("\na)YES \nb)NO \n3)Not Sure");
}

public boolean checkAnswer(String a)
{
	if(answer.equals(a)){
		return true;
	}
	else{
		return false;
}
}

}
