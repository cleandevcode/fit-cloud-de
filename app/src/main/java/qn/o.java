package qn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* loaded from: classes2.dex */
public class o implements l {

    /* renamed from: f */
    public static final String f25118f;

    /* renamed from: g */
    public static final un.b f25119g;

    /* renamed from: h */
    public static /* synthetic */ Class f25120h;

    /* renamed from: a */
    public Socket f25121a;

    /* renamed from: b */
    public SocketFactory f25122b;

    /* renamed from: c */
    public String f25123c;

    /* renamed from: d */
    public int f25124d;

    /* renamed from: e */
    public int f25125e;

    static {
        Class<o> cls = f25120h;
        if (cls == null) {
            cls = o.class;
            f25120h = cls;
        }
        String name = cls.getName();
        f25118f = name;
        f25119g = un.c.a(name);
    }

    public o(SocketFactory socketFactory, String str, int i10, String str2) {
        f25119g.d(str2);
        this.f25122b = socketFactory;
        this.f25123c = str;
        this.f25124d = i10;
    }

    @Override // qn.l
    public String a() {
        StringBuffer stringBuffer = new StringBuffer("tcp://");
        stringBuffer.append(this.f25123c);
        stringBuffer.append(":");
        stringBuffer.append(this.f25124d);
        return stringBuffer.toString();
    }

    @Override // qn.l
    public OutputStream b() {
        return this.f25121a.getOutputStream();
    }

    @Override // qn.l
    public InputStream getInputStream() {
        return this.f25121a.getInputStream();
    }

    @Override // qn.l
    public void start() {
        try {
            f25119g.g(f25118f, "start", "252", new Object[]{this.f25123c, new Integer(this.f25124d), new Long(this.f25125e * 1000)});
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f25123c, this.f25124d);
            Socket createSocket = this.f25122b.createSocket();
            this.f25121a = createSocket;
            createSocket.connect(inetSocketAddress, this.f25125e * 1000);
        } catch (ConnectException e10) {
            f25119g.e(f25118f, "start", "250", null, e10);
            throw new pn.n(32103, e10);
        }
    }

    @Override // qn.l
    public void stop() {
        Socket socket = this.f25121a;
        if (socket != null) {
            socket.close();
        }
    }
}
