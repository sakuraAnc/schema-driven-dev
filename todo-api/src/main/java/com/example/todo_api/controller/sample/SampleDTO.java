package com.example.todo_api.controller.sample;

import java.time.LocalDateTime;

// import lombok.Data;
import lombok.Value;

// @Data
@Value
public class SampleDTO {

    String content;
    LocalDateTime timestamp;

    /** field */
    // private String content;
    // private LocalDateTime timestamp;

    /** constructor */
    // public SampleDTO(String content, LocalDateTime timestamp) {
    //     this.content = content;
    //     this.timestamp = timestamp;
    // }
}
