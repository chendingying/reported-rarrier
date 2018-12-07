package com.reported.rarrier.exception.auth;


import com.reported.rarrier.constants.CommonConstants;
import com.reported.rarrier.exception.BaseException;

/**
 * Created by cdy on 2017/9/8.
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
