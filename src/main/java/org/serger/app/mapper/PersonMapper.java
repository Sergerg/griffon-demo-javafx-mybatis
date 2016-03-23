package org.serger.app.mapper;

import griffon.metadata.TypeProviderFor;
import griffon.plugins.mybatis.MybatisMapper;
import org.serger.app.model.Person;

import java.util.List;

@TypeProviderFor(MybatisMapper.class)
public interface PersonMapper extends MybatisMapper {
    public Person findPersonById(int id);

    public int insert(Person person);

    public int update(Person person);

    public int delete(Person person);

    public List<Person> list();
}
