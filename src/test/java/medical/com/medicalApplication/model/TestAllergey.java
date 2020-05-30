package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAllergey {

	private Allergey allergey;
	
	@Before
	public void testAllergey() {
		this.allergey = new Allergey("Peanuts");
	}

	@Test
	public void testGetName() {
		String expectedValue = "Peanuts";
		String actualValue = this.allergey.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetName() {
		String expectedValue = "Dairy";
		this.allergey.setName("Dairy");
		String actualValue = this.allergey.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testToString() {
		this.allergey.setName("Pollen");
		String expectedValue = "Allergy Pollen";
		String actualValue = this.allergey.toString();
		
		assertEquals(expectedValue, actualValue);
	}

}
