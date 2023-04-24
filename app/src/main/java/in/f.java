package in;

import hn.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import zm.v;

/* loaded from: classes2.dex */
public class f implements k {

    /* renamed from: f */
    public static final e f17211f = new e();

    /* renamed from: a */
    public final Method f17212a;

    /* renamed from: b */
    public final Method f17213b;

    /* renamed from: c */
    public final Method f17214c;

    /* renamed from: d */
    public final Method f17215d;

    /* renamed from: e */
    public final Class<? super SSLSocket> f17216e;

    public f(Class<? super SSLSocket> cls) {
        this.f17216e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        gm.l.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f17212a = declaredMethod;
        this.f17213b = cls.getMethod("setHostname", String.class);
        this.f17214c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f17215d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // in.k
    public final boolean a(SSLSocket sSLSocket) {
        return this.f17216e.isInstance(sSLSocket);
    }

    @Override // in.k
    public final boolean b() {
        hn.c.f16161g.getClass();
        return hn.c.f16160f;
    }

    @Override // in.k
    public final String c(SSLSocket sSLSocket) {
        if (!this.f17216e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f17214c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            gm.l.e(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (NullPointerException e11) {
            if (gm.l.a(e11.getMessage(), "ssl == null")) {
                return null;
            }
            throw e11;
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override // in.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        gm.l.f(list, "protocols");
        if (this.f17216e.isInstance(sSLSocket)) {
            try {
                this.f17212a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f17213b.invoke(sSLSocket, str);
                }
                Method method = this.f17215d;
                hn.k.f16188c.getClass();
                method.invoke(sSLSocket, k.a.b(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
