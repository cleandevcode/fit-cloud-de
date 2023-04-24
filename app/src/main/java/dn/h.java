package dn;

import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import fn.b;
import gn.f;
import gn.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ln.h;
import ln.r;
import ln.s;
import zm.a0;
import zm.d0;
import zm.f;
import zm.m;
import zm.o;
import zm.p;
import zm.q;
import zm.u;
import zm.v;
import zm.w;

/* loaded from: classes2.dex */
public final class h extends f.c {

    /* renamed from: b */
    public Socket f13241b;

    /* renamed from: c */
    public Socket f13242c;

    /* renamed from: d */
    public o f13243d;

    /* renamed from: e */
    public v f13244e;

    /* renamed from: f */
    public gn.f f13245f;

    /* renamed from: g */
    public s f13246g;

    /* renamed from: h */
    public r f13247h;

    /* renamed from: i */
    public boolean f13248i;

    /* renamed from: j */
    public boolean f13249j;

    /* renamed from: k */
    public int f13250k;

    /* renamed from: l */
    public int f13251l;

    /* renamed from: m */
    public int f13252m;

    /* renamed from: n */
    public int f13253n;

    /* renamed from: o */
    public final ArrayList f13254o;

    /* renamed from: p */
    public long f13255p;

    /* renamed from: q */
    public final d0 f13256q;

    public h(j jVar, d0 d0Var) {
        gm.l.f(jVar, "connectionPool");
        gm.l.f(d0Var, "route");
        this.f13256q = d0Var;
        this.f13253n = 1;
        this.f13254o = new ArrayList();
        this.f13255p = Long.MAX_VALUE;
    }

    public static void d(u uVar, d0 d0Var, IOException iOException) {
        gm.l.f(uVar, "client");
        gm.l.f(d0Var, "failedRoute");
        gm.l.f(iOException, "failure");
        if (d0Var.f32575b.type() != Proxy.Type.DIRECT) {
            zm.a aVar = d0Var.f32574a;
            aVar.f32528k.connectFailed(aVar.f32518a.g(), d0Var.f32575b.address(), iOException);
        }
        f.s sVar = uVar.f32721y;
        synchronized (sVar) {
            ((Set) sVar.f13974a).add(d0Var);
        }
    }

