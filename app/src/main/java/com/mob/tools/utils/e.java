package com.mob.tools.utils;

import com.mob.tools.MobLog;

/* loaded from: classes.dex */
public abstract class e implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
