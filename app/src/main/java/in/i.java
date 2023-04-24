package in;

import hn.e;
import hn.k;
import in.j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import zm.v;

/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a */
    public static final a f17221a = new a();

    /* loaded from: classes2.dex */
    public static final class a implements j.a {
        @Override // in.j.a
        public final boolean a(SSLSocket sSLSocket) {
            hn.e.f16170f.getClass();
            return e.a.b() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // in.j.a
        public final k b(SSLSocket sSLSocket) {
            return new i();
        }
    }

    @Override // in.k
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // in.k
    public final boolean b() {
        hn.e.f16170f.getClass();
        return hn.e.f16169e;
    }

    @Override // in.k
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // in.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        gm.l.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            hn.k.f16188c.getClass();
            Object[] array = k.a.a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
