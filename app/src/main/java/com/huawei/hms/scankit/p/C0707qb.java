package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.qb */
/* loaded from: classes.dex */
public class C0707qb extends Thread {

    /* renamed from: a */
    public final /* synthetic */ C0710rb f8040a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707qb(C0710rb c0710rb, String str) {
        super(str);
        this.f8040a = c0710rb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f8040a.d();
    }
}
