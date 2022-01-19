package studyJava.java;


public class Study9 {

	public static void main(String[] args) {
		
		Study9 main = new Study9();
		try {
			main.firstMethod();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

		
		public void firstMethod() throws Exception{
			secondMethod();
		}
		public void secondMethod() throws Exception{
			thirdMethod();
		}
		public void thirdMethod() throws Exception{
			System.out.println("10/0="+(10/0));
		}


}