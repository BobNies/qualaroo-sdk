package com.qualaroo.ui;

import android.support.annotation.RestrictTo;

import com.qualaroo.internal.model.UserResponse;

import java.util.List;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public interface OnLeadGenAnswerListener {
    void onResponse(List<UserResponse> userResponses);
}
