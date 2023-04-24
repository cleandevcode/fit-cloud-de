package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public class z<T> extends a0<T> {

    /* renamed from: l */
    public n.b<LiveData<?>, a<?>> f2810l = new n.b<>();

    /* loaded from: classes.dex */
    public static class a<V> implements b0<V> {

        /* renamed from: a */
        public final LiveData<V> f2811a;

        /* renamed from: b */
        public final b0<? super V> f2812b;

        /* renamed from: c */
        public int f2813c = -1;

        public a(a0 a0Var, s.d0 d0Var) {
            this.f2811a = a0Var;
            this.f2812b = d0Var;
        }

        @Override // androidx.lifecycle.b0
        public final void a(V v10) {
            int i10 = this.f2813c;
            int i11 = this.f2811a.f2644g;
            if (i10 != i11) {
                this.f2813c = i11;
                this.f2812b.a(v10);
            }
        }

        public final void b() {
            this.f2811a.f(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2810l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            ((a) ((Map.Entry) eVar.next()).getValue()).b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2810l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2811a.i(aVar);
            } else {
                return;
            }
        }
    }
}
