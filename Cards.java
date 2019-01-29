//Textual representaion of Card Object
public class Cards {
	
	//Attributes
	String type;
	String expiry;
	int cvv;
	
	//methods
	void setDataForCards(String ty, String ex, int cv) {
		type = ty;
		expiry = ex;
		cvv = cv;
		
	}
	void showDataForCards() {
		System.out.println("========= Card Data ========");
		System.out.println("Type of card\t" +type);
		System.out.println("Expiry date\t" +expiry);
		System.out.println("cvv no\t" +cvv);
	}
	}


