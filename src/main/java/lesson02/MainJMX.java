package lesson02;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class MainJMX {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("lesson02:type=MyJMX");
        MyJMX myJMX = new MyJMX();
        mBeanServer.registerMBean(myJMX, objectName);


        System.out.println("Wait...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
