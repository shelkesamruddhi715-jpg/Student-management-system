package com.codding.secondproject.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collector;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private long id;
    private String name;
    private String email;


}
