import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {

    private static final Map<String, Service> services = new HashMap<>();

    public static void registerService(String serviceName, Service service) {
        services.put(serviceName, service);
    }

    public static Service getService(String serviceName) {
        Service service = services.get(serviceName);
        if (service == null) {
            throw new IllegalArgumentException("Service not found: " + serviceName);
        }
        return service;
    }

    public static <T extends Service> T getService(String serviceName, Class<T> serviceClass) {
        Service service = getService(serviceName);
        if (!serviceClass.isInstance(service)) {
            throw new ClassCastException("Service '" + serviceName + "' is not of type " + serviceClass.getName());
        }
        return serviceClass.cast(service);
    }
}
