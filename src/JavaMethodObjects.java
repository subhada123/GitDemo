
public class JavaMethodObjects {

	public static void main(String[] args) {
		// To create methods and access methods using Java class objects
		//why method ? - to reuse certain steps
		
		JavaMethodObjects q = new JavaMethodObjects();
		String wish = q.getData();
		System.out.println(wish);
		
		Methodindiffclass q1 = new Methodindiffclass();
		q1.getUserData();
		getData2();
	}

	//Note- Method should always be declared outside main class
	public String getData()
	{
		System.out.println("hello world**");
		return "Shubhi";
	}
	
	//no need to create object becoz of use of static 
	public static String getData2()
	{
		System.out.println("hello world??");
		return "Shubhi";
	}
}
