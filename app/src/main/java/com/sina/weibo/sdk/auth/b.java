package com.sina.weibo.sdk.auth;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e */
    private Map<String, WbAuthListener> f9494e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: f */
        private static final b f9495f = new b((byte) 0);
    }

    private b() {
        this.f9494e = new HashMap();
    }

    public /* synthetic */ b(byte b10) {
        this();
    }

    public static synchronized b b() {
        b bVar;
        synchronized (b.class) {
            bVar = a.f9495f;
        }
        return bVar;
    }

    public final synchronized WbAuthListener a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9494e.get(str);
    }

    public final synchronized void a(String str, WbAuthListener wbAuthListener) {
        if (!TextUtils.isEmpty(str) && wbAuthListener != null) {
            this.f9494e.put(str, wbAuthListener);
        }
    }

    public final synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f9494e.remove(str);
    }
}
