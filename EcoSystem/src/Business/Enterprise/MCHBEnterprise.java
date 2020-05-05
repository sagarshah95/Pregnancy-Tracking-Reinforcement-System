/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author my pc
 */
public class MCHBEnterprise extends Enterprise{
    public MCHBEnterprise(String name){
        super(name,EnterpriseType.MCHB);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
