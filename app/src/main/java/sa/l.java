package sa;

import java.util.Collections;
import java.util.List;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class l implements y, Cloneable {

    /* renamed from: f */
    public static final l f26762f = new l();

    /* renamed from: a */
    public double f26763a = -1.0d;

    /* renamed from: b */
    public int f26764b = 136;

    /* renamed from: c */
    public boolean f26765c = true;

    /* renamed from: d */
    public List<qa.a> f26766d = Collections.emptyList();

    /* renamed from: e */
    public List<qa.a> f26767e = Collections.emptyList();

    /* loaded from: classes.dex */
    public class a<T> extends x<T> {

        /* renamed from: a */
        public x<T> f26768a;

        /* renamed from: b */
        public final /* synthetic */ boolean f26769b;

        /* renamed from: c */
        public final /* synthetic */ boolean f26770c;

        /* renamed from: d */
        public final /* synthetic */ qa.h f26771d;

        /* renamed from: e */
        public final /* synthetic */ xa.a f26772e;

        public a(boolean z10, boolean z11, qa.h hVar, xa.a aVar) {
            l.this = r1;
            this.f26769b = z10;
            this.f26770c = z11;
            this.f26771d = hVar;
            this.f26772e = aVar;
        }

        @Override // qa.x
        public final T a(ya.a aVar) {
            if (this.f26769b) {
                aVar.t0();
                return null;
            }
            x<T> xVar = this.f26768a;
            if (xVar == null) {
                xVar = this.f26771d.d(l.this, this.f26772e);
                this.f26768a = xVar;
            }
            return xVar.a(aVar);
        }

        @Override // qa.x
        public final void b(ya.b bVar, T t10) {
            if (this.f26770c) {
                bVar.y();
                return;
            }
            x<T> xVar = this.f26768a;
            if (xVar == null) {
                xVar = this.f26771d.d(l.this, this.f26772e);
                this.f26768a = xVar;
            }
            xVar.b(bVar, t10);
        }
    }

    public static boolean d(Class cls) {
        boolean z10;
        if (!Enum.class.isAssignableFrom(cls)) {
            if ((cls.getModifiers() & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        boolean z10;
        boolean z11;
        Class<? super T> cls = aVar.f30456a;
        boolean b10 = b(cls);
        if (!b10 && !c(cls, true)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!b10 && !c(cls, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new a(z11, z10, hVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Class<?> r7) {
        /*
            r6 = this;
            double r0 = r6.f26763a
            r2 = 1
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L20
            java.lang.Class<ra.c> r0 = ra.c.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            ra.c r0 = (ra.c) r0
            java.lang.Class<ra.d> r1 = ra.d.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            ra.d r1 = (ra.d) r1
            boolean r0 = r6.e(r0, r1)
            if (r0 != 0) goto L20
            return r2
        L20:
            boolean r0 = r6.f26765c
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r7.isMemberClass()
            if (r0 == 0) goto L3a
            int r0 = r7.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 != 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L3e
            return r2
        L3e:
            boolean r7 = d(r7)
            if (r7 == 0) goto L45
            return r2
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.l.b(java.lang.Class):boolean");
    }

    public final boolean c(Class<?> cls, boolean z10) {
        for (qa.a aVar : z10 ? this.f26766d : this.f26767e) {
            if (aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(ra.c r7, ra.d r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L11
            double r2 = r7.value()
            double r4 = r6.f26763a
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto Lf
            goto L11
        Lf:
            r7 = 0
            goto L12
        L11:
            r7 = 1
        L12:
            if (r7 == 0) goto L27
            if (r8 == 0) goto L23
            double r7 = r8.value()
            double r2 = r6.f26763a
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L21
            goto L23
        L21:
            r7 = 0
            goto L24
        L23:
            r7 = 1
        L24:
            if (r7 == 0) goto L27
            r0 = 1
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.l.e(ra.c, ra.d):boolean");
    }
}
