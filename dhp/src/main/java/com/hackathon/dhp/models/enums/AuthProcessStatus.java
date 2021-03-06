package com.hackathon.dhp.models.enums;

public enum AuthProcessStatus {
    SIGNIN_COMPLETED,
    SIGNUP_DUPLICATE,
    SIGNUP_COMPLETED,
    SIGNOUT_COMPLETED,
    REFRESH_TOKEN_EXPIRED,
    REFRESH_TOKEN_IS_BLACKLISTED,
    REFRESH_TOKEN_NOT_FOUND,
    NEW_ACCESS_TOKEN_ISSUE_COMPLETE,
    NEW_TOKEN_ISSUE_COMPLETE,
}
