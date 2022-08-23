package school;

import java.util.Scanner;

public class SchoolChoice {
	
	private static Scanner scan = new Scanner(System.in);
	School stf;
	
	public String getInput() {
		System.out.println("Enter a choice ");
		return scan.nextLine();
	}
	

	
	public void CrudOptions() {
		CRUDqueries cr1 = new CRUDqueries();
		//cr1.endConnection();
		
		String crd = getInput().toLowerCase();
		
		try {
			do {
				switch (crd) {
				case "create":
					System.out.println("Enter Name: ");
					String nam = scan.nextLine();
					
					System.out.println("Enter Position: ");
					String pos = scan.nextLine();
					
					System.out.println("Enter Age: ");
					int age = scan.nextInt();
					scan.nextLine();
					
					System.out.println("Enter Years Teaching: ");
					int yt = scan.nextInt();
					scan.nextLine();
					
					System.out.println("Enter Salary: ");
					int sar = scan.nextInt();
					scan.nextLine();
					
					cr1.create(new School(nam,pos,age,yt,sar));
					break;
					
				case "read":
					System.out.println("Enter Staff-id of staff you want to search");
					int id_search = scan.nextInt();
					scan.nextLine();
					cr1.read(id_search);
					break;
					
					
				case "read all":
					System.out.println("This is the staff :");		
					cr1.readAll();
					break;
					
					
				case "update":
					System.out.println("Enter staff_id to update");
					int UpdateID = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter new position of the staff member: ");
					String positionUpd = scan.nextLine();
					cr1.update(UpdateID, positionUpd);
					break;
				
				case "delete":
					System.out.println("Enter staff id you want to delete");
					int delId = scan.nextInt();
					scan.nextLine();
					cr1.delete(delId);
					break;
					
					
				default:
						System.out.println("Wrong crud choice");
				}
				System.out.println("Continue? y/n");
				String stop = scan.nextLine();
				if(stop.toLowerCase().equals("y")) {
					crd = getInput();
			    } else if (stop.toLowerCase().equals("n")) {
				   crd = "stop";
			    } else {
				  System.out.println("Please enter 'y' or 'n'");
			    }
			} while (!crd.equals("stop"));
			System.out.println("See ya later!!!");
		} finally {
			cr1.endConnection();
		}
		
	}
}
