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
import ul.u;

/* loaded from: classes2.dex */
public final class d<T> extends t<vg.i<T>> {

    /* renamed from: a */
    public final y.a f29815a;

    /* renamed from: b */
    public final t<Integer> f29816b;

    /* renamed from: c */
    public final t<String> f29817c;

    /* renamed from: d */
    public final t<List<T>> f29818d;

    public d(h0 h0Var, Type[] typeArr) {
        l.f(h0Var, "moshi");
        if (!(typeArr.length == 1)) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
            l.e(str, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalArgumentException(str.toString());
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("JsonAdapter");
        bVar.b("create new ListNullableJsonAdapter for " + typeArr[0], new Object[0]);
        this.f29815a = y.a.a("errorCode", "errorMsg", "data");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f29816b = h0Var.c(cls, uVar, "errorCode");
        this.f29817c = h0Var.c(String.class, uVar, "errorMsg");
        this.f29818d = h0Var.c(l0.d(List.class, typeArr[0]), uVar, "data");
    }

    @Override // mf.t
    public final Object b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        String str = null;
        List<T> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f29815a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f29816b.b(yVar);
                if (num == null) {
                    throw nf.b.m("errorCode", "errorCode", yVar);
                }
            } else if (L == 1) {
                str = this.f29817c.b(yVar);
            } else if (L == 2) {
                list = this.f29818d.b(yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return new vg.i(intValue, str, list);
            }
            throw new ig.c(intValue, str);
        }
        throw nf.b.g("errorCode", "errorCode", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        vg.i iVar = (vg.i) obj;
        l.f(e0Var, "writer");
        if (iVar != null) {
            e0Var.b();
            e0Var.s("errorCode");
            fb.b.b(iVar.f29377a, this.f29816b, e0Var, "errorMsg");
            this.f29817c.f(e0Var, iVar.f29378b);
            e0Var.s("data");
            this.f29818d.f(e0Var, iVar.a());
            e0Var.k();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "ListNullableJsonAdapter";
    }
}
