import griffon.core.GriffonApplication;
import org.codehaus.griffon.runtime.core.AbstractLifecycleHandler;

import javax.annotation.Nonnull;
import javax.inject.Inject;

public class Shutdown extends AbstractLifecycleHandler {
    @Inject
    public Shutdown(@Nonnull GriffonApplication application) {
        super(application);
    }

    @Override
    public void execute() {
        System.out.println("Shootdown");
    }
}