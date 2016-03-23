import griffon.core.GriffonApplication;
import org.codehaus.griffon.runtime.core.AbstractLifecycleHandler;

import javax.annotation.Nonnull;
import javax.inject.Inject;

public class Startup extends AbstractLifecycleHandler {
    @Inject
    public Startup(@Nonnull GriffonApplication application) {
        super(application);
    }

    @Override
    public void execute() {
        System.out.println("Startup");
    }
}