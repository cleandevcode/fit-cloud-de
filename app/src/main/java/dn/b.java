package dn;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import zm.g;
import zm.h;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public int f13183a;

    /* renamed from: b */
    public boolean f13184b;

    /* renamed from: c */
    public boolean f13185c;

    /* renamed from: d */
    public final List<zm.h> f13186d;

    public b(List<zm.h> list) {
        gm.l.f(list, "connectionSpecs");
        this.f13186d = list;
    }

    public final zm.h a(SSLSocket sSLSocket) {
        zm.h hVar;
        boolean z10;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        boolean z11;
        int i10 = this.f13183a;
        int size = this.f13186d.size();
        while (true) {
            if (i10 < size) {
                hVar = this.f13186d.get(i10);
                if (hVar.b(sSLSocket)) {
                    this.f13183a = i10 + 1;
                    break;
                }
                i10++;
            } else {
                hVar = null;
                break;
            }
        }
        if (hVar != null) {
            int i11 = this.f13183a;
            int size2 = this.f13186d.size();
            while (true) {
                if (i11 < size2) {
                    if (this.f13186d.get(i11).b(sSLSocket)) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.f13184b = z10;
            boolean z12 = this.f13185c;
            if (hVar.f32612c != null) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                gm.l.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
                String[] strArr = hVar.f32612c;
                zm.g.f32606t.getClass();
                enabledCipherSuites = an.c.n(enabledCipherSuites2, strArr, zm.g.f32588b);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            if (hVar.f32613d != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                gm.l.e(enabledProtocols2, "sslSocket.enabledProtocols");
                enabledProtocols = an.c.n(enabledProtocols2, hVar.f32613d, wl.a.f30022a);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            gm.l.e(supportedCipherSuites, "supportedCipherSuites");
            zm.g.f32606t.getClass();
            g.a aVar = zm.g.f32588b;
            byte[] bArr = an.c.f635a;
            gm.l.f(aVar, "comparator");
            int length = supportedCipherSuites.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (aVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (z12 && i12 != -1) {
                gm.l.e(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i12];
                gm.l.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                gm.l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                enabledCipherSuites = (String[]) copyOf;
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            h.a aVar2 = new h.a(hVar);
            gm.l.e(enabledCipherSuites, "cipherSuitesIntersection");
            aVar2.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            gm.l.e(enabledProtocols, "tlsVersionsIntersection");
            aVar2.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            zm.h a10 = aVar2.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f32613d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f32612c);
            }
            return hVar;
        }
        StringBuilder a11 = android.support.v4.media.d.a("Unable to find acceptable protocols. isFallback=");
        a11.append(this.f13185c);
        a11.append(',');
        a11.append(" modes=");
        a11.append(this.f13186d);
        a11.append(',');
        a11.append(" supported protocols=");
        String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
        gm.l.c(enabledProtocols3);
        String arrays = Arrays.toString(enabledProtocols3);
        gm.l.e(arrays, "java.util.Arrays.toString(this)");
        a11.append(arrays);
        throw new UnknownServiceException(a11.toString());
    }
}
