package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import b1.a;
import h.d;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: m */
    public static final /* synthetic */ int f15693m = 0;

    /* renamed from: a */
    public c f15694a;

    /* renamed from: b */
    public Rect f15695b;

    /* renamed from: c */
    public Drawable f15696c;

    /* renamed from: d */
    public Drawable f15697d;

    /* renamed from: f */
    public boolean f15699f;

    /* renamed from: h */
    public boolean f15701h;

    /* renamed from: i */
    public a f15702i;

    /* renamed from: j */
    public long f15703j;

    /* renamed from: k */
    public long f15704k;

    /* renamed from: l */
    public C0280b f15705l;

    /* renamed from: e */
    public int f15698e = 255;

    /* renamed from: g */
    public int f15700g = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ b f15706a;

        public a(d dVar) {
            this.f15706a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15706a.a(true);
            this.f15706a.invalidateSelf();
        }
    }

    /* renamed from: h.b$b */
    /* loaded from: classes.dex */
    public static class C0280b implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f15707a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f15707a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f15707a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a */
        public final b f15708a;

        /* renamed from: b */
        public Resources f15709b;

        /* renamed from: c */
        public int f15710c;

        /* renamed from: d */
        public int f15711d;

        /* renamed from: e */
        public int f15712e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f15713f;

        /* renamed from: g */
        public Drawable[] f15714g;

        /* renamed from: h */
        public int f15715h;

        /* renamed from: i */
        public boolean f15716i;

        /* renamed from: j */
        public boolean f15717j;

        /* renamed from: k */
        public Rect f15718k;

        /* renamed from: l */
        public boolean f15719l;

        /* renamed from: m */
        public boolean f15720m;

        /* renamed from: n */
        public int f15721n;

        /* renamed from: o */
        public int f15722o;

        /* renamed from: p */
        public int f15723p;

        /* renamed from: q */
        public int f15724q;

        /* renamed from: r */
        public boolean f15725r;

        /* renamed from: s */
        public int f15726s;

        /* renamed from: t */
        public boolean f15727t;

        /* renamed from: u */
        public boolean f15728u;

        /* renamed from: v */
        public boolean f15729v;

        /* renamed from: w */
        public boolean f15730w;

        /* renamed from: x */
        public int f15731x;

        /* renamed from: y */
        public int f15732y;

        /* renamed from: z */
        public int f15733z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            int i10;
            SparseArray<Drawable.ConstantState> sparseArray;
            this.f15716i = false;
            this.f15719l = false;
            this.f15730w = true;
            this.f15732y = 0;
            this.f15733z = 0;
            this.f15708a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f15709b;
            } else {
                resources2 = null;
            }
            this.f15709b = resources2;
            if (cVar != null) {
                i10 = cVar.f15710c;
            } else {
                i10 = 0;
            }
            int i11 = b.f15693m;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f15710c = i10;
            if (cVar != null) {
                this.f15711d = cVar.f15711d;
                this.f15712e = cVar.f15712e;
                this.f15728u = true;
                this.f15729v = true;
                this.f15716i = cVar.f15716i;
                this.f15719l = cVar.f15719l;
                this.f15730w = cVar.f15730w;
                this.f15731x = cVar.f15731x;
                this.f15732y = cVar.f15732y;
                this.f15733z = cVar.f15733z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.f15710c == i10) {
                    if (cVar.f15717j) {
                        this.f15718k = cVar.f15718k != null ? new Rect(cVar.f15718k) : null;
                        this.f15717j = true;
                    }
                    if (cVar.f15720m) {
                        this.f15721n = cVar.f15721n;
                        this.f15722o = cVar.f15722o;
                        this.f15723p = cVar.f15723p;
                        this.f15724q = cVar.f15724q;
                        this.f15720m = true;
                    }
                }
                if (cVar.f15725r) {
                    this.f15726s = cVar.f15726s;
                    this.f15725r = true;
                }
                if (cVar.f15727t) {
                    this.f15727t = true;
                }
                Drawable[] drawableArr = cVar.f15714g;
                this.f15714g = new Drawable[drawableArr.length];
                this.f15715h = cVar.f15715h;
                SparseArray<Drawable.ConstantState> sparseArray2 = cVar.f15713f;
                if (sparseArray2 != null) {
                    sparseArray = sparseArray2.clone();
                } else {
                    sparseArray = new SparseArray<>(this.f15715h);
                }
                this.f15713f = sparseArray;
                int i12 = this.f15715h;
                for (int i13 = 0; i13 < i12; i13++) {
                    Drawable drawable = drawableArr[i13];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f15713f.put(i13, constantState);
                        } else {
                            this.f15714g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.f15714g = new Drawable[10];
            this.f15715h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f15715h;
            if (i10 >= this.f15714g.length) {
                int i11 = i10 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f15714g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f15714g = drawableArr;
                int[][] iArr = new int[i11];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f15708a);
            this.f15714g[i10] = drawable;
            this.f15715h++;
            this.f15712e = drawable.getChangingConfigurations() | this.f15712e;
            this.f15725r = false;
            this.f15727t = false;
            this.f15718k = null;
            this.f15717j = false;
            this.f15720m = false;
            this.f15728u = false;
            return i10;
        }

        public final void b() {
            this.f15720m = true;
            c();
            int i10 = this.f15715h;
            Drawable[] drawableArr = this.f15714g;
            this.f15722o = -1;
            this.f15721n = -1;
            this.f15724q = 0;
            this.f15723p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f15721n) {
                    this.f15721n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f15722o) {
                    this.f15722o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f15723p) {
                    this.f15723p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f15724q) {
                    this.f15724q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f15713f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f15713f.keyAt(i10);
                    Drawable[] drawableArr = this.f15714g;
                    Drawable newDrawable = this.f15713f.valueAt(i10).newDrawable(this.f15709b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        b1.a.c(newDrawable, this.f15731x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f15708a);
                    drawableArr[keyAt] = mutate;
                }
                this.f15713f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i10 = this.f15715h;
            Drawable[] drawableArr = this.f15714g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (a.b.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f15713f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f15714g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f15713f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f15713f.valueAt(indexOfKey).newDrawable(this.f15709b);
            if (Build.VERSION.SDK_INT >= 23) {
                b1.a.c(newDrawable, this.f15731x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f15708a);
            this.f15714g[i10] = mutate;
            this.f15713f.removeAt(indexOfKey);
            if (this.f15713f.size() == 0) {
                this.f15713f = null;
            }
            return mutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f15711d | this.f15712e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f15699f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f15696c
            r4 = 0
            r5 = 255(0xff, double:1.26E-321)
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f15703j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f15698e
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r5
            int r10 = (int) r9
            h.b$c r9 = r13.f15694a
            int r9 = r9.f15732y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f15698e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f15703j = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f15697d
            if (r9 == 0) goto L61
            long r10 = r13.f15704k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r4, r4)
            r0 = 0
            r13.f15697d = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r5
            int r3 = (int) r10
            h.b$c r4 = r13.f15694a
            int r4 = r4.f15733z
            int r3 = r3 / r4
            int r4 = r13.f15698e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f15704k = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            h.b$a r14 = r13.f15702i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f15694a;
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f15715h;
            Drawable[] drawableArr = cVar.f15714g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && a.b.b(drawable)) {
                    a.b.a(drawableArr[i11], theme);
                    cVar.f15712e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f15709b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = cVar.f15710c;
                cVar.f15710c = i12;
                if (i13 != i12) {
                    cVar.f15720m = false;
                    cVar.f15717j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f15705l == null) {
            this.f15705l = new C0280b();
        }
        C0280b c0280b = this.f15705l;
        c0280b.f15707a = drawable.getCallback();
        drawable.setCallback(c0280b);
        try {
            if (this.f15694a.f15732y <= 0 && this.f15699f) {
                drawable.setAlpha(this.f15698e);
            }
            c cVar = this.f15694a;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.b.h(drawable, cVar.D);
                }
                c cVar2 = this.f15694a;
                if (cVar2.G) {
                    a.b.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f15694a.f15730w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                b1.a.c(drawable, b1.a.b(this));
            }
            a.C0049a.e(drawable, this.f15694a.A);
            Rect rect = this.f15695b;
            if (rect != null) {
                a.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0280b c0280b2 = this.f15705l;
            Drawable.Callback callback = c0280b2.f15707a;
            c0280b2.f15707a = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f15694a.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f15700g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$c r0 = r9.f15694a
            int r0 = r0.f15733z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f15697d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f15696c
            if (r0 == 0) goto L29
            r9.f15697d = r0
            h.b$c r0 = r9.f15694a
            int r0 = r0.f15733z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f15704k = r0
            goto L35
        L29:
            r9.f15697d = r4
            r9.f15704k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f15696c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$c r0 = r9.f15694a
            int r1 = r0.f15715h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f15696c = r0
            r9.f15700g = r10
            if (r0 == 0) goto L5a
            h.b$c r10 = r9.f15694a
            int r10 = r10.f15732y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f15703j = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f15696c = r4
            r10 = -1
            r9.f15700g = r10
        L5a:
            long r0 = r9.f15703j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f15704k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7c
        L67:
            h.b$a r0 = r9.f15702i
            if (r0 != 0) goto L76
            h.b$a r0 = new h.b$a
            r1 = r9
            h.d r1 = (h.d) r1
            r0.<init>(r1)
            r9.f15702i = r0
            goto L79
        L76:
            r9.unscheduleSelf(r0)
        L79:
            r9.a(r10)
        L7c:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f15697d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15698e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f15694a;
        return changingConfigurations | cVar.f15712e | cVar.f15711d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f15694a;
        boolean z10 = false;
        if (cVar.f15728u) {
            z10 = cVar.f15729v;
        } else {
            cVar.c();
            cVar.f15728u = true;
            int i10 = cVar.f15715h;
            Drawable[] drawableArr = cVar.f15714g;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (drawableArr[i11].getConstantState() == null) {
                        cVar.f15729v = false;
                        break;
                    }
                    i11++;
                } else {
                    cVar.f15729v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f15694a.f15711d = getChangingConfigurations();
            return this.f15694a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f15696c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f15695b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f15694a;
        if (cVar.f15719l) {
            if (!cVar.f15720m) {
                cVar.b();
            }
            return cVar.f15722o;
        }
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f15694a;
        if (cVar.f15719l) {
            if (!cVar.f15720m) {
                cVar.b();
            }
            return cVar.f15721n;
        }
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f15694a;
        if (cVar.f15719l) {
            if (!cVar.f15720m) {
                cVar.b();
            }
            return cVar.f15724q;
        }
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f15694a;
        if (cVar.f15719l) {
            if (!cVar.f15720m) {
                cVar.b();
            }
            return cVar.f15723p;
        }
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f15696c;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f15694a;
        if (cVar.f15725r) {
            return cVar.f15726s;
        }
        cVar.c();
        int i11 = cVar.f15715h;
        Drawable[] drawableArr = cVar.f15714g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        cVar.f15726s = i10;
        cVar.f15725r = true;
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f15694a;
        Rect rect2 = null;
        boolean z10 = true;
        if (!cVar.f15716i) {
            Rect rect3 = cVar.f15718k;
            if (rect3 == null && !cVar.f15717j) {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f15715h;
                Drawable[] drawableArr = cVar.f15714g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f15717j = true;
                cVar.f15718k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f15696c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if ((this.f15694a.A && b1.a.b(this) == 1) ? false : false) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f15694a;
        if (cVar != null) {
            cVar.f15725r = false;
            cVar.f15727t = false;
        }
        if (drawable == this.f15696c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f15694a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f15697d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f15697d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f15696c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f15699f) {
                this.f15696c.setAlpha(this.f15698e);
            }
        }
        if (this.f15704k != 0) {
            this.f15704k = 0L;
            z10 = true;
        }
        if (this.f15703j != 0) {
            this.f15703j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f15701h && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f15701h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15697d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f15696c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z10;
        c cVar = this.f15694a;
        int i11 = this.f15700g;
        int i12 = cVar.f15715h;
        Drawable[] drawableArr = cVar.f15714g;
        boolean z11 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = b1.a.c(drawable, i10);
                } else {
                    z10 = false;
                }
                if (i13 == i11) {
                    z11 = z10;
                }
            }
        }
        cVar.f15731x = i10;
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f15697d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f15696c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f15697d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f15696c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f15696c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f15699f && this.f15698e == i10) {
            return;
        }
        this.f15699f = true;
        this.f15698e = i10;
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            if (this.f15703j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f15694a;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f15696c;
            if (drawable != null) {
                a.C0049a.e(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f15694a;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f15696c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f15694a;
        if (cVar.f15730w != z10) {
            cVar.f15730w = z10;
            Drawable drawable = this.f15696c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f15695b;
        if (rect == null) {
            this.f15695b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f15696c;
        if (drawable != null) {
            a.b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f15694a;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            b1.a.e(this.f15696c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f15694a;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            b1.a.f(this.f15696c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f15697d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f15696c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f15696c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
