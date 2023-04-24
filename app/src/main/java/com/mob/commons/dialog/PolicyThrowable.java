package com.mob.commons.dialog;

@Deprecated
/* loaded from: classes.dex */
public class PolicyThrowable extends Throwable {
    private int code;

    public PolicyThrowable() {
        super("Privacy policy is not accepted");
    }

    public PolicyThrowable(int i10, String str) {
        this(str);
        this.code = i10;
    }

    public PolicyThrowable(int i10, String str, Throwable th2) {
        this(str, th2);
        this.code = i10;
    }

    public PolicyThrowable(String str) {
        super(str);
    }

    public PolicyThrowable(String str, Throwable th2) {
        super(str, th2);
    }

    public PolicyThrowable(Throwable th2) {
        super(th2);
    }

    public int getCode() {
        return this.code;
    }
}
