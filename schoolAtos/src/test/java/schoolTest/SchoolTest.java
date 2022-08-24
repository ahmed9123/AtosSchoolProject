package schoolTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import school.School;

public class SchoolTest {

	School teach = new School();
	School tea;
	
	
	
	
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
	 public void testGetName() {
		 Assertions.assertEquals("kenneth", teach.getName());
		 Assertions.assertEquals("may", tea.getName());
	 
	 }
	 
	 @Test
		public void testGetPosition() {
			Assertions.assertEquals("support staff", teach.getPosition());
			Assertions.assertEquals("math teacher",tea.getPosition());
			Assertions.assertNotEquals("english teacher", tea.getPosition());
			System.out.println("Test 2");
		}
	 
	 @Test
		public void testGetAge() {
			Assertions.assertEquals(23, teach.getAge());
			Assertions.assertEquals(26,tea.getAge());
			Assertions.assertNotEquals("99", teach.getAge());
			System.out.println("Test 2");
		}
	 
	 @Test
		public void testGetYearsTeaching() {
			Assertions.assertEquals(1, teach.getYears_teaching());
			Assertions.assertEquals(4,tea.getYears_teaching());
			Assertions.assertNotEquals("20", teach.getYears_teaching());
			System.out.println("Test 2");
		}
	 
	 @Test
		public void testGetSalary() {
			Assertions.assertEquals(24000, teach.getSalary());
			Assertions.assertEquals(30000,tea.getSalary());
			Assertions.assertNotEquals(60000, tea.getSalary());
			System.out.println("Test 2");
		}
	 
	 @Test 
	 public void testSetName() {
		 teach.setName("oliver");
		 Assertions.assertEquals("oliver", teach.getName());
		 
	 }
	 
	 @Test 
	 public void testSetPosition() {
		 teach.setPosition("king of testers");
		 Assertions.assertEquals("king of testers", teach.getPosition());
		 
	 }
	 
	 @Test 
	 public void testSetAge() {
		 teach.setAge(42);
		 Assertions.assertEquals(42, teach.getAge());
		 
	 }
	 
	 @Test 
	 public void testSetYears_teaching() {
		 teach.setYears_teaching(10);
		 Assertions.assertEquals(10, teach.getYears_teaching());
		 
	 }
	 
	 
	 
	 @Test 
	 public void testSetSalary() {
		 teach.setSalary(50000);
		 Assertions.assertEquals(50000, teach.getSalary());
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 @AfterEach 
		public void clean() {
			System.out.println("After Each");
			
		}
	    
       
      
}
