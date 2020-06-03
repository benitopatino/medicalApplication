package medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMedicalRecordService {

	
	// Before
	// Create 
	
	@Test
	// make sure Singleton reference is not null
	public void testGetReference() {
		// Expected: True
		assertNotNull(MedicalRecordService.getReference());
	}

	@Test
	// Test adding a patient
	public void testAddPatient() {
		boolean expectedValue = true;
		boolean actualValue = MedicalRecordService.getReference().addPatient("James", "456");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	// Test adding a patient with a conflicting Id
	public void testAddPatientWithSameId() {
		boolean expectedValue = false;
		boolean actualValue = MedicalRecordService.getReference().addPatient("James", "456");	
		assertEquals(expectedValue, actualValue);
	}

	@Test
	// Get medical records of an existing patient
	public void testGetMedicalRecord() {
		MedicalRecordService.getReference().addPatient("Tom Cruise", "786");
		assertNotNull(MedicalRecordService.getReference().getPatient("786"));
	}

	@Test
	public void testGetPatient() {
		
	}

//	@Test
//	public void testGetAllPatients() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPatientsWithAllergies() {
//		fail("Not yet implemented");
//	}

}
