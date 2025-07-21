package com.itheima.service.impl;

import com.itheima.mapper.GoodMapper;
import com.itheima.pojo.Good;
import com.itheima.service.GoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GoodServiceImpl implements GoodService {

    private final GoodMapper goodMapper;

    @Override
    public List<Good> getAll() {
        List<Good> all = goodMapper.getAll();
        List<Good> fu = all.stream().filter(s -> s.getFuid().equals(0)).toList();
        fu.forEach(s->setZiList(s,all));
        return fu;
    }

    private void setZiList(Good fu,List<Good> all){
        List<Good> ziList = all.stream().filter(s -> s.getFuid().equals(fu.getId())).toList();
        fu.setZiList(ziList);
        ziList.forEach(s->setZiList(s,all));
    }
}
