package t7;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import java.util.ArrayList;
import t7.k;

/* loaded from: classes.dex */
public abstract class n<T extends k> extends e<Object> implements x7.f<T>, x7.g<Object> {

    /* renamed from: u */
    public boolean f27843u;

    /* renamed from: v */
    public boolean f27844v;

    /* renamed from: w */
    public float f27845w;

    /* renamed from: x */
    public DashPathEffect f27846x;

    /* renamed from: y */
    public float f27847y;

    public n(String str, ArrayList arrayList) {
        super(str, arrayList);
        this.f27843u = true;
        this.f27844v = true;
        this.f27845w = 0.5f;
        this.f27846x = null;
        this.f27845w = a8.f.c(0.5f);
        Color.rgb(140, 234, 255);
        this.f27847y = 2.5f;
    }

    @Override // x7.g
    public final DashPathEffect I() {
        return this.f27846x;
    }

    @Override // x7.g
    public final boolean d0() {
        return this.f27843u;
    }

    @Override // x7.f
    public final float e() {
        return this.f27847y;
    }

    @Override // x7.g
    public final boolean f0() {
        return this.f27844v;
    }

    @Override // x7.g
    public final float o() {
        return this.f27845w;
    }

    @Override // x7.f
    public final void z() {
    }
}
