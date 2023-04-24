package in;

import java.util.List;
import javax.net.ssl.SSLSocket;
import zm.v;

/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a */
    public k f17222a;

    /* renamed from: b */
    public final a f17223b;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        this.f17223b = aVar;
    }

    @Override // in.k
    public final boolean a(SSLSocket sSLSocket) {
        return this.f17223b.a(sSLSocket);
    }

    @Override // in.k
    public final boolean b() {
        return true;
    }

    @Override // in.k
    public final String c(SSLSocket sSLSocket) {
        k kVar;
        synchronized (this) {
            if (this.f17222a == null && this.f17223b.a(sSLSocket)) {
                this.f17222a = this.f17223b.b(sSLSocket);
            }
            kVar = this.f17222a;
        }
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @Override // in.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        k kVar;
        gm.l.f(list, "protocols");
        synchronized (this) {
            if (this.f17222a == null && this.f17223b.a(sSLSocket)) {
                this.f17222a = this.f17223b.b(sSLSocket);
            }
            kVar = this.f17222a;
        }
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }
}
