package com.huawei.hms.feature.dynamic.a;

import android.util.Log;
import dalvik.system.DexClassLoader;

/* loaded from: classes.dex */
public final class b extends DexClassLoader {

    /* renamed from: a */
    private static final String f6996a = "b";

    public b(String str, String str2, ClassLoader classLoader) {
        super(str, str2, null, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(f6996a, "Cannot find The class:".concat(str));
            }
        }
        return super.loadClass(str, z10);
    }
}
