package medical.com.medicalApplication.services;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDoctorService {
	
	@Before
	public void createListOfDoctors() {
		// Add doctors
		String[] names = {"Frank", "Josh", "Donald", "Beyonce"};
		String[] ids = {"567", "778", "984345", "113322"};
		
		for(int i = 0; i < names.length; i++) {
			DoctorService.getReference().addDoctor(names[i], ids[i]);
		}
	}

	@Test
	// test creating a DoctorService reference
	public void testGetReference() {
		DoctorService expectedValue = DoctorService.getReference();
		assertNotNull(expectedValue);
	}

	@Test
	public void testGetAllDoctors() {
		int expectedValue = 5;
		int actualValue = DoctorService.getReference().getAllDoctors().size();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	// Test adding a doctor using the DoctorService
	// Adding a single doctors
	public void testAddDoctor() {
		boolean expectedValue = true;
		boolean actualValue = DoctorService.getReference().addDoctor("Frank", "88990");
		System.out.println(DoctorService.getReference().getAllDoctors().size());
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void testAddingAlreadyExistingDoctor() {
		
		// Should not create doctor because there already exists an entry with the same ID
		boolean expectedValue = false;
		boolean actualValue = DoctorService.getReference().addDoctor("Frank", "567");
		assertEquals(expectedValue, actualValue);
	}

}
