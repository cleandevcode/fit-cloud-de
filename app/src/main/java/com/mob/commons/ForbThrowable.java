package com.mob.commons;

import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: classes.dex */
public class ForbThrowable extends Throwable implements PublicMemberKeeper {
    public static final int CODE_NO_GMS = 900;
    private int code;

    public ForbThrowable() {
        super("Service is forbidden currently");
    }

    public ForbThrowable(int i10, String str) {
        this(str);
        this.code = i10;
    }

    public ForbThrowable(String str) {
        super(str);
    }

    public static ForbThrowable obtainGpThrowable() {
        return new ForbThrowable(CODE_NO_GMS, "Service unavailable due to Google Play Services is unavailable!");
    }
}
