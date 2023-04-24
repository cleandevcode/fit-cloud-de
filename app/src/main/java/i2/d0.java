package i2;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class d0<T> {

    /* renamed from: b */
    public static final f f16257b = new f();

    /* renamed from: c */
    public static final i f16258c = new i();

    /* renamed from: d */
    public static final e f16259d = new e();

    /* renamed from: e */
    public static final h f16260e = new h();

    /* renamed from: f */
    public static final g f16261f = new g();

    /* renamed from: g */
    public static final d f16262g = new d();

    /* renamed from: h */
    public static final c f16263h = new c();

    /* renamed from: i */
    public static final b f16264i = new b();

    /* renamed from: j */
    public static final a f16265j = new a();

    /* renamed from: k */
    public static final k f16266k = new k();

    /* renamed from: l */
    public static final j f16267l = new j();

    /* renamed from: a */
    public final boolean f16268a;

    /* loaded from: classes.dex */
    public static final class a extends d0<boolean[]> {
        public a() {
            super(true);
        }

        @Override // i2.d0
        public final boolean[] a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "boolean[]";
        }

        @Override // i2.d0
        public final boolean[] c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, boolean[] zArr) {
            gm.l.f(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d0<Boolean> {
        public b() {
            super(false);
        }

        @Override // i2.d0
        public final Boolean a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "boolean";
        }

        @Override // i2.d0
        public final Boolean c(String str) {
            boolean z10;
            gm.l.f(str, "value");
            if (gm.l.a(str, "true")) {
                z10 = true;
            } else if (!gm.l.a(str, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            gm.l.f(str, "key");
            bundle.putBoolean(str, booleanValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d0<float[]> {
        public c() {
            super(true);
        }

        @Override // i2.d0
        public final float[] a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "float[]";
        }

        @Override // i2.d0
        public final float[] c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, float[] fArr) {
            gm.l.f(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends d0<Float> {
        public d() {
            super(false);
        }

        @Override // i2.d0
        public final Float a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // i2.d0
        public final String b() {
            return "float";
        }

        @Override // i2.d0
        public final Float c(String str) {
            gm.l.f(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Float f10) {
            float floatValue = f10.floatValue();
            gm.l.f(str, "key");
            bundle.putFloat(str, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends d0<int[]> {
        public e() {
            super(true);
        }

        @Override // i2.d0
        public final int[] a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "integer[]";
        }

        @Override // i2.d0
        public final int[] c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, int[] iArr) {
            gm.l.f(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends d0<Integer> {
        public f() {
            super(false);
        }

        @Override // i2.d0
        public final Integer a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // i2.d0
        public final String b() {
            return "integer";
        }

        @Override // i2.d0
        public final Integer c(String str) {
            int parseInt;
            gm.l.f(str, "value");
            if (om.h.a0(str, "0x", false)) {
                String substring = str.substring(2);
                gm.l.e(substring, "this as java.lang.String).substring(startIndex)");
                ih.v.c(16);
                parseInt = Integer.parseInt(substring, 16);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Integer num) {
            int intValue = num.intValue();
            gm.l.f(str, "key");
            bundle.putInt(str, intValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends d0<long[]> {
        public g() {
            super(true);
        }

        @Override // i2.d0
        public final long[] a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "long[]";
        }

        @Override // i2.d0
        public final long[] c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, long[] jArr) {
            gm.l.f(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends d0<Long> {
        public h() {
            super(false);
        }

        @Override // i2.d0
        public final Long a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // i2.d0
        public final String b() {
            return "long";
        }

        @Override // i2.d0
        public final Long c(String str) {
            String str2;
            long parseLong;
            gm.l.f(str, "value");
            if (om.h.U(str, "L", false)) {
                str2 = str.substring(0, str.length() - 1);
                gm.l.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (om.h.a0(str, "0x", false)) {
                String substring = str2.substring(2);
                gm.l.e(substring, "this as java.lang.String).substring(startIndex)");
                ih.v.c(16);
                parseLong = Long.parseLong(substring, 16);
            } else {
                parseLong = Long.parseLong(str2);
            }
            return Long.valueOf(parseLong);
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Long l10) {
            long longValue = l10.longValue();
            gm.l.f(str, "key");
            bundle.putLong(str, longValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends d0<Integer> {
        public i() {
            super(false);
        }

        @Override // i2.d0
        public final Integer a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // i2.d0
        public final String b() {
            return "reference";
        }

        @Override // i2.d0
        public final Integer c(String str) {
            int parseInt;
            gm.l.f(str, "value");
            if (om.h.a0(str, "0x", false)) {
                String substring = str.substring(2);
                gm.l.e(substring, "this as java.lang.String).substring(startIndex)");
                ih.v.c(16);
                parseInt = Integer.parseInt(substring, 16);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Integer num) {
            int intValue = num.intValue();
            gm.l.f(str, "key");
            bundle.putInt(str, intValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends d0<String[]> {
        public j() {
            super(true);
        }

        @Override // i2.d0
        public final String[] a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "string[]";
        }

        @Override // i2.d0
        public final String[] c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, String[] strArr) {
            gm.l.f(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends d0<String> {
        public k() {
            super(true);
        }

        @Override // i2.d0
        public final String a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return "string";
        }

        @Override // i2.d0
        public final String c(String str) {
            gm.l.f(str, "value");
            return str;
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, String str2) {
            gm.l.f(str, "key");
            bundle.putString(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<D extends Enum<?>> extends p<D> {

        /* renamed from: n */
        public final Class<D> f16269n;

        public l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f16269n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // i2.d0.p, i2.d0
        public final String b() {
            return this.f16269n.getName();
        }

        @Override // i2.d0.p
        /* renamed from: f */
        public final D e(String str) {
            D d10;
            gm.l.f(str, "value");
            D[] enumConstants = this.f16269n.getEnumConstants();
            gm.l.e(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    d10 = enumConstants[i10];
                    if (om.h.V(d10.name(), str)) {
                        break;
                    }
                    i10++;
                } else {
                    d10 = null;
                    break;
                }
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder a10 = androidx.activity.result.d.a("Enum value ", str, " not found for type ");
            a10.append(this.f16269n.getName());
            a10.append('.');
            throw new IllegalArgumentException(a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Parcelable> extends d0<D[]> {

        /* renamed from: m */
        public final Class<D[]> f16270m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f16270m = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // i2.d0
        public final Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return this.f16270m.getName();
        }

        @Override // i2.d0
        public final Object c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            gm.l.f(str, "key");
            this.f16270m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !gm.l.a(m.class, obj.getClass())) {
                return false;
            }
            return gm.l.a(this.f16270m, ((m) obj).f16270m);
        }

        public final int hashCode() {
            return this.f16270m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D> extends d0<D> {

        /* renamed from: m */
        public final Class<D> f16271m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class<D> cls) {
            super(true);
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.f16271m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // i2.d0
        public final D a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return this.f16271m.getName();
        }

        @Override // i2.d0
        public final D c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, D d10) {
            gm.l.f(str, "key");
            this.f16271m.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !gm.l.a(n.class, obj.getClass())) {
                return false;
            }
            return gm.l.a(this.f16271m, ((n) obj).f16271m);
        }

        public final int hashCode() {
            return this.f16271m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D extends Serializable> extends d0<D[]> {

        /* renamed from: m */
        public final Class<D[]> f16272m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f16272m = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // i2.d0
        public final Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // i2.d0
        public final String b() {
            return this.f16272m.getName();
        }

        @Override // i2.d0
        public final Object c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        @Override // i2.d0
        public final void d(Bundle bundle, String str, Object obj) {
            ?? r42 = (Serializable[]) obj;
            gm.l.f(str, "key");
            this.f16272m.cast(r42);
            bundle.putSerializable(str, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !gm.l.a(o.class, obj.getClass())) {
                return false;
            }
            return gm.l.a(this.f16272m, ((o) obj).f16272m);
        }

        public final int hashCode() {
            return this.f16272m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class p<D extends Serializable> extends d0<D> {

        /* renamed from: m */
        public final Class<D> f16273m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.f16273m = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        public p(Class cls, int i10) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f16273m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // i2.d0
        public final Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // i2.d0
        public String b() {
            return this.f16273m.getName();
        }

        @Override // i2.d0
        public final void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            gm.l.f(str, "key");
            gm.l.f(serializable, "value");
            this.f16273m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        @Override // i2.d0
        /* renamed from: e */
        public D c(String str) {
            gm.l.f(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return gm.l.a(this.f16273m, ((p) obj).f16273m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16273m.hashCode();
        }
    }

    public d0(boolean z10) {
        this.f16268a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t10);

    public final String toString() {
        return b();
    }
}
