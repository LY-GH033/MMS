package com.example.mapper;

import com.example.pojo.Runner;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RunnerMapper {

    @Select("select * from runner where email = #{email}")
    Runner findByEmail(String email);

    @Insert("insert into gate_monitor(id,email,password,name,sex,birthDate,city,avatarUrl,experience) VALUES " +
            "( #{id}, #{email}, #{password}, #{name}, #{sex}, #{birthDate},#{avatar_url},#{birth_date},#{experience} )")
    void insert(Runner runner);
}
