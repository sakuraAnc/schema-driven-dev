package com.example.todo_api.controller.sample;

import org.springframework.web.bind.annotation.RestController;

import com.example.todo_api.service.sample.SampleService;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor    // SampleServiceを引数に取るコンストラクタを作成する
public class SampleController {

    private final SampleService service;
    
    // GET /samples
    public SampleDTO index() {
        var entity = service.find();
        return new SampleDTO(entity.getContent(), LocalDateTime.now());
    }
    
}
