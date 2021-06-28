package com.my.pattern.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 员工
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private int restDays;

}
