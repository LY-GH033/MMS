package com.example.controller;

import com.example.common.Result;
import com.example.pojo.Runner;
import com.example.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/runner")
public class RunnerController {

    @Autowired
    private RunnerService runnerService;

    @PostMapping("register")
    public Result register(Runner runner){

        Runner r = runnerService.findByEmail(runner.getEmail());
        if (r == null){
            runnerService.register(runner);
            return Result.success();
        }else {
            return Result.error("邮箱已被占用");
        }
    }
}
