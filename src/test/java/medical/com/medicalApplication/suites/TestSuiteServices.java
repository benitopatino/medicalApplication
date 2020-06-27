package medical.com.medicalApplication.suites;

import medical.com.medicalApplication.services.TestDoctorService;
import medical.com.medicalApplication.services.TestMedicalRecordService;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Test suite will examine all the java classes in Models
@RunWith(Suite.class)
@SuiteClasses({TestDoctorService.class, TestMedicalRecordService.class})
public class TestSuiteServices {
}
