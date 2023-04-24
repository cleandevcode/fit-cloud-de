package tn;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public class g extends OutputStream {

    /* renamed from: c */
    public static final String f28397c;

    /* renamed from: d */
    public static final un.b f28398d;

    /* renamed from: e */
    public static /* synthetic */ Class f28399e;

    /* renamed from: a */
    public qn.b f28400a;

    /* renamed from: b */
    public BufferedOutputStream f28401b;

    static {
        Class<?> cls = f28399e;
        if (cls == null) {
            try {
                cls = Class.forName("tn.g");
                f28399e = cls;
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        }
        String name = cls.getName();
        f28397c = name;
        f28398d = un.c.a(name);
    }

    public g(qn.b bVar, OutputStream outputStream) {
        this.f28400a = bVar;
        this.f28401b = new BufferedOutputStream(outputStream);
    }

    public final void a(u uVar) {
        byte[] l10 = uVar.l();
        byte[] o10 = uVar.o();
        this.f28401b.write(l10, 0, l10.length);
        this.f28400a.u(l10.length);
        int i10 = 0;
        while (i10 < o10.length) {
            int min = Math.min((int) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, o10.length - i10);
            this.f28401b.write(o10, i10, min);
            i10 += DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            this.f28400a.u(min);
        }
        f28398d.g(f28397c, "write", "500", new Object[]{uVar});
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28401b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f28401b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f28401b.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f28401b.write(bArr);
        this.f28400a.u(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f28401b.write(bArr, i10, i11);
        this.f28400a.u(i11);
    }
}
