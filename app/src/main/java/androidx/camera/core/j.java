package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import y.o0;

/* loaded from: classes.dex */
public interface j extends AutoCloseable {

    /* loaded from: classes.dex */
    public interface a {
    }

    int c();

    @Override // java.lang.AutoCloseable
    void close();

    o0 d0();

    int f();

    int getFormat();

    @SuppressLint({"ArrayReturn"})
    a[] l();

    Image s0();

    Rect z();
}
