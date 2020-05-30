package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPatient {

	private Patient patient;
	
	@Before
	public void testPatient() {
		this.patient = new Patient("Oscar", "2349dsf");
	}

	@Test
	public void testGetName() {
		String expectedValue = "Oscar";
		String actualValue = this.patient.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetName() {
		this.patient.setName("Edgar");
		String expectedValue = "Edgar";
		String actualValue = this.patient.getName();
		
		assertEquals(expectedValue, actualValue);
		
	}

	@Test
	public void testGetId() {
		String expectedValue = "2349dsf";
		String actualValue = this.patient.getId();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetId() {
		String expectedValue = "98UIS83.sdf9";
		this.patient.setId(expectedValue);
		String actualValue = this.patient.getId();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testToString() {
		String expectedValue = "Patient Name:" + " Oscar " + "ID: "+"2349dsf";
		String actualValue = this.patient.toString();
		
		assertEquals(expectedValue, actualValue);
	}

}
