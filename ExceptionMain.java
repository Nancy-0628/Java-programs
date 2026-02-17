import java.util.Scanner;
class ExceptionMain{
 	public static void main(String...args){
		Scanner s = new Scanner(System.in);

	try{
		int age = s.nextInt();
		if(age < 18)
			throw new AgeException("Sorry you are not eligible to vote");
		else 
			System.out.println("Please cast your vote");
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}