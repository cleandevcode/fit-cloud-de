package dc;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends SSLSocketFactory {

    /* renamed from: c */
    public static final String f13003c = c.class.getSimpleName();

    /* renamed from: a */
    public SSLContext f13004a;

    /* renamed from: b */
    public String[] f13005b;

    public c(e eVar) {
        String str;
        this.f13004a = null;
        if (Build.VERSION.SDK_INT >= 29) {
            str = "TLSv1.3";
        } else {
            str = "TLSv1.2";
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        this.f13004a = sSLContext;
        sSLContext.init(null, new X509TrustManager[]{eVar}, null);
    }

    public static void a(Socket socket) {
        String str = f13003c;
        p.b.e(str, "set default protocols");
        a.b((SSLSocket) socket);
        p.b.e(str, "set default cipher suites");
        SSLSocket sSLSocket = (SSLSocket) socket;
        if (sSLSocket != null && !a.c(sSLSocket, a.f12996a)) {
            a.a(sSLSocket, a.f12997b);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) {
        p.b.e(f13003c, "createSocket: host , port");
        Socket createSocket = this.f13004a.getSocketFactory().createSocket(str, i10);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f13005b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        p.b.e(f13003c, "createSocket s host port autoClose");
        Socket createSocket = this.f13004a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f13005b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f13005b;
        return strArr != null ? strArr : new String[0];
    }
}
