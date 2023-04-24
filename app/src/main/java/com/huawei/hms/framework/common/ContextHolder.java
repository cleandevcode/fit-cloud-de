package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public class ContextHolder {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static Context f7028a;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    public static Context f7029b;

    public static Context getAppContext() {
        return f7028a;
    }

    public static Context getKitContext() {
        return f7029b;
    }

    public static Context getResourceContext() {
        return getKitContext() != null ? getKitContext() : getAppContext();
    }

    public static void setAppContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sAppContext == null");
        f7028a = context.getApplicationContext();
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        f7029b = context;
    }
}
