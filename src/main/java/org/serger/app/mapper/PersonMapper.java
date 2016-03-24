package org.serger.app.mapper;

import griffon.metadata.TypeProviderFor;
import griffon.plugins.mybatis.MybatisMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.serger.app.model.Person;

import java.util.List;

@TypeProviderFor(PersonMapper.class) // MybatisMapper
public interface PersonMapper extends MybatisMapper {
    @Select("SELECT * FROM people WHERE id = #{id}")
    public Person findPersonById(@Param("id") int id);

    @Update("create table people (id int, name text, lastname text) ")
    public int createTablePerson();

    @Insert("insert into people (id, name, lastname) values (#{id}, #{name}, #{lastname}) ")
    public int insert(Person person);

    public int update(Person person);

    public int delete(Person person);

    public List<Person> list();
}
