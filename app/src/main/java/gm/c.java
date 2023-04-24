package gm;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class c implements mm.a, Serializable {

    /* renamed from: a */
    public transient mm.a f15490a;

    /* renamed from: b */
    public final Object f15491b;

    /* renamed from: c */
    public final Class f15492c;

    /* renamed from: d */
    public final String f15493d;

    /* renamed from: e */
    public final String f15494e;

    /* renamed from: f */
    public final boolean f15495f;

    /* loaded from: classes2.dex */
    public static class a implements Serializable {

        /* renamed from: a */
        public static final a f15496a = new a();

        private Object readResolve() {
            return f15496a;
        }
    }

    public c() {
        this(a.f15496a, null, null, null, false);
    }

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f15491b = obj;
        this.f15492c = cls;
        this.f15493d = str;
        this.f15494e = str2;
        this.f15495f = z10;
    }

    public final mm.a a() {
        mm.a aVar = this.f15490a;
        if (aVar == null) {
            mm.a c10 = c();
            this.f15490a = c10;
            return c10;
        }
        return aVar;
    }

    public abstract mm.a c();

    public final d d() {
        Class cls = this.f15492c;
        if (cls == null) {
            return null;
        }
        if (this.f15495f) {
            b0.f15488a.getClass();
            return new q(cls);
        }
        return b0.a(cls);
    }

    @Override // mm.a
    public final String getName() {
        return this.f15493d;
    }
}
