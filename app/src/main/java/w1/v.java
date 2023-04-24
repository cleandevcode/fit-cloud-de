package w1;

import w1.w;

/* loaded from: classes.dex */
public final class v implements o0 {

    /* renamed from: a */
    public static final v f29714a = new v();

    @Override // w1.o0
    public final n0 a(Class<?> cls) {
        if (w.class.isAssignableFrom(cls)) {
            try {
                return (n0) w.l(cls.asSubclass(w.class)).k(w.f.BUILD_MESSAGE_INFO);
            } catch (Exception e10) {
                throw new RuntimeException(k.f.a(cls, android.support.v4.media.d.a("Unable to get message info for ")), e10);
            }
        }
        throw new IllegalArgumentException(k.f.a(cls, android.support.v4.media.d.a("Unsupported message type: ")));
    }

    @Override // w1.o0
    public final boolean b(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }
}
