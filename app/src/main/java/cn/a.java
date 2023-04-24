package cn;

import gm.l;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a */
    public c f4956a;

    /* renamed from: b */
    public long f4957b;

    /* renamed from: c */
    public final String f4958c;

    /* renamed from: d */
    public final boolean f4959d;

    public /* synthetic */ a() {
        throw null;
    }

    public a(String str, boolean z10) {
        l.f(str, "name");
        this.f4958c = str;
        this.f4959d = z10;
        this.f4957b = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f4958c;
    }
}
