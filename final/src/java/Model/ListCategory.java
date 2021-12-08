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
public class ListCategory {
    private ArrayList<Category> lCategory;

    public ListCategory() {
    }

    public ListCategory(ArrayList<Category> lCategory) {
        this.lCategory = lCategory;
    }

    public ArrayList<Category> getlCategory() {
        return lCategory;
    }

    public void setlCategory(ArrayList<Category> lCategory) {
        this.lCategory = lCategory;
    }

    public String getNameById(int id) {
        for (Category category : lCategory) {
            if (category.getCate_id()== id) {
                return category.getCate_name();
            }
        }
        return null;
    }
}
