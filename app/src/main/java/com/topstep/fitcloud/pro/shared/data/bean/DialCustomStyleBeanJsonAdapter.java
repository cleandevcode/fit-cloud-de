package com.topstep.fitcloud.pro.shared.data.bean;

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
public final class DialCustomStyleBeanJsonAdapter extends t<DialCustomStyleBean> {

    /* renamed from: a */
    public final y.a f9773a;

    /* renamed from: b */
    public final t<String> f9774b;

    /* renamed from: c */
    public final t<Long> f9775c;

    /* renamed from: d */
    public volatile Constructor<DialCustomStyleBean> f9776d;

    public DialCustomStyleBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9773a = y.a.a("binUrl", "styleName", "binSize");
        u uVar = u.f28881a;
        this.f9774b = h0Var.c(String.class, uVar, "binUrl");
        this.f9775c = h0Var.c(Long.TYPE, uVar, "binSize");
    }

    @Override // mf.t
    public final DialCustomStyleBean b(y yVar) {
        l.f(yVar, "reader");
        Long l10 = 0L;
        yVar.b();
        int i10 = -1;
        String str = null;
        String str2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9773a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9774b.b(yVar);
                if (str == null) {
                    throw b.m("binUrl", "binUrl", yVar);
                }
            } else if (L == 1) {
                str2 = this.f9774b.b(yVar);
                if (str2 == null) {
                    throw b.m("styleName", "styleName", yVar);
                }
            } else if (L == 2) {
                l10 = this.f9775c.b(yVar);
                if (l10 == null) {
                    throw b.m("binSize", "binSize", yVar);
                }
                i10 &= -5;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -5) {
            if (str != null) {
                if (str2 != null) {
                    return new DialCustomStyleBean(str, l10.longValue(), str2);
                }
                throw b.g("styleName", "styleName", yVar);
            }
            throw b.g("binUrl", "binUrl", yVar);
        }
        Constructor<DialCustomStyleBean> constructor = this.f9776d;
        if (constructor == null) {
            constructor = DialCustomStyleBean.class.getDeclaredConstructor(String.class, String.class, Long.TYPE, Integer.TYPE, b.f22341c);
            this.f9776d = constructor;
            l.e(constructor, "DialCustomStyleBean::cla…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (str != null) {
            objArr[0] = str;
            if (str2 != null) {
                objArr[1] = str2;
                objArr[2] = l10;
                objArr[3] = Integer.valueOf(i10);
                objArr[4] = null;
                DialCustomStyleBean newInstance = constructor.newInstance(objArr);
                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw b.g("styleName", "styleName", yVar);
        }
        throw b.g("binUrl", "binUrl", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, DialCustomStyleBean dialCustomStyleBean) {
        DialCustomStyleBean dialCustomStyleBean2 = dialCustomStyleBean;
        l.f(e0Var, "writer");
        if (dialCustomStyleBean2 != null) {
            e0Var.b();
            e0Var.s("binUrl");
            this.f9774b.f(e0Var, dialCustomStyleBean2.f9770a);
            e0Var.s("styleName");
            this.f9774b.f(e0Var, dialCustomStyleBean2.f9771b);
            e0Var.s("binSize");
            this.f9775c.f(e0Var, Long.valueOf(dialCustomStyleBean2.f9772c));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DialCustomStyleBean)";
    }
}
