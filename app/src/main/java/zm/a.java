package zm;

import androidx.appcompat.widget.u0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import zm.q;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final q f32518a;

    /* renamed from: b */
    public final List<v> f32519b;

    /* renamed from: c */
    public final List<h> f32520c;

    /* renamed from: d */
    public final l f32521d;

    /* renamed from: e */
    public final SocketFactory f32522e;

    /* renamed from: f */
    public final SSLSocketFactory f32523f;

    /* renamed from: g */
    public final HostnameVerifier f32524g;

    /* renamed from: h */
    public final f f32525h;

    /* renamed from: i */
    public final b f32526i;

    /* renamed from: j */
    public final Proxy f32527j;

    /* renamed from: k */
    public final ProxySelector f32528k;

    public a(String str, int i10, l lVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, List list, List list2, ProxySelector proxySelector) {
        gm.l.f(str, "uriHost");
        gm.l.f(lVar, "dns");
        gm.l.f(socketFactory, "socketFactory");
        gm.l.f(bVar, "proxyAuthenticator");
        gm.l.f(list, "protocols");
        gm.l.f(list2, "connectionSpecs");
        gm.l.f(proxySelector, "proxySelector");
        this.f32521d = lVar;
        this.f32522e = socketFactory;
        this.f32523f = sSLSocketFactory;
        this.f32524g = hostnameVerifier;
        this.f32525h = fVar;
        this.f32526i = bVar;
        this.f32527j = null;
        this.f32528k = proxySelector;
        q.a aVar = new q.a();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? "https" : "http";
        boolean z10 = true;
        if (om.h.V(str3, "http")) {
            str2 = "http";
        } else if (!om.h.V(str3, "https")) {
            throw new IllegalArgumentException(a.b.b("unexpected scheme: ", str3));
        }
        aVar.f32667a = str2;
        String g10 = gm.f.g(q.b.d(q.f32656l, str, 0, 0, false, 7));
        if (g10 == null) {
            throw new IllegalArgumentException(a.b.b("unexpected host: ", str));
        }
        aVar.f32670d = g10;
        if ((1 > i10 || 65535 < i10) ? false : false) {
            aVar.f32671e = i10;
            this.f32518a = aVar.a();
            this.f32519b = an.c.t(list);
            this.f32520c = an.c.t(list2);
            return;
        }
        throw new IllegalArgumentException(u0.a("unexpected port: ", i10).toString());
    }

    public final boolean a(a aVar) {
        gm.l.f(aVar, "that");
        if (gm.l.a(this.f32521d, aVar.f32521d) && gm.l.a(this.f32526i, aVar.f32526i) && gm.l.a(this.f32519b, aVar.f32519b) && gm.l.a(this.f32520c, aVar.f32520c) && gm.l.a(this.f32528k, aVar.f32528k) && gm.l.a(this.f32527j, aVar.f32527j) && gm.l.a(this.f32523f, aVar.f32523f) && gm.l.a(this.f32524g, aVar.f32524g) && gm.l.a(this.f32525h, aVar.f32525h) && this.f32518a.f32662f == aVar.f32518a.f32662f) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (gm.l.a(this.f32518a, aVar.f32518a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32521d.hashCode();
        int hashCode2 = this.f32526i.hashCode();
        int hashCode3 = this.f32519b.hashCode();
        int hashCode4 = this.f32520c.hashCode();
        int hashCode5 = this.f32528k.hashCode();
        int hashCode6 = Objects.hashCode(this.f32527j);
        int hashCode7 = Objects.hashCode(this.f32523f);
        int hashCode8 = Objects.hashCode(this.f32524g);
        return Objects.hashCode(this.f32525h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f32518a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10;
        Object obj;
        StringBuilder a11 = android.support.v4.media.d.a("Address{");
        a11.append(this.f32518a.f32661e);
        a11.append(':');
        a11.append(this.f32518a.f32662f);
        a11.append(", ");
        if (this.f32527j != null) {
            a10 = android.support.v4.media.d.a("proxy=");
            obj = this.f32527j;
        } else {
            a10 = android.support.v4.media.d.a("proxySelector=");
            obj = this.f32528k;
        }
        a10.append(obj);
        a11.append(a10.toString());
        a11.append("}");
        return a11.toString();
    }
}
