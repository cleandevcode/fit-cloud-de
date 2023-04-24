package j5;

import android.graphics.drawable.Drawable;
import m5.l;

/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: a */
    public final int f17486a;

    /* renamed from: b */
    public final int f17487b;

    /* renamed from: c */
    public i5.d f17488c;

    public c() {
        if (!l.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f17486a = Integer.MIN_VALUE;
        this.f17487b = Integer.MIN_VALUE;
    }

    @Override // j5.h
    public final void a(g gVar) {
        gVar.c(this.f17486a, this.f17487b);
    }

    @Override // j5.h
    public final void b(i5.d dVar) {
        this.f17488c = dVar;
    }

    @Override // j5.h
    public final void d(g gVar) {
    }

    @Override // j5.h
    public void e(Drawable drawable) {
    }

    @Override // j5.h
    public final void f(Drawable drawable) {
    }

    @Override // j5.h
    public final i5.d g() {
        return this.f17488c;
    }

    @Override // com.bumptech.glide.manager.j
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStop() {
    }
}
