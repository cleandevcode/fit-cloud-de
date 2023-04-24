package ec;

import android.support.v4.media.d;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            x509Certificate.getSubjectDN().getName();
            c.a(str, x509Certificate);
            return true;
        } catch (SSLException e10) {
            StringBuilder a10 = d.a("SSLException : ");
            a10.append(e10.getMessage());
            p.b.c("", a10.toString());
            return false;
        }
    }
}
