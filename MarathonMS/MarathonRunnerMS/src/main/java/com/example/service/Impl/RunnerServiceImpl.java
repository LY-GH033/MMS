package com.example.service.Impl;

import com.example.mapper.RunnerMapper;
import com.example.pojo.Runner;
import com.example.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunnerServiceImpl implements RunnerService {
    @Autowired
    private RunnerMapper runnerMapper;

    @Override
    public Runner findByEmail(String email) {
        Runner runner = runnerMapper.findByEmail(email);
        return runner;
    }

    @Override
    public void register(Runner runner) {
        runnerMapper.insert(runner);
    }
}
