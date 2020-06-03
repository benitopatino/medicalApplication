package medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;

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
	// Expected: NotNull
	public void testGetMedicalRecord() {
		// expected a result that is not null
		MedicalRecordService.getReference().addPatient("Tom Cruise", "786");
		assertNotNull(MedicalRecordService.getReference().getMedicalRecord("786"));
	}

	
	@Test(expected = NoSuchElementException.class)
	// Attempts to get a medical record from a patient that does not exists
	// Expected: An exception will be thrown: NoSuchElementException
	public void testGetNonExsitantMedicalRecord() {
		// expected a result that is not null
		MedicalRecordService.getReference().getPatient("546213");
	}

	
	@Test
	// Tests getting a patient that already exists
	// Expected: NotNull
	public void testGetPatient() {
		// add a patient 
		MedicalRecordService.getReference().addPatient("bender", "010101");

		assertNotNull(MedicalRecordService.getReference().getPatient("010101"));
	}
	
	@Test(expected = NoSuchElementException.class)
	// Tests getting a patient that does not exists
	// Expected: null
	public void testGetPatientThatDoesNotExists() {
		// add a patient 
		MedicalRecordService.getReference().addPatient("James", "4husdf");
		
		MedicalRecordService.getReference().getPatient("jhgdkghsdfjghsdkjsdhkgsdgh");
		
	}
;
	@Test
	// Get list of all patients
	// Expected: NotNull
	public void testGetAllPatients() {
		// add patients
		MedicalRecordService.getReference().addPatient("Thomas", "555533322");
		MedicalRecordService.getReference().addPatient("Homer", "5666551");
		
		// add allergy
		MedicalRecordService.getReference().getMedicalRecord("555533322").getHistory().addAllergy(new Allergey("Fish"));
		MedicalRecordService.getReference().getMedicalRecord("5666551").getHistory().addAllergy(new Allergey("Peanut"));
		
		assertNotNull(MedicalRecordService.getReference().getAllPatients());
	}
	
	@Test
	// Get list of all patients and make sure the count equals the expected amount
	// Expected: # of entries 
	public void testGetAllPatientsCount() {
		// add patients
		MedicalRecordService.getReference().addPatient("Donald", "123456789");
		MedicalRecordService.getReference().addPatient("Alex", "6551");
		
		// add allergy
		MedicalRecordService.getReference().getMedicalRecord("123456789").getHistory().addAllergy(new Allergey("Fish"));
		MedicalRecordService.getReference().getMedicalRecord("6551").getHistory().addAllergy(new Allergey("Gluten"));
		
		int expectedValue = 5;
		int actualValue = MedicalRecordService.getReference().getAllPatients().size();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	// Get a patient that matches the allergy
	public void testGetPatientsWithAllergies() {
		// add some patients
		MedicalRecordService.getReference().addPatient("Zoidberg", "3453");
		MedicalRecordService.getReference().addPatient("Fry", "789456");
		MedicalRecordService.getReference().addPatient("Hermes", "021021");
		MedicalRecordService.getReference().addPatient("Zapp", "4957");
		
		// add allergies to patients
		MedicalRecordService.getReference().getMedicalRecord("3453").getHistory().addAllergy(new Allergey("Fish"));
		MedicalRecordService.getReference().getMedicalRecord("789456").getHistory().addAllergy(new Allergey("Fish"));
		MedicalRecordService.getReference().getMedicalRecord("021021").getHistory().addAllergy(new Allergey("Peanut"));
		


		assertNotNull(MedicalRecordService.getReference().getPatientsWithAllergies("Fish"));
		
	}

}
