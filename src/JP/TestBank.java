/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author deainsani
 */
public class TestBank {

    public static void main(String[] args) {
        //Account a1 = new Account("Mutiara",12345,061102);
        Account a2 = new Account();
        Account a3 = new Account();

        a2.setAccountName("Dea Insani Putri");
        a2.setAccountNum(2101092042);
        a2.setBalance(150000);

        a3.setAccountName("Dea");
        a3.setAccountNum(2101092042);
        a3.setBalance(4530000);

        a2.print();
        System.out.println("");
        a3.print();
    }
}
