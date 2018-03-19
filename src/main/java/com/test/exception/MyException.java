package com.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
