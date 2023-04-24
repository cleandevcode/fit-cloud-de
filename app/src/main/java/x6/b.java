package x6;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public final int f30329a;

    /* renamed from: b */
    public a f30330b;

    /* renamed from: c */
    public Integer f30331c;

    /* renamed from: e */
    public int f30333e;

    /* renamed from: g */
    public int f30335g;

    /* renamed from: d */
    public boolean f30332d = true;

    /* renamed from: f */
    public final y6.a[] f30334f = new y6.a[3];

    /* loaded from: classes.dex */
    public interface a {
        void a(double d10, double d11, double d12);

        void b();

        void c(double d10, double d11);
    }

    public b(int i10) {
        this.f30329a = i10;
    }

    public abstract float a(double d10, double d11, double d12, double d13);

    public abstract void b();

    public void c(y6.d dVar) {
        boolean z10;
        this.f30331c = dVar.f31179m;
        if (dVar.f31180n == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30332d = z10;
        this.f30333e = 0;
        y6.a[] aVarArr = this.f30334f;
        aVarArr[0] = null;
        aVarArr[1] = null;
        aVarArr[2] = null;
        this.f30335g = 0;
        if (z10) {
            b();
        }
    }

    public abstract void d();
}
