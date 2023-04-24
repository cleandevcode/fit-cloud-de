package dc;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import s.h1;

@Deprecated
/* loaded from: classes.dex */
public final class b extends SSLSocketFactory {

    /* renamed from: d */
    public static final String f12998d;

    /* renamed from: e */
    public static volatile b f12999e;

    /* renamed from: a */
    public SSLContext f13000a;

    /* renamed from: b */
    public Context f13001b;

    /* renamed from: c */
    public String[] f13002c;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        f12998d = b.class.getSimpleName();
        f12999e = null;
    }

    public b(Context context) {
        String str;
        this.f13000a = null;
        if (context == null) {
            p.b.c(f12998d, "SecureSSLSocketFactory: context is null");
            return;
        }
        this.f13001b = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 29) {
            str = "TLSv1.3";
        } else {
            str = "TLSv1.2";
        }
        this.f13000a = SSLContext.getInstance(str);
        System.currentTimeMillis();
        if (h1.f25978c == null) {
            h1.f25978c = context.getApplicationContext();
        }
        if (d.f13006a == null) {
            synchronized (d.class) {
                if (d.f13006a == null) {
                    InputStream j10 = fc.a.j(context);
                    if (j10 == null) {
                        p.b.e("SecureX509SingleInstance", "get assets bks");
                        j10 = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        p.b.e("SecureX509SingleInstance", "get files bks");
                    }
                    d.f13006a = new e(j10);
                    new fc.b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                }
            }
        }
        System.currentTimeMillis();
        this.f13000a.init(null, new X509TrustManager[]{d.f13006a}, null);
    }

    public static void a(Socket socket) {
        String str = f12998d;
        p.b.e(str, "set default protocols");
        a.b((SSLSocket) socket);
        p.b.e(str, "set default cipher suites");
        SSLSocket sSLSocket = (SSLSocket) socket;
        if (sSLSocket != null && !a.c(sSLSocket, a.f12996a)) {
            a.a(sSLSocket, a.f12997b);
        }
    }

    public static b b(Context context) {
        System.currentTimeMillis();
        if (context != null && h1.f25978c == null) {
            h1.f25978c = context.getApplicationContext();
        }
        if (f12999e == null) {
            synchronized (b.class) {
                if (f12999e == null) {
                    f12999e = new b(context);
                }
            }
        }
        if (f12999e.f13001b == null && context != null) {
            b bVar = f12999e;
            bVar.getClass();
            bVar.f13001b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return f12999e;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) {
        p.b.e(f12998d, "createSocket: host , port");
        Socket createSocket = this.f13000a.getSocketFactory().createSocket(str, i10);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f13002c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
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
        p.b.e(f12998d, "createSocket s host port autoClose");
        Socket createSocket = this.f13000a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f13002c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f13002c;
        return strArr != null ? strArr : new String[0];
    }
}
