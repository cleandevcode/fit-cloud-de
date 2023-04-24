package n4;

import i4.o;
import i4.t;
import j4.a1;
import j4.b1;
import j4.c1;
import j4.d1;
import j4.e1;
import j4.h1;
import j4.i0;
import j4.j0;
import j4.l0;
import j4.m0;
import j4.r0;
import j4.t0;
import j4.u;
import j4.v;
import j4.v0;
import j4.w0;
import j4.y0;
import j4.z0;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends ClassLoader {

    /* renamed from: b */
    public static HashMap f21945b = new HashMap();

    /* renamed from: a */
    public static ProtectionDomain f21944a = (ProtectionDomain) AccessController.doPrivileged(new C0388a());

    /* renamed from: n4.a$a */
    /* loaded from: classes.dex */
    public static class C0388a implements PrivilegedAction<Object> {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return a.class.getProtectionDomain();
        }
    }

    static {
        Class[] clsArr = {e4.a.class, e4.e.class, e4.b.class, e4.g.class, e4.c.class, e4.d.class, e4.h.class, e4.i.class, e4.j.class, e4.l.class, e4.n.class, c.class, n.class, g.class, h.class, k.class, i.class, t0.class, j0.class, c1.class, z0.class, i0.class, d1.class, b1.class, m0.class, l0.class, v.class, j4.c.class, j4.k.class, r0.class, v0.class, w0.class, h1.class, e1.class, u.class, y0.class, a1.class, o.class, h4.k.class, h4.a.class, h4.c.class, h4.e.class, h4.j.class, h4.i.class, h4.l.class, h4.b.class, h4.h.class, h4.f.class, i4.d.class, t.class, i4.j.class, i4.i.class, i4.k.class, j4.j.class, i4.l.class, i4.f.class};
        for (int i10 = 0; i10 < 56; i10++) {
            Class cls = clsArr[i10];
            f21945b.put(cls.getName(), cls);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a() {
        /*
            r3 = this;
            java.lang.Class<e4.a> r0 = e4.a.class
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
            if (r1 == 0) goto L14
            java.lang.String r2 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L14
            r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L14
            goto L18
        L14:
            java.lang.ClassLoader r1 = r0.getClassLoader()
        L18:
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a.<init>():void");
    }

    public final Class a(String str, byte[] bArr, int i10) {
        return defineClass(str, bArr, 0, i10, f21944a);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) {
        Class<?> cls = (Class) f21945b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return super.loadClass(str, z10);
        } catch (ClassNotFoundException e10) {
            throw e10;
        }
    }
}
