package zm;

import java.io.Closeable;
import zm.p;

/* loaded from: classes2.dex */
public final class a0 implements Closeable {

    /* renamed from: a */
    public final w f32529a;

    /* renamed from: b */
    public final v f32530b;

    /* renamed from: c */
    public final String f32531c;

    /* renamed from: d */
    public final int f32532d;

    /* renamed from: e */
    public final o f32533e;

    /* renamed from: f */
    public final p f32534f;

    /* renamed from: g */
    public final c0 f32535g;

    /* renamed from: h */
    public final a0 f32536h;

    /* renamed from: i */
    public final a0 f32537i;

    /* renamed from: j */
    public final a0 f32538j;

    /* renamed from: k */
    public final long f32539k;

    /* renamed from: l */
    public final long f32540l;

    /* renamed from: m */
    public final dn.c f32541m;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public w f32542a;

        /* renamed from: b */
        public v f32543b;

        /* renamed from: c */
        public int f32544c;

        /* renamed from: d */
        public String f32545d;

        /* renamed from: e */
        public o f32546e;

        /* renamed from: f */
        public p.a f32547f;

        /* renamed from: g */
        public c0 f32548g;

        /* renamed from: h */
        public a0 f32549h;

        /* renamed from: i */
        public a0 f32550i;

        /* renamed from: j */
        public a0 f32551j;

        /* renamed from: k */
        public long f32552k;

        /* renamed from: l */
        public long f32553l;

        /* renamed from: m */
        public dn.c f32554m;

        public a() {
            this.f32544c = -1;
            this.f32547f = new p.a();
        }

        public a(a0 a0Var) {
            gm.l.f(a0Var, "response");
            this.f32542a = a0Var.f32529a;
            this.f32543b = a0Var.f32530b;
            this.f32544c = a0Var.f32532d;
            this.f32545d = a0Var.f32531c;
            this.f32546e = a0Var.f32533e;
            this.f32547f = a0Var.f32534f.i();
            this.f32548g = a0Var.f32535g;
            this.f32549h = a0Var.f32536h;
            this.f32550i = a0Var.f32537i;
            this.f32551j = a0Var.f32538j;
            this.f32552k = a0Var.f32539k;
            this.f32553l = a0Var.f32540l;
            this.f32554m = a0Var.f32541m;
        }

        public static void b(String str, a0 a0Var) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (a0Var != null) {
                boolean z13 = false;
                if (a0Var.f32535g == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (a0Var.f32536h == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (a0Var.f32537i == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (a0Var.f32538j == null) {
                                z13 = true;
                            }
                            if (!z13) {
                                throw new IllegalArgumentException(a.b.b(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(a.b.b(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(a.b.b(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(a.b.b(str, ".body != null").toString());
            }
        }

        public final a0 a() {
            boolean z10;
            int i10 = this.f32544c;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                w wVar = this.f32542a;
                if (wVar != null) {
                    v vVar = this.f32543b;
                    if (vVar != null) {
                        String str = this.f32545d;
                        if (str != null) {
                            return new a0(wVar, vVar, str, i10, this.f32546e, this.f32547f.c(), this.f32548g, this.f32549h, this.f32550i, this.f32551j, this.f32552k, this.f32553l, this.f32554m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder a10 = android.support.v4.media.d.a("code < 0: ");
            a10.append(this.f32544c);
            throw new IllegalStateException(a10.toString().toString());
        }
    }

    public a0(w wVar, v vVar, String str, int i10, o oVar, p pVar, c0 c0Var, a0 a0Var, a0 a0Var2, a0 a0Var3, long j10, long j11, dn.c cVar) {
        this.f32529a = wVar;
        this.f32530b = vVar;
        this.f32531c = str;
        this.f32532d = i10;
        this.f32533e = oVar;
        this.f32534f = pVar;
        this.f32535g = c0Var;
        this.f32536h = a0Var;
        this.f32537i = a0Var2;
        this.f32538j = a0Var3;
        this.f32539k = j10;
        this.f32540l = j11;
        this.f32541m = cVar;
    }

    public static String a(a0 a0Var, String str) {
        a0Var.getClass();
        String e10 = a0Var.f32534f.e(str);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c0 c0Var = this.f32535g;
        if (c0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        c0Var.close();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Response{protocol=");
        a10.append(this.f32530b);
        a10.append(", code=");
        a10.append(this.f32532d);
        a10.append(", message=");
        a10.append(this.f32531c);
        a10.append(", url=");
        a10.append(this.f32529a.f32751b);
        a10.append('}');
        return a10.toString();
    }
}
