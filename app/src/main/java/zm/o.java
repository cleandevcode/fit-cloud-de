package zm;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import zm.e0;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: e */
    public static final a f32645e = new a();

    /* renamed from: a */
    public final tl.i f32646a;

    /* renamed from: b */
    public final e0 f32647b;

    /* renamed from: c */
    public final g f32648c;

    /* renamed from: d */
    public final List<Certificate> f32649d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: zm.o$a$a */
        /* loaded from: classes2.dex */
        public static final class C0625a extends gm.m implements fm.a<List<? extends Certificate>> {

            /* renamed from: b */
            public final /* synthetic */ List f32650b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0625a(List list) {
                super(0);
                this.f32650b = list;
            }

            @Override // fm.a
            public final List<? extends Certificate> m() {
                return this.f32650b;
            }
        }

        public static o a(SSLSession sSLSession) {
            List list;
            List list2;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? !cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : !(hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL"))) {
                    g b10 = g.f32606t.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!gm.l.a("NONE", protocol)) {
                            e0 a10 = e0.a.a(protocol);
                            try {
                                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                                if (peerCertificates != null) {
                                    list = an.c.j((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length));
                                } else {
                                    list = ul.s.f28879a;
                                }
                            } catch (SSLPeerUnverifiedException unused) {
                                list = ul.s.f28879a;
                            }
                            Certificate[] localCertificates = sSLSession.getLocalCertificates();
                            if (localCertificates != null) {
                                list2 = an.c.j((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
                            } else {
                                list2 = ul.s.f28879a;
                            }
                            return new o(a10, b10, list2, new C0625a(list));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException(a.b.b("cipherSuite == ", cipherSuite));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<List<? extends Certificate>> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f32651b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fm.a aVar) {
            super(0);
            this.f32651b = aVar;
        }

        @Override // fm.a
        public final List<? extends Certificate> m() {
            try {
                return (List) this.f32651b.m();
            } catch (SSLPeerUnverifiedException unused) {
                return ul.s.f28879a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(e0 e0Var, g gVar, List<? extends Certificate> list, fm.a<? extends List<? extends Certificate>> aVar) {
        gm.l.f(e0Var, "tlsVersion");
        gm.l.f(gVar, "cipherSuite");
        gm.l.f(list, "localCertificates");
        this.f32647b = e0Var;
        this.f32648c = gVar;
        this.f32649d = list;
        this.f32646a = new tl.i(new b(aVar));
    }

    public final List<Certificate> a() {
        return (List) this.f32646a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f32647b == this.f32647b && gm.l.a(oVar.f32648c, this.f32648c) && gm.l.a(oVar.a(), a()) && gm.l.a(oVar.f32649d, this.f32649d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32648c.hashCode();
        int hashCode2 = a().hashCode();
        return this.f32649d.hashCode() + ((hashCode2 + ((hashCode + ((this.f32647b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(ul.l.B(a10, 10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                gm.l.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder a11 = p.a.a("Handshake{", "tlsVersion=");
        a11.append(this.f32647b);
        a11.append(' ');
        a11.append("cipherSuite=");
        a11.append(this.f32648c);
        a11.append(' ');
        a11.append("peerCertificates=");
        a11.append(obj);
        a11.append(' ');
        a11.append("localCertificates=");
        List<Certificate> list = this.f32649d;
        ArrayList arrayList2 = new ArrayList(ul.l.B(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                gm.l.e(type, "type");
            }
            arrayList2.add(type);
        }
        a11.append(arrayList2);
        a11.append('}');
        return a11.toString();
    }
}
