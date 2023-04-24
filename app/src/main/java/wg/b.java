package wg;

import gm.l;
import java.lang.reflect.Type;
import java.util.List;
import mf.e0;
import mf.h0;
import mf.l0;
import mf.t;
import mf.y;
import p000do.a;

/* loaded from: classes2.dex */
public final class b<T> extends t<vg.h<T>> {

    /* renamed from: a */
    public final t<vg.i<T>> f29813a;

    public b(h0 h0Var, Type[] typeArr) {
        l.f(h0Var, "moshi");
        if (typeArr.length == 1) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("JsonAdapter");
            bVar.b("create new ListNonNullJsonAdapter for " + typeArr[0], new Object[0]);
            this.f29813a = h0Var.b(l0.d(vg.i.class, typeArr[0]));
            return;
        }
        String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
        l.e(str, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalArgumentException(str.toString());
    }

    @Override // mf.t
    public final Object b(y yVar) {
        List<T> a10;
        l.f(yVar, "reader");
        vg.i<T> b10 = this.f29813a.b(yVar);
        if (b10 != null && (a10 = b10.a()) != null) {
            if (!(!a10.isEmpty())) {
                a10 = null;
            }
            if (a10 != null) {
                return new vg.h(b10.f29377a, b10.f29378b, a10);
            }
        }
        throw nf.b.m("data", "data", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        l.f(e0Var, "writer");
        this.f29813a.f(e0Var, (vg.h) obj);
    }

    public final String toString() {
        return "ListNonNullJsonAdapter";
    }
}
