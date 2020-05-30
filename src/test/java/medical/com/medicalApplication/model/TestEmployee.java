package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployee {

	private Employee emp;
	
	@Before
	public void testEmployee() {
		this.emp = new Employee("Renee", "Afd443");
	}

	@Test
	public void testGetName() {
		String expectedValue = "Renee";
		String actualValue = this.emp.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetId() {
		String expectedValue = "Afd443";
		String actualValue = this.emp.getId();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetPassword() {
		String expectedValue = "Open";
		String actualValue = this.emp.getPassword();
		
		assertEquals(expectedValue, actualValue);
	}

}
