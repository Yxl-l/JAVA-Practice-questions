package com.yxl.service.Impl;

import com.yxl.mapper.GoodMapper;
import com.yxl.pojo.Good;
import com.yxl.service.GoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GoodServiceImpl implements GoodService {

    private final GoodMapper goodMapper;
    @Override
    public List<Good> getAll() {
        List<Good> list = goodMapper.getAll();
        List<Good> parents = list.stream().filter(good -> good.getParentId()==0).collect(Collectors.toList());
        List<Good> children = list.stream().filter(good -> good.getParentId()>0).collect(Collectors.toList());
        parents.forEach(g->findChildren(g,children));
        return parents;
    }
    public void findChildren(Good good,List<Good> all){
        List<Good> children = all.stream().filter(g -> Objects.equals(g.getParentId(),good.getId())).collect(Collectors.toList());
        children.forEach(g->findChildren(g,all));
        good.setZiList(children);
    }
}
