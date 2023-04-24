package jl;

import a0.q0;
import vk.c;

/* loaded from: classes2.dex */
public final class b implements xn.b {

    /* renamed from: a */
    public static final b f17993a;

    /* renamed from: b */
    public static final /* synthetic */ b[] f17994b;

    static {
        b bVar = new b();
        f17993a = bVar;
        f17994b = new b[]{bVar};
    }

    public static boolean a(long j10) {
        if (j10 <= 0) {
            ol.a.a(new IllegalArgumentException(q0.a("n > 0 required but it was ", j10)));
            return false;
        }
        return true;
    }

    public static boolean c(xn.b bVar, xn.b bVar2) {
        if (bVar2 == null) {
            ol.a.a(new NullPointerException("next is null"));
            return false;
        } else if (bVar != null) {
            bVar2.cancel();
            ol.a.a(new c("Subscription already set!"));
            return false;
        } else {
            return true;
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17994b.clone();
    }

    @Override // xn.b
    public final void cancel() {
    }

    @Override // xn.b
    public final void g(long j10) {
    }
}
