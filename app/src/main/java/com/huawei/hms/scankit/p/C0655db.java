package com.huawei.hms.scankit.p;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* renamed from: com.huawei.hms.scankit.p.db */
/* loaded from: classes.dex */
public class C0655db extends SimpleDateFormat {

    /* renamed from: a */
    public final /* synthetic */ C0663fb f7849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0655db(C0663fb c0663fb, String str) {
        super(str);
        this.f7849a = c0663fb;
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
