/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bridgetv;

/**
 *
 * @author Teri
 */
//Concrete TV Implementation
public class Philips implements TV{
    public void on(){
        System.out.println("Philips TV On");
    }
    public void off(){
        System.out.println("Philips TV Off");
    }
    public void tuneChannel(int channel)
    {
       System.out.println("Philips TV Change Channel to: "+channel);
    }
}
