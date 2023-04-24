package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class c extends RecyclerView.r {

    /* renamed from: a */
    public ViewPager2.e f3591a;

    /* renamed from: b */
    public final ViewPager2 f3592b;

    /* renamed from: c */
    public final RecyclerView f3593c;

    /* renamed from: d */
    public final LinearLayoutManager f3594d;

    /* renamed from: e */
    public int f3595e;

    /* renamed from: f */
    public int f3596f;

    /* renamed from: g */
    public a f3597g;

    /* renamed from: h */
    public int f3598h;

    /* renamed from: i */
    public int f3599i;

    /* renamed from: j */
    public boolean f3600j;

    /* renamed from: k */
    public boolean f3601k;

    /* renamed from: l */
    public boolean f3602l;

    /* renamed from: m */
    public boolean f3603m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f3604a;

        /* renamed from: b */
        public float f3605b;

        /* renamed from: c */
        public int f3606c;
    }

    public c(ViewPager2 viewPager2) {
        this.f3592b = viewPager2;
        ViewPager2.i iVar = viewPager2.f3565j;
        this.f3593c = iVar;
        this.f3594d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f3597g = new a();
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i10, RecyclerView recyclerView) {
        boolean z10;
        boolean z11;
        ViewPager2.e eVar;
        int i11 = this.f3595e;
        boolean z12 = true;
        if ((i11 != 1 || this.f3596f != 1) && i10 == 1) {
            this.f3603m = false;
            this.f3595e = 1;
            int i12 = this.f3599i;
            if (i12 != -1) {
                this.f3598h = i12;
                this.f3599i = -1;
            } else if (this.f3598h == -1) {
                this.f3598h = this.f3594d.O0();
            }
            d(1);
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && i10 == 2) {
            if (this.f3601k) {
                d(2);
                this.f3600j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && i10 == 0) {
            f();
            if (!this.f3601k) {
                int i13 = this.f3597g.f3604a;
                if (i13 != -1 && (eVar = this.f3591a) != null) {
                    eVar.b(0.0f, i13, 0);
                }
            } else {
                a aVar = this.f3597g;
                if (aVar.f3606c == 0) {
                    int i14 = this.f3598h;
                    int i15 = aVar.f3604a;
                    if (i14 != i15) {
                        c(i15);
                    }
                } else {
                    z12 = false;
                }
            }
            if (z12) {
                d(0);
                e();
            }
        }
        if (this.f3595e == 2 && i10 == 0 && this.f3602l) {
            f();
            a aVar2 = this.f3597g;
            if (aVar2.f3606c == 0) {
                int i16 = this.f3599i;
                int i17 = aVar2.f3604a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    c(i17);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0024, code lost:
        if (r6 == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x003e, code lost:
        if (r4.f3598h != r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f3601k = r5
            r4.f()
            boolean r0 = r4.f3600j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L41
            r4.f3600j = r1
            if (r7 > 0) goto L29
            if (r7 != 0) goto L27
            if (r6 >= 0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f3592b
            androidx.viewpager2.widget.ViewPager2$d r7 = r7.f3562g
            int r7 = r7.B()
            if (r7 != r5) goto L23
            r7 = 1
            goto L24
        L23:
            r7 = 0
        L24:
            if (r6 != r7) goto L27
            goto L29
        L27:
            r6 = 0
            goto L2a
        L29:
            r6 = 1
        L2a:
            if (r6 == 0) goto L36
            androidx.viewpager2.widget.c$a r6 = r4.f3597g
            int r7 = r6.f3606c
            if (r7 == 0) goto L36
            int r6 = r6.f3604a
            int r6 = r6 + r5
            goto L3a
        L36:
            androidx.viewpager2.widget.c$a r6 = r4.f3597g
            int r6 = r6.f3604a
        L3a:
            r4.f3599i = r6
            int r7 = r4.f3598h
            if (r7 == r6) goto L4f
            goto L4c
        L41:
            int r6 = r4.f3595e
            if (r6 != 0) goto L4f
            androidx.viewpager2.widget.c$a r6 = r4.f3597g
            int r6 = r6.f3604a
            if (r6 != r2) goto L4c
            r6 = 0
        L4c:
            r4.c(r6)
        L4f:
            androidx.viewpager2.widget.c$a r6 = r4.f3597g
            int r7 = r6.f3604a
            if (r7 != r2) goto L56
            r7 = 0
        L56:
            float r0 = r6.f3605b
            int r6 = r6.f3606c
            androidx.viewpager2.widget.ViewPager2$e r3 = r4.f3591a
            if (r3 == 0) goto L61
            r3.b(r0, r7, r6)
        L61:
            androidx.viewpager2.widget.c$a r6 = r4.f3597g
            int r7 = r6.f3604a
            int r0 = r4.f3599i
            if (r7 == r0) goto L6b
            if (r0 != r2) goto L79
        L6b:
            int r6 = r6.f3606c
            if (r6 != 0) goto L79
            int r6 = r4.f3596f
            if (r6 == r5) goto L79
            r4.d(r1)
            r4.e()
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        ViewPager2.e eVar = this.f3591a;
        if (eVar != null) {
            eVar.c(i10);
        }
    }

    public final void d(int i10) {
        if ((this.f3595e == 3 && this.f3596f == 0) || this.f3596f == i10) {
            return;
        }
        this.f3596f = i10;
        ViewPager2.e eVar = this.f3591a;
        if (eVar != null) {
            eVar.a(i10);
        }
    }

    public final void e() {
        this.f3595e = 0;
        this.f3596f = 0;
        a aVar = this.f3597g;
        aVar.f3604a = -1;
        aVar.f3605b = 0.0f;
        aVar.f3606c = 0;
        this.f3598h = -1;
        this.f3599i = -1;
        this.f3600j = false;
        this.f3601k = false;
        this.f3603m = false;
        this.f3602l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0141, code lost:
        if (r5[r2 - 1][1] >= r6) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.f():void");
    }
}
