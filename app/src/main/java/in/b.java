package in;

import android.net.http.X509TrustManagerExtensions;
import androidx.fragment.app.a0;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class b extends a0 {

    /* renamed from: a */
    public final X509TrustManager f17205a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f17206b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f17205a = x509TrustManager;
        this.f17206b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f17205a == this.f17205a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f17205a);
    }

    @Override // androidx.fragment.app.a0
    public final List r(String str, List list) {
        gm.l.f(list, "chain");
        gm.l.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f17206b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                gm.l.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
