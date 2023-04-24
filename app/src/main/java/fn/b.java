package fn;

import a0.q0;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import dn.h;
import en.j;
import gm.l;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import ln.g;
import ln.k;
import ln.w;
import ln.y;
import ln.z;
import zm.a0;
import zm.j;
import zm.p;
import zm.q;
import zm.u;
import zm.v;

/* loaded from: classes2.dex */
public final class b implements en.d {

    /* renamed from: a */
    public int f14778a;

    /* renamed from: b */
    public final fn.a f14779b;

    /* renamed from: c */
    public p f14780c;

    /* renamed from: d */
    public final u f14781d;

    /* renamed from: e */
    public final h f14782e;

    /* renamed from: f */
    public final g f14783f;

    /* renamed from: g */
    public final ln.f f14784g;

    /* loaded from: classes2.dex */
    public abstract class a implements y {

        /* renamed from: a */
        public final k f14785a;

        /* renamed from: b */
        public boolean f14786b;

        public a() {
            b.this = r2;
            this.f14785a = new k(r2.f14783f.e());
        }

        @Override // ln.y
        public long V(ln.e eVar, long j10) {
            l.f(eVar, "sink");
            try {
                return b.this.f14783f.V(eVar, j10);
            } catch (IOException e10) {
                b.this.f14782e.k();
                a();
                throw e10;
            }
        }

        public final void a() {
            b bVar = b.this;
            int i10 = bVar.f14778a;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                b.h(bVar, this.f14785a);
                b.this.f14778a = 6;
                return;
            }
            StringBuilder a10 = android.support.v4.media.d.a("state: ");
            a10.append(b.this.f14778a);
            throw new IllegalStateException(a10.toString());
        }

