package com.huawei.hms.framework.common;

/* loaded from: classes.dex */
public class RunnableEnhance implements Runnable {
    public static final String TRANCELOGO = " -->";

    /* renamed from: a */
    public Runnable f7042a;

    /* renamed from: b */
    public String f7043b = Thread.currentThread().getName();

    public RunnableEnhance(Runnable runnable) {
        this.f7042a = runnable;
    }

    public String getParentName() {
        return this.f7043b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7042a.run();
    }
}
