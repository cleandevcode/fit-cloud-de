package in;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import hn.k;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import zm.v;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: a */
    public static final C0303a f17204a = new C0303a();

    /* renamed from: in.a$a */
    /* loaded from: classes2.dex */
    public static final class C0303a {
    }

    @Override // in.k
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // in.k
    public final boolean b() {
        f17204a.getClass();
        hn.k.f16188c.getClass();
        return k.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // in.k
    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // in.k
    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        gm.l.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            gm.l.e(sSLParameters, "sslParameters");
            hn.k.f16188c.getClass();
            Object[] array = k.a.a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
