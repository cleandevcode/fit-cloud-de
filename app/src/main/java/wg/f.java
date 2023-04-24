package wg;

import java.lang.reflect.Type;
import mf.e0;
import mf.h0;
import mf.l0;
import mf.t;
import mf.y;
import p000do.a;
import vg.l;

/* loaded from: classes2.dex */
public final class f<T> extends t<vg.k<T>> {

    /* renamed from: a */
    public final t<l<T>> f29820a;

    public f(h0 h0Var, Type[] typeArr) {
        gm.l.f(h0Var, "moshi");
        if (typeArr.length == 1) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("JsonAdapter");
            bVar.b("create new ObjectNonNullJsonAdapter for " + typeArr[0], new Object[0]);
            this.f29820a = h0Var.b(l0.d(l.class, typeArr[0]));
            return;
        }
        String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
        gm.l.e(str, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalArgumentException(str.toString());
    }

    @Override // mf.t
    public final Object b(y yVar) {
        T a10;
        gm.l.f(yVar, "reader");
        l<T> b10 = this.f29820a.b(yVar);
        if (b10 != null && (a10 = b10.a()) != null) {
            return new vg.k(b10.f29377a, b10.f29378b, a10);
        }
        throw nf.b.m("data", "data", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        gm.l.f(e0Var, "writer");
        this.f29820a.f(e0Var, (vg.k) obj);
    }

    public final String toString() {
        return "ObjectNonNullJsonAdapter";
    }
}
