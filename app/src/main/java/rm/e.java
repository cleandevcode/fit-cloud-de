package rm;

import i2.l0;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import um.f0;

/* loaded from: classes2.dex */
public final class e<E> extends a<E> {

    /* renamed from: d */
    public final int f25838d;

    /* renamed from: e */
    public final f f25839e;

    /* renamed from: f */
    public final ReentrantLock f25840f;

    /* renamed from: g */
    public Object[] f25841g;

    /* renamed from: h */
    public int f25842h;
    private volatile /* synthetic */ int size;

    public e(int i10, f fVar, fm.l<? super E, tl.l> lVar) {
        super(lVar);
        this.f25838d = i10;
        this.f25839e = fVar;
        if (i10 >= 1) {
            this.f25840f = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i10, 8)];
            ul.i.z(objArr, b.f25821a);
            this.f25841g = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(androidx.activity.i.a("ArrayChannel capacity must be at least 1, but ", i10, " was specified").toString());
    }

    @Override // rm.a
    public final Object A() {
        ReentrantLock reentrantLock = this.f25840f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object f10 = f();
                if (f10 == null) {
                    f10 = b.f25824d;
                }
                return f10;
            }
            Object[] objArr = this.f25841g;
            int i11 = this.f25842h;
            Object obj = objArr[i11];
            y yVar = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object obj2 = b.f25824d;
            boolean z10 = false;
            if (i10 == this.f25838d) {
                y yVar2 = null;
                while (true) {
                    y q10 = q();
                    if (q10 == null) {
                        yVar = yVar2;
                        break;
                    } else if (q10.U(null) != null) {
                        obj2 = q10.S();
                        yVar = q10;
                        z10 = true;
                        break;
                    } else {
                        q10.V();
                        yVar2 = q10;
                    }
                }
            }
            if (obj2 != b.f25824d && !(obj2 instanceof m)) {
                this.size = i10;
                Object[] objArr2 = this.f25841g;
                objArr2[(this.f25842h + i10) % objArr2.length] = obj2;
            }
            this.f25842h = (this.f25842h + 1) % this.f25841g.length;
            tl.l lVar = tl.l.f28297a;
            if (z10) {
                gm.l.c(yVar);
                yVar.R();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x009a A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:56:0x0005, B:58:0x0009, B:60:0x000f, B:63:0x0015, B:65:0x0029, B:67:0x0036, B:84:0x0080, B:86:0x0084, B:88:0x0088, B:94:0x00a8, B:89:0x0094, B:91:0x009a, B:68:0x0044, B:70:0x0048, B:72:0x004c, B:74:0x0050, B:77:0x005c, B:81:0x0064, B:82:0x007e), top: B:102:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b8  */
    @Override // rm.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(xm.c<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f25840f
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lc1
            if (r1 != 0) goto L15
            rm.m r9 = r8.f()     // Catch: java.lang.Throwable -> Lc1
            if (r9 != 0) goto L11
            um.x r9 = rm.b.f25824d     // Catch: java.lang.Throwable -> Lc1
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f25841g     // Catch: java.lang.Throwable -> Lc1
            int r3 = r8.f25842h     // Catch: java.lang.Throwable -> Lc1
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lc1
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lc1
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lc1
            um.x r2 = rm.b.f25824d     // Catch: java.lang.Throwable -> Lc1
            int r3 = r8.f25838d     // Catch: java.lang.Throwable -> Lc1
            r6 = 1
            if (r1 != r3) goto L7f
        L29:
            rm.a$g r3 = new rm.a$g     // Catch: java.lang.Throwable -> Lc1
            um.j r7 = r8.f25835b     // Catch: java.lang.Throwable -> Lc1
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r7 = r9.C(r3)     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto L44
            um.k r2 = r3.m()     // Catch: java.lang.Throwable -> Lc1
            r3 = r2
            rm.y r3 = (rm.y) r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r3 = r3.S()     // Catch: java.lang.Throwable -> Lc1
            r5 = r2
            r2 = r3
            goto L62
        L44:
            um.x r3 = rm.b.f25824d     // Catch: java.lang.Throwable -> Lc1
            if (r7 == r3) goto L7f
            um.x r3 = um.c.f28893b     // Catch: java.lang.Throwable -> Lc1
            if (r7 == r3) goto L29
            um.x r2 = xm.d.f30642b     // Catch: java.lang.Throwable -> Lc1
            if (r7 != r2) goto L5c
            r8.size = r1     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object[] r9 = r8.f25841g     // Catch: java.lang.Throwable -> Lc1
            int r1 = r8.f25842h     // Catch: java.lang.Throwable -> Lc1
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc1
            r0.unlock()
            return r7
        L5c:
            boolean r2 = r7 instanceof rm.m     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto L64
            r2 = r7
            r5 = r2
        L62:
            r3 = 1
            goto L80
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r1.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lc1
            throw r9     // Catch: java.lang.Throwable -> Lc1
        L7f:
            r3 = 0
        L80:
            um.x r7 = rm.b.f25824d     // Catch: java.lang.Throwable -> Lc1
            if (r2 == r7) goto L94
            boolean r7 = r2 instanceof rm.m     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto L94
            r8.size = r1     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object[] r9 = r8.f25841g     // Catch: java.lang.Throwable -> Lc1
            int r7 = r8.f25842h     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lc1
            goto La8
        L94:
            boolean r9 = r9.p()     // Catch: java.lang.Throwable -> Lc1
            if (r9 != 0) goto La8
            r8.size = r1     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object[] r9 = r8.f25841g     // Catch: java.lang.Throwable -> Lc1
            int r1 = r8.f25842h     // Catch: java.lang.Throwable -> Lc1
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc1
            um.x r9 = xm.d.f30642b     // Catch: java.lang.Throwable -> Lc1
            r0.unlock()
            return r9
        La8:
            int r9 = r8.f25842h     // Catch: java.lang.Throwable -> Lc1
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f25841g     // Catch: java.lang.Throwable -> Lc1
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lc1
            int r9 = r9 % r1
            r8.f25842h = r9     // Catch: java.lang.Throwable -> Lc1
            tl.l r9 = tl.l.f28297a     // Catch: java.lang.Throwable -> Lc1
            r0.unlock()
            if (r3 == 0) goto Lc0
            gm.l.c(r5)
            rm.y r5 = (rm.y) r5
            r5.R()
        Lc0:
            return r4
        Lc1:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.e.B(xm.c):java.lang.Object");
    }

    public final void F(int i10, E e10) {
        int i11 = this.f25838d;
        if (i10 < i11) {
            Object[] objArr = this.f25841g;
            if (i10 >= objArr.length) {
                int min = Math.min(objArr.length * 2, i11);
                Object[] objArr2 = new Object[min];
                for (int i12 = 0; i12 < i10; i12++) {
                    Object[] objArr3 = this.f25841g;
                    objArr2[i12] = objArr3[(this.f25842h + i12) % objArr3.length];
                }
                Arrays.fill(objArr2, i10, min, b.f25821a);
                this.f25841g = objArr2;
                this.f25842h = 0;
            }
            Object[] objArr4 = this.f25841g;
            objArr4[(this.f25842h + i10) % objArr4.length] = e10;
            return;
        }
        Object[] objArr5 = this.f25841g;
        int i13 = this.f25842h;
        objArr5[i13 % objArr5.length] = null;
        objArr5[(i10 + i13) % objArr5.length] = e10;
        this.f25842h = (i13 + 1) % objArr5.length;
    }

    @Override // rm.c
    public final Object b(a0 a0Var) {
        ReentrantLock reentrantLock = this.f25840f;
        reentrantLock.lock();
        try {
            return super.b(a0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.c
    public final String e() {
        StringBuilder a10 = android.support.v4.media.d.a("(buffer:capacity=");
        a10.append(this.f25838d);
        a10.append(",size=");
        return a1.b.a(a10, this.size, ')');
    }

    @Override // rm.c
    public final boolean i() {
        return false;
    }

    @Override // rm.c
    public final boolean j() {
        return this.size == this.f25838d && this.f25839e == f.SUSPEND;
    }

    @Override // rm.c
    public final Object k(E e10) {
        w<E> l10;
        ReentrantLock reentrantLock = this.f25840f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            m<?> f10 = f();
            if (f10 != null) {
                return f10;
            }
            um.x xVar = null;
            if (i10 < this.f25838d) {
                this.size = i10 + 1;
            } else {
                int ordinal = this.f25839e.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            xVar = b.f25822b;
                        } else {
                            throw new qa.p();
                        }
                    }
                } else {
                    xVar = b.f25823c;
                }
            }
            if (xVar != null) {
                return xVar;
            }
            if (i10 == 0) {
                do {
                    l10 = l();
                    if (l10 != null) {
                        if (l10 instanceof m) {
                            this.size = i10;
                            return l10;
                        }
                    }
                } while (l10.d(e10) == null);
                this.size = i10;
                tl.l lVar = tl.l.f28297a;
                reentrantLock.unlock();
                l10.y(e10);
                return l10.o();
            }
            F(i10, e10);
            return b.f25822b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final boolean s(u<? super E> uVar) {
        ReentrantLock reentrantLock = this.f25840f;
        reentrantLock.lock();
        try {
            return super.s(uVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final boolean t() {
        return false;
    }

    @Override // rm.a
    public final boolean v() {
        return this.size == 0;
    }

    @Override // rm.a
    public final boolean w() {
        ReentrantLock reentrantLock = this.f25840f;
        reentrantLock.lock();
        try {
            return super.w();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final void y(boolean z10) {
        fm.l<E, tl.l> lVar = this.f25834a;
        ReentrantLock reentrantLock = this.f25840f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            f0 f0Var = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.f25841g[this.f25842h];
                if (lVar != null && obj != b.f25821a) {
                    f0Var = l0.a(lVar, obj, f0Var);
                }
                Object[] objArr = this.f25841g;
                int i12 = this.f25842h;
                objArr[i12] = b.f25821a;
                this.f25842h = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            tl.l lVar2 = tl.l.f28297a;
            reentrantLock.unlock();
            super.y(z10);
            if (f0Var != null) {
                throw f0Var;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
