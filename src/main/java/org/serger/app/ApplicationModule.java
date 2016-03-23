package org.serger.app;

import griffon.core.event.EventHandler;
import griffon.core.injection.Module;
import griffon.plugins.mybatis.MybatisBootstrap;
import org.codehaus.griffon.runtime.core.injection.AbstractModule;
import org.kordamp.jipsy.ServiceProviderFor;

@ServiceProviderFor(Module.class)
public class ApplicationModule extends AbstractModule {
    @Override
    protected void doConfigure() {
        bind(EventHandler.class)
            .to(ApplicationEventHandler.class)
            .asSingleton();
        bind(MybatisBootstrap.class)
            .to(SampleMybatisBootstrap.class)
            .asSingleton();
    }
}