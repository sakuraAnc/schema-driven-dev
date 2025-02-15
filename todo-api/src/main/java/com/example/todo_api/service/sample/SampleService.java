package com.example.todo_api.service.sample;

import org.springframework.stereotype.Service;

import com.example.todo_api.repository.sample.SampleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor    // SampleRepositoryを引数に取るコンストラクタを作成する
public class SampleService {

    private final SampleRepository repository;
    
    public SampleEntity find() {
        var record = repository.select();
        return new SampleEntity(record.getContent());
    }
}
