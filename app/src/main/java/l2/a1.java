package l2;

/* loaded from: classes.dex */
public final class a1<T> implements androidx.recyclerview.widget.y {

    /* renamed from: a */
    public final y0<T> f18701a;

    /* renamed from: b */
    public final y0<T> f18702b;

    /* renamed from: c */
    public final androidx.recyclerview.widget.y f18703c;

    /* renamed from: d */
    public int f18704d;

    /* renamed from: e */
    public int f18705e;

    /* renamed from: f */
    public int f18706f;

    /* renamed from: g */
    public int f18707g = 1;

    /* renamed from: h */
    public int f18708h = 1;

    public a1(y0<T> y0Var, y0<T> y0Var2, androidx.recyclerview.widget.y yVar) {
        this.f18701a = y0Var;
        this.f18702b = y0Var2;
        this.f18703c = yVar;
        this.f18704d = y0Var.d();
        this.f18705e = y0Var.e();
        this.f18706f = y0Var.c();
    }

    @Override // androidx.recyclerview.widget.y
    public final void a(int i10, int i11) {
        boolean z10;
        z zVar = z.PLACEHOLDER_TO_ITEM;
        boolean z11 = true;
        if (i10 < this.f18706f || this.f18708h == 2) {
            z10 = false;
        } else {
            int min = Math.min(i11, this.f18705e);
            if (min > 0) {
                this.f18708h = 3;
                this.f18703c.d(this.f18704d + i10, min, zVar);
                this.f18705e -= min;
            }
            int i12 = i11 - min;
            if (i12 > 0) {
                this.f18703c.a(min + i10 + this.f18704d, i12);
            }
            z10 = true;
        }
        if (!z10) {
            if (i10 > 0 || this.f18707g == 2) {
                z11 = false;
            } else {
                int min2 = Math.min(i11, this.f18704d);
                if (min2 > 0) {
                    this.f18707g = 3;
                    this.f18703c.d((0 - min2) + this.f18704d, min2, zVar);
                    this.f18704d -= min2;
                }
                int i13 = i11 - min2;
                if (i13 > 0) {
                    this.f18703c.a(this.f18704d + 0, i13);
                }
            }
            if (!z11) {
                this.f18703c.a(i10 + this.f18704d, i11);
            }
        }
        this.f18706f += i11;
    }

    @Override // androidx.recyclerview.widget.y
    public final void b(int i10, int i11) {
        boolean z10;
        z zVar = z.ITEM_TO_PLACEHOLDER;
        boolean z11 = true;
        if (i10 + i11 < this.f18706f || this.f18708h == 3) {
            z10 = false;
        } else {
            int min = Math.min(this.f18702b.e() - this.f18705e, i11);
            if (min < 0) {
                min = 0;
            }
            int i12 = i11 - min;
            if (min > 0) {
                this.f18708h = 2;
                this.f18703c.d(this.f18704d + i10, min, zVar);
                this.f18705e += min;
            }
            if (i12 > 0) {
                this.f18703c.b(min + i10 + this.f18704d, i12);
            }
            z10 = true;
        }
        if (!z10) {
            if (i10 > 0 || this.f18707g == 3) {
                z11 = false;
            } else {
                int min2 = Math.min(this.f18702b.d() - this.f18704d, i11);
                if (min2 < 0) {
                    min2 = 0;
                }
                int i13 = i11 - min2;
                if (i13 > 0) {
                    this.f18703c.b(this.f18704d + 0, i13);
                }
                if (min2 > 0) {
                    this.f18707g = 2;
                    this.f18703c.d(this.f18704d + 0, min2, zVar);
                    this.f18704d += min2;
                }
            }
            if (!z11) {
                this.f18703c.b(i10 + this.f18704d, i11);
            }
        }
        this.f18706f -= i11;
    }

    @Override // androidx.recyclerview.widget.y
    public final void c(int i10, int i11) {
        androidx.recyclerview.widget.y yVar = this.f18703c;
        int i12 = this.f18704d;
        yVar.c(i10 + i12, i11 + i12);
    }

    @Override // androidx.recyclerview.widget.y
    public final void d(int i10, int i11, Object obj) {
        this.f18703c.d(i10 + this.f18704d, i11, obj);
    }
}
