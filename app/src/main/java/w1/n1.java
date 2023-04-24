package w1;

import cn.sharesdk.framework.InnerShareParams;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a */
    public static final Logger f29646a = Logger.getLogger(n1.class.getName());

    /* renamed from: b */
    public static final Unsafe f29647b;

    /* renamed from: c */
    public static final Class<?> f29648c;

    /* renamed from: d */
    public static final e f29649d;

    /* renamed from: e */
    public static final boolean f29650e;

    /* renamed from: f */
    public static final boolean f29651f;

    /* renamed from: g */
    public static final long f29652g;

    /* renamed from: h */
    public static final boolean f29653h;

    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // w1.n1.e
        public final boolean c(long j10, Object obj) {
            if (n1.f29653h) {
                if (n1.h(j10, obj) != 0) {
                    return true;
                }
                return false;
            } else if (n1.i(j10, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // w1.n1.e
        public final byte d(long j10, Object obj) {
            if (n1.f29653h) {
                return n1.h(j10, obj);
            }
            return n1.i(j10, obj);
        }

        @Override // w1.n1.e
        public final double e(long j10, Object obj) {
            return Double.longBitsToDouble(h(j10, obj));
        }

        @Override // w1.n1.e
        public final float f(long j10, Object obj) {
            return Float.intBitsToFloat(g(j10, obj));
        }

        @Override // w1.n1.e
        public final void k(Object obj, long j10, boolean z10) {
            if (n1.f29653h) {
                n1.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                n1.r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // w1.n1.e
        public final void l(Object obj, long j10, byte b10) {
            if (n1.f29653h) {
                n1.q(obj, j10, b10);
            } else {
                n1.r(obj, j10, b10);
            }
        }

        @Override // w1.n1.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // w1.n1.e
        public final void n(Object obj, long j10, float f10) {
            o(obj, Float.floatToIntBits(f10), j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // w1.n1.e
        public final boolean c(long j10, Object obj) {
            if (n1.f29653h) {
                if (n1.h(j10, obj) != 0) {
                    return true;
                }
                return false;
            } else if (n1.i(j10, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // w1.n1.e
        public final byte d(long j10, Object obj) {
            if (n1.f29653h) {
                return n1.h(j10, obj);
            }
            return n1.i(j10, obj);
        }

        @Override // w1.n1.e
        public final double e(long j10, Object obj) {
            return Double.longBitsToDouble(h(j10, obj));
        }

        @Override // w1.n1.e
        public final float f(long j10, Object obj) {
            return Float.intBitsToFloat(g(j10, obj));
        }

        @Override // w1.n1.e
        public final void k(Object obj, long j10, boolean z10) {
            if (n1.f29653h) {
                n1.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                n1.r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // w1.n1.e
        public final void l(Object obj, long j10, byte b10) {
            if (n1.f29653h) {
                n1.q(obj, j10, b10);
            } else {
                n1.r(obj, j10, b10);
            }
        }

        @Override // w1.n1.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // w1.n1.e
        public final void n(Object obj, long j10, float f10) {
            o(obj, Float.floatToIntBits(f10), j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // w1.n1.e
        public final boolean c(long j10, Object obj) {
            return this.f29654a.getBoolean(obj, j10);
        }

        @Override // w1.n1.e
        public final byte d(long j10, Object obj) {
            return this.f29654a.getByte(obj, j10);
        }

        @Override // w1.n1.e
        public final double e(long j10, Object obj) {
            return this.f29654a.getDouble(obj, j10);
        }

        @Override // w1.n1.e
        public final float f(long j10, Object obj) {
            return this.f29654a.getFloat(obj, j10);
        }

        @Override // w1.n1.e
        public final void k(Object obj, long j10, boolean z10) {
            this.f29654a.putBoolean(obj, j10, z10);
        }

        @Override // w1.n1.e
        public final void l(Object obj, long j10, byte b10) {
            this.f29654a.putByte(obj, j10, b10);
        }

        @Override // w1.n1.e
        public final void m(Object obj, long j10, double d10) {
            this.f29654a.putDouble(obj, j10, d10);
        }

        @Override // w1.n1.e
        public final void n(Object obj, long j10, float f10) {
            this.f29654a.putFloat(obj, j10, f10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        public Unsafe f29654a;

        public e(Unsafe unsafe) {
            this.f29654a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f29654a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f29654a.arrayIndexScale(cls);
        }

        public abstract boolean c(long j10, Object obj);

        public abstract byte d(long j10, Object obj);

        public abstract double e(long j10, Object obj);

        public abstract float f(long j10, Object obj);

        public final int g(long j10, Object obj) {
            return this.f29654a.getInt(obj, j10);
        }

        public final long h(long j10, Object obj) {
            return this.f29654a.getLong(obj, j10);
        }

        public final Object i(long j10, Object obj) {
            return this.f29654a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f29654a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, int i10, long j10) {
            this.f29654a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f29654a.putLong(obj, j10, j11);
        }

        public final void q(long j10, Object obj, Object obj2) {
            this.f29654a.putObject(obj, j10, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0071  */
    static {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.n1.<clinit>():void");
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f29647b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class<?> cls) {
        if (f29651f) {
            return f29649d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f29651f) {
            f29649d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (w1.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(InnerShareParams.ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class<?> cls) {
        if (w1.d.a()) {
            try {
                Class<?> cls2 = f29648c;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean f(long j10, Object obj) {
        return f29649d.c(j10, obj);
    }

    public static byte g(long j10, byte[] bArr) {
        return f29649d.d(f29652g + j10, bArr);
    }

    public static byte h(long j10, Object obj) {
        return (byte) ((l((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(long j10, Object obj) {
        return (byte) ((l((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double j(long j10, Object obj) {
        return f29649d.e(j10, obj);
    }

    public static float k(long j10, Object obj) {
        return f29649d.f(j10, obj);
    }

    public static int l(long j10, Object obj) {
        return f29649d.g(j10, obj);
    }

    public static long m(long j10, Object obj) {
        return f29649d.h(j10, obj);
    }

    public static Object n(long j10, Object obj) {
        return f29649d.i(j10, obj);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(byte[] bArr, long j10, byte b10) {
        f29649d.l(bArr, f29652g + j10, b10);
    }

    public static void q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int l10 = l(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        s(obj, ((255 & b10) << i10) | (l10 & (~(255 << i10))), j11);
    }

    public static void r(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        s(obj, ((255 & b10) << i10) | (l(j11, obj) & (~(255 << i10))), j11);
    }

    public static void s(Object obj, int i10, long j10) {
        f29649d.o(obj, i10, j10);
    }

    public static void t(Object obj, long j10, long j11) {
        f29649d.p(obj, j10, j11);
    }

    public static void u(long j10, Object obj, Object obj2) {
        f29649d.q(j10, obj, obj2);
    }
}
