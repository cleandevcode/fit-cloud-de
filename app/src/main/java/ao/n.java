package ao;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class n implements d<Object> {

    /* renamed from: a */
    public final /* synthetic */ pm.i f3836a;

    public n(pm.j jVar) {
        this.f3836a = jVar;
    }

    @Override // ao.d
    public final void a(b<Object> bVar, b0<Object> b0Var) {
        boolean z10;
        pm.i iVar;
        Object f10;
        gm.l.g(bVar, "call");
        gm.l.g(b0Var, "response");
        int i10 = b0Var.f3791a.f32532d;
        if (200 <= i10 && 299 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = b0Var.f3792b;
            if (f10 == null) {
                zm.w j10 = bVar.j();
                j10.getClass();
                Object cast = k.class.cast(j10.f32755f.get(k.class));
                if (cast != null) {
                    Method method = ((k) cast).f3832a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    gm.l.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    gm.l.b(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    tl.c cVar = new tl.c(sb2.toString());
                    iVar = this.f3836a;
                    f10 = mf.a0.f(cVar);
                } else {
                    tl.c cVar2 = new tl.c();
                    gm.l.j(gm.l.class.getName(), cVar2);
                    throw cVar2;
                }
            } else {
                iVar = this.f3836a;
            }
        } else {
            iVar = this.f3836a;
            f10 = mf.a0.f(new i(b0Var));
        }
        iVar.l(f10);
    }

    @Override // ao.d
    public final void b(b<Object> bVar, Throwable th2) {
        gm.l.g(bVar, "call");
        gm.l.g(th2, "t");
        this.f3836a.l(mf.a0.f(th2));
    }
}
