package com.qf.money.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgResult {

    private Integer statuSCode;
    private String msg;
    private Object data;
}
