package u1;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import w1.b1;
import w1.i;
import w1.i0;
import w1.i1;
import w1.j0;
import w1.o;
import w1.p1;
import w1.q0;
import w1.w;
import w1.x0;
import w1.z;

/* loaded from: classes.dex */
public final class d extends w<d, a> implements q0 {
    private static final d DEFAULT_INSTANCE;
    private static volatile x0<d> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0<String, f> preferences_ = j0.f29619b;

    /* loaded from: classes.dex */
    public static final class a extends w.a<d, a> implements q0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public static final i0<String, f> f28476a = new i0<>(p1.f29661c, p1.f29663e, f.y());
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        w.o(d.class, dVar);
    }

    public static j0 q(d dVar) {
        j0<String, f> j0Var = dVar.preferences_;
        if (!j0Var.f29620a) {
            dVar.preferences_ = j0Var.d();
        }
        return dVar.preferences_;
    }

    public static a s() {
        return (a) ((w.a) DEFAULT_INSTANCE.k(w.f.NEW_BUILDER));
    }

    public static d t(FileInputStream fileInputStream) {
        w n10 = w.n(DEFAULT_INSTANCE, new i.b(fileInputStream), o.a());
        if (n10.g()) {
            return (d) n10;
        }
        throw new z(new i1().getMessage());
    }

    @Override // w1.w
    public final Object k(w.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f28476a});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0<d> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (d.class) {
                        try {
                            x0Var = PARSER;
                            if (x0Var == null) {
                                x0Var = new w.b<>(DEFAULT_INSTANCE);
                                PARSER = x0Var;
                            }
                        } finally {
                        }
                    }
                }
                return x0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map<String, f> r() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
