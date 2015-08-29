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
public class Sony implements TV
{
    public void on(){
        System.out.println("Sony TV On");
    }
    public void off(){
        System.out.println("Sony TV Off");
    }
    public void tuneChannel(int channel)
    {
        System.out.println("Sony TV Change Channel to: "+channel);
    }
    
}