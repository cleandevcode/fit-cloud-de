package tn;

import bi.m0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class f extends InputStream {

    /* renamed from: c */
    public static final String f28392c;

    /* renamed from: d */
    public static final un.b f28393d;

    /* renamed from: e */
    public static /* synthetic */ Class f28394e;

    /* renamed from: a */
    public qn.b f28395a;

    /* renamed from: b */
    public DataInputStream f28396b;

    static {
        Class<?> cls = f28394e;
        if (cls == null) {
            try {
                cls = Class.forName("tn.f");
                f28394e = cls;
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        }
        String name = cls.getName();
        f28392c = name;
        f28393d = un.c.a(name);
    }

    public f(qn.b bVar, InputStream inputStream) {
        this.f28395a = bVar;
        this.f28396b = new DataInputStream(inputStream);
    }

    public final u a() {
        byte readByte;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte readByte2 = this.f28396b.readByte();
        this.f28395a.q(1);
        byte b10 = (byte) ((readByte2 >>> 4) & 15);
        if (b10 >= 1 && b10 <= 14) {
            DataInputStream dataInputStream = this.f28396b;
            long j10 = 0;
            int i10 = 1;
            do {
                readByte = dataInputStream.readByte();
                j10 += (readByte & Byte.MAX_VALUE) * i10;
                i10 *= 128;
            } while ((readByte & 128) != 0);
            byteArrayOutputStream.write(readByte2);
            byteArrayOutputStream.write(u.i(j10));
            int size = (int) (byteArrayOutputStream.size() + j10);
            byte[] bArr = new byte[size];
            int size2 = byteArrayOutputStream.size();
            int size3 = size - byteArrayOutputStream.size();
            if (size3 >= 0) {
                int i11 = 0;
                while (i11 < size3) {
                    int read = this.f28396b.read(bArr, size2 + i11, size3 - i11);
                    this.f28395a.q(read);
                    if (read >= 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
                u g10 = u.g(new ByteArrayInputStream(bArr));
                f28393d.g(f28392c, "readMqttWireMessage", "501", new Object[]{g10});
                return g10;
            }
            throw new IndexOutOfBoundsException();
        }
        throw m0.h(32108);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f28396b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28396b.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f28396b.read();
    }
}
