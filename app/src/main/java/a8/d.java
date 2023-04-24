package a8;

import a8.d.a;

/* loaded from: classes.dex */
public final class d<T extends a> {

    /* renamed from: g */
    public static int f372g;

    /* renamed from: a */
    public int f373a;

    /* renamed from: b */
    public int f374b;

    /* renamed from: c */
    public Object[] f375c;

    /* renamed from: d */
    public int f376d;

    /* renamed from: e */
    public T f377e;

    /* renamed from: f */
    public float f378f;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public int f379a = -1;

        public abstract a a();
    }

    public d(int i10, T t10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.f374b = i10;
        this.f375c = new Object[i10];
        this.f376d = 0;
        this.f377e = t10;
        this.f378f = 1.0f;
        d();
    }

    public static synchronized d a(int i10, a aVar) {
        d dVar;
        synchronized (d.class) {
            dVar = new d(i10, aVar);
            int i11 = f372g;
            dVar.f373a = i11;
            f372g = i11 + 1;
        }
        return dVar;
    }

    public final synchronized T b() {
        T t10;
        if (this.f376d == -1 && this.f378f > 0.0f) {
            d();
        }
        Object[] objArr = this.f375c;
        int i10 = this.f376d;
        t10 = (T) objArr[i10];
        t10.f379a = -1;
        this.f376d = i10 - 1;
        return t10;
    }

    public final synchronized void c(T t10) {
        int i10 = t10.f379a;
        if (i10 != -1) {
            if (i10 == this.f373a) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t10.f379a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
        int i11 = this.f376d + 1;
        this.f376d = i11;
        if (i11 >= this.f375c.length) {
            int i12 = this.f374b;
            int i13 = i12 * 2;
            this.f374b = i13;
            Object[] objArr = new Object[i13];
            for (int i14 = 0; i14 < i12; i14++) {
                objArr[i14] = this.f375c[i14];
            }
            this.f375c = objArr;
        }
        t10.f379a = this.f373a;
        this.f375c[this.f376d] = t10;
    }

    public final void d() {
        float f10 = this.f378f;
        int i10 = this.f374b;
        int i11 = (int) (i10 * f10);
        if (i11 < 1) {
            i10 = 1;
        } else if (i11 <= i10) {
            i10 = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            this.f375c[i12] = this.f377e.a();
        }
        this.f376d = i10 - 1;
    }
}
