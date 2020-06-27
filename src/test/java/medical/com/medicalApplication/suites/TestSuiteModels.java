package medical.com.medicalApplication.suites;

import medical.com.medicalApplication.model.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


// Test suite will examine all the java classes in Models
@RunWith(Suite.class)
@SuiteClasses({TestAllergey.class, TestDoctor.class, TestEmployee.class, TestMedication.class, TestPatient.class, TestPatientHistory.class, TestTreatment.class})
public class TestSuiteModels {
}
