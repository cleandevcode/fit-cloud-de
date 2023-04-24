package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class c1 extends Writer {

    /* renamed from: b */
    public StringBuilder f2335b = new StringBuilder(128);

    /* renamed from: a */
    public final String f2334a = "FragmentManager";

    public final void a() {
        if (this.f2335b.length() > 0) {
            Log.d(this.f2334a, this.f2335b.toString());
            StringBuilder sb2 = this.f2335b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f2335b.append(c10);
            }
        }
    }
}
