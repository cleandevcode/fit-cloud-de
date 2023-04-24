package dc;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import yb.y;

/* loaded from: classes.dex */
public final class e implements X509TrustManager {

    /* renamed from: b */
    public static final String f13007b = e.class.getSimpleName();

    /* renamed from: a */
    public ArrayList f13008a = new ArrayList();

    public e(InputStream inputStream) {
        if (inputStream != null) {
            System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, "".toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.f13008a.add((X509TrustManager) trustManager);
                        }
                    }
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
                    p.b.c(f13007b, "loadInputStream: exception : " + e10.getMessage());
                }
                y.g(inputStream);
                System.currentTimeMillis();
                return;
            } catch (Throwable th2) {
                y.g(inputStream);
                throw th2;
            }
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        p.b.e(f13007b, "checkClientTrusted: ");
        Iterator it = this.f13008a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e10) {
                String str2 = f13007b;
                StringBuilder a10 = android.support.v4.media.d.a("checkServerTrusted CertificateException");
                a10.append(e10.getMessage());
                p.b.c(str2, a10.toString());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        String str2 = f13007b;
        StringBuilder a10 = android.support.v4.media.d.a("checkServerTrusted begin ,server ca chain size is : ");
        a10.append(x509CertificateArr.length);
        a10.append(" ,auth type is : ");
        a10.append(str);
        p.b.e(str2, a10.toString());
        System.currentTimeMillis();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Objects.toString(x509Certificate.getSubjectDN());
            Objects.toString(x509Certificate.getIssuerDN());
            Objects.toString(x509Certificate.getSerialNumber());
        }
        int size = this.f13008a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                String str3 = f13007b;
                p.b.e(str3, "check server i : " + i10);
                X509TrustManager x509TrustManager = (X509TrustManager) this.f13008a.get(i10);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    p.b.e(str3, "client root ca size is : " + acceptedIssuers.length);
                    for (X509Certificate x509Certificate2 : acceptedIssuers) {
                        Objects.toString(x509Certificate2.getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                p.b.e(f13007b, "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e10) {
                String str4 = f13007b;
                StringBuilder a11 = android.support.v4.media.d.a("checkServerTrusted error :");
                a11.append(e10.getMessage());
                a11.append(" , time : ");
                a11.append(i10);
                p.b.c(str4, a11.toString());
                if (i10 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        StringBuilder a12 = android.support.v4.media.d.a("root ca issuer : ");
                        a12.append(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                        p.b.c(str4, a12.toString());
                    }
                    throw e10;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f13008a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e10) {
            String str = f13007b;
            StringBuilder a10 = android.support.v4.media.d.a("getAcceptedIssuers exception : ");
            a10.append(e10.getMessage());
            p.b.c(str, a10.toString());
            return new X509Certificate[0];
        }
    }
}
