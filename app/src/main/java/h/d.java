package h;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import h.b;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: n */
    public a f15735n;

    /* renamed from: o */
    public boolean f15736o;

    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f15714g.length];
            }
        }

        @Override // h.b.c
        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.H = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i10 = this.f15715h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d() {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.b
    public void e(b.c cVar) {
        this.f15694a = cVar;
        int i10 = this.f15700g;
        if (i10 >= 0) {
            Drawable d10 = cVar.d(i10);
            this.f15696c = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f15697d = null;
        if (cVar instanceof a) {
            this.f15735n = (a) cVar;
        }
    }

    @Override // h.b
    /* renamed from: f */
    public a b() {
        return new a(this.f15735n, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f15736o) {
            super.mutate();
            this.f15735n.e();
            this.f15736o = true;
        }
        return this;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f10 = this.f15735n.f(iArr);
        if (f10 < 0) {
            f10 = this.f15735n.f(StateSet.WILD_CARD);
        }
        return d(f10) || onStateChange;
    }
}
