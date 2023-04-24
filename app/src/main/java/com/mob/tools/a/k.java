package com.mob.tools.a;

import android.content.Context;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private static k f9098a = new k();

    /* renamed from: b */
    private volatile Context f9099b;

    /* renamed from: c */
    private volatile j f9100c;

    /* renamed from: d */
    private volatile j f9101d;

    public static k a(Context context) {
        if (f9098a.f9099b == null && context != null) {
            f9098a.f9099b = context.getApplicationContext();
        }
        return f9098a;
    }

    public j a() {
        return this.f9100c == null ? b() : this.f9100c;
    }

    public void a(j jVar) {
        this.f9100c = jVar;
    }

    public j b() {
        if (this.f9101d == null) {
            this.f9101d = new e(this.f9099b);
        }
        return this.f9101d;
    }
}
