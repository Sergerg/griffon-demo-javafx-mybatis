package org.serger.app;

import griffon.plugins.mybatis.MybatisBootstrap;
import org.apache.ibatis.session.SqlSession;
import org.serger.app.mapper.PersonMapper;
import org.serger.app.model.Person;

import javax.annotation.Nonnull;
import javax.inject.Named;

@Named("sample")
public class SampleMybatisBootstrap implements MybatisBootstrap {
    @Override
    public void init(@Nonnull String sessionFactoryName, @Nonnull SqlSession session) {
        // operations after first connection to datasource
        session.getConfiguration().addMapper(PersonMapper.class); // Автоматом не работает!!!
        // INSERT DATE INTO DB

        PersonMapper personMapper = session.getMapper(PersonMapper.class);

        personMapper.createTablePerson();

        Person person = new Person();
        person.setId(1);
        person.setName("aaa");
        person.setLastname("bbb");
        personMapper.insert(person);
        session.commit();


    }

    @Override
    public void destroy(@Nonnull String sessionFactoryName, @Nonnull SqlSession session) {
        // operations before disconnecting from the datasource
    }
}
