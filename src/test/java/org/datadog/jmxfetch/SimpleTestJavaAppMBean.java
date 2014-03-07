package org.datadog.jmxfetch;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public interface SimpleTestJavaAppMBean {
    
    int getShouldBe100();
    Double getShouldBe1000();
    int getShouldBeCounter();
    String getShouldBeConverted();
    String getShouldBeDefaulted();
    HashMap<String, Integer> getHashmap();
    AtomicInteger getAtomic42();
    AtomicLong getAtomic4242();
    Object getObject1337();
    
}
