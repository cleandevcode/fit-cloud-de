package in;

import in.j;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class e implements j.a {

    /* renamed from: a */
    public final /* synthetic */ String f17210a = "com.google.android.gms.org.conscrypt";

    @Override // in.j.a
    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return om.h.a0(name, this.f17210a + '.', false);
    }

    @Override // in.j.a
    public final k b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!gm.l.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
