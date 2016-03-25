package org.serger.app;

import griffon.core.artifact.GriffonController;
import griffon.metadata.ArtifactProviderFor;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonController;

import griffon.transform.Threading;

import org.serger.app.services.SampleService;

import javax.inject.Inject;

@ArtifactProviderFor(GriffonController.class)
public class ConsoleController extends AbstractGriffonController {
    private ConsoleModel model;

    @Inject
    private SampleService sampleService;

    public void setModel(ConsoleModel model) {
        this.model = model;
    }

    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    public void click() {
        int count = Integer.parseInt(model.getClickCount());
        model.setClickCount(String.valueOf(count + 1));
    }

    public void btnOpenForm() {
        System.out.println("btnOpenForm");
        String name = sampleService.getPersonName(1);
        System.out.println("Name = " + name);
    }
}
