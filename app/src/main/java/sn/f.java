package sn;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import javax.net.SocketFactory;
import qn.o;

/* loaded from: classes2.dex */
public class f extends o {

    /* renamed from: o */
    public static final un.b f27375o;

    /* renamed from: p */
    public static /* synthetic */ Class f27376p;

    /* renamed from: i */
    public String f27377i;

    /* renamed from: j */
    public String f27378j;

    /* renamed from: k */
    public int f27379k;

    /* renamed from: l */
    public PipedInputStream f27380l;

    /* renamed from: m */
    public g f27381m;

    /* renamed from: n */
    public e f27382n;

    static {
        Class<f> cls = f27376p;
        if (cls == null) {
            cls = f.class;
            f27376p = cls;
        }
        f27375o = un.c.a(cls.getName());
    }

    public f(SocketFactory socketFactory, String str, String str2, int i10, String str3) {
        super(socketFactory, str2, i10, str3);
        this.f27382n = new e(this);
        this.f27377i = str;
        this.f27378j = str2;
        this.f27379k = i10;
        this.f27380l = new PipedInputStream();
        f27375o.d(str3);
    }

    public static OutputStream c(f fVar) {
        return super.b();
    }

    @Override // qn.o, qn.l
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("ws://");
        stringBuffer.append(this.f27378j);
        stringBuffer.append(":");
        stringBuffer.append(this.f27379k);
        return stringBuffer.toString();
    }

    @Override // qn.o, qn.l
    public final OutputStream b() {
        return this.f27382n;
    }

    @Override // qn.o, qn.l
    public final InputStream getInputStream() {
        return this.f27380l;
    }

    @Override // qn.o, qn.l
    public final void start() {
        super.start();
        new d(super.getInputStream(), super.b(), this.f27377i, this.f27378j, this.f27379k).a();
        g gVar = new g(super.getInputStream(), this.f27380l);
        this.f27381m = gVar;
        gVar.a("webSocketReceiver");
    }

    @Override // qn.o, qn.l
    public final void stop() {
        super.b().write(new c((byte) 8, "1000".getBytes()).a());
        super.b().flush();
        g gVar = this.f27381m;
        if (gVar != null) {
            gVar.b();
        }
        super.stop();
    }
}
