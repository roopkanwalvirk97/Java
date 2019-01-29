
public class Users {
	//Attributes
			String name;
			String email;
			int contact;
			Cards cRef;
			
			//methods
		
				void setDataForUsers (String na, String em, int co) {
					name = na;
					email = em;
					contact = co;}
             //redifining methods
					void setDataForUsers (String na, String em, int co, Cards c) {
						name = na;
						email = em;
						contact = co;
						cRef = c;
				}
				void showDataForUsers() {
					System.out.println("========= User Data ========");
					System.out.println("NAME\t" +name);
					System.out.println("EMAIL\t" +email);
					System.out.println("CONTACT\t " +contact);
					cRef.showDataForCards();

		}}



