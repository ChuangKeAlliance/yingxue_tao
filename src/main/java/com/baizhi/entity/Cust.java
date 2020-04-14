package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cust {
    private String id;

    private String userName;

    private Integer age;

    private String phoneNumber;

    public String getId() {
        return id;
    }

}