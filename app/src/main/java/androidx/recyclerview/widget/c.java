package androidx.recyclerview.widget;

import l2.a1;

/* loaded from: classes.dex */
public final class c implements y {

    /* renamed from: a */
    public final y f3084a;

    /* renamed from: b */
    public int f3085b = 0;

    /* renamed from: c */
    public int f3086c = -1;

    /* renamed from: d */
    public int f3087d = -1;

    /* renamed from: e */
    public Object f3088e = null;

    public c(a1 a1Var) {
        this.f3084a = a1Var;
    }

    @Override // androidx.recyclerview.widget.y
    public final void a(int i10, int i11) {
        int i12;
        if (this.f3085b == 1 && i10 >= (i12 = this.f3086c)) {
            int i13 = this.f3087d;
            if (i10 <= i12 + i13) {
                this.f3087d = i13 + i11;
                this.f3086c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f3086c = i10;
        this.f3087d = i11;
        this.f3085b = 1;
    }

    @Override // androidx.recyclerview.widget.y
    public final void b(int i10, int i11) {
        int i12;
        if (this.f3085b == 2 && (i12 = this.f3086c) >= i10 && i12 <= i10 + i11) {
            this.f3087d += i11;
            this.f3086c = i10;
            return;
        }
        e();
        this.f3086c = i10;
        this.f3087d = i11;
        this.f3085b = 2;
    }

    @Override // androidx.recyclerview.widget.y
    public final void c(int i10, int i11) {
        e();
        this.f3084a.c(i10, i11);
    }

    @Override // androidx.recyclerview.widget.y
    public final void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f3085b == 3) {
            int i13 = this.f3086c;
            int i14 = this.f3087d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f3088e == obj) {
                this.f3086c = Math.min(i10, i13);
                this.f3087d = Math.max(i14 + i13, i12) - this.f3086c;
                return;
            }
        }
        e();
        this.f3086c = i10;
        this.f3087d = i11;
        this.f3088e = obj;
        this.f3085b = 3;
    }

    public final void e() {
        int i10 = this.f3085b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f3084a.a(this.f3086c, this.f3087d);
        } else if (i10 == 2) {
            this.f3084a.b(this.f3086c, this.f3087d);
        } else if (i10 == 3) {
            this.f3084a.d(this.f3086c, this.f3087d, this.f3088e);
        }
        this.f3088e = null;
        this.f3085b = 0;
    }
}
