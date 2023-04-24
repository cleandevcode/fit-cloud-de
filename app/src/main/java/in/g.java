package in;

import hn.k;
import in.j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import zm.v;

/* loaded from: classes2.dex */
public final class g implements k {

    /* renamed from: a */
    public static final a f17217a = new a();

    /* loaded from: classes2.dex */
    public static final class a implements j.a {
        @Override // in.j.a
        public final boolean a(SSLSocket sSLSocket) {
            hn.d.f16167f.getClass();
            if (hn.d.f16166e && (sSLSocket instanceof BCSSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // in.j.a
        public final k b(SSLSocket sSLSocket) {
            return new g();
        }
    }

    @Override // in.k
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // in.k
    public final boolean b() {
        hn.d.f16167f.getClass();
        return hn.d.f16166e;
    }

    @Override // in.k
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // in.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        gm.l.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            gm.l.e(parameters, "sslParameters");
            hn.k.f16188c.getClass();
            Object[] array = k.a.a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
