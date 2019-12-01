package com.evan.builder.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @ClassName House
 * @Author Evan
 * @date 2019.11.30 13:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    private String base;
    private String wall;
    private String roofed;
}
