/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.DriverRole;
import Business.Role.ManagerRole;
import Business.Role.Role;
import java.sql.Driver;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ManagmentOrganization extends Organization{

    public ManagmentOrganization() {
        super(Organization.Type.Management.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManagerRole());
        roles.add(new DriverRole());
        return roles;
    }
}
