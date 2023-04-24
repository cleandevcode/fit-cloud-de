package i5;

import a5.k;
import a5.m;
import a5.p;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i5.a;
import m5.l;
import no.nordicsemi.android.dfu.DfuBaseService;
import t4.n;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: a */
    public int f16500a;

    /* renamed from: e */
    public Drawable f16504e;

    /* renamed from: f */
    public int f16505f;

    /* renamed from: g */
    public Drawable f16506g;

    /* renamed from: h */
    public int f16507h;

    /* renamed from: m */
    public boolean f16512m;

    /* renamed from: o */
    public Drawable f16514o;

    /* renamed from: p */
    public int f16515p;

    /* renamed from: t */
    public boolean f16519t;

    /* renamed from: u */
    public Resources.Theme f16520u;

    /* renamed from: v */
    public boolean f16521v;

    /* renamed from: w */
    public boolean f16522w;

    /* renamed from: x */
    public boolean f16523x;

    /* renamed from: z */
    public boolean f16525z;

    /* renamed from: b */
    public float f16501b = 1.0f;

    /* renamed from: c */
    public n f16502c = n.f27658c;

    /* renamed from: d */
    public com.bumptech.glide.j f16503d = com.bumptech.glide.j.NORMAL;

    /* renamed from: i */
    public boolean f16508i = true;

    /* renamed from: j */
    public int f16509j = -1;

    /* renamed from: k */
    public int f16510k = -1;

    /* renamed from: l */
    public r4.f f16511l = l5.a.f19392b;

    /* renamed from: n */
    public boolean f16513n = true;

    /* renamed from: q */
    public r4.h f16516q = new r4.h();

    /* renamed from: r */
    public m5.b f16517r = new m5.b();

    /* renamed from: s */
    public Class<?> f16518s = Object.class;

    /* renamed from: y */
    public boolean f16524y = true;

    public static boolean e(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T a(a<?> aVar) {
        if (this.f16521v) {
            return (T) clone().a(aVar);
        }
        if (e(aVar.f16500a, 2)) {
            this.f16501b = aVar.f16501b;
        }
        if (e(aVar.f16500a, 262144)) {
            this.f16522w = aVar.f16522w;
        }
        if (e(aVar.f16500a, 1048576)) {
            this.f16525z = aVar.f16525z;
        }
        if (e(aVar.f16500a, 4)) {
            this.f16502c = aVar.f16502c;
        }
        if (e(aVar.f16500a, 8)) {
            this.f16503d = aVar.f16503d;
        }
        if (e(aVar.f16500a, 16)) {
            this.f16504e = aVar.f16504e;
            this.f16505f = 0;
            this.f16500a &= -33;
        }
        if (e(aVar.f16500a, 32)) {
            this.f16505f = aVar.f16505f;
            this.f16504e = null;
            this.f16500a &= -17;
        }
        if (e(aVar.f16500a, 64)) {
            this.f16506g = aVar.f16506g;
            this.f16507h = 0;
            this.f16500a &= -129;
        }
        if (e(aVar.f16500a, 128)) {
            this.f16507h = aVar.f16507h;
            this.f16506g = null;
            this.f16500a &= -65;
        }
        if (e(aVar.f16500a, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY)) {
            this.f16508i = aVar.f16508i;
        }
        if (e(aVar.f16500a, DfuBaseService.ERROR_REMOTE_TYPE_SECURE)) {
            this.f16510k = aVar.f16510k;
            this.f16509j = aVar.f16509j;
        }
        if (e(aVar.f16500a, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) {
            this.f16511l = aVar.f16511l;
        }
        if (e(aVar.f16500a, 4096)) {
            this.f16518s = aVar.f16518s;
        }
        if (e(aVar.f16500a, DfuBaseService.ERROR_REMOTE_MASK)) {
            this.f16514o = aVar.f16514o;
            this.f16515p = 0;
            this.f16500a &= -16385;
        }
        if (e(aVar.f16500a, DfuBaseService.ERROR_CONNECTION_MASK)) {
            this.f16515p = aVar.f16515p;
            this.f16514o = null;
            this.f16500a &= -8193;
        }
        if (e(aVar.f16500a, DfuBaseService.ERROR_CONNECTION_STATE_MASK)) {
            this.f16520u = aVar.f16520u;
        }
        if (e(aVar.f16500a, 65536)) {
            this.f16513n = aVar.f16513n;
        }
        if (e(aVar.f16500a, 131072)) {
            this.f16512m = aVar.f16512m;
        }
        if (e(aVar.f16500a, 2048)) {
            this.f16517r.putAll(aVar.f16517r);
            this.f16524y = aVar.f16524y;
        }
        if (e(aVar.f16500a, 524288)) {
            this.f16523x = aVar.f16523x;
        }
        if (!this.f16513n) {
            this.f16517r.clear();
            this.f16512m = false;
            this.f16500a = this.f16500a & (-2049) & (-131073);
            this.f16524y = true;
        }
        this.f16500a |= aVar.f16500a;
        this.f16516q.f25218b.j(aVar.f16516q.f25218b);
        m();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            r4.h hVar = new r4.h();
            t10.f16516q = hVar;
            hVar.f25218b.j(this.f16516q.f25218b);
            m5.b bVar = new m5.b();
            t10.f16517r = bVar;
            bVar.putAll(this.f16517r);
            t10.f16519t = false;
            t10.f16521v = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T c(Class<?> cls) {
        if (this.f16521v) {
            return (T) clone().c(cls);
        }
        this.f16518s = cls;
        this.f16500a |= 4096;
        m();
        return this;
    }

    public final T d(n nVar) {
        if (this.f16521v) {
            return (T) clone().d(nVar);
        }
        b0.c.i(nVar);
        this.f16502c = nVar;
        this.f16500a |= 4;
        m();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f16501b, this.f16501b) == 0 && this.f16505f == aVar.f16505f && l.b(this.f16504e, aVar.f16504e) && this.f16507h == aVar.f16507h && l.b(this.f16506g, aVar.f16506g) && this.f16515p == aVar.f16515p && l.b(this.f16514o, aVar.f16514o) && this.f16508i == aVar.f16508i && this.f16509j == aVar.f16509j && this.f16510k == aVar.f16510k && this.f16512m == aVar.f16512m && this.f16513n == aVar.f16513n && this.f16522w == aVar.f16522w && this.f16523x == aVar.f16523x && this.f16502c.equals(aVar.f16502c) && this.f16503d == aVar.f16503d && this.f16516q.equals(aVar.f16516q) && this.f16517r.equals(aVar.f16517r) && this.f16518s.equals(aVar.f16518s) && l.b(this.f16511l, aVar.f16511l) && l.b(this.f16520u, aVar.f16520u)) {
                return true;
            }
        }
        return false;
    }

    public final T f() {
        T t10 = (T) g(m.f293b, new a5.j());
        t10.f16524y = true;
        return t10;
    }

    public final a g(m mVar, a5.f fVar) {
        if (this.f16521v) {
            return clone().g(mVar, fVar);
        }
        r4.g gVar = m.f297f;
        b0.c.i(mVar);
        n(gVar, mVar);
        return u(fVar, false);
    }

    public final T h(int i10, int i11) {
        if (this.f16521v) {
            return (T) clone().h(i10, i11);
        }
        this.f16510k = i10;
        this.f16509j = i11;
        this.f16500a |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE;
        m();
        return this;
    }

    public int hashCode() {
        float f10 = this.f16501b;
        char[] cArr = l.f20382a;
        return l.g(l.g(l.g(l.g(l.g(l.g(l.g(l.h(l.h(l.h(l.h((((l.h(l.g((l.g((l.g(((Float.floatToIntBits(f10) + 527) * 31) + this.f16505f, this.f16504e) * 31) + this.f16507h, this.f16506g) * 31) + this.f16515p, this.f16514o), this.f16508i) * 31) + this.f16509j) * 31) + this.f16510k, this.f16512m), this.f16513n), this.f16522w), this.f16523x), this.f16502c), this.f16503d), this.f16516q), this.f16517r), this.f16518s), this.f16511l), this.f16520u);
    }

    public final T i(int i10) {
        if (this.f16521v) {
            return (T) clone().i(i10);
        }
        this.f16507h = i10;
        this.f16506g = null;
        this.f16500a = (this.f16500a | 128) & (-65);
        m();
        return this;
    }

    public final a l() {
        com.bumptech.glide.j jVar = com.bumptech.glide.j.LOW;
        if (this.f16521v) {
            return clone().l();
        }
        this.f16503d = jVar;
        this.f16500a |= 8;
        m();
        return this;
    }

    public final void m() {
        if (this.f16519t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T n(r4.g<Y> gVar, Y y10) {
        if (this.f16521v) {
            return (T) clone().n(gVar, y10);
        }
        b0.c.i(gVar);
        b0.c.i(y10);
        this.f16516q.f25218b.put(gVar, y10);
        m();
        return this;
    }

    public final a o(l5.b bVar) {
        if (this.f16521v) {
            return clone().o(bVar);
        }
        this.f16511l = bVar;
        this.f16500a |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        m();
        return this;
    }

    public final a p() {
        if (this.f16521v) {
            return clone().p();
        }
        this.f16508i = false;
        this.f16500a |= DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        m();
        return this;
    }

    public final a r(m.c cVar, k kVar) {
        if (this.f16521v) {
            return clone().r(cVar, kVar);
        }
        r4.g gVar = m.f297f;
        b0.c.i(cVar);
        n(gVar, cVar);
        return u(kVar, true);
    }

    public final <Y> T t(Class<Y> cls, r4.l<Y> lVar, boolean z10) {
        if (this.f16521v) {
            return (T) clone().t(cls, lVar, z10);
        }
        b0.c.i(lVar);
        this.f16517r.put(cls, lVar);
        this.f16513n = true;
        int i10 = this.f16500a | 2048 | 65536;
        this.f16500a = i10;
        this.f16524y = false;
        if (z10) {
            this.f16500a = i10 | 131072;
            this.f16512m = true;
        }
        m();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T u(r4.l<Bitmap> lVar, boolean z10) {
        if (this.f16521v) {
            return (T) clone().u(lVar, z10);
        }
        p pVar = new p(lVar, z10);
        t(Bitmap.class, lVar, z10);
        t(Drawable.class, pVar, z10);
        t(BitmapDrawable.class, pVar, z10);
        t(e5.c.class, new e5.e(lVar), z10);
        m();
        return this;
    }

    public final a v() {
        if (this.f16521v) {
            return clone().v();
        }
        this.f16525z = true;
        this.f16500a |= 1048576;
        m();
        return this;
    }
}
