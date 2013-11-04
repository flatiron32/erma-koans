package monitors.processor;

import java.util.HashSet;
import java.util.Set;

import com.orbitz.monitoring.api.Monitor;
import com.orbitz.monitoring.api.MonitorProcessor;
import com.orbitz.monitoring.api.MonitoringEngine;
import com.orbitz.monitoring.test.MockMonitorProcessorFactory;

public class KoanProcessor implements MonitorProcessor {

    private static final Set<Monitor> PROCESSED_MONITORS = new HashSet<Monitor>();
    
    static {
        MonitoringEngine.getInstance().setProcessorFactory(new MockMonitorProcessorFactory(new KoanProcessor()));
    }
    
    private KoanProcessor() {
        
    }
    
    @Override
    public void startup() {
        // TODO Auto-generated method stub

    }

    @Override
    public void shutdown() {
        // TODO Auto-generated method stub

    }

    @Override
    public void monitorCreated(Monitor monitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void monitorStarted(Monitor monitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process(Monitor monitor) {
        PROCESSED_MONITORS.add(monitor);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static boolean hasProcessed(Monitor monitor) {
        return PROCESSED_MONITORS.contains(monitor);
    }
}
