package monitors;

import static com.sandwich.util.Assert.assertEquals;
import static com.sandwich.util.Assert.assertTrue;
import static com.sandwich.util.Assert.fail;

import com.orbitz.erma.koans.KoanProcessor;
import com.orbitz.monitoring.api.Attribute;
import com.orbitz.monitoring.api.Monitor;
import com.orbitz.monitoring.api.monitor.EventMonitor;
import com.sandwich.koan.Koan;

public class AboutEvents {

    static {
        KoanProcessor.getInstance();
    }
    
    //TODO EventMonitor has only constructors and fire, else is in AbstractMonitor
    
    @Koan
    public void eventMonitorAll() {
        EventMonitor event = new EventMonitor("Name"); //TODO There are three other constructors.
    }
    
    @Koan
    public void eventNaming(){
        Monitor eventMonitor = new EventMonitor("NewEvent");
        //Monitors are maps of attributes to be processed.
        //The minimum data that all monitors have is a name. The Attribute class defines many common
        //keys to the monitors attribute map.
        assertEquals(eventMonitor.get(Attribute.NAME), "NewEvent");
    }
    
//    @Koan
    public void eventsHaveDefaultProperties() {
        fail("Define this koan");
    }
    
//    @Koan
    public void eventsCanHaveCustomProperties() {
        fail("Define this koan");
    }

    @Koan
    public void eventsMustBeFired(){
        EventMonitor likeAGun = new EventMonitor("LikeAGun");
        likeAGun.fire();
        assertTrue(KoanProcessor.hasProcessed(likeAGun));
    }
    
    public static void main(String[] args) {
        new AboutEvents().eventMonitorAll();
    }
}