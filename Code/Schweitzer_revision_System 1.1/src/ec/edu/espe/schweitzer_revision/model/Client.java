/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.schweitzer_revision.model;

/**
 *
 * @author User
 */
public class Client {
    private String name;
    private long id;
    private String address;
    private long phone;
    private Order newOrder;

    public Client(String name, long id, String address, long phone, Order newOrder) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.newOrder = newOrder;
    }

    public void assignOrder(Technician technician){
        //to do
    }
    
    public void cancelorder(){
        // to do
    }
    
    public void displaySparePartList(SparePart item){
        // to do
    }
}
