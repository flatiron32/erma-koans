package com.orbitz.erma.koans;

import java.util.HashSet;
import java.util.Set;

import com.orbitz.monitoring.api.Attribute;
import com.orbitz.monitoring.api.Monitor;
import com.orbitz.monitoring.api.MonitorProcessor;
import com.orbitz.monitoring.api.MonitoringEngine;
import com.orbitz.monitoring.lib.BaseMonitoringEngineManager;
import com.orbitz.monitoring.lib.factory.ProcessGroup;
import com.orbitz.monitoring.lib.factory.SimpleMonitorProcessorFactory;
import com.orbitz.monitoring.lib.processor.LoggingMonitorProcessor;
import com.orbitz.monitoring.test.MockMonitorProcessorFactory;

public class KoanProcessor implements MonitorProcessor {

    private static final KoanProcessor INSTANCE = new KoanProcessor();
    private static final Set<Monitor> PROCESSED_MONITORS = new HashSet<Monitor>();
    
    static {
        ProcessGroup[] processGroup = {new ProcessGroup(getInstance())};
        SimpleMonitorProcessorFactory factory = new SimpleMonitorProcessorFactory(processGroup);
        BaseMonitoringEngineManager manager = new BaseMonitoringEngineManager(factory);
        manager.startup();
    }
    
    private KoanProcessor() {
        
    }
    
    public static final KoanProcessor getInstance() {
        return INSTANCE;
    }
    
    @Override
    public void startup() {
        System.out.println("Started");
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
        System.out.println("Processing Monitor named " + monitor.getAsString(Attribute.NAME));
        PROCESSED_MONITORS.add(monitor);
    }

    @Override
    public String getName() {
        return "Koan Monitor Processor";
    }
    
    public static boolean hasProcessed(Monitor monitor) {
        System.out.println("Looking For Monitor named " + monitor.getAsString(Attribute.NAME));
        return PROCESSED_MONITORS.contains(monitor);
    }
}
