package com.my.pattern.memento;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 模仿 状态类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Memento {

    private String state;
}
