package Business;

import Business.Employee.Employee;
import Business.Role.LabAssistantRole;
import Business.Role.MCHBRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
      UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee employee1=system.getEmployeeDirectory().createEmployee("MCHB");
        
       UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("MCHB", "MCHB", employee1, new MCHBRole());
        
      //  Employee employee2=system.getEmployeeDirectory().createEmployee("lab");
        
       //UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("lab", "lab", employee1, new LabAssistantRole());
        return system;
    }
    
}
