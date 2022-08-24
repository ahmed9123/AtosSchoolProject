package schoolTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import school.CRUDqueries;
import school.School;

public class CrudTest {
	
	School teach = new School();
	School tea;
	
	CRUDqueries crudTest = new CRUDqueries();
	
	@BeforeAll
	  public static void start() {
	      System.out.println("Test for School");
	  }

	  
	  
	 @BeforeEach
		public  void setup() { 
		 teach.setName("kenneth");
		 teach.setPosition("support staff");
		 teach.setAge(23);
		 teach.setYears_teaching(1);
		 teach.setSalary(24000);
		 System.out.println("Before Each");
		 
		 tea = new School("may","math teacher",26,4,30000);
		 
		}
	 
	 @Test
	 public void TestRead()
	 {
		School teach1 = new School("jim","dinner man", 27, 0, 20000);
		//crudTest.create(teach1);
	    School teach2 = crudTest.read(5);//If this test is run again you must make a new object then change the read method parameter value 6 or in increments.
	    Assertions.assertEquals(teach1.getSalary(), teach2.getSalary());
	    Assertions.assertEquals(teach1.getPosition(), teach2.getPosition());
	    Assertions.assertEquals(teach1.getName(), teach2.getName());
	    
		
	 }
	 
	/* @Test
	 public void TestReadAll()
	 {
		
		
	    
	    
		
	 }*/
	 
	 @Test
	 public void TestCreate()
	 {
		 School teach3 = new School("harry redknapp", "pe couch",52,27,70000);
		// crudTest.create(teach3);
		 School teach4 = crudTest.read(7);
		 Assertions.assertEquals("harry redknapp",teach4.getName());
		 
	 }
	 
	 @Test
	 public void TestUpdate()
	 {
		 School teach5 = new School("clive connely", "attendace officer",60,24,52000);
		// crudTest.create(teach5);
		 crudTest.update(8, "wenger");
		 School teach6 = crudTest.read(8);
		 
		 
		 Assertions.assertEquals("wenger", teach6.getPosition());
	 }
	 
	 @Test
	 public void TestDelete() {
		 School teach7 = new School("king","leader of schools",72,50,100000);
		 crudTest.create(teach7);
		 Assertions.assertEquals("king",teach7.getName());
		 School teach8 = crudTest.read(11);
		  crudTest.delete(11);
		 Assertions.assertNotEquals(null,teach8.getName());
		 
		 
	 }

}
