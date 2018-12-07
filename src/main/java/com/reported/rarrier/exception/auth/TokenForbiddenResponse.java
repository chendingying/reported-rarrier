package com.reported.rarrier.exception.auth;


import com.reported.rarrier.constants.CommonConstants;
import com.reported.rarrier.util.BaseResponse;

/**
 * Created by cdy on 2017/8/25.
 */
public class TokenForbiddenResponse extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(CommonConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
