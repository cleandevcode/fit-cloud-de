package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.s;
import java.util.concurrent.CancellationException;
import p0.c;
import s.h1;

/* loaded from: classes.dex */
public final class q implements d0.c<Surface> {

    /* renamed from: a */
    public final /* synthetic */ na.a f1783a;

    /* renamed from: b */
    public final /* synthetic */ c.a f1784b;

    /* renamed from: c */
    public final /* synthetic */ String f1785c;

    public q(na.a aVar, c.a aVar2, String str) {
        this.f1783a = aVar;
        this.f1784b = aVar2;
        this.f1785c = str;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        if (th2 instanceof CancellationException) {
            h1.k(null, this.f1784b.b(new s.b(androidx.activity.e.b(new StringBuilder(), this.f1785c, " cancelled."), th2)));
        } else {
            this.f1784b.a(null);
        }
    }

    @Override // d0.c
    public final void onSuccess(Surface surface) {
        d0.f.g(true, this.f1783a, this.f1784b, o8.b.i());
    }
}
