package h8;

import g8.a;
import i8.b;
import java.util.Set;

/* loaded from: classes.dex */
public final class f0 implements b.c, u0 {

    /* renamed from: a */
    public final a.e f15945a;

    /* renamed from: b */
    public final a f15946b;

    /* renamed from: c */
    public i8.j f15947c = null;

    /* renamed from: d */
    public Set f15948d = null;

    /* renamed from: e */
    public boolean f15949e = false;

    /* renamed from: f */
    public final /* synthetic */ d f15950f;

    public f0(d dVar, a.e eVar, a aVar) {
        this.f15950f = dVar;
        this.f15945a = eVar;
        this.f15946b = aVar;
    }

    @Override // i8.b.c
    public final void a(f8.a aVar) {
        this.f15950f.f15938n.post(new e0(this, aVar));
    }

    public final void b(f8.a aVar) {
        c0 c0Var = (c0) this.f15950f.f15934j.get(this.f15946b);
        if (c0Var != null) {
            i8.p.c(c0Var.f15919m.f15938n);
            a.e eVar = c0Var.f15908b;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(aVar);
            eVar.b("onSignInFailed for " + name + " with " + valueOf);
            c0Var.p(aVar, null);
        }
    }
}
