package v5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: g */
    public static i f29116g;

    /* renamed from: h */
    public static final AtomicBoolean f29117h = new AtomicBoolean(false);

    /* renamed from: a */
    public final Class<?> f29118a;

    /* renamed from: b */
    public final Class<?> f29119b;

    /* renamed from: c */
    public final Method f29120c;

    /* renamed from: d */
    public final Method f29121d;

    /* renamed from: e */
    public final Method f29122e;

    /* renamed from: f */
    public final Method f29123f;

    public i(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f29118a = cls;
        this.f29119b = cls2;
        this.f29120c = method;
        this.f29121d = method2;
        this.f29122e = method3;
        this.f29123f = method4;
    }

    public static final /* synthetic */ i a() {
        if (i6.a.b(i.class)) {
            return null;
        }
        try {
            return f29116g;
        } catch (Throwable th2) {
            i6.a.a(i.class, th2);
            return null;
        }
    }

    public final Object b(ArrayList arrayList) {
        Object d10;
        Object d11;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            int i10 = j.f29124a;
            Object d12 = j.d(this.f29118a, null, this.f29120c, new Object[0]);
            if (d12 != null && (d10 = j.d(this.f29119b, d12, this.f29121d, "inapp")) != null && (d11 = j.d(this.f29119b, d10, this.f29122e, arrayList)) != null) {
                return j.d(this.f29119b, d11, this.f29123f, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
