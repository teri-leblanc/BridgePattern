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
//This is a refiend abstraction of Remote. This specific remote has a button to view the next channel and go back to the
//previous channel
public class ConcreteRemote extends RemoteControl{   
    private int currentChannel;
    public ConcreteRemote(TV imp){
        super(imp);
                }
    public void nextChannel()   {       
        currentChannel++;   
        setChannel(currentChannel);   
    }     
    public void prevChannel()   {       
        currentChannel--;   
        setChannel(currentChannel);   
    }   
    public void setChannel(int channel)   {   
        currentChannel = channel;
        super.setChannel(channel);
    }
}
