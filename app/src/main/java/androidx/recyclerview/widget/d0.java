package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a */
    public final RecyclerView.m f3089a;

    /* renamed from: b */
    public int f3090b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f3091c = new Rect();

    public d0(RecyclerView.m mVar) {
        this.f3089a = mVar;
    }

    public static d0 a(RecyclerView.m mVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new c0(mVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new b0(mVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i10);
}
