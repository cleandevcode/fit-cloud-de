package u1;

import u1.e;
import w1.b1;
import w1.q0;
import w1.w;
import w1.x0;

/* loaded from: classes.dex */
public final class f extends w<f, a> implements q0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x0<f> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* loaded from: classes.dex */
    public static final class a extends w.a<f, a> implements q0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.o(f.class, fVar);
    }

    public static a G() {
        return (a) ((w.a) DEFAULT_INSTANCE.k(w.f.NEW_BUILDER));
    }

    public static void p(f fVar, long j10) {
        fVar.valueCase_ = 4;
        fVar.value_ = Long.valueOf(j10);
    }

    public static void q(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.valueCase_ = 5;
        fVar.value_ = str;
    }

    public static void r(f fVar, e.a aVar) {
        fVar.getClass();
        fVar.value_ = aVar.h();
        fVar.valueCase_ = 6;
    }

    public static void s(f fVar, double d10) {
        fVar.valueCase_ = 7;
        fVar.value_ = Double.valueOf(d10);
    }

    public static void u(f fVar, boolean z10) {
        fVar.valueCase_ = 1;
        fVar.value_ = Boolean.valueOf(z10);
    }

    public static void v(f fVar, float f10) {
        fVar.valueCase_ = 2;
        fVar.value_ = Float.valueOf(f10);
    }

    public static void w(f fVar, int i10) {
        fVar.valueCase_ = 3;
        fVar.value_ = Integer.valueOf(i10);
    }

    public static f y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final e E() {
        return this.valueCase_ == 6 ? (e) this.value_ : e.r();
    }

    public final int F() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    @Override // w1.w
    public final Object k(w.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", e.class});
            case 3:
                return new f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0<f> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (f.class) {
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

    public final boolean x() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
