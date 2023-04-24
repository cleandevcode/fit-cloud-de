package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MultiPartInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a */
    private ArrayList<InputStream> f9124a = new ArrayList<>();

    /* renamed from: b */
    private int f9125b;

    private boolean a() {
        ArrayList<InputStream> arrayList = this.f9124a;
        return arrayList == null || arrayList.size() <= 0;
    }

    public void addInputStream(InputStream inputStream) {
        this.f9124a.add(inputStream);
    }

    @Override // java.io.InputStream
    public int available() {
        if (a()) {
            return 0;
        }
        return this.f9124a.get(this.f9125b).available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<InputStream> it = this.f9124a.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int read;
        int i10;
        if (a()) {
            return -1;
        }
        do {
            read = this.f9124a.get(this.f9125b).read();
            if (read >= 0) {
                break;
            }
            i10 = this.f9125b + 1;
            this.f9125b = i10;
        } while (i10 < this.f9124a.size());
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read;
        int i12;
        if (a()) {
            return -1;
        }
        do {
            read = this.f9124a.get(this.f9125b).read(bArr, i10, i11);
            if (read >= 0) {
                break;
            }
            i12 = this.f9125b + 1;
            this.f9125b = i12;
        } while (i12 < this.f9124a.size());
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        throw new IOException();
    }
}
