import griffon.core.GriffonApplication;
import org.codehaus.griffon.runtime.core.AbstractLifecycleHandler;

import javax.annotation.Nonnull;
import javax.inject.Inject;

public class Ready extends AbstractLifecycleHandler {
    @Inject
    public Ready(@Nonnull GriffonApplication application) {
        super(application);
    }

    @Override
    public void execute() {
        System.out.println("Ready");
    }
}