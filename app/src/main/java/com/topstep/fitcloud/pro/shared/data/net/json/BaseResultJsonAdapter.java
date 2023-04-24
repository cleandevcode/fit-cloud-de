package com.topstep.fitcloud.pro.shared.data.net.json;

import gm.l;
import ig.c;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.k0;
import mf.o;
import mf.t;
import mf.y;
import nf.b;
import p000do.a;
import ul.u;
import vg.f;

@Metadata
/* loaded from: classes2.dex */
public final class BaseResultJsonAdapter extends t<f> {

    /* renamed from: a */
    public final y.a f10101a;

    /* renamed from: b */
    public final t<Integer> f10102b;

    /* renamed from: c */
    public final t<String> f10103c;

    public BaseResultJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        a.b bVar = a.f13275a;
        bVar.t("JsonAdapter");
        bVar.b("create new BaseResultJsonAdapter", new Object[0]);
        this.f10101a = y.a.a("errorCode", "errorMsg");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f10102b = h0Var.c(cls, uVar, "errorCode");
        this.f10103c = h0Var.c(String.class, uVar, "errorMsg");
    }

    @Override // mf.t
    @o
    /* renamed from: fromJson */
    public f b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        String str = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10101a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f10102b.b(yVar);
                if (num == null) {
                    throw b.m("errorCode", "errorCode", yVar);
                }
            } else if (L == 1) {
                str = this.f10103c.b(yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return new f(intValue, str);
            }
            throw new c(intValue, str);
        }
        throw b.g("errorCode", "errorCode", yVar);
    }

    @Override // mf.t
    @k0
    /* renamed from: toJson */
    public void f(e0 e0Var, f fVar) {
        l.f(e0Var, "writer");
        if (fVar != null) {
            e0Var.b();
            e0Var.s("errorCode");
            fb.b.b(fVar.f29377a, this.f10102b, e0Var, "errorMsg");
            this.f10103c.f(e0Var, fVar.f29378b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "BaseResultJsonAdapter";
    }
}
