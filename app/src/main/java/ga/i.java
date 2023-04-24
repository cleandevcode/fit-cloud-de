package ga;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import pm.g0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: m */
    public static final g f15116m = new g(0.5f);

    /* renamed from: a */
    public g0 f15117a;

    /* renamed from: b */
    public g0 f15118b;

    /* renamed from: c */
    public g0 f15119c;

    /* renamed from: d */
    public g0 f15120d;

    /* renamed from: e */
    public c f15121e;

    /* renamed from: f */
    public c f15122f;

    /* renamed from: g */
    public c f15123g;

    /* renamed from: h */
    public c f15124h;

    /* renamed from: i */
    public e f15125i;

    /* renamed from: j */
    public e f15126j;

    /* renamed from: k */
    public e f15127k;

    /* renamed from: l */
    public e f15128l;

    public i() {
        this.f15117a = new h();
        this.f15118b = new h();
        this.f15119c = new h();
        this.f15120d = new h();
        this.f15121e = new ga.a(0.0f);
        this.f15122f = new ga.a(0.0f);
        this.f15123g = new ga.a(0.0f);
        this.f15124h = new ga.a(0.0f);
        this.f15125i = new e();
        this.f15126j = new e();
        this.f15127k = new e();
        this.f15128l = new e();
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.ShapeAppearance);
        try {
            int i12 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i13 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i12);
            c b10 = b(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cVar);
            c b11 = b(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, b10);
            c b12 = b(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, b10);
            c b13 = b(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, b10);
            c b14 = b(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, b10);
            a aVar = new a();
            g0 j10 = p.b.j(i13);
            aVar.f15129a = j10;
            float a10 = a.a(j10);
            if (a10 != -1.0f) {
                aVar.f15133e = new ga.a(a10);
            }
            aVar.f15133e = b11;
            g0 j11 = p.b.j(i14);
            aVar.f15130b = j11;
            float a11 = a.a(j11);
            if (a11 != -1.0f) {
                aVar.f15134f = new ga.a(a11);
            }
            aVar.f15134f = b12;
            g0 j12 = p.b.j(i15);
            aVar.f15131c = j12;
            float a12 = a.a(j12);
            if (a12 != -1.0f) {
                aVar.f15135g = new ga.a(a12);
            }
            aVar.f15135g = b13;
            g0 j13 = p.b.j(i16);
            aVar.f15132d = j13;
            float a13 = a.a(j13);
            if (a13 != -1.0f) {
                aVar.f15136h = new ga.a(a13);
            }
            aVar.f15136h = b14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static c b(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new ga.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean c(RectF rectF) {
        boolean z10 = this.f15128l.getClass().equals(e.class) && this.f15126j.getClass().equals(e.class) && this.f15125i.getClass().equals(e.class) && this.f15127k.getClass().equals(e.class);
        float a10 = this.f15121e.a(rectF);
        return z10 && ((this.f15122f.a(rectF) > a10 ? 1 : (this.f15122f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f15124h.a(rectF) > a10 ? 1 : (this.f15124h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f15123g.a(rectF) > a10 ? 1 : (this.f15123g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f15118b instanceof h) && (this.f15117a instanceof h) && (this.f15119c instanceof h) && (this.f15120d instanceof h));
    }

    public final i d(float f10) {
        a aVar = new a(this);
        aVar.f15133e = new ga.a(f10);
        aVar.f15134f = new ga.a(f10);
        aVar.f15135g = new ga.a(f10);
        aVar.f15136h = new ga.a(f10);
        return new i(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public g0 f15129a;

        /* renamed from: b */
        public g0 f15130b;

        /* renamed from: c */
        public g0 f15131c;

        /* renamed from: d */
        public g0 f15132d;

        /* renamed from: e */
        public c f15133e;

        /* renamed from: f */
        public c f15134f;

        /* renamed from: g */
        public c f15135g;

        /* renamed from: h */
        public c f15136h;

        /* renamed from: i */
        public e f15137i;

        /* renamed from: j */
        public e f15138j;

        /* renamed from: k */
        public e f15139k;

        /* renamed from: l */
        public e f15140l;

        public a() {
            this.f15129a = new h();
            this.f15130b = new h();
            this.f15131c = new h();
            this.f15132d = new h();
            this.f15133e = new ga.a(0.0f);
            this.f15134f = new ga.a(0.0f);
            this.f15135g = new ga.a(0.0f);
            this.f15136h = new ga.a(0.0f);
            this.f15137i = new e();
            this.f15138j = new e();
            this.f15139k = new e();
            this.f15140l = new e();
        }

        public static float a(g0 g0Var) {
            if (g0Var instanceof h) {
                return ((h) g0Var).f15115a;
            }
            if (g0Var instanceof d) {
                return ((d) g0Var).f15066a;
            }
            return -1.0f;
        }

        public a(i iVar) {
            this.f15129a = new h();
            this.f15130b = new h();
            this.f15131c = new h();
            this.f15132d = new h();
            this.f15133e = new ga.a(0.0f);
            this.f15134f = new ga.a(0.0f);
            this.f15135g = new ga.a(0.0f);
            this.f15136h = new ga.a(0.0f);
            this.f15137i = new e();
            this.f15138j = new e();
            this.f15139k = new e();
            this.f15140l = new e();
            this.f15129a = iVar.f15117a;
            this.f15130b = iVar.f15118b;
            this.f15131c = iVar.f15119c;
            this.f15132d = iVar.f15120d;
            this.f15133e = iVar.f15121e;
            this.f15134f = iVar.f15122f;
            this.f15135g = iVar.f15123g;
            this.f15136h = iVar.f15124h;
            this.f15137i = iVar.f15125i;
            this.f15138j = iVar.f15126j;
            this.f15139k = iVar.f15127k;
            this.f15140l = iVar.f15128l;
        }
    }

    public i(a aVar) {
        this.f15117a = aVar.f15129a;
        this.f15118b = aVar.f15130b;
        this.f15119c = aVar.f15131c;
        this.f15120d = aVar.f15132d;
        this.f15121e = aVar.f15133e;
        this.f15122f = aVar.f15134f;
        this.f15123g = aVar.f15135g;
        this.f15124h = aVar.f15136h;
        this.f15125i = aVar.f15137i;
        this.f15126j = aVar.f15138j;
        this.f15127k = aVar.f15139k;
        this.f15128l = aVar.f15140l;
    }
}
