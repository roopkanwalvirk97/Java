
public class Payment {

	public static void main(String[] args) {
    Users u1 = new Users();
	Cards c1 = new Cards();
	
	// Writing Data In-Directly
	 u1.setDataForUsers("Roop", "virk@gmail.com", 987765432, c1);
	 
	 c1.setDataForCards("VISA", "30-06-2020", 988);

		
		
u1.showDataForUsers();
	}

}
