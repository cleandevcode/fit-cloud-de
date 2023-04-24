package com.topstep.fitcloud.pro.shared.data.bean;

import com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean;
import gm.l;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.l0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class DialPacketComplexBean_ComponentJsonAdapter extends t<DialPacketComplexBean.Component> {

    /* renamed from: a */
    public final y.a f9798a;

    /* renamed from: b */
    public final t<List<String>> f9799b;

    /* renamed from: c */
    public volatile Constructor<DialPacketComplexBean.Component> f9800c;

    public DialPacketComplexBean_ComponentJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9798a = y.a.a("urls");
        this.f9799b = h0Var.c(l0.d(List.class, String.class), u.f28881a, "urls");
    }

    @Override // mf.t
    public final DialPacketComplexBean.Component b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        List<String> list = null;
        int i10 = -1;
        while (yVar.q()) {
            int L = yVar.L(this.f9798a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                list = this.f9799b.b(yVar);
                i10 &= -2;
            }
        }
        yVar.j();
        if (i10 == -2) {
            return new DialPacketComplexBean.Component(list);
        }
        Constructor<DialPacketComplexBean.Component> constructor = this.f9800c;
        if (constructor == null) {
            constructor = DialPacketComplexBean.Component.class.getDeclaredConstructor(List.class, Integer.TYPE, b.f22341c);
            this.f9800c = constructor;
            l.e(constructor, "DialPacketComplexBean.Co…his.constructorRef = it }");
        }
        DialPacketComplexBean.Component newInstance = constructor.newInstance(list, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, DialPacketComplexBean.Component component) {
        DialPacketComplexBean.Component component2 = component;
        l.f(e0Var, "writer");
        if (component2 != null) {
            e0Var.b();
            e0Var.s("urls");
            this.f9799b.f(e0Var, component2.f9790a);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DialPacketComplexBean.Component)";
    }
}
