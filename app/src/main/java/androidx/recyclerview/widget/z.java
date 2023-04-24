package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0;
import androidx.recyclerview.widget.r0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public final r0.b f3336a;

    /* renamed from: b */
    public final o0.b f3337b;

    /* renamed from: c */
    public final RecyclerView.e<RecyclerView.b0> f3338c;

    /* renamed from: d */
    public final b f3339d;

    /* renamed from: e */
    public int f3340e;

    /* renamed from: f */
    public a f3341f = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.g {
        public a() {
            z.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            z zVar = z.this;
            zVar.f3340e = zVar.f3338c.e();
            g gVar = (g) z.this.f3339d;
            gVar.f3101a.h();
            gVar.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i10, int i11) {
            z zVar = z.this;
            g gVar = (g) zVar.f3339d;
            gVar.f3101a.j(i10 + gVar.b(zVar), i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            z zVar = z.this;
            g gVar = (g) zVar.f3339d;
            gVar.f3101a.j(i10 + gVar.b(zVar), i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            z zVar = z.this;
            zVar.f3340e += i11;
            g gVar = (g) zVar.f3339d;
            gVar.f3101a.k(i10 + gVar.b(zVar), i11);
            z zVar2 = z.this;
            if (zVar2.f3340e > 0 && zVar2.f3338c.f2949c == 2) {
                ((g) zVar2.f3339d).a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            z zVar = z.this;
            g gVar = (g) zVar.f3339d;
            int b10 = gVar.b(zVar);
            gVar.f3101a.i(i10 + b10, i11 + b10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            z zVar = z.this;
            zVar.f3340e -= i11;
            g gVar = (g) zVar.f3339d;
            gVar.f3101a.l(i10 + gVar.b(zVar), i11);
            z zVar2 = z.this;
            if (zVar2.f3340e < 1 && zVar2.f3338c.f2949c == 2) {
                ((g) zVar2.f3339d).a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void g() {
            ((g) z.this.f3339d).a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public z(RecyclerView.e eVar, g gVar, r0 r0Var, o0.b bVar) {
        this.f3338c = eVar;
        this.f3339d = gVar;
        this.f3336a = r0Var.b(this);
        this.f3337b = bVar;
        this.f3340e = eVar.e();
        eVar.u(this.f3341f);
    }
}
