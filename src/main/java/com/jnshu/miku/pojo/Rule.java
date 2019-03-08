package com.jnshu.miku.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Rule implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long ruleId;
    private String role;
}
