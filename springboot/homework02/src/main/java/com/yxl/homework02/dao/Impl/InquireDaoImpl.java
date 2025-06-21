package com.yxl.homework02.dao.Impl;

import com.yxl.homework02.dao.InquireDao;
import com.yxl.homework02.entity.People;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InquireDaoImpl implements InquireDao {
    @Override
    public List<People> inquire(String name, Integer gender, Integer job) {
        List<People> list = new ArrayList<>();//符合的放到集合返回
        for (People p : ListAllDaoImpl.peopleList) {
            boolean nameMatch = name == null || p.getName().contains(name);//含有，满足一个为true
            boolean genderMatch = gender == null || p.getGender() == gender;
            boolean jobMatch = job == null || p.getJob() == job;

            if (nameMatch && genderMatch && jobMatch) {
                list.add(p);
            }
            
        }
        return list;
    }
}
