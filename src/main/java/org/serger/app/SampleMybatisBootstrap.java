package org.serger.app;

import griffon.plugins.mybatis.MybatisBootstrap;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Nonnull;
import javax.inject.Named;

@Named("sample")
public class SampleMybatisBootstrap implements MybatisBootstrap {
    @Override
    public void init(@Nonnull String sessionFactoryName, @Nonnull SqlSession session) {
        // operations after first connection to datasource
    }

    @Override
    public void destroy(@Nonnull String sessionFactoryName, @Nonnull SqlSession session) {
        // operations before disconnecting from the datasource
    }
}
