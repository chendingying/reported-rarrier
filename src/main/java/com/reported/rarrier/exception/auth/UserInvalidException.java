package com.reported.rarrier.exception.auth;


import com.reported.rarrier.constants.CommonConstants;
import com.reported.rarrier.exception.BaseException;

/**
 * Created by cdy on 2017/9/8.
 */
public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
