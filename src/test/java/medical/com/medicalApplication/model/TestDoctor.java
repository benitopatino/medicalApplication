package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDoctor {

	private Doctor doctor;
	
	@Before
	public void testDoctor() {
		this.doctor = new Doctor("James", "888");
	}

	@Test
	public void testGetName() {
		String expectedValue = "James";
		String actualValue= this.doctor.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetName() {
		this.doctor.setName("Frank");
		String expectedValue = "Frank";
		String actualValue = this.doctor.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetId() {
		String expectedValue = "888";
		String actualValue = this.doctor.getId();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetId() {
		this.doctor.setId("34504");
		String expectedValue = "34504";
		String actualValue = this.doctor.getId();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testToString() {
		String expectedValue = "Doctor Name:" + "James " + "ID: " +"888";
		String actualValue = this.doctor.toString();
		
		assertEquals(expectedValue, actualValue);
	}

}
