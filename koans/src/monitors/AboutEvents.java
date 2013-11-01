package monitors;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;
import static com.sandwich.util.Assert.fail;

import com.orbitz.monitoring.api.Attribute;
import com.orbitz.monitoring.api.Monitor;
import com.orbitz.monitoring.api.monitor.EventMonitor;
import com.sandwich.koan.Koan;

public class AboutEvents {

    @Koan
    public void eventNaming(){
        Monitor eventMonitor = new EventMonitor("NewEvent");
        //Monitors are maps of attributes to be processed.
        //The minimum data that all monitors have is a name. The Attribute class defines many common
        //keys to the monitors attribute map.
        assertEquals(eventMonitor.get(Attribute.NAME), __);
    }
    
    @Koan
    public void eventsHaveDefaultProperties() {
        fail("Define this koan");
    }
    
    @Koan
    public void eventsCanHaveCustomProperties() {
        fail("Define this koan");
    }

    @Koan
    public void eventsMustBeFired(){
        fail("delete this line");
    }
    
}