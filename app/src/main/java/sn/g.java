package sn;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* loaded from: classes2.dex */
public class g implements Runnable {

    /* renamed from: g */
    public static final String f27383g;

    /* renamed from: h */
    public static final un.b f27384h;

    /* renamed from: i */
    public static /* synthetic */ Class f27385i;

    /* renamed from: d */
    public InputStream f27389d;

    /* renamed from: f */
    public PipedOutputStream f27391f;

    /* renamed from: a */
    public boolean f27386a = false;

    /* renamed from: b */
    public boolean f27387b = false;

    /* renamed from: c */
    public Object f27388c = new Object();

    /* renamed from: e */
    public Thread f27390e = null;

    static {
        Class<?> cls = f27385i;
        if (cls == null) {
            try {
                cls = Class.forName("sn.g");
                f27385i = cls;
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        }
        String name = cls.getName();
        f27383g = name;
        f27384h = un.c.a(name);
    }

    public g(InputStream inputStream, PipedInputStream pipedInputStream) {
        this.f27389d = inputStream;
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.f27391f = pipedOutputStream;
        pipedInputStream.connect(pipedOutputStream);
    }

    public final void a(String str) {
        f27384h.c(f27383g, "start", "855");
        synchronized (this.f27388c) {
            if (!this.f27386a) {
                this.f27386a = true;
                Thread thread = new Thread(this, str);
                this.f27390e = thread;
                thread.start();
            }
        }
    }

    public final void b() {
        this.f27387b = true;
        synchronized (this.f27388c) {
            f27384h.c(f27383g, "stop", "850");
            if (this.f27386a) {
                this.f27386a = false;
                try {
                    this.f27391f.close();
                } catch (IOException unused) {
                }
                if (!Thread.currentThread().equals(this.f27390e)) {
                    try {
                        this.f27390e.join();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
        this.f27390e = null;
        f27384h.c(f27383g, "stop", "851");
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f27386a && this.f27389d != null) {
            try {
                f27384h.c(f27383g, "run", "852");
                this.f27389d.available();
                c cVar = new c(this.f27389d);
                if (!cVar.f27368d) {
                    int i10 = 0;
                    while (true) {
                        byte[] bArr = cVar.f27367c;
                        if (i10 >= bArr.length) {
                            break;
                        }
                        this.f27391f.write(bArr[i10]);
                        i10++;
                    }
                    this.f27391f.flush();
                } else if (!this.f27387b) {
                    throw new IOException("Server sent a WebSocket Frame with the Stop OpCode");
                    break;
                }
            } catch (IOException unused) {
                b();
            }
        }
    }
}
