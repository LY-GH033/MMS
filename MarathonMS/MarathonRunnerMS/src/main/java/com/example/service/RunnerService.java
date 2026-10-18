package com.example.service;

import com.example.pojo.Runner;

public interface RunnerService {

    Runner findByEmail(String email);

    void register(Runner runner);
}
