package i5;

/* loaded from: classes.dex */
public final class j implements e, d {

    /* renamed from: a */
    public final e f16558a;

    /* renamed from: b */
    public final Object f16559b;

    /* renamed from: c */
    public volatile d f16560c;

    /* renamed from: d */
    public volatile d f16561d;

    /* renamed from: e */
    public int f16562e = 3;

    /* renamed from: f */
    public int f16563f = 3;

    /* renamed from: g */
    public boolean f16564g;

    public j(Object obj, e eVar) {
        this.f16559b = obj;
        this.f16558a = eVar;
    }

    @Override // i5.e, i5.d
    public final boolean a() {
        boolean z10;
        synchronized (this.f16559b) {
            z10 = this.f16561d.a() || this.f16560c.a();
        }
        return z10;
    }

    @Override // i5.d
    public final boolean b(d dVar) {
        if (dVar instanceof j) {
            j jVar = (j) dVar;
            if (this.f16560c == null) {
                if (jVar.f16560c != null) {
                    return false;
                }
            } else if (!this.f16560c.b(jVar.f16560c)) {
                return false;
            }
            if (this.f16561d == null) {
                if (jVar.f16561d != null) {
                    return false;
                }
            } else if (!this.f16561d.b(jVar.f16561d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // i5.e
    public final void c(d dVar) {
        synchronized (this.f16559b) {
            if (!dVar.equals(this.f16560c)) {
                this.f16563f = 5;
                return;
            }
            this.f16562e = 5;
            e eVar = this.f16558a;
            if (eVar != null) {
                eVar.c(this);
            }
        }
    }

    @Override // i5.d
    public final void clear() {
        synchronized (this.f16559b) {
            this.f16564g = false;
            this.f16562e = 3;
            this.f16563f = 3;
            this.f16561d.clear();
            this.f16560c.clear();
        }
    }

    @Override // i5.e
    public final boolean d(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f16559b) {
            e eVar = this.f16558a;
            z10 = false;
            if (eVar != null && !eVar.d(this)) {
                z11 = false;
                if (z11 && dVar.equals(this.f16560c) && !a()) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // i5.e
    public final boolean e(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f16559b) {
            e eVar = this.f16558a;
            z10 = true;
            if (eVar != null && !eVar.e(this)) {
                z11 = false;
                if (z11 || !dVar.equals(this.f16560c) || this.f16562e == 2) {
                    z10 = false;
                }
            }
            z11 = true;
            if (z11) {
            }
            z10 = false;
        }
        return z10;
    }

    @Override // i5.e
    public final boolean f(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f16559b) {
            e eVar = this.f16558a;
            z10 = true;
            if (eVar != null && !eVar.f(this)) {
                z11 = false;
                if (z11 || (!dVar.equals(this.f16560c) && this.f16562e == 4)) {
                    z10 = false;
                }
            }
            z11 = true;
            if (z11) {
            }
            z10 = false;
        }
        return z10;
    }

    @Override // i5.d
    public final boolean g() {
        boolean z10;
        synchronized (this.f16559b) {
            z10 = this.f16562e == 3;
        }
        return z10;
    }

    @Override // i5.e
    public final e getRoot() {
        e root;
        synchronized (this.f16559b) {
            e eVar = this.f16558a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // i5.d
    public final void h() {
        synchronized (this.f16559b) {
            this.f16564g = true;
            if (this.f16562e != 4 && this.f16563f != 1) {
                this.f16563f = 1;
                this.f16561d.h();
            }
            if (this.f16564g && this.f16562e != 1) {
                this.f16562e = 1;
                this.f16560c.h();
            }
            this.f16564g = false;
        }
    }

    @Override // i5.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f16559b) {
            z10 = this.f16562e == 4;
        }
        return z10;
    }

    @Override // i5.d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f16559b) {
            z10 = true;
            if (this.f16562e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // i5.e
    public final void j(d dVar) {
        synchronized (this.f16559b) {
            if (dVar.equals(this.f16561d)) {
                this.f16563f = 4;
                return;
            }
            this.f16562e = 4;
            e eVar = this.f16558a;
            if (eVar != null) {
                eVar.j(this);
            }
            if (!androidx.activity.e.a(this.f16563f)) {
                this.f16561d.clear();
            }
        }
    }

    @Override // i5.d
    public final void pause() {
        synchronized (this.f16559b) {
            if (!androidx.activity.e.a(this.f16563f)) {
                this.f16563f = 2;
                this.f16561d.pause();
            }
            if (!androidx.activity.e.a(this.f16562e)) {
                this.f16562e = 2;
                this.f16560c.pause();
            }
        }
    }
}
