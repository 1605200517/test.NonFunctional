package eng.fiware.iotbroker.tester;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * JAX-RS Application
 *
 */
public class JaxRsDataProviderApplication extends Application {
    private final Set<Class<?>> classes;

    public JaxRsDataProviderApplication() {
        HashSet<Class<?>> c = new HashSet<Class<?>>();
		c.add(QueryContextResource.class);
        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
