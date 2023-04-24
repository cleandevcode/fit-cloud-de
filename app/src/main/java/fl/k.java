package fl;

import java.util.Objects;
import yk.a;
import yk.b;

/* loaded from: classes2.dex */
public final class k<T, K> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.e<? super T, K> f14519b;

    /* renamed from: c */
    public final wk.b<? super K, ? super K> f14520c;

    /* loaded from: classes2.dex */
    public static final class a<T, K> extends al.a<T, T> {

        /* renamed from: f */
        public final wk.e<? super T, K> f14521f;

        /* renamed from: g */
        public final wk.b<? super K, ? super K> f14522g;

        /* renamed from: h */
        public K f14523h;

        /* renamed from: i */
        public boolean f14524i;

        public a(tk.n<? super T> nVar, wk.e<? super T, K> eVar, wk.b<? super K, ? super K> bVar) {
            super(nVar);
            this.f14521f = eVar;
            this.f14522g = bVar;
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f606d) {
                return;
            }
            if (this.f607e == 0) {
                try {
                    K apply = this.f14521f.apply(t10);
                    if (this.f14524i) {
                        wk.b<? super K, ? super K> bVar = this.f14522g;
                        K k10 = this.f14523h;
                        ((b.a) bVar).getClass();
                        boolean equals = Objects.equals(k10, apply);
                        this.f14523h = apply;
                        if (equals) {
                            return;
                        }
                    } else {
                        this.f14524i = true;
                        this.f14523h = apply;
                    }
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    this.f604b.c();
                    onError(th2);
                    return;
                }
            }
            this.f603a.b(t10);
        }

        @Override // nl.c
        public final int d(int i10) {
            return e(i10);
        }

        @Override // nl.f
        public final T poll() {
            T poll;
            boolean equals;
            do {
                poll = this.f605c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f14521f.apply(poll);
                if (!this.f14524i) {
                    this.f14524i = true;
                    this.f14523h = apply;
                    return poll;
                }
                wk.b<? super K, ? super K> bVar = this.f14522g;
                K k10 = this.f14523h;
                ((b.a) bVar).getClass();
                equals = Objects.equals(k10, apply);
                this.f14523h = apply;
            } while (equals);
            return poll;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tk.l lVar) {
        super(lVar);
        a.f fVar = yk.a.f31786a;
        b.a aVar = yk.b.f31795a;
        this.f14519b = fVar;
        this.f14520c = aVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14519b, this.f14520c));
    }
}
