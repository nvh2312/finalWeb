/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author pv
 */
public class ListRole {
    private ArrayList<RoleType> lRole;

    public ListRole() {
    }

    public ListRole(ArrayList<RoleType> lRole) {
        this.lRole = lRole;
    }

    public ArrayList<RoleType> getlRole() {
        return lRole;
    }

    public void setlRole(ArrayList<RoleType> lRole) {
        this.lRole = lRole;
    }
    public String getNameById(int id) {        
        for (RoleType roleType : lRole) {
            if(roleType.getRole_id()==id){
                return roleType.getRole_name();
            }
        }
        return null;
    }
    
}
