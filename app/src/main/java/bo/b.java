package bo;

import ao.f;
import gm.l;
import ln.e;
import ln.h;
import mf.c0;
import mf.t;
import zm.s;
import zm.x;
import zm.z;

/* loaded from: classes2.dex */
public final class b<T> implements f<T, z> {

    /* renamed from: b */
    public static final s f4491b;

    /* renamed from: a */
    public final t<T> f4492a;

    static {
        s.f32677f.getClass();
        f4491b = s.a.a("application/json; charset=UTF-8");
    }

    public b(t<T> tVar) {
        this.f4492a = tVar;
    }

    @Override // ao.f
    public final z a(Object obj) {
        e eVar = new e();
        this.f4492a.f(new c0(eVar), obj);
        s sVar = f4491b;
        h I = eVar.I();
        z.f32767a.getClass();
        l.f(I, "content");
        return new x(sVar, I);
    }
}
