package t4;

import n5.a;
import n5.d;

/* loaded from: classes.dex */
public final class w<Z> implements x<Z>, a.d {

    /* renamed from: e */
    public static final a.c f27744e = n5.a.a(20, new a());

    /* renamed from: a */
    public final d.a f27745a = new d.a();

    /* renamed from: b */
    public x<Z> f27746b;

    /* renamed from: c */
    public boolean f27747c;

    /* renamed from: d */
    public boolean f27748d;

    /* loaded from: classes.dex */
    public class a implements a.b<w<?>> {
        @Override // n5.a.b
        public final w<?> a() {
            return new w<>();
        }
    }

    public final synchronized void a() {
        this.f27745a.a();
        if (!this.f27747c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f27747c = false;
        if (this.f27748d) {
            c();
        }
    }

    @Override // t4.x
    public final int b() {
        return this.f27746b.b();
    }

    @Override // t4.x
    public final synchronized void c() {
        this.f27745a.a();
        this.f27748d = true;
        if (!this.f27747c) {
            this.f27746b.c();
            this.f27746b = null;
            f27744e.release(this);
        }
    }

    @Override // t4.x
    public final Class<Z> d() {
        return this.f27746b.d();
    }

    @Override // n5.a.d
    public final d.a e() {
        return this.f27745a;
    }

    @Override // t4.x
    public final Z get() {
        return this.f27746b.get();
    }
}
