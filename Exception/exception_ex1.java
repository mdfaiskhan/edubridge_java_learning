package Exception;
//Arithmetic Exception handles by try and catch
public class exception_ex1 {

	public static void main(String[] args) {
		try{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println(100/0);
		System.out.println("5");
	}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("6");
		System.out.println("Exception can be handled");
	}
}
