package com.yxl.demo02homework01.service.Impl;
import com.yxl.demo02homework01.dao.Impl.LogDaoImpl;
import com.yxl.demo02homework01.pojo.Log;
import com.yxl.demo02homework01.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDaoImpl logDaoImpl;
    @Override
    public List<Log> LogServiceLog() {
        return logDaoImpl.LogDaoLog().stream().map(line -> {
            String[] parts = line.split(",");
            return new Log(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
        }).collect(Collectors.toList());
    }
}
