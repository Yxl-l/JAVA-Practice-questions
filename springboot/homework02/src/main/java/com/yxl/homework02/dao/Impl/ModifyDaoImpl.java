package com.yxl.homework02.dao.Impl;

import com.yxl.homework02.dao.ModifyDao;
import com.yxl.homework02.entity.People;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class ModifyDaoImpl implements ModifyDao {
    @Override
    public int modify(int id, String name, String image, Integer gender, Integer job,int count) {
        for (People people : ListAllDaoImpl.peopleList) {
            if (people.getId()==id){
                people.setName(name);
                people.setImage(image);
                people.setGender(gender);
                people.setJob(job);
                people.setUpdateTime(LocalDateTime.now());
                count++;
            }
        }
        return count;
    }
}
