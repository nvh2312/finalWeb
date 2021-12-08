
import Model.Bill;
import dao.BillDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PV
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        // TODO code application logic here
        BillDAO billDAO = new BillDAO();
        Bill b = new Bill(4, 4);
        billDAO.addBill(b);
        ArrayList<Bill> list = billDAO.getList();
        for (Bill bill : list) {
            System.out.println("" + bill);

        }
    }
    
}
