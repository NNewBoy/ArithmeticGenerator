package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommandEnum {

    N("-n", "成题目的个数"),
    R("-r", "题目中数值的最大值"),
    ;

    private String command;

    private String msg;
}