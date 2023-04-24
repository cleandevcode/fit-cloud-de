package zm;

import cn.sharesdk.framework.InnerShareParams;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a */
    public final a f32574a;

    /* renamed from: b */
    public final Proxy f32575b;

    /* renamed from: c */
    public final InetSocketAddress f32576c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        gm.l.f(aVar, InnerShareParams.ADDRESS);
        gm.l.f(inetSocketAddress, "socketAddress");
        this.f32574a = aVar;
        this.f32575b = proxy;
        this.f32576c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (gm.l.a(d0Var.f32574a, this.f32574a) && gm.l.a(d0Var.f32575b, this.f32575b) && gm.l.a(d0Var.f32576c, this.f32576c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32575b.hashCode();
        return this.f32576c.hashCode() + ((hashCode + ((this.f32574a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Route{");
        a10.append(this.f32576c);
        a10.append('}');
        return a10.toString();
    }
}
