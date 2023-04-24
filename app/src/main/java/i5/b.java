package i5;

/* loaded from: classes.dex */
public final class b implements e, d {

    /* renamed from: a */
    public final Object f16526a;

    /* renamed from: b */
    public final e f16527b;

    /* renamed from: c */
    public volatile d f16528c;

    /* renamed from: d */
    public volatile d f16529d;

    /* renamed from: e */
    public int f16530e = 3;

    /* renamed from: f */
    public int f16531f = 3;

    public b(Object obj, e eVar) {
        this.f16526a = obj;
        this.f16527b = eVar;
    }

    @Override // i5.e, i5.d
    public final boolean a() {
        boolean z10;
        synchronized (this.f16526a) {
            z10 = this.f16528c.a() || this.f16529d.a();
        }
        return z10;
    }

    @Override // i5.d
    public final boolean b(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            return this.f16528c.b(bVar.f16528c) && this.f16529d.b(bVar.f16529d);
        }
        return false;
    }

    @Override // i5.e
    public final void c(d dVar) {
        synchronized (this.f16526a) {
            if (dVar.equals(this.f16529d)) {
                this.f16531f = 5;
                e eVar = this.f16527b;
                if (eVar != null) {
                    eVar.c(this);
                }
                return;
            }
            this.f16530e = 5;
            if (this.f16531f != 1) {
                this.f16531f = 1;
                this.f16529d.h();
            }
        }
    }

    @Override // i5.d
    public final void clear() {
        synchronized (this.f16526a) {
            this.f16530e = 3;
            this.f16528c.clear();
            if (this.f16531f != 3) {
                this.f16531f = 3;
                this.f16529d.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0015 A[Catch: all -> 0x0039, TryCatch #0 {, blocks: (B:36:0x0003, B:38:0x0009, B:44:0x0015, B:46:0x001a, B:57:0x0037, B:47:0x0021, B:49:0x0029), top: B:62:0x0003 }] */
    @Override // i5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(i5.d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f16526a
            monitor-enter(r0)
            i5.e r1 = r5.f16527b     // Catch: java.lang.Throwable -> L39
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L36
            int r1 = r5.f16530e     // Catch: java.lang.Throwable -> L39
            r4 = 5
            if (r1 == r4) goto L21
            i5.d r1 = r5.f16528c     // Catch: java.lang.Throwable -> L39
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L39
            goto L33
        L21:
            i5.d r1 = r5.f16529d     // Catch: java.lang.Throwable -> L39
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L32
            int r6 = r5.f16531f     // Catch: java.lang.Throwable -> L39
            r1 = 4
            if (r6 == r1) goto L30
            if (r6 != r4) goto L32
        L30:
            r6 = 1
            goto L33
        L32:
            r6 = 0
        L33:
            if (r6 == 0) goto L36
            goto L37
        L36:
            r2 = 0
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r2
        L39:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.b.d(i5.d):boolean");
    }

    @Override // i5.e
    public final boolean e(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f16526a) {
            e eVar = this.f16527b;
            z10 = false;
            if (eVar != null && !eVar.e(this)) {
                z11 = false;
                if (z11 && dVar.equals(this.f16528c)) {
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
    public final boolean f(d dVar) {
        boolean z10;
        synchronized (this.f16526a) {
            e eVar = this.f16527b;
            if (eVar != null && !eVar.f(this)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // i5.d
    public final boolean g() {
        boolean z10;
        synchronized (this.f16526a) {
            z10 = this.f16530e == 3 && this.f16531f == 3;
        }
        return z10;
    }

    @Override // i5.e
    public final e getRoot() {
        e root;
        synchronized (this.f16526a) {
            e eVar = this.f16527b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // i5.d
    public final void h() {
        synchronized (this.f16526a) {
            if (this.f16530e != 1) {
                this.f16530e = 1;
                this.f16528c.h();
            }
        }
    }

    @Override // i5.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f16526a) {
            z10 = this.f16530e == 4 || this.f16531f == 4;
        }
        return z10;
    }

    @Override // i5.d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f16526a) {
            z10 = true;
            if (this.f16530e != 1 && this.f16531f != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // i5.e
    public final void j(d dVar) {
        synchronized (this.f16526a) {
            if (dVar.equals(this.f16528c)) {
                this.f16530e = 4;
            } else if (dVar.equals(this.f16529d)) {
                this.f16531f = 4;
            }
            e eVar = this.f16527b;
            if (eVar != null) {
                eVar.j(this);
            }
        }
    }

    @Override // i5.d
    public final void pause() {
        synchronized (this.f16526a) {
            if (this.f16530e == 1) {
                this.f16530e = 2;
                this.f16528c.pause();
            }
            if (this.f16531f == 1) {
                this.f16531f = 2;
                this.f16529d.pause();
            }
        }
    }
}
