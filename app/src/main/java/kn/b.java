package kn;

import gm.l;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a */
    public final LinkedHashMap f18630a;

    public b(X509Certificate... x509CertificateArr) {
        l.f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            l.e(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f18630a = linkedHashMap;
    }

    @Override // kn.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        boolean z10;
        Set set = (Set) this.f18630a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    z10 = true;
                    continue;
                } catch (Exception unused) {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && l.a(((b) obj).f18630a, this.f18630a));
    }

    public final int hashCode() {
        return this.f18630a.hashCode();
    }
}
