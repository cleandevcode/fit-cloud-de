package kn;

import androidx.fragment.app.a0;
import gm.l;

/* loaded from: classes2.dex */
public final class a extends a0 {

    /* renamed from: a */
    public final d f18629a;

    public a(d dVar) {
        l.f(dVar, "trustRootIndex");
        this.f18629a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && l.a(((a) obj).f18629a, this.f18629a);
    }

    public final int hashCode() {
        return this.f18629a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006b  */
    @Override // androidx.fragment.app.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List r(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = "chain"
            gm.l.f(r11, r0)
            java.lang.String r0 = "hostname"
            gm.l.f(r10, r0)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r0 = r10.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            gm.l.e(r0, r1)
            r11.add(r0)
            r0 = 0
            r1 = 0
        L22:
            r2 = 9
            if (r0 >= r2) goto Ld0
            int r2 = r11.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            if (r2 == 0) goto Lca
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            kn.d r5 = r9.f18629a
            java.security.cert.X509Certificate r5 = r5.a(r2)
            if (r5 == 0) goto L6d
            int r1 = r11.size()
            if (r1 > r3) goto L4b
            boolean r1 = gm.l.a(r2, r5)
            r1 = r1 ^ r3
            if (r1 == 0) goto L4e
        L4b:
            r11.add(r5)
        L4e:
            java.security.Principal r1 = r5.getIssuerDN()
            java.security.Principal r2 = r5.getSubjectDN()
            boolean r1 = gm.l.a(r1, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L5e
            goto L67
        L5e:
            java.security.PublicKey r1 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L67
            r5.verify(r1)     // Catch: java.security.GeneralSecurityException -> L67
            r1 = 1
            goto L68
        L67:
            r1 = 0
        L68:
            if (r1 == 0) goto L6b
            return r11
        L6b:
            r1 = 1
            goto La6
        L6d:
            java.util.Iterator r5 = r10.iterator()
            java.lang.String r6 = "queue.iterator()"
            gm.l.e(r5, r6)
        L76:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r5.next()
            if (r6 == 0) goto Laa
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r2.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = gm.l.a(r7, r8)
            r7 = r7 ^ r3
            if (r7 == 0) goto L94
            goto L9d
        L94:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L9d
            r2.verify(r7)     // Catch: java.security.GeneralSecurityException -> L9d
            r7 = 1
            goto L9e
        L9d:
            r7 = 0
        L9e:
            if (r7 == 0) goto L76
            r5.remove()
            r11.add(r6)
        La6:
            int r0 = r0 + 1
            goto L22
        Laa:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        Lb0:
            if (r1 == 0) goto Lb3
            return r11
        Lb3:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lca:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        Ld0:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = "Certificate chain too long: "
            java.lang.String r11 = androidx.appcompat.widget.t2.a(r0, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kn.a.r(java.lang.String, java.util.List):java.util.List");
    }
}
