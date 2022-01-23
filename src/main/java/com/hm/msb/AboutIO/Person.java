package com.hm.msb.AboutIO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 自定义类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    // 序列号
    private static final long serialVersionUID = -13795995260353804L;
    private String name;
    private Integer age;
}
