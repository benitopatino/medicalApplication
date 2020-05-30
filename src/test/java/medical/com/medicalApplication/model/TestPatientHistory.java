package medical.com.medicalApplication.model;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPatientHistory {

	private PatientHistory pHistory;
	private List<Treatment> treatments;
	private List<Allergey> allergies;
	private List<Medication> medications;
	
	// @Before
	@Before
	public void testPatientHistory() {
		this.pHistory = new PatientHistory();
		this.treatments = new ArrayList<Treatment>();
		this.allergies = new ArrayList<Allergey>();
		this.medications = new ArrayList<Medication>();
	}
	
	// @Before
	// Initialize the local Treatment list
//	@Before 
//	public void initializeTreatments() {
//		String[] treatDates = {"01/01/1990", "11/03/1990", "12/21/2020", "03/14/2006" };
//		String[] diagnose = {"Broken Leg", "Ear Infection", "Stomach cramps", "Sore Throats" };
//		String[] description = {"asdfasdf sdfasfsdfsdf", "eeeeeeee", "the bif gower", "asdfasdfasdfwefwefwfefwfefefasefef" };
//		Treatment t;
//		int i = 0;
//		while(i < treatDates.length) {
//			t = new Treatment(treatDates[i], diagnose[i], description[i]);
//			this.treatments.add(t);
//			i++;
//		}
//	}

	// @Before
	// Initialize local allergies list
	@Before
	public void initializeAllergies() {
		String[] names = {"Pollen", "Peanuts", "Alcohol", "Penicillan", "Rubber" };
		Allergey a;
		int i = 0;
		while(i < names.length) {
			a = new Allergey(names[i]);
			this.allergies.add(a);
			i++;
		}
	}
	
	//@Before
	// Initialize local medication list
	@Before
	public void initializeMedications() {
		String[] name = {"Vicodin", "Tylenol", "Penecillan", "Prozac", "Gaterade" };
		String[] startDate = {"11/17/1994", "06/04/2005", "12/21/2020", "03/14/2006", "10/26/2011" };
		String[] endDate = {"11/20/1994", "06/10/2005", "12/30/2020", "03/25/2006", "11/02/2011"  };
		String[] dose = {"300MG","600MG","1000MG","200MG","50MG","30MG" };
		Medication m;
		int i = 0;
		while(i < name.length) {
			m = new Medication(name[i], startDate[i], endDate[i], dose[i]);
			this.medications.add(m);
			i++;
		}
	}
	
	// @Test
	// Test adding treatments to patient history
//	@Test
//	public void testAddTreatment() {
//		// Copy local treatment list to expectedValue 
//		List<Treatment> expectedValue = this.treatments;
//
//		// add treatments to patientHistory treatment list from the local treatment list
//		for(int i = 0; i < expectedValue.size(); i++) {
//			this.pHistory.addTreatment(expectedValue.get(i));
//		}
//		
//		// // Copy patient History treatment list to actual value
//		List<Treatment> actualValue = this.pHistory.getAllTreatments();
//		
//		// Test expected list of treatments to those in the pHistory treatment list(actualValue)
//		assertEquals(expectedValue, actualValue);
//		
//	}
//
//	// @Test
	// Add allergy
	@Test
	public void testAddAllergy() {
		// Copy local allergey list to expectedValue 
		List<Allergey> expectedValue = this.allergies;
		
		// add allergies list to patient history allergies list 
		for(int i = 0; i < expectedValue.size(); i++) {
			this.pHistory.addAllergy(expectedValue.get(i));
		}
		
		// Copy patient history allergey list to actual value
		List<Allergey> actualValue = this.pHistory.getAlergies();
		
		// Test expected list of allergies to those in patient history allergy list(actualValue)
		assertEquals(expectedValue, actualValue);
	}

	// @Test
	// Add medication
	@Test
	public void testAddMedication() {
		// Copy local allergey list to expectedValue 
		List<Medication> expectedValue = this.medications;
		
		// add allergies list to patient history allergies list 
		for(int i = 0; i < expectedValue.size(); i++) {
			this.pHistory.addMedication(expectedValue.get(i));
		}
		
		// Copy patient history allergey list to actual value
		List<Medication> actualValue = this.pHistory.getAllMedications();
		
		// Test expected list of allergies to those in patient history allergy list(actualValue)
		assertEquals(expectedValue.size(), actualValue.size());
	}
//
//	@Test
//	public void testGetAlergies() {
//		List<Allergey> expectedValue = this.allergies;
//		// add allergies list to patient history allergies list 
//		for(int i = 0; i < expectedValue.size(); i++) {
//			this.pHistory.addAllergy(expectedValue.get(i));
//		}
//		List<Allergey> actualValue = this.pHistory.getAlergies();
//		
//		assertEquals(expectedValue, actualValue);
//	}

//	@Test
//	public void testGetAllTreatments() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetAllMedications() {
//		fail("Not yet implemented");
//	}

}