        @Override // ln.y
        public final z e() {
            return this.f14785a;
        }
    }

    /* renamed from: fn.b$b */
    /* loaded from: classes2.dex */
    public final class C0266b implements w {

        /* renamed from: a */
        public final k f14788a;

        /* renamed from: b */
        public boolean f14789b;

        public C0266b() {
            b.this = r2;
            this.f14788a = new k(r2.f14784g.e());
        }

        @Override // ln.w
        public final void c0(ln.e eVar, long j10) {
            l.f(eVar, "source");
            if (!this.f14789b) {
                if (j10 == 0) {
                    return;
                }
                b.this.f14784g.a0(j10);
                b.this.f14784g.S("\r\n");
                b.this.f14784g.c0(eVar, j10);
                b.this.f14784g.S("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f14789b) {
                return;
            }
            this.f14789b = true;
            b.this.f14784g.S("0\r\n\r\n");
            b.h(b.this, this.f14788a);
            b.this.f14778a = 3;
        }

        @Override // ln.w
        public final z e() {
            return this.f14788a;
        }

        @Override // ln.w, java.io.Flushable
        public final synchronized void flush() {
            if (this.f14789b) {
                return;
            }
            b.this.f14784g.flush();
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends a {

        /* renamed from: d */
        public long f14791d;

        /* renamed from: e */
        public boolean f14792e;

        /* renamed from: f */
        public final q f14793f;

        /* renamed from: g */
        public final /* synthetic */ b f14794g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, q qVar) {
            super();
            l.f(qVar, InnerShareParams.URL);
            this.f14794g = bVar;
            this.f14793f = qVar;
            this.f14791d = -1L;
            this.f14792e = true;
        }

        @Override // fn.b.a, ln.y
        public final long V(ln.e eVar, long j10) {
            boolean z10;
            l.f(eVar, "sink");
            boolean z11 = true;
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!this.f14786b) {
                    if (!this.f14792e) {
                        return -1L;
                    }
                    long j11 = this.f14791d;
                    if (j11 == 0 || j11 == -1) {
                        if (j11 != -1) {
                            this.f14794g.f14783f.o0();
                        }
                        try {
                            this.f14791d = this.f14794g.f14783f.H0();
                            String o02 = this.f14794g.f14783f.o0();
                            if (o02 != null) {
                                String obj = om.l.x0(o02).toString();
                                if (this.f14791d >= 0) {
                                    if (obj.length() <= 0) {
                                        z11 = false;
                                    }
                                    if (!z11 || om.h.a0(obj, ";", false)) {
                                        if (this.f14791d == 0) {
                                            this.f14792e = false;
                                            b bVar = this.f14794g;
                                            bVar.f14780c = bVar.f14779b.a();
                                            u uVar = this.f14794g.f14781d;
                                            l.c(uVar);
                                            j jVar = uVar.f32706j;
                                            q qVar = this.f14793f;
                                            p pVar = this.f14794g.f14780c;
                                            l.c(pVar);
                                            en.e.b(jVar, qVar, pVar);
                                            a();
                                        }
                                        if (!this.f14792e) {
                                            return -1L;
                                        }
                                    }
                                }
                                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f14791d + obj + '\"');
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        } catch (NumberFormatException e10) {
                            throw new ProtocolException(e10.getMessage());
                        }
                    }
                    long V = super.V(eVar, Math.min(j10, this.f14791d));
                    if (V != -1) {
                        this.f14791d -= V;
                        return V;
                    }
                    this.f14794g.f14782e.k();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
        }

        @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14786b) {
                return;
            }
            if (this.f14792e && !an.c.f(this, TimeUnit.MILLISECONDS)) {
                this.f14794g.f14782e.k();
                a();
            }
            this.f14786b = true;
        }
    }

    /* loaded from: classes2.dex */
    public final class d extends a {

        /* renamed from: d */
        public long f14795d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10) {
            super();
            b.this = r3;
            this.f14795d = j10;
            if (j10 == 0) {
                a();
            }
        }

        @Override // fn.b.a, ln.y
        public final long V(ln.e eVar, long j10) {
            boolean z10;
            l.f(eVar, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!this.f14786b) {
                    long j11 = this.f14795d;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long V = super.V(eVar, Math.min(j11, j10));
                    if (V != -1) {
                        long j12 = this.f14795d - V;
                        this.f14795d = j12;
                        if (j12 == 0) {
                            a();
                        }
                        return V;
                    }
                    b.this.f14782e.k();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
        }

        @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14786b) {
                return;
            }
            if (this.f14795d != 0 && !an.c.f(this, TimeUnit.MILLISECONDS)) {
                b.this.f14782e.k();
                a();
            }
            this.f14786b = true;
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements w {

        /* renamed from: a */
        public final k f14797a;

        /* renamed from: b */
        public boolean f14798b;

        public e() {
            b.this = r2;
            this.f14797a = new k(r2.f14784g.e());
        }

        @Override // ln.w
        public final void c0(ln.e eVar, long j10) {
            l.f(eVar, "source");
            if (!this.f14798b) {
                long j11 = eVar.f20098b;
                byte[] bArr = an.c.f635a;
                if ((0 | j10) >= 0 && 0 <= j11 && j11 - 0 >= j10) {
                    b.this.f14784g.c0(eVar, j10);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14798b) {
                return;
            }
            this.f14798b = true;
            b.h(b.this, this.f14797a);
            b.this.f14778a = 3;
        }

        @Override // ln.w
        public final z e() {
            return this.f14797a;
        }

        @Override // ln.w, java.io.Flushable
        public final void flush() {
            if (this.f14798b) {
                return;
            }
            b.this.f14784g.flush();
        }
    }

    /* loaded from: classes2.dex */
    public final class f extends a {

        /* renamed from: d */
        public boolean f14800d;

        public f(b bVar) {
            super();
        }

        @Override // fn.b.a, ln.y
        public final long V(ln.e eVar, long j10) {
            boolean z10;
            l.f(eVar, "sink");
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!this.f14786b) {
                    if (this.f14800d) {
                        return -1L;
                    }
                    long V = super.V(eVar, j10);
                    if (V == -1) {
                        this.f14800d = true;
                        a();
                        return -1L;
                    }
                    return V;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
        }

        @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14786b) {
                return;
            }
            if (!this.f14800d) {
                a();
            }
            this.f14786b = true;
        }
    }

    public b(u uVar, h hVar, g gVar, ln.f fVar) {
        l.f(hVar, "connection");
        this.f14781d = uVar;
        this.f14782e = hVar;
        this.f14783f = gVar;
        this.f14784g = fVar;
        this.f14779b = new fn.a(gVar);
    }

    public static final void h(b bVar, k kVar) {
        bVar.getClass();
        z zVar = kVar.f20106e;
        z.a aVar = z.f20144d;
        l.f(aVar, "delegate");
        kVar.f20106e = aVar;
        zVar.a();
        zVar.b();
    }

    @Override // en.d
    public final void a() {
        this.f14784g.flush();
    }

    @Override // en.d
    public final long b(a0 a0Var) {
        if (!en.e.a(a0Var)) {
            return 0L;
        }
        if (om.h.V("chunked", a0.a(a0Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return an.c.i(a0Var);
    }

    @Override // en.d
    public final a0.a c(boolean z10) {
        int i10 = this.f14778a;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (z11) {
            try {
                fn.a aVar = this.f14779b;
                String G = aVar.f14777b.G(aVar.f14776a);
                aVar.f14776a -= G.length();
                en.j a10 = j.a.a(G);
                a0.a aVar2 = new a0.a();
                v vVar = a10.f13864a;
                l.f(vVar, "protocol");
                aVar2.f32543b = vVar;
                aVar2.f32544c = a10.f13865b;
                String str = a10.f13866c;
                l.f(str, CrashHianalyticsData.MESSAGE);
                aVar2.f32545d = str;
                aVar2.f32547f = this.f14779b.a().i();
                if (z10 && a10.f13865b == 100) {
                    return null;
                }
                if (a10.f13865b == 100) {
                    this.f14778a = 3;
                    return aVar2;
                }
                this.f14778a = 4;
                return aVar2;
            } catch (EOFException e10) {
                throw new IOException(a.b.b("unexpected end of stream on ", this.f14782e.f13256q.f32574a.f32518a.f()), e10);
            }
        }
        StringBuilder a11 = android.support.v4.media.d.a("state: ");
        a11.append(this.f14778a);
        throw new IllegalStateException(a11.toString().toString());
    }

    @Override // en.d
    public final void cancel() {
        Socket socket = this.f14782e.f13241b;
        if (socket != null) {
            an.c.c(socket);
        }
    }

    @Override // en.d
    public final void d(zm.w wVar) {
        boolean z10;
        Proxy.Type type = this.f14782e.f13256q.f32575b.type();
        l.e(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wVar.f32752c);
        sb2.append(' ');
        q qVar = wVar.f32751b;
        if (!qVar.f32657a && type == Proxy.Type.HTTP) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(qVar);
        } else {
            String b10 = qVar.b();
            String d10 = qVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        j(wVar.f32753d, sb3);
    }

    @Override // en.d
    public final y e(a0 a0Var) {
        if (!en.e.a(a0Var)) {
            return i(0L);
        }
        boolean z10 = true;
        if (om.h.V("chunked", a0.a(a0Var, "Transfer-Encoding"))) {
            q qVar = a0Var.f32529a.f32751b;
            if (this.f14778a != 4) {
                z10 = false;
            }
            if (z10) {
                this.f14778a = 5;
                return new c(this, qVar);
            }
            StringBuilder a10 = android.support.v4.media.d.a("state: ");
            a10.append(this.f14778a);
            throw new IllegalStateException(a10.toString().toString());
        }
        long i10 = an.c.i(a0Var);
        if (i10 != -1) {
            return i(i10);
        }
        if (this.f14778a != 4) {
            z10 = false;
        }
        if (z10) {
            this.f14778a = 5;
            this.f14782e.k();
            return new f(this);
        }
        StringBuilder a11 = android.support.v4.media.d.a("state: ");
        a11.append(this.f14778a);
        throw new IllegalStateException(a11.toString().toString());
    }

    @Override // en.d
    public final void f() {
        this.f14784g.flush();
    }

    @Override // en.d
    public final w g(zm.w wVar, long j10) {
        boolean z10 = true;
        if (om.h.V("chunked", wVar.f32753d.e("Transfer-Encoding"))) {
            if (this.f14778a != 1) {
                z10 = false;
            }
            if (z10) {
                this.f14778a = 2;
                return new C0266b();
            }
            StringBuilder a10 = android.support.v4.media.d.a("state: ");
            a10.append(this.f14778a);
            throw new IllegalStateException(a10.toString().toString());
        } else if (j10 != -1) {
            if (this.f14778a != 1) {
                z10 = false;
            }
            if (z10) {
                this.f14778a = 2;
                return new e();
            }
            StringBuilder a11 = android.support.v4.media.d.a("state: ");
            a11.append(this.f14778a);
            throw new IllegalStateException(a11.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // en.d
    public final h getConnection() {
        return this.f14782e;
    }

    public final d i(long j10) {
        boolean z10;
        if (this.f14778a == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f14778a = 5;
            return new d(j10);
        }
        StringBuilder a10 = android.support.v4.media.d.a("state: ");
        a10.append(this.f14778a);
        throw new IllegalStateException(a10.toString().toString());
    }

    public final void j(p pVar, String str) {
        boolean z10;
        l.f(pVar, "headers");
        l.f(str, "requestLine");
        if (this.f14778a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f14784g.S(str).S("\r\n");
            int length = pVar.f32653a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                this.f14784g.S(pVar.f(i10)).S(": ").S(pVar.j(i10)).S("\r\n");
            }
            this.f14784g.S("\r\n");
            this.f14778a = 1;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("state: ");
        a10.append(this.f14778a);
        throw new IllegalStateException(a10.toString().toString());
    }
}
