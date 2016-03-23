package org.serger.app.services;

import griffon.core.artifact.GriffonService;
import griffon.metadata.ArtifactProviderFor;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonService;

import griffon.plugins.mybatis.MybatisHandler;
import griffon.plugins.mybatis.MybatisCallback;
import org.apache.ibatis.session.SqlSession;

import org.serger.app.mapper.PersonMapper;
import org.serger.app.model.Person;

import javax.annotation.Nonnull;
import javax.inject.Inject;

@ArtifactProviderFor(GriffonService.class)
public class SampleService extends AbstractGriffonService {
    @Inject
    private MybatisHandler mybatisHandler;

    public String getPersonName(final int id) {
         return mybatisHandler.withSqlSession(new MybatisCallback<String>() {
             public String handle(@Nonnull String sessionFactoryName, @Nonnull SqlSession session) {
                 PersonMapper mapper = session.getMapper(PersonMapper.class);
                 Person person = mapper.findPersonById(id);
                 return person != null ? person.getName() : null;
             }
         });
    }
}
