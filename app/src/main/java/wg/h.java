package wg;

import java.lang.reflect.Type;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import p000do.a;
import ul.u;
import vg.l;

/* loaded from: classes2.dex */
public final class h<T> extends t<l<T>> {

    /* renamed from: a */
    public final y.a f29822a;

    /* renamed from: b */
    public final t<Integer> f29823b;

    /* renamed from: c */
    public final t<String> f29824c;

    /* renamed from: d */
    public final t<T> f29825d;

    public h(h0 h0Var, Type[] typeArr) {
        gm.l.f(h0Var, "moshi");
        if (!(typeArr.length == 1)) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
            gm.l.e(str, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalArgumentException(str.toString());
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("JsonAdapter");
        bVar.b("create new ObjectNullableJsonAdapter for " + typeArr[0], new Object[0]);
        this.f29822a = y.a.a("errorCode", "errorMsg", "data");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f29823b = h0Var.c(cls, uVar, "errorCode");
        this.f29824c = h0Var.c(String.class, uVar, "errorMsg");
        this.f29825d = h0Var.c(typeArr[0], uVar, "data");
    }

    @Override // mf.t
    public final Object b(y yVar) {
        gm.l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        String str = null;
        T t10 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f29822a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f29823b.b(yVar);
                if (num == null) {
                    throw nf.b.m("errorCode", "errorCode", yVar);
                }
            } else if (L == 1) {
                str = this.f29824c.b(yVar);
            } else if (L == 2) {
                t10 = this.f29825d.b(yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return new l(intValue, str, t10);
            }
            throw new ig.c(intValue, str);
        }
        throw nf.b.g("errorCode", "errorCode", yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        l lVar = (l) obj;
        gm.l.f(e0Var, "writer");
        if (lVar != null) {
            e0Var.b();
            e0Var.s("errorCode");
            fb.b.b(lVar.f29377a, this.f29823b, e0Var, "errorMsg");
            this.f29824c.f(e0Var, lVar.f29378b);
            e0Var.s("data");
            this.f29825d.f(e0Var, lVar.a());
            e0Var.k();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "ObjectNullableJsonAdapter";
    }
}
