package en;

import dn.l;
import gm.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import zm.a0;
import zm.d0;
import zm.q;
import zm.r;
import zm.u;
import zm.w;
import zm.z;

/* loaded from: classes2.dex */
public final class i implements r {

    /* renamed from: a */
    public final u f13863a;

    public i(u uVar) {
        l.f(uVar, "client");
        this.f13863a = uVar;
    }

    public static int d(a0 a0Var, int i10) {
        String a10 = a0.a(a0Var, "Retry-After");
        if (a10 != null) {
            Pattern compile = Pattern.compile("\\d+");
            l.e(compile, "compile(pattern)");
            if (compile.matcher(a10).matches()) {
                Integer valueOf = Integer.valueOf(a10);
                l.e(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x00c4, code lost:
        throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
     */
    @Override // zm.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zm.a0 a(en.g r27) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: en.i.a(en.g):zm.a0");
    }

    public final w b(a0 a0Var, dn.c cVar) {
        d0 d0Var;
        String a10;
        q.a aVar;
        q qVar;
        zm.b bVar;
        dn.h hVar;
        z zVar = null;
        if (cVar != null && (hVar = cVar.f13188b) != null) {
            d0Var = hVar.f13256q;
        } else {
            d0Var = null;
        }
        int i10 = a0Var.f32532d;
        String str = a0Var.f32529a.f32752c;
        boolean z10 = false;
        if (i10 != 307 && i10 != 308) {
            if (i10 != 401) {
                if (i10 != 421) {
                    if (i10 != 503) {
                        if (i10 != 407) {
                            if (i10 != 408) {
                                switch (i10) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.f13863a.f32702f) {
                                return null;
                            } else {
                                a0 a0Var2 = a0Var.f32538j;
                                if ((a0Var2 != null && a0Var2.f32532d == 408) || d(a0Var, 0) > 0) {
                                    return null;
                                }
                                return a0Var.f32529a;
                            }
                        } else {
                            l.c(d0Var);
                            if (d0Var.f32575b.type() == Proxy.Type.HTTP) {
                                bVar = this.f13863a.f32709m;
                            } else {
                                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                            }
                        }
                    } else {
                        a0 a0Var3 = a0Var.f32538j;
                        if ((a0Var3 != null && a0Var3.f32532d == 503) || d(a0Var, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return a0Var.f32529a;
                    }
                } else if (cVar == null || !(!l.a(cVar.f13191e.f13211h.f32518a.f32661e, cVar.f13188b.f13256q.f32574a.f32518a.f32661e))) {
                    return null;
                } else {
                    dn.h hVar2 = cVar.f13188b;
                    synchronized (hVar2) {
                        hVar2.f13249j = true;
                    }
                    return a0Var.f32529a;
                }
            } else {
                bVar = this.f13863a.f32703g;
            }
            bVar.a(d0Var, a0Var);
            return null;
        }
        if (!this.f13863a.f32704h || (a10 = a0.a(a0Var, "Location")) == null) {
            return null;
        }
        q qVar2 = a0Var.f32529a.f32751b;
        qVar2.getClass();
        try {
            aVar = new q.a();
            aVar.c(qVar2, a10);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            qVar = aVar.a();
        } else {
            qVar = null;
        }
        if (qVar == null) {
            return null;
        }
        if (!l.a(qVar.f32658b, a0Var.f32529a.f32751b.f32658b) && !this.f13863a.f32705i) {
            return null;
        }
        w wVar = a0Var.f32529a;
        wVar.getClass();
        w.a aVar2 = new w.a(wVar);
        if (f.d(str)) {
            int i11 = a0Var.f32532d;
            z10 = (l.a(str, "PROPFIND") || i11 == 308 || i11 == 307) ? true : true;
            if ((true ^ l.a(str, "PROPFIND")) && i11 != 308 && i11 != 307) {
                str = "GET";
            } else if (z10) {
                zVar = a0Var.f32529a.f32754e;
            }
            aVar2.c(str, zVar);
            if (!z10) {
                aVar2.f32758c.d("Transfer-Encoding");
                aVar2.f32758c.d("Content-Length");
                aVar2.f32758c.d("Content-Type");
            }
        }
        if (!an.c.a(a0Var.f32529a.f32751b, qVar)) {
            aVar2.f32758c.d("Authorization");
        }
        aVar2.f32756a = qVar;
        return aVar2.a();
    }

    public final boolean c(IOException iOException, dn.e eVar, w wVar, boolean z10) {
        boolean z11;
        boolean z12;
        dn.l lVar;
        dn.h hVar;
        if (!this.f13863a.f32702f) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z10))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        dn.d dVar = eVar.f13219f;
        l.c(dVar);
        int i10 = dVar.f13206c;
        if (i10 == 0 && dVar.f13207d == 0 && dVar.f13208e == 0) {
            z12 = false;
        } else {
            if (dVar.f13209f == null) {
                d0 d0Var = null;
                if (i10 <= 1 && dVar.f13207d <= 1 && dVar.f13208e <= 0 && (hVar = dVar.f13212i.f13220g) != null) {
                    synchronized (hVar) {
                        if (hVar.f13250k == 0 && an.c.a(hVar.f13256q.f32574a.f32518a, dVar.f13211h.f32518a)) {
                            d0Var = hVar.f13256q;
                        }
                    }
                }
                if (d0Var != null) {
                    dVar.f13209f = d0Var;
                } else {
                    l.a aVar = dVar.f13204a;
                    if ((aVar == null || !aVar.a()) && (lVar = dVar.f13205b) != null) {
                        z12 = lVar.a();
                    }
                }
            }
            z12 = true;
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}
