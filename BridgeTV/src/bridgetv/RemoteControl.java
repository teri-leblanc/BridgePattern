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
//This is the Abstraction
public abstract class RemoteControl{   
    private TV implementor;
    protected RemoteControl(TV imp){
        implementor = imp;
    };
    public void on()   {      
        implementor.on();   
    }   
    public void off()   {      
        implementor.off();   
    }      
    public void setChannel(int channel)   {   
        implementor.tuneChannel(channel);   
    }
}
