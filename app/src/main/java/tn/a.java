package tn;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class a extends InputStream {

    /* renamed from: a */
    public InputStream f28380a;

    /* renamed from: b */
    public int f28381b = 0;

    public a(InputStream inputStream) {
        this.f28380a = inputStream;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f28380a.read();
        if (read != -1) {
            this.f28381b++;
        }
        return read;
    }
}
