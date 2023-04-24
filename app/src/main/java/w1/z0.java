package w1;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: c */
    public static final z0 f29732c = new z0();

    /* renamed from: b */
    public final ConcurrentHashMap f29734b = new ConcurrentHashMap();

    /* renamed from: a */
    public final h0 f29733a = new h0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [w1.t0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [w1.t0] */
    public final <T> d1<T> a(Class<T> cls) {
        u0 u0Var;
        f0 f0Var;
        j1<?, ?> j1Var;
        p<?> pVar;
        k0 k0Var;
        s0 u10;
        s0 s0Var;
        Class<?> cls2;
        Charset charset = y.f29729a;
        if (cls != null) {
            d1<T> d1Var = (d1) this.f29734b.get(cls);
            if (d1Var == null) {
                h0 h0Var = this.f29733a;
                h0Var.getClass();
                Class<?> cls3 = e1.f29553a;
                if (!w.class.isAssignableFrom(cls) && (cls2 = e1.f29553a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                n0 a10 = h0Var.f29587a.a(cls);
                if (a10.a()) {
                    if (w.class.isAssignableFrom(cls)) {
                        s0Var = new t0(e1.f29556d, r.f29678a, a10.b());
                    } else {
                        j1<?, ?> j1Var2 = e1.f29554b;
                        p<?> pVar2 = r.f29679b;
                        if (pVar2 != null) {
                            s0Var = new t0(j1Var2, pVar2, a10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    u10 = s0Var;
                } else {
                    boolean z10 = false;
                    if (w.class.isAssignableFrom(cls)) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            u0Var = w0.f29726b;
                            f0Var = f0.f29561b;
                            j1Var = e1.f29556d;
                            pVar = r.f29678a;
                        } else {
                            u0Var = w0.f29726b;
                            f0Var = f0.f29561b;
                            j1Var = e1.f29556d;
                            pVar = null;
                        }
                        k0Var = m0.f29641b;
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            u0Var = w0.f29725a;
                            f0Var = f0.f29560a;
                            j1<?, ?> j1Var3 = e1.f29554b;
                            p<?> pVar3 = r.f29679b;
                            if (pVar3 != null) {
                                j1Var = j1Var3;
                                pVar = pVar3;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            u0Var = w0.f29725a;
                            f0Var = f0.f29560a;
                            j1Var = e1.f29555c;
                            pVar = null;
                        }
                        k0Var = m0.f29640a;
                    }
                    u0 u0Var2 = u0Var;
                    f0 f0Var2 = f0Var;
                    j1<?, ?> j1Var4 = j1Var;
                    p<?> pVar4 = pVar;
                    k0 k0Var2 = k0Var;
                    int[] iArr = s0.f29684r;
                    if (a10 instanceof b1) {
                        u10 = s0.u((b1) a10, u0Var2, f0Var2, j1Var4, pVar4, k0Var2);
                    } else {
                        h1 h1Var = (h1) a10;
                        throw null;
                    }
                }
                d1<T> d1Var2 = (d1) this.f29734b.putIfAbsent(cls, u10);
                if (d1Var2 != null) {
                    return d1Var2;
                }
                return u10;
            }
            return d1Var;
        }
        throw new NullPointerException("messageType");
    }
}
