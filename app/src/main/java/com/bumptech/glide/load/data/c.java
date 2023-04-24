package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a */
    public final OutputStream f5705a;

    /* renamed from: b */
    public byte[] f5706b;

    /* renamed from: c */
    public u4.b f5707c;

    /* renamed from: d */
    public int f5708d;

    public c(FileOutputStream fileOutputStream, u4.b bVar) {
        this.f5705a = fileOutputStream;
        this.f5707c = bVar;
        this.f5706b = (byte[]) bVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
            this.f5705a.close();
            byte[] bArr = this.f5706b;
            if (bArr != null) {
                this.f5707c.put(bArr);
                this.f5706b = null;
            }
        } catch (Throwable th2) {
            this.f5705a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i10 = this.f5708d;
        if (i10 > 0) {
            this.f5705a.write(this.f5706b, 0, i10);
            this.f5708d = 0;
        }
        this.f5705a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.f5706b;
        int i11 = this.f5708d;
        int i12 = i11 + 1;
        this.f5708d = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f5705a.write(bArr, 0, i12);
        this.f5708d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f5708d;
            if (i15 == 0 && i13 >= this.f5706b.length) {
                this.f5705a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f5706b.length - i15);
            System.arraycopy(bArr, i14, this.f5706b, this.f5708d, min);
            int i16 = this.f5708d + min;
            this.f5708d = i16;
            i12 += min;
            byte[] bArr2 = this.f5706b;
            if (i16 == bArr2.length && i16 > 0) {
                this.f5705a.write(bArr2, 0, i16);
                this.f5708d = 0;
                continue;
            }
        } while (i12 < i11);
    }
}
