
public class methods {


		void fun1(int x){ // non static method
			int y = x + 10;
			System.out.println("y is: "+y);
		}

		static void fun2(int x){ // static method
			int y = x + 10;
			System.out.println("y is: "+y);
		}

		int mtrsToCms(int mtrs){	// non static method
			int cms = mtrs * 100;
			return cms;
		}
	
		public static void main(String[] args) {

			int x = 11;
			int y = x + 1;
			System.out.print("y is: "+y);

			System.out.println();
			methods.fun2(1);
			methods.fun2(2);
			methods.fun2(3);
			methods.fun2(4);

			System.out.println();
			// Execution of a non static method
			// We need Object to execute a non static method
			methods Roop = new methods(); // Syntax
			Roop.fun1(10);
			Roop.fun1(13);
			Roop.fun1(17);

			System.out.println();
			
			System.out.println("20 mtrs is: "+Roop.mtrsToCms(20)+" cms");


	}

}
