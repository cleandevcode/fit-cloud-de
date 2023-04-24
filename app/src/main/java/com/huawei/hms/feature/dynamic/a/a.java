package com.huawei.hms.feature.dynamic.a;

import android.util.Log;
import dalvik.system.PathClassLoader;

/* loaded from: classes.dex */
public final class a extends PathClassLoader {

    /* renamed from: a */
    private static final String f6995a = "a";

    public a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(f6995a, "Cannot find The class:".concat(str));
            }
        }
        return super.loadClass(str, z10);
    }
}
