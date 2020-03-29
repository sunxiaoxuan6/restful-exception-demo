package com.example.restful.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private Long id;
    @NonNull
    private String text;
    private String summary;
}
