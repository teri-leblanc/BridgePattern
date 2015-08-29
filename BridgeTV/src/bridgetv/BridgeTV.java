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
public class BridgeTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // In this example we create a remote for our SONY and Philips TV. We then check to make sure all the buttons on the
        // remote are functional
        ConcreteRemote sony = new ConcreteRemote(new Sony());
        ConcreteRemote philips = new ConcreteRemote(new Philips());
        sony.on();
        sony.setChannel(23);
        sony.nextChannel();
        sony.prevChannel();
        sony.off();
        philips.on();
        philips.setChannel(15);
        philips.nextChannel();
        philips.prevChannel();
        philips.off();
        
        
    }
    
}
