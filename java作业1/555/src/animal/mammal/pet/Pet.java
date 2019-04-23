/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.mammal.pet;

/**
 *
 * @author admin
 */
public interface Pet {
    int price = 5;
    String master= "master";
    String getMaster();
    int getPrice();
    void setPrice(int p);
    void setMaster(String m);
}
