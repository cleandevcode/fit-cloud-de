package zm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l2.o0;
import zm.e0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: e */
    public static final h f32608e;

    /* renamed from: f */
    public static final h f32609f;

    /* renamed from: a */
    public final boolean f32610a;

    /* renamed from: b */
    public final boolean f32611b;

    /* renamed from: c */
    public final String[] f32612c;

    /* renamed from: d */
    public final String[] f32613d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f32614a;

        /* renamed from: b */
        public String[] f32615b;

        /* renamed from: c */
        public String[] f32616c;

        /* renamed from: d */
        public boolean f32617d;

        public a() {
            this.f32614a = true;
        }

        public a(h hVar) {
            this.f32614a = hVar.f32610a;
            this.f32615b = hVar.f32612c;
            this.f32616c = hVar.f32613d;
            this.f32617d = hVar.f32611b;
        }

        public final h a() {
            return new h(this.f32614a, this.f32617d, this.f32615b, this.f32616c);
        }

        public final void b(String... strArr) {
            gm.l.f(strArr, "cipherSuites");
            if (!this.f32614a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f32615b = (String[]) clone;
        }

        public final void c(g... gVarArr) {
            gm.l.f(gVarArr, "cipherSuites");
            if (this.f32614a) {
                ArrayList arrayList = new ArrayList(gVarArr.length);
                for (g gVar : gVarArr) {
                    arrayList.add(gVar.f32607a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void d() {
            if (!this.f32614a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f32617d = true;
        }

        public final void e(String... strArr) {
            gm.l.f(strArr, "tlsVersions");
            if (!this.f32614a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f32616c = (String[]) clone;
        }

        public final void f(e0... e0VarArr) {
            if (this.f32614a) {
                ArrayList arrayList = new ArrayList(e0VarArr.length);
                for (e0 e0Var : e0VarArr) {
                    arrayList.add(e0Var.f32583a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        g gVar = g.f32603q;
        g gVar2 = g.f32604r;
        g gVar3 = g.f32605s;
        g gVar4 = g.f32597k;
        g gVar5 = g.f32599m;
        g gVar6 = g.f32598l;
        g gVar7 = g.f32600n;
        g gVar8 = g.f32602p;
        g gVar9 = g.f32601o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f32595i, g.f32596j, g.f32593g, g.f32594h, g.f32591e, g.f32592f, g.f32590d};
        a aVar = new a();
        aVar.c((g[]) Arrays.copyOf(gVarArr, 9));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        aVar.f(e0Var, e0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.c((g[]) Arrays.copyOf(gVarArr2, 16));
        aVar2.f(e0Var, e0Var2);
        aVar2.d();
        f32608e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((g[]) Arrays.copyOf(gVarArr2, 16));
        aVar3.f(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0);
        aVar3.d();
        aVar3.a();
        f32609f = new h(false, false, null, null);
    }

    public h(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f32610a = z10;
        this.f32611b = z11;
        this.f32612c = strArr;
        this.f32613d = strArr2;
    }

    public final List<g> a() {
        String[] strArr = this.f32612c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(g.f32606t.b(str));
            }
            return ul.q.Y(arrayList);
        }
        return null;
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f32610a) {
            return false;
        }
        String[] strArr = this.f32613d;
        if (strArr != null && !an.c.h(strArr, sSLSocket.getEnabledProtocols(), wl.a.f30022a)) {
            return false;
        }
        String[] strArr2 = this.f32612c;
        if (strArr2 != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            g.f32606t.getClass();
            if (!an.c.h(strArr2, enabledCipherSuites, g.f32588b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final List<e0> c() {
        String[] strArr = this.f32613d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(e0.a.a(str));
            }
            return ul.q.Y(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (obj == this) {
                return true;
            }
            boolean z10 = this.f32610a;
            h hVar = (h) obj;
            if (z10 != hVar.f32610a) {
                return false;
            }
            return !z10 || (Arrays.equals(this.f32612c, hVar.f32612c) && Arrays.equals(this.f32613d, hVar.f32613d) && this.f32611b == hVar.f32611b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32610a) {
            String[] strArr = this.f32612c;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.f32613d;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f32611b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f32610a) {
            return "ConnectionSpec()";
        }
        StringBuilder a10 = p.a.a("ConnectionSpec(", "cipherSuites=");
        a10.append(Objects.toString(a(), "[all enabled]"));
        a10.append(", ");
        a10.append("tlsVersions=");
        a10.append(Objects.toString(c(), "[all enabled]"));
        a10.append(", ");
        a10.append("supportsTlsExtensions=");
        return o0.a(a10, this.f32611b, ')');
    }
}
