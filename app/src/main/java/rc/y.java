package rc;

import fl.c1;
import fl.e1;
import fl.m0;
import fl.x0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import tc.j0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    public final tk.o f25517a;

    /* renamed from: b */
    public final a f25518b;

    /* renamed from: c */
    public final b f25519c = new b();

    /* renamed from: d */
    public final c f25520d = new c();

    /* loaded from: classes.dex */
    public class a implements tk.m<q, q> {

        /* renamed from: b */
        public final c1 f25522b;

        /* renamed from: a */
        public final b0 f25521a = new b0();

        /* renamed from: c */
        public final C0462a f25523c = new C0462a();

        /* renamed from: d */
        public final b f25524d = new b();

        /* renamed from: rc.y$a$a */
        /* loaded from: classes.dex */
        public class C0462a implements wk.e<q, tk.i<?>> {
            public C0462a() {
                a.this = r1;
            }

            @Override // wk.e
            public final tk.i<?> apply(q qVar) {
                return a.this.f25522b;
            }
        }

        /* loaded from: classes.dex */
        public class b implements wk.e<tk.i<q>, tk.i<q>> {
            @Override // wk.e
            public final tk.i<q> apply(tk.i<q> iVar) {
                tk.i<q> iVar2 = iVar;
                iVar2.getClass();
                return new x0(iVar2);
            }
        }

        /* loaded from: classes.dex */
        public class c implements wk.e<tk.i<q>, tk.l<q>> {
            public c() {
                a.this = r1;
            }

            @Override // wk.e
            public final tk.l<q> apply(tk.i<q> iVar) {
                tk.i<q> iVar2 = iVar;
                tk.i<R> B = iVar2.B(a.this.f25523c);
                int i10 = tk.d.f28269a;
                Objects.requireNonNull(B, "boundaryIndicator is null");
                yk.b.a(i10, "bufferSize");
                return new e1(iVar2, B, i10).o(a.this.f25524d).u(a.this.f25521a);
            }
        }

        public a(tk.o oVar) {
            this.f25522b = tk.i.E(10L, TimeUnit.SECONDS, oVar);
        }

        @Override // tk.m
        public final tk.i a(tk.i iVar) {
            c cVar = new c();
            iVar.getClass();
            return new m0(iVar, cVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements tk.m<q, q> {
        public b() {
            y.this = r1;
        }

        @Override // tk.m
        public final tk.i a(tk.i iVar) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            tk.o oVar = y.this.f25517a;
            iVar.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(oVar, "scheduler is null");
            return new fl.h(10L, iVar, oVar, timeUnit).u(new c0());
        }
    }

    /* loaded from: classes.dex */
    public class c implements tk.m<q, q> {

        /* loaded from: classes.dex */
        public class a implements wk.e<tk.i<q>, tk.i<q>> {
            public a() {
                c.this = r1;
            }

            @Override // wk.e
            public final tk.i<q> apply(tk.i<q> iVar) {
                tk.i<q> iVar2 = iVar;
                return tk.i.v(iVar2.c(y.this.f25518b), iVar2.c(y.this.f25519c));
            }
        }

        public c() {
            y.this = r1;
        }

        @Override // tk.m
        public final tk.i a(tk.i iVar) {
            a aVar = new a();
            iVar.getClass();
            return new m0(iVar, aVar);
        }
    }

    public y(tk.o oVar) {
        this.f25517a = oVar;
        this.f25518b = new a(oVar);
    }

    public final tk.m<q, q> a(int i10) {
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 6) {
                    return j0.f27986a;
                }
                return new a0(this.f25520d);
            }
            return new a0(this.f25519c);
        }
        return new a0(this.f25518b);
    }
}
