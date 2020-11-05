package com.example.demo.practic.检验毒药;

import lombok.Data;

import java.util.List;

/**
 * @author by 李泽阳 @on 2020/11/5
 * @description:
 */
@Data
public class ParamsBo {
    private List<Bottle> bottleList;
    private List<Mouse> mouseList;
}
