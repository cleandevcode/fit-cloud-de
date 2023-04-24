package sn;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import javax.net.ssl.SSLSocketFactory;
import qn.n;

/* loaded from: classes2.dex */
public class i extends n {

    /* renamed from: v */
    public static final un.b f27393v;

    /* renamed from: w */
    public static /* synthetic */ Class f27394w;

    /* renamed from: p */
    public PipedInputStream f27395p;

    /* renamed from: q */
    public g f27396q;

    /* renamed from: r */
    public String f27397r;

    /* renamed from: s */
    public String f27398s;

    /* renamed from: t */
    public int f27399t;

    /* renamed from: u */
    public h f27400u;

    static {
        Class<i> cls = f27394w;
        if (cls == null) {
            cls = i.class;
            f27394w = cls;
        }
        f27393v = un.c.a(cls.getName());
    }

    public i(SSLSocketFactory sSLSocketFactory, String str, String str2, int i10, String str3) {
        super(sSLSocketFactory, str2, i10, str3);
        this.f27400u = new h(this);
        this.f27397r = str;
        this.f27398s = str2;
        this.f27399t = i10;
        this.f27395p = new PipedInputStream();
        f27393v.d(str3);
    }

    public static OutputStream d(i iVar) {
        return super.b();
    }

    @Override // qn.n, qn.o, qn.l
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("wss://");
        stringBuffer.append(this.f27398s);
        stringBuffer.append(":");
        stringBuffer.append(this.f27399t);
        return stringBuffer.toString();
    }

    @Override // qn.o, qn.l
    public final OutputStream b() {
        return this.f27400u;
    }

    @Override // qn.o, qn.l
    public final InputStream getInputStream() {
        return this.f27395p;
    }

    @Override // qn.n, qn.o, qn.l
    public final void start() {
        super.start();
        new d(super.getInputStream(), super.b(), this.f27397r, this.f27398s, this.f27399t).a();
        g gVar = new g(super.getInputStream(), this.f27395p);
        this.f27396q = gVar;
        gVar.a("WssSocketReceiver");
    }

    @Override // qn.o, qn.l
    public final void stop() {
        super.b().write(new c((byte) 8, "1000".getBytes()).a());
        super.b().flush();
        g gVar = this.f27396q;
        if (gVar != null) {
            gVar.b();
        }
        super.stop();
    }
}
