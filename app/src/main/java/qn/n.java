package qn;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class n extends o {

    /* renamed from: m */
    public static final String f25111m;

    /* renamed from: n */
    public static final un.b f25112n;

    /* renamed from: o */
    public static /* synthetic */ Class f25113o;

    /* renamed from: i */
    public String[] f25114i;

    /* renamed from: j */
    public int f25115j;

    /* renamed from: k */
    public String f25116k;

    /* renamed from: l */
    public int f25117l;

    static {
        Class<n> cls = f25113o;
        if (cls == null) {
            cls = n.class;
            f25113o = cls;
        }
        String name = cls.getName();
        f25111m = name;
        f25112n = un.c.a(name);
    }

    public n(SSLSocketFactory sSLSocketFactory, String str, int i10, String str2) {
        super(sSLSocketFactory, str, i10, str2);
        this.f25116k = str;
        this.f25117l = i10;
        f25112n.d(str2);
    }

    @Override // qn.o, qn.l
    public String a() {
        StringBuffer stringBuffer = new StringBuffer("ssl://");
        stringBuffer.append(this.f25116k);
        stringBuffer.append(":");
        stringBuffer.append(this.f25117l);
        return stringBuffer.toString();
    }

    public final void c(String[] strArr) {
        this.f25114i = strArr;
        if (this.f25121a == null || strArr == null) {
            return;
        }
        if (f25112n.f()) {
            String str = "";
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
                    stringBuffer.append(",");
                    str = stringBuffer.toString();
                }
                StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(str));
                stringBuffer2.append(strArr[i10]);
                str = stringBuffer2.toString();
            }
            f25112n.g(f25111m, "setEnabledCiphers", "260", new Object[]{str});
        }
        ((SSLSocket) this.f25121a).setEnabledCipherSuites(strArr);
    }

    @Override // qn.o, qn.l
    public void start() {
        super.start();
        c(this.f25114i);
        int soTimeout = this.f25121a.getSoTimeout();
        if (soTimeout == 0) {
            this.f25121a.setSoTimeout(this.f25115j * 1000);
        }
        ((SSLSocket) this.f25121a).startHandshake();
        this.f25121a.setSoTimeout(soTimeout);
    }
}