    @Override // gn.f.c
    public final synchronized void a(gn.f fVar, w wVar) {
        int i10;
        gm.l.f(fVar, "connection");
        gm.l.f(wVar, "settings");
        if ((wVar.f15678a & 16) != 0) {
            i10 = wVar.f15679b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f13253n = i10;
    }

    @Override // gn.f.c
    public final void b(gn.r rVar) {
        gm.l.f(rVar, "stream");
        rVar.c(gn.b.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, e eVar, m mVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        d0 d0Var;
        boolean z14;
        gm.l.f(eVar, "call");
        gm.l.f(mVar, "eventListener");
        if (this.f13244e == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            List<zm.h> list = this.f13256q.f32574a.f32520c;
            b bVar = new b(list);
            zm.a aVar = this.f13256q.f32574a;
            if (aVar.f32523f == null) {
                if (list.contains(zm.h.f32609f)) {
                    String str = this.f13256q.f32574a.f32518a.f32661e;
                    hn.k.f16188c.getClass();
                    if (!hn.k.f16186a.h(str)) {
                        throw new k(new UnknownServiceException(android.support.v4.media.a.a("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new k(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (aVar.f32519b.contains(v.H2_PRIOR_KNOWLEDGE)) {
                throw new k(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            k kVar = null;
            do {
                try {
                    d0 d0Var2 = this.f13256q;
                    if (d0Var2.f32574a.f32523f != null && d0Var2.f32575b.type() == Proxy.Type.HTTP) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f(i10, i11, i12, eVar, mVar);
                        if (this.f13241b == null) {
                            d0Var = this.f13256q;
                            if (d0Var.f32574a.f32523f == null && d0Var.f32575b.type() == Proxy.Type.HTTP) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14 && this.f13241b == null) {
                                throw new k(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f13255p = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            e(i10, i11, eVar, mVar);
                        } catch (IOException e10) {
                            e = e10;
                            Socket socket = this.f13242c;
                            if (socket != null) {
                                an.c.c(socket);
                            }
                            Socket socket2 = this.f13241b;
                            if (socket2 != null) {
                                an.c.c(socket2);
                            }
                            this.f13242c = null;
                            this.f13241b = null;
                            this.f13246g = null;
                            this.f13247h = null;
                            this.f13243d = null;
                            this.f13244e = null;
                            this.f13245f = null;
                            this.f13253n = 1;
                            d0 d0Var3 = this.f13256q;
                            InetSocketAddress inetSocketAddress = d0Var3.f32576c;
                            Proxy proxy = d0Var3.f32575b;
                            gm.l.f(inetSocketAddress, "inetSocketAddress");
                            gm.l.f(proxy, "proxy");
                            if (kVar == null) {
                                kVar = new k(e);
                            } else {
                                ih.v.b(kVar.f13264b, e);
                                kVar.f13263a = e;
                            }
                            if (!z10) {
                                break;
                            }
                            bVar.f13185c = true;
                            if (bVar.f13184b && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                z12 = true;
                                continue;
                            } else {
                                z12 = false;
                                continue;
                            }
                            if (!z12) {
                            }
                            throw kVar;
                        }
                    }
                    g(bVar, eVar, mVar);
                    d0 d0Var4 = this.f13256q;
                    InetSocketAddress inetSocketAddress2 = d0Var4.f32576c;
                    Proxy proxy2 = d0Var4.f32575b;
                    m.a aVar2 = m.f32638a;
                    gm.l.f(inetSocketAddress2, "inetSocketAddress");
                    gm.l.f(proxy2, "proxy");
                    d0Var = this.f13256q;
                    if (d0Var.f32574a.f32523f == null) {
                    }
                    z14 = false;
                    if (!z14) {
                    }
                    this.f13255p = System.nanoTime();
                    return;
                } catch (IOException e11) {
                    e = e11;
                }
            } while (!z12);
            throw kVar;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i10, int i11, e eVar, m mVar) {
        Socket socket;
        int i12;
        d0 d0Var = this.f13256q;
        Proxy proxy = d0Var.f32575b;
        zm.a aVar = d0Var.f32574a;
        Proxy.Type type = proxy.type();
        if (type == null || ((i12 = f.f13237a[type.ordinal()]) != 1 && i12 != 2)) {
            socket = new Socket(proxy);
        } else {
            socket = aVar.f32522e.createSocket();
            gm.l.c(socket);
        }
        this.f13241b = socket;
        InetSocketAddress inetSocketAddress = this.f13256q.f32576c;
        mVar.getClass();
        gm.l.f(eVar, "call");
        gm.l.f(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i11);
        try {
            hn.k.f16188c.getClass();
            hn.k.f16186a.e(socket, this.f13256q.f32576c, i10);
            try {
                this.f13246g = new s(rm.l.v(socket));
                this.f13247h = new r(rm.l.u(socket));
            } catch (NullPointerException e10) {
                if (!gm.l.a(e10.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e10);
            }
        } catch (ConnectException e11) {
            StringBuilder a10 = android.support.v4.media.d.a("Failed to connect to ");
            a10.append(this.f13256q.f32576c);
            ConnectException connectException = new ConnectException(a10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, e eVar, m mVar) {
        w.a aVar = new w.a();
        q qVar = this.f13256q.f32574a.f32518a;
        gm.l.f(qVar, InnerShareParams.URL);
        aVar.f32756a = qVar;
        aVar.c("CONNECT", null);
        aVar.b("Host", an.c.s(this.f13256q.f32574a.f32518a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/4.9.1");
        zm.w a10 = aVar.a();
        a0.a aVar2 = new a0.a();
        aVar2.f32542a = a10;
        aVar2.f32543b = v.HTTP_1_1;
        aVar2.f32544c = 407;
        aVar2.f32545d = "Preemptive Authenticate";
        aVar2.f32548g = an.c.f637c;
        aVar2.f32552k = -1L;
        aVar2.f32553l = -1L;
        p.a aVar3 = aVar2.f32547f;
        aVar3.getClass();
        p.f32652b.getClass();
        p.b.a("Proxy-Authenticate");
        p.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.d("Proxy-Authenticate");
        aVar3.b("Proxy-Authenticate", "OkHttp-Preemptive");
        a0 a11 = aVar2.a();
        d0 d0Var = this.f13256q;
        d0Var.f32574a.f32526i.a(d0Var, a11);
        q qVar2 = a10.f32751b;
        e(i10, i11, eVar, mVar);
        s sVar = this.f13246g;
        gm.l.c(sVar);
        r rVar = this.f13247h;
        gm.l.c(rVar);
        fn.b bVar = new fn.b(null, this, sVar, rVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sVar.e().g(i11, timeUnit);
        rVar.e().g(i12, timeUnit);
        bVar.j(a10.f32753d, "CONNECT " + an.c.s(qVar2, true) + " HTTP/1.1");
        bVar.a();
        a0.a c10 = bVar.c(false);
        gm.l.c(c10);
        c10.f32542a = a10;
        a0 a12 = c10.a();
        long i13 = an.c.i(a12);
        if (i13 != -1) {
            b.d i14 = bVar.i(i13);
            an.c.q(i14, Integer.MAX_VALUE, timeUnit);
            i14.close();
        }
        int i15 = a12.f32532d;
        if (i15 != 200) {
            if (i15 == 407) {
                d0 d0Var2 = this.f13256q;
                d0Var2.f32574a.f32526i.a(d0Var2, a12);
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder a13 = android.support.v4.media.d.a("Unexpected response code for CONNECT: ");
            a13.append(a12.f32532d);
            throw new IOException(a13.toString());
        } else if (sVar.f20127a.A() && rVar.f20124a.A()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, e eVar, m mVar) {
        v vVar = v.HTTP_1_1;
        zm.a aVar = this.f13256q.f32574a;
        if (aVar.f32523f == null) {
            List<v> list = aVar.f32519b;
            v vVar2 = v.H2_PRIOR_KNOWLEDGE;
            if (list.contains(vVar2)) {
                this.f13242c = this.f13241b;
                this.f13244e = vVar2;
                l();
                return;
            }
            this.f13242c = this.f13241b;
            this.f13244e = vVar;
            return;
        }
        mVar.getClass();
        gm.l.f(eVar, "call");
        zm.a aVar2 = this.f13256q.f32574a;
        SSLSocketFactory sSLSocketFactory = aVar2.f32523f;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            gm.l.c(sSLSocketFactory);
            Socket socket = this.f13241b;
            q qVar = aVar2.f32518a;
            Socket createSocket = sSLSocketFactory.createSocket(socket, qVar.f32661e, qVar.f32662f, true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    zm.h a10 = bVar.a(sSLSocket2);
                    if (a10.f32611b) {
                        hn.k.f16188c.getClass();
                        hn.k.f16186a.d(sSLSocket2, aVar2.f32518a.f32661e, aVar2.f32519b);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    o.a aVar3 = o.f32645e;
                    gm.l.e(session, "sslSocketSession");
                    aVar3.getClass();
                    o a11 = o.a.a(session);
                    HostnameVerifier hostnameVerifier = aVar2.f32524g;
                    gm.l.c(hostnameVerifier);
                    if (!hostnameVerifier.verify(aVar2.f32518a.f32661e, session)) {
                        List<Certificate> a12 = a11.a();
                        if (!a12.isEmpty()) {
                            Certificate certificate = a12.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(aVar2.f32518a.f32661e);
                            sb2.append(" not verified:\n              |    certificate: ");
                            zm.f.f32585d.getClass();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("sha256/");
                            ln.h hVar = ln.h.f20100d;
                            PublicKey publicKey = x509Certificate.getPublicKey();
                            gm.l.e(publicKey, "publicKey");
                            byte[] encoded = publicKey.getEncoded();
                            gm.l.e(encoded, "publicKey.encoded");
                            sb3.append(h.a.c(encoded).c("SHA-256").a());
                            sb2.append(sb3.toString());
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            gm.l.e(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(ul.q.Q(kn.c.a(x509Certificate, 2), kn.c.a(x509Certificate, 7)));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(om.d.R(sb2.toString()));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.f32518a.f32661e + " not verified (no certificates)");
                    }
                    zm.f fVar = aVar2.f32525h;
                    gm.l.c(fVar);
                    this.f13243d = new o(a11.f32647b, a11.f32648c, a11.f32649d, new g(fVar, a11, aVar2));
                    gm.l.f(aVar2.f32518a.f32661e, "hostname");
                    Iterator<T> it = fVar.f32586a.iterator();
                    if (!it.hasNext()) {
                        if (a10.f32611b) {
                            hn.k.f16188c.getClass();
                            str = hn.k.f16186a.f(sSLSocket2);
                        }
                        this.f13242c = sSLSocket2;
                        this.f13246g = new s(rm.l.v(sSLSocket2));
                        this.f13247h = new r(rm.l.u(sSLSocket2));
                        if (str != null) {
                            vVar = v.a.a(str);
                        }
                        this.f13244e = vVar;
                        hn.k.f16188c.getClass();
                        hn.k.f16186a.a(sSLSocket2);
                        if (this.f13244e == v.HTTP_2) {
                            l();
                            return;
                        }
                        return;
                    }
                    ((f.b) it.next()).getClass();
                    om.h.a0(null, "**.", false);
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        hn.k.f16188c.getClass();
                        hn.k.f16186a.a(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        an.c.c(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d6, code lost:
        if (r8 == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(zm.a r7, java.util.List<zm.d0> r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.h.h(zm.a, java.util.List):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0046, code lost:
        if (r0 >= r2.f15566q) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = an.c.f635a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f13241b
            gm.l.c(r2)
            java.net.Socket r3 = r9.f13242c
            gm.l.c(r3)
            ln.s r4 = r9.f13246g
            gm.l.c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L7c
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L7c
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L7c
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L2f
            goto L7c
        L2f:
            gn.f r2 = r9.f13245f
            r6 = 1
            if (r2 == 0) goto L50
            monitor-enter(r2)
            boolean r10 = r2.f15556g     // Catch: java.lang.Throwable -> L4d
            if (r10 == 0) goto L3a
            goto L48
        L3a:
            long r3 = r2.f15565p     // Catch: java.lang.Throwable -> L4d
            long r7 = r2.f15564o     // Catch: java.lang.Throwable -> L4d
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L4a
            long r3 = r2.f15566q     // Catch: java.lang.Throwable -> L4d
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L4a
        L48:
            monitor-exit(r2)
            goto L4c
        L4a:
            monitor-exit(r2)
            r5 = 1
        L4c:
            return r5
        L4d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L50:
            monitor-enter(r9)
            long r7 = r9.f13255p     // Catch: java.lang.Throwable -> L79
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L78
            if (r10 == 0) goto L78
            int r10 = r3.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
            r3.setSoTimeout(r6)     // Catch: java.lang.Throwable -> L71
            boolean r0 = r4.A()     // Catch: java.lang.Throwable -> L71
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
            r5 = r0
            goto L77
        L71:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
            throw r0     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
        L76:
            r5 = 1
        L77:
            return r5
        L78:
            return r6
        L79:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.h.i(boolean):boolean");
    }

    public final en.d j(u uVar, en.g gVar) {
        Socket socket = this.f13242c;
        gm.l.c(socket);
        s sVar = this.f13246g;
        gm.l.c(sVar);
        r rVar = this.f13247h;
        gm.l.c(rVar);
        gn.f fVar = this.f13245f;
        if (fVar != null) {
            return new gn.p(uVar, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.f13858h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sVar.e().g(gVar.f13858h, timeUnit);
        rVar.e().g(gVar.f13859i, timeUnit);
        return new fn.b(uVar, this, sVar, rVar);
    }

    public final synchronized void k() {
        this.f13248i = true;
    }

    public final void l() {
        StringBuilder a10;
        int i10;
        int i11;
        Socket socket = this.f13242c;
        gm.l.c(socket);
        s sVar = this.f13246g;
        gm.l.c(sVar);
        r rVar = this.f13247h;
        gm.l.c(rVar);
        socket.setSoTimeout(0);
        cn.d dVar = cn.d.f4967h;
        f.b bVar = new f.b(dVar);
        String str = this.f13256q.f32574a.f32518a.f32661e;
        gm.l.f(str, "peerName");
        bVar.f15578a = socket;
        if (bVar.f15585h) {
            a10 = new StringBuilder();
            a10.append(an.c.f640f);
            a10.append(' ');
        } else {
            a10 = android.support.v4.media.d.a("MockWebServer ");
        }
        a10.append(str);
        bVar.f15579b = a10.toString();
        bVar.f15580c = sVar;
        bVar.f15581d = rVar;
        bVar.f15582e = this;
        bVar.f15584g = 0;
        gn.f fVar = new gn.f(bVar);
        this.f13245f = fVar;
        gn.w wVar = gn.f.B;
        if ((wVar.f15678a & 16) != 0) {
            i10 = wVar.f15679b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f13253n = i10;
        gn.s sVar2 = fVar.f15574y;
        synchronized (sVar2) {
            if (!sVar2.f15668c) {
                if (sVar2.f15671f) {
                    Logger logger = gn.s.f15665g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(an.c.g(">> CONNECTION " + gn.e.f15545a.e(), new Object[0]));
                    }
                    sVar2.f15670e.u(gn.e.f15545a);
                    sVar2.f15670e.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        gn.s sVar3 = fVar.f15574y;
        gn.w wVar2 = fVar.f15567r;
        synchronized (sVar3) {
            gm.l.f(wVar2, "settings");
            if (!sVar3.f15668c) {
                sVar3.h(0, Integer.bitCount(wVar2.f15678a) * 6, 4, 0);
                for (int i12 = 0; i12 < 10; i12++) {
                    boolean z10 = true;
                    if (((1 << i12) & wVar2.f15678a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        if (i12 != 4) {
                            if (i12 != 7) {
                                i11 = i12;
                            } else {
                                i11 = 4;
                            }
                        } else {
                            i11 = 3;
                        }
                        sVar3.f15670e.writeShort(i11);
                        sVar3.f15670e.writeInt(wVar2.f15679b[i12]);
                    }
                }
                sVar3.f15670e.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a11 = fVar.f15567r.a();
        if (a11 != 65535) {
            fVar.f15574y.s(0, a11 - Platform.CUSTOMER_ACTION_MASK);
        }
        dVar.f().c(new cn.b(fVar.f15575z, fVar.f15553d), 0L);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Connection{");
        a10.append(this.f13256q.f32574a.f32518a.f32661e);
        a10.append(':');
        a10.append(this.f13256q.f32574a.f32518a.f32662f);
        a10.append(',');
        a10.append(" proxy=");
        a10.append(this.f13256q.f32575b);
        a10.append(" hostAddress=");
        a10.append(this.f13256q.f32576c);
        a10.append(" cipherSuite=");
        o oVar = this.f13243d;
        a10.append((oVar == null || (r1 = oVar.f32648c) == null) ? "none" : "none");
        a10.append(" protocol=");
        a10.append(this.f13244e);
        a10.append('}');
        return a10.toString();
    }
}
