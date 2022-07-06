package com.yyn.责任链模式.版本三.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GatewayEntity {

    private Integer handlerId;

    private String name;

    private String classFullName;

    private Integer preHandlerId;

    private Integer nextHandlerId;
} 