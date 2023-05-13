package com.txkt.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//有参无参构造
@NoArgsConstructor
public class TxktException extends RuntimeException{
    private Integer code;
    private String msg;
}
