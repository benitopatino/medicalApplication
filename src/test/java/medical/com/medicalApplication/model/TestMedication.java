package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMedication {

	private Medication medication;
	
	@Before
	public void testMedication() {
		this.medication = new Medication("Vicodin", "01/01/2004", "01/02/2004", "200mg");
	}
	

	@Test
	public void testGetName() {
		String expectedValue = "Vicodin";
		String actualValue = this.medication.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetName() {
		String expectedValue = "Tylenol";
		this.medication.setName(expectedValue);
		String actualValue = this.medication.getName();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetStartDate() {
		String expectedValue = "01/01/2004";
		String actualValue = this.medication.getStartDate();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetStartDate() {
		String expectedValue = "02/02/1993";
		this.medication.setStartDate(expectedValue);
		String actualValue = this.medication.getStartDate();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetEndDate() {
		String expectedValue = "01/02/2004";
		String actualValue = this.medication.getEndDate();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetEndDate() {
		String expectedValue = "01/22/2005";
		this.medication.setEndDate(expectedValue);
		String actualValue = this.medication.getEndDate();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetDose() {
		String expectedValue = "200mg";
		String actualValue = this.medication.getDose();
		
		assertEquals(expectedValue,actualValue);
	}

	@Test
	public void testSetDose() {
		String expectedValue = "500mg";
		this.medication.setDose(expectedValue);
		String actualValue = this.medication.getDose();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testToString() {
		String expectedValue = "Medication:"+this.medication.getName()+ " Start Date: " + this.medication.getStartDate() + " End Date: "+this.medication.getEndDate()+ " Dose: "+this.medication.getDose();
		String actualValue = this.medication.toString();
		
		assertEquals(expectedValue, actualValue);
	}

}
