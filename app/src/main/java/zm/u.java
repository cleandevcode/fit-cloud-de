package zm;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import zm.d;
import zm.m;

@Metadata
/* loaded from: classes2.dex */
public class u implements Cloneable, d.a {

    /* renamed from: a */
    public final k f32697a;

    /* renamed from: b */
    public final w.d f32698b;

    /* renamed from: c */
    public final List<r> f32699c;

    /* renamed from: d */
    public final List<r> f32700d;

    /* renamed from: e */
    public final m.b f32701e;

    /* renamed from: f */
    public final boolean f32702f;

    /* renamed from: g */
    public final b f32703g;

    /* renamed from: h */
    public final boolean f32704h;

    /* renamed from: i */
    public final boolean f32705i;

    /* renamed from: j */
    public final j f32706j;

    /* renamed from: k */
    public final l f32707k;

    /* renamed from: l */
    public final ProxySelector f32708l;

    /* renamed from: m */
    public final b f32709m;

    /* renamed from: n */
    public final SocketFactory f32710n;

    /* renamed from: o */
    public final SSLSocketFactory f32711o;

    /* renamed from: p */
    public final X509TrustManager f32712p;

    /* renamed from: q */
    public final List<h> f32713q;

    /* renamed from: r */
    public final List<v> f32714r;

    /* renamed from: s */
    public final HostnameVerifier f32715s;

    /* renamed from: t */
    public final f f32716t;

    /* renamed from: u */
    public final androidx.fragment.app.a0 f32717u;

    /* renamed from: v */
    public final int f32718v;

    /* renamed from: w */
    public final int f32719w;

    /* renamed from: x */
    public final int f32720x;

    /* renamed from: y */
    public final f.s f32721y;

    /* renamed from: z */
    public static final List<v> f32696z = an.c.j(v.HTTP_2, v.HTTP_1_1);
    public static final List<h> A = an.c.j(h.f32608e, h.f32609f);

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public k f32722a = new k();

        /* renamed from: b */
        public w.d f32723b = new w.d(10);

        /* renamed from: c */
        public final ArrayList f32724c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f32725d = new ArrayList();

        /* renamed from: e */
        public an.a f32726e;

        /* renamed from: f */
        public boolean f32727f;

        /* renamed from: g */
        public w.o f32728g;

        /* renamed from: h */
        public boolean f32729h;

        /* renamed from: i */
        public boolean f32730i;

        /* renamed from: j */
        public j f32731j;

        /* renamed from: k */
        public bk.i f32732k;

        /* renamed from: l */
        public w.o f32733l;

        /* renamed from: m */
        public SocketFactory f32734m;

        /* renamed from: n */
        public List<h> f32735n;

        /* renamed from: o */
        public List<? extends v> f32736o;

        /* renamed from: p */
        public kn.c f32737p;

        /* renamed from: q */
        public f f32738q;

        /* renamed from: r */
        public int f32739r;

        /* renamed from: s */
        public int f32740s;

        /* renamed from: t */
        public int f32741t;

        public a() {
            m.a aVar = m.f32638a;
            byte[] bArr = an.c.f635a;
            gm.l.f(aVar, "$this$asFactory");
            this.f32726e = new an.a(aVar);
            this.f32727f = true;
            w.o oVar = b.f32555a;
            this.f32728g = oVar;
            this.f32729h = true;
            this.f32730i = true;
            this.f32731j = j.f32632a;
            this.f32732k = l.f32637a;
            this.f32733l = oVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            gm.l.e(socketFactory, "SocketFactory.getDefault()");
            this.f32734m = socketFactory;
            this.f32735n = u.A;
            this.f32736o = u.f32696z;
            this.f32737p = kn.c.f18631a;
            this.f32738q = f.f32584c;
            this.f32739r = 10000;
            this.f32740s = 10000;
            this.f32741t = 10000;
        }
    }

    public u() {
        this(new a());
    }

    public u(a aVar) {
        boolean z10;
        f fVar;
        boolean z11;
        this.f32697a = aVar.f32722a;
        this.f32698b = aVar.f32723b;
        this.f32699c = an.c.t(aVar.f32724c);
        this.f32700d = an.c.t(aVar.f32725d);
        this.f32701e = aVar.f32726e;
        this.f32702f = aVar.f32727f;
        this.f32703g = aVar.f32728g;
        this.f32704h = aVar.f32729h;
        this.f32705i = aVar.f32730i;
        this.f32706j = aVar.f32731j;
        this.f32707k = aVar.f32732k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f32708l = proxySelector == null ? jn.a.f17999a : proxySelector;
        this.f32709m = aVar.f32733l;
        this.f32710n = aVar.f32734m;
        List<h> list = aVar.f32735n;
        this.f32713q = list;
        this.f32714r = aVar.f32736o;
        this.f32715s = aVar.f32737p;
        this.f32718v = aVar.f32739r;
        this.f32719w = aVar.f32740s;
        this.f32720x = aVar.f32741t;
        this.f32721y = new f.s(5);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (h hVar : list) {
                if (hVar.f32610a) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            this.f32711o = null;
            this.f32717u = null;
            this.f32712p = null;
            fVar = f.f32584c;
        } else {
            hn.k.f16188c.getClass();
            X509TrustManager m10 = hn.k.f16186a.m();
            this.f32712p = m10;
            hn.k kVar = hn.k.f16186a;
            gm.l.c(m10);
            this.f32711o = kVar.l(m10);
            androidx.fragment.app.a0 b10 = hn.k.f16186a.b(m10);
            this.f32717u = b10;
            fVar = aVar.f32738q;
            gm.l.c(b10);
            if (!gm.l.a(fVar.f32587b, b10)) {
                fVar = new f(fVar.f32586a, b10);
            }
        }
        this.f32716t = fVar;
        List<r> list2 = this.f32699c;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            StringBuilder a10 = android.support.v4.media.d.a("Null interceptor: ");
            a10.append(this.f32699c);
            throw new IllegalStateException(a10.toString().toString());
        }
        List<r> list3 = this.f32700d;
        if (list3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list3.contains(null))) {
            StringBuilder a11 = android.support.v4.media.d.a("Null network interceptor: ");
            a11.append(this.f32700d);
            throw new IllegalStateException(a11.toString().toString());
        }
        List<h> list4 = this.f32713q;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            for (h hVar2 : list4) {
                if (hVar2.f32610a) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (!z11) {
            if (this.f32711o == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f32717u == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f32712p == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f32711o == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f32717u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f32712p == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!gm.l.a(this.f32716t, f.f32584c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // zm.d.a
    public final dn.e a(w wVar) {
        return new dn.e(this, wVar, false);
    }

    public final Object clone() {
        return super.clone();
    }
}
