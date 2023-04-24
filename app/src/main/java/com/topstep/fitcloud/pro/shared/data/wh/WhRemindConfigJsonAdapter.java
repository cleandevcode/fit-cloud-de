package com.topstep.fitcloud.pro.shared.data.wh;

import gm.l;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class WhRemindConfigJsonAdapter extends t<WhRemindConfig> {

    /* renamed from: a */
    public final y.a f10115a;

    /* renamed from: b */
    public final t<Boolean> f10116b;

    /* renamed from: c */
    public final t<Integer> f10117c;

    /* renamed from: d */
    public volatile Constructor<WhRemindConfig> f10118d;

    public WhRemindConfigJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10115a = y.a.a("remindDevice", "remindTime", "remindAdvance", "remindType");
        Class cls = Boolean.TYPE;
        u uVar = u.f28881a;
        this.f10116b = h0Var.c(cls, uVar, "remindDevice");
        this.f10117c = h0Var.c(Integer.TYPE, uVar, "remindTime");
    }

    @Override // mf.t
    public final WhRemindConfig b(y yVar) {
        l.f(yVar, "reader");
        Boolean bool = Boolean.FALSE;
        Integer num = 0;
        yVar.b();
        Integer num2 = num;
        Integer num3 = num2;
        int i10 = -1;
        while (yVar.q()) {
            int L = yVar.L(this.f10115a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                bool = this.f10116b.b(yVar);
                if (bool == null) {
                    throw b.m("remindDevice", "remindDevice", yVar);
                }
                i10 &= -2;
            } else if (L == 1) {
                num = this.f10117c.b(yVar);
                if (num == null) {
                    throw b.m("remindTime", "remindTime", yVar);
                }
                i10 &= -3;
            } else if (L == 2) {
                num2 = this.f10117c.b(yVar);
                if (num2 == null) {
                    throw b.m("remindAdvance", "remindAdvance", yVar);
                }
                i10 &= -5;
            } else if (L == 3) {
                num3 = this.f10117c.b(yVar);
                if (num3 == null) {
                    throw b.m("remindType", "remindType", yVar);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -16) {
            return new WhRemindConfig(num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue());
        }
        Constructor<WhRemindConfig> constructor = this.f10118d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = WhRemindConfig.class.getDeclaredConstructor(Boolean.TYPE, cls, cls, cls, cls, b.f22341c);
            this.f10118d = constructor;
            l.e(constructor, "WhRemindConfig::class.ja…his.constructorRef = it }");
        }
        WhRemindConfig newInstance = constructor.newInstance(bool, num, num2, num3, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, WhRemindConfig whRemindConfig) {
        WhRemindConfig whRemindConfig2 = whRemindConfig;
        l.f(e0Var, "writer");
        if (whRemindConfig2 != null) {
            e0Var.b();
            e0Var.s("remindDevice");
            this.f10116b.f(e0Var, Boolean.valueOf(whRemindConfig2.f10111a));
            e0Var.s("remindTime");
            fb.b.b(whRemindConfig2.f10112b, this.f10117c, e0Var, "remindAdvance");
            fb.b.b(whRemindConfig2.f10113c, this.f10117c, e0Var, "remindType");
            this.f10117c.f(e0Var, Integer.valueOf(whRemindConfig2.f10114d));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(WhRemindConfig)";
    }
}
