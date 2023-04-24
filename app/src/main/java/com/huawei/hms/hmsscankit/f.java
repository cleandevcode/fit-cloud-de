package com.huawei.hms.hmsscankit;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class f extends SimpleDateFormat {
    public f(String str) {
        super(str);
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
