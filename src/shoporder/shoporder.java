package shoporder;
import java.util.Scanner;
import java.util.Arrays;
public class shoporder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = {"flour","cookingoil","sugar","vegetables"};
		String[] flouritems = {"baking", "maize"};
		String[] oiltype = {"elianto", "kimbo"};
		String[] sugartype = {"mumias", "nzoia"};
		String[] vegietype = {"tomatoes", "kales", "cabbage"};
		String userorder;
		String[] exeorgol = {"exe", "golden"};
		Scanner order = new Scanner(System.in);
		
		//first question to customer and customer input
		System.out.println("What would you like to order? We currently have" + Arrays.toString(items));
		userorder = order.nextLine();
		//check if user input = items in array and proceed if correct item is selected
		if(userorder.equals(items[0])) {
			System.out.println("What kind of flour would you like "+flouritems[0]+" or "+flouritems[1]+"?");
			userorder = order.nextLine();
		}
			//if user selects flour proceed to which type
		else if(userorder.equals(flouritems[0])) {
				System.out.println("Would you like Exe or Golden");
				userorder = order.nextLine();
		
				}
			//if user selects flour proceed to which type
			 else if (userorder.equals(flouritems[1])) {
				 System.out.println("Would you like Exe or Golden");
				 userorder = order.nextLine(); 
			}
		
			 //if user selects exe print cost
			  if(userorder.equals(exeorgol[0])) {
				 System.out.println("Exe: Costs 89kshs per 2kgs");
				 
			 }
			  //if user selects golden print cost
			 else if (userorder.equals(exeorgol[1])) {
				 System.out.println("Golden: Costs 79kshs per 2kgs");
			 }
		
		
			//if cooking oil is selected proceed to which type
			else if(userorder.equals(items[1])) {
				System.out.println("What kind of "+items[1]+" would you like? Elianto or Kimbo");
				userorder = order.nextLine();
			}
		
			//user selects elianto and gets cost
			if (userorder.equals(oiltype[0])) {
				System.out.println("Elianto: Costs 112khs per litre");
				
			}
			//user selects kimbo and gets cost
			else if (userorder.equals(oiltype[1])) {
				System.out.println("Kimbo: Costs 140ksh per litre");
			}
			
			//sugar type
			else if(userorder.equals(items[2])) {
					System.out.println("What kind of "+items[2]+" would you like? Mumias or Nzoia");
					userorder = order.nextLine();
			}
			
			//mumias is selected then print cost
			if (userorder.equals(sugartype[0])) {
				System.out.println("Mumias: Costs 215ksh per 2kg");
			}
			
			//nzoia is selected then print cost-
			else if (userorder.equals(sugartype[1])) {
				System.out.println("Nzoia: Costs 187ksh per 2kg");
			}
		
			else if(userorder.equals(items[3])) {
				System.out.println("What kind of "+items[3]+" would you like? Tomatoes, Kales or Cabbage ");	
				userorder = order.nextLine();
		}
			
			if (userorder.equals(vegietype[0])) {
				System.out.println("Tomatoes: Cost 10ksh for 1");
			}
			
			else if (userorder.equals(vegietype[1])) {
				System.out.println("Kales: Cost 20 for 5 pieces");
			}
			
			else if (userorder.equals(vegietype[2])) {
				System.out.println("Cabbage: Costs 30 for 1");
			}
		
		//if user input doesn't match items in array
		else {
			System.out.println("sorry we only have this items available" + Arrays.toString(items));
		}
		
		

	}

}
