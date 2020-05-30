package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTreatment {

	private Treatment treatment;
	
	@Before
	public void testTreatment() {
		this.treatment = new Treatment("12/12/1923", "Broken Leg", "The patient has broken femur");
	}

	@Test
	public void testGetTreatmentDate() {
		String expectedValue = "12/12/1923";
		String actualValue = this.treatment.getTreatmentDate();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetTreatmentDate() {
		String expectedValue = "06/12/1999";
		this.treatment.setTreatmentDate(expectedValue);
		String actualValue = this.treatment.getTreatmentDate();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetDiagnose() {
		String expectedValue = "Broken Leg";
		String actualValue = this.treatment.getDiagnose();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetDiagnose() {
		String expectedValue = "Headache";
		this.treatment.setDiagnose(expectedValue);
		String actualValue = this.treatment.getDiagnose();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetDescription() {
		String expectedValue = "The patient has broken femur";
		String actualValue = this.treatment.getDescription();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testSetDescription() {
		String expectedValue = "Multi fracture";
		this.treatment.setDescription(expectedValue);
		String actualValue = this.treatment.getDescription();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testToString() {
		String expectedValue = "Treatment: " + " Date: " + this.treatment.getTreatmentDate() + " Diagnose: " + this.treatment.getDiagnose();
		String actualValue = this.treatment.toString();
		
		assertEquals(expectedValue, actualValue);
	}

}
