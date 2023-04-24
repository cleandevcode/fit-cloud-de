package com.huawei.hms.scankit.p;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* renamed from: com.huawei.hms.scankit.p.hb */
/* loaded from: classes.dex */
public class C0671hb extends SimpleDateFormat {

    /* renamed from: a */
    public final /* synthetic */ C0675ib f7920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671hb(C0675ib c0675ib, String str) {
        super(str);
        this.f7920a = c0675ib;
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
