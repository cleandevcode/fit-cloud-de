package com.huawei.hms.hmsscankit;

/* loaded from: classes.dex */
public final class WriterException extends Exception {
    public WriterException() {
    }

    public WriterException(String str) {
        super(str);
    }

    public WriterException(String str, String str2) {
        super(android.support.v4.media.a.a(str2, " Format | ", str));
    }

    public WriterException(Throwable th2) {
        super(th2);
    }
}
