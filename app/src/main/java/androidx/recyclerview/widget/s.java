package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import f1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal<s> f3252e = new ThreadLocal<>();

    /* renamed from: f */
    public static a f3253f = new a();

    /* renamed from: b */
    public long f3255b;

    /* renamed from: c */
    public long f3256c;

    /* renamed from: a */
    public ArrayList<RecyclerView> f3254a = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<c> f3257d = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0020, code lost:
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0022, code lost:
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
            return r1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.s.c r7, androidx.recyclerview.widget.s.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.s$c r7 = (androidx.recyclerview.widget.s.c) r7
                androidx.recyclerview.widget.s$c r8 = (androidx.recyclerview.widget.s.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f3265d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f3265d
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.f3262a
                boolean r3 = r8.f3262a
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.f3263b
                int r1 = r7.f3263b
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.f3264c
                int r8 = r8.f3264c
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.m.c {

        /* renamed from: a */
        public int f3258a;

        /* renamed from: b */
        public int f3259b;

        /* renamed from: c */
        public int[] f3260c;

        /* renamed from: d */
        public int f3261d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f3261d * 2;
            int[] iArr = this.f3260c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3260c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f3260c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3260c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f3261d++;
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            boolean z11 = false;
            this.f3261d = 0;
            int[] iArr = this.f3260c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.f2889m;
            if (recyclerView.f2887l != null && mVar != null && mVar.f2967i) {
                if (z10) {
                    if (!recyclerView.f2871d.g()) {
                        mVar.k(recyclerView.f2887l.e(), this);
                    }
                } else {
                    if (!((!recyclerView.f2905u || recyclerView.D || recyclerView.f2871d.g()) ? true : true)) {
                        mVar.j(this.f3258a, this.f3259b, recyclerView.f2904t0, this);
                    }
                }
                int i10 = this.f3261d;
                if (i10 > mVar.f2968j) {
                    mVar.f2968j = i10;
                    mVar.f2969k = z10;
                    recyclerView.f2868b.k();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f3262a;

        /* renamed from: b */
        public int f3263b;

        /* renamed from: c */
        public int f3264c;

        /* renamed from: d */
        public RecyclerView f3265d;

        /* renamed from: e */
        public int f3266e;
    }

    public static RecyclerView.b0 c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int h10 = recyclerView.f2873e.h();
        int i11 = 0;
        while (true) {
            if (i11 < h10) {
                RecyclerView.b0 J = RecyclerView.J(recyclerView.f2873e.g(i11));
                if (J.f2929c == i10 && !J.i()) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f2868b;
        try {
            recyclerView.Q();
            RecyclerView.b0 i12 = tVar.i(i10, j10);
            if (i12 != null) {
                if (i12.h() && !i12.i()) {
                    tVar.f(i12.f2927a);
                } else {
                    tVar.a(i12, false);
                }
            }
            return i12;
        } finally {
            recyclerView.R(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f3255b == 0) {
            this.f3255b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f2902s0;
        bVar.f3258a = i10;
        bVar.f3259b = i11;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z10;
        int size = this.f3254a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f3254a.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f2902s0.b(recyclerView3, false);
                i10 += recyclerView3.f2902s0.f3261d;
            }
        }
        this.f3257d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f3254a.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f2902s0;
                int abs = Math.abs(bVar.f3259b) + Math.abs(bVar.f3258a);
                for (int i14 = 0; i14 < bVar.f3261d * 2; i14 += 2) {
                    if (i12 >= this.f3257d.size()) {
                        cVar2 = new c();
                        this.f3257d.add(cVar2);
                    } else {
                        cVar2 = this.f3257d.get(i12);
                    }
                    int[] iArr = bVar.f3260c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar2.f3262a = z10;
                    cVar2.f3263b = abs;
                    cVar2.f3264c = i15;
                    cVar2.f3265d = recyclerView4;
                    cVar2.f3266e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3257d, f3253f);
        for (int i16 = 0; i16 < this.f3257d.size() && (recyclerView = (cVar = this.f3257d.get(i16)).f3265d) != null; i16++) {
            if (cVar.f3262a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            RecyclerView.b0 c10 = c(recyclerView, cVar.f3266e, j11);
            if (c10 != null && c10.f2928b != null && c10.h() && !c10.i() && (recyclerView2 = c10.f2928b.get()) != null) {
                if (recyclerView2.D && recyclerView2.f2873e.h() != 0) {
                    recyclerView2.X();
                }
                b bVar2 = recyclerView2.f2902s0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f3261d != 0) {
                    try {
                        int i17 = f1.o.f14038a;
                        o.a.a("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.f2904t0;
                        RecyclerView.e eVar = recyclerView2.f2887l;
                        yVar.f3018d = 1;
                        yVar.f3019e = eVar.e();
                        yVar.f3021g = false;
                        yVar.f3022h = false;
                        yVar.f3023i = false;
                        for (int i18 = 0; i18 < bVar2.f3261d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f3260c[i18], j10);
                        }
                        o.a.b();
                    } catch (Throwable th2) {
                        int i19 = f1.o.f14038a;
                        o.a.b();
                        throw th2;
                    }
                } else {
                    continue;
                }
            }
            cVar.f3262a = false;
            cVar.f3263b = 0;
            cVar.f3264c = 0;
            cVar.f3265d = null;
            cVar.f3266e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = f1.o.f14038a;
            o.a.a("RV Prefetch");
            if (this.f3254a.isEmpty()) {
                this.f3255b = 0L;
                o.a.b();
                return;
            }
            int size = this.f3254a.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f3254a.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f3255b = 0L;
                o.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3256c);
            this.f3255b = 0L;
            o.a.b();
        } catch (Throwable th2) {
            this.f3255b = 0L;
            int i12 = f1.o.f14038a;
            o.a.b();
            throw th2;
        }
    }
}
