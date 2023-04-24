package hn;

import gm.l;
import hn.k;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import zm.v;

/* loaded from: classes2.dex */
public final class i extends k {

    /* renamed from: d */
    public static final boolean f16181d;

    /* renamed from: e */
    public static final a f16182e = new a();

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001f, code lost:
        if (r0.intValue() >= 9) goto L9;
     */
    static {
        /*
            hn.i$a r0 = new hn.i$a
            r0.<init>()
            hn.i.f16182e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r0 = om.g.S(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L22
            goto L2d
        L22:
            r1 = 0
            goto L2d
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L22
        L2d:
            hn.i.f16181d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.i.<clinit>():void");
    }

    @Override // hn.k
    public final void d(SSLSocket sSLSocket, String str, List<v> list) {
        l.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        k.f16188c.getClass();
        ArrayList a10 = k.a.a(list);
        l.e(sSLParameters, "sslParameters");
        Object[] array = a10.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // hn.k
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (!applicationProtocol.equals("")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
