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
public final class UserBeanJsonAdapter extends t<UserBean> {

    /* renamed from: a */
    public final y.a f9840a;

    /* renamed from: b */
    public final t<Long> f9841b;

    /* renamed from: c */
    public final t<String> f9842c;

    /* renamed from: d */
    public final t<Integer> f9843d;

    /* renamed from: e */
    public final t<Float> f9844e;

    /* renamed from: f */
    public volatile Constructor<UserBean> f9845f;

    public UserBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9840a = y.a.a("userId", "phone", "email", "nickName", "sex", "birthday", "height", "weight", "avatar", "identityId", "hasProfile", "hasPassword", "hasIdentity", "lastModifyTime");
        Class cls = Long.TYPE;
        u uVar = u.f28881a;
        this.f9841b = h0Var.c(cls, uVar, "userId");
        this.f9842c = h0Var.c(String.class, uVar, "phone");
        this.f9843d = h0Var.c(Integer.TYPE, uVar, "sex");
        this.f9844e = h0Var.c(Float.TYPE, uVar, "height");
    }

    @Override // mf.t
    public final UserBean b(y yVar) {
        l.f(yVar, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        yVar.b();
        Integer num2 = num;
        Float f10 = valueOf;
        Float f11 = f10;
        Long l10 = 0L;
        int i10 = -1;
        Long l11 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = num2;
        Integer num4 = num3;
        while (yVar.q()) {
            switch (yVar.L(this.f9840a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    l11 = this.f9841b.b(yVar);
                    if (l11 != null) {
                        break;
                    } else {
                        throw b.m("userId", "userId", yVar);
                    }
                case 1:
                    str = this.f9842c.b(yVar);
                    i10 &= -3;
                    break;
                case 2:
                    str2 = this.f9842c.b(yVar);
                    i10 &= -5;
                    break;
                case 3:
                    str3 = this.f9842c.b(yVar);
                    i10 &= -9;
                    break;
                case 4:
                    num = this.f9843d.b(yVar);
                    if (num != null) {
                        i10 &= -17;
                        break;
                    } else {
                        throw b.m("sex", "sex", yVar);
                    }
                case 5:
                    str4 = this.f9842c.b(yVar);
                    i10 &= -33;
                    break;
                case 6:
                    f10 = this.f9844e.b(yVar);
                    if (f10 != null) {
                        i10 &= -65;
                        break;
                    } else {
                        throw b.m("height", "height", yVar);
                    }
                case 7:
                    f11 = this.f9844e.b(yVar);
                    if (f11 != null) {
                        i10 &= -129;
                        break;
                    } else {
                        throw b.m("weight", "weight", yVar);
                    }
                case 8:
                    str5 = this.f9842c.b(yVar);
                    i10 &= -257;
                    break;
                case 9:
                    str6 = this.f9842c.b(yVar);
                    i10 &= -513;
                    break;
                case 10:
                    num3 = this.f9843d.b(yVar);
                    if (num3 != null) {
                        i10 &= -1025;
                        break;
                    } else {
                        throw b.m("hasProfile", "hasProfile", yVar);
                    }
                case 11:
                    num4 = this.f9843d.b(yVar);
                    if (num4 != null) {
                        i10 &= -2049;
                        break;
                    } else {
                        throw b.m("hasPassword", "hasPassword", yVar);
                    }
                case 12:
                    num2 = this.f9843d.b(yVar);
                    if (num2 != null) {
                        i10 &= -4097;
                        break;
                    } else {
                        throw b.m("hasIdentity", "hasIdentity", yVar);
                    }
                case 13:
                    l10 = this.f9841b.b(yVar);
                    if (l10 != null) {
                        i10 &= -8193;
                        break;
                    } else {
                        throw b.m("lastModifyTime", "lastModifyTime", yVar);
                    }
            }
        }
        yVar.j();
        if (i10 == -16383) {
            if (l11 != null) {
                return new UserBean(l11.longValue(), str, str2, str3, num.intValue(), str4, f10.floatValue(), f11.floatValue(), str5, str6, num3.intValue(), num4.intValue(), num2.intValue(), l10.longValue());
            }
            throw b.g("userId", "userId", yVar);
        }
        Constructor<UserBean> constructor = this.f9845f;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            constructor = UserBean.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls2, String.class, cls3, cls3, String.class, String.class, cls2, cls2, cls2, cls, cls2, b.f22341c);
            this.f9845f = constructor;
            l.e(constructor, "UserBean::class.java.get…his.constructorRef = it }");
        }
        Object[] objArr = new Object[16];
        if (l11 != null) {
            objArr[0] = Long.valueOf(l11.longValue());
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = str3;
            objArr[4] = num;
            objArr[5] = str4;
            objArr[6] = f10;
            objArr[7] = f11;
            objArr[8] = str5;
            objArr[9] = str6;
            objArr[10] = num3;
            objArr[11] = num4;
            objArr[12] = num2;
            objArr[13] = l10;
            objArr[14] = Integer.valueOf(i10);
            objArr[15] = null;
            UserBean newInstance = constructor.newInstance(objArr);
            l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw b.g("userId", "userId", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, UserBean userBean) {
        UserBean userBean2 = userBean;
        l.f(e0Var, "writer");
        if (userBean2 != null) {
            e0Var.b();
            e0Var.s("userId");
            this.f9841b.f(e0Var, Long.valueOf(userBean2.f9826a));
            e0Var.s("phone");
            this.f9842c.f(e0Var, userBean2.f9827b);
            e0Var.s("email");
            this.f9842c.f(e0Var, userBean2.f9828c);
            e0Var.s("nickName");
            this.f9842c.f(e0Var, userBean2.f9829d);
            e0Var.s("sex");
            fb.b.b(userBean2.f9830e, this.f9843d, e0Var, "birthday");
            this.f9842c.f(e0Var, userBean2.f9831f);
            e0Var.s("height");
            this.f9844e.f(e0Var, Float.valueOf(userBean2.f9832g));
            e0Var.s("weight");
            this.f9844e.f(e0Var, Float.valueOf(userBean2.f9833h));
            e0Var.s("avatar");
            this.f9842c.f(e0Var, userBean2.f9834i);
            e0Var.s("identityId");
            this.f9842c.f(e0Var, userBean2.f9835j);
            e0Var.s("hasProfile");
            fb.b.b(userBean2.f9836k, this.f9843d, e0Var, "hasPassword");
            fb.b.b(userBean2.f9837l, this.f9843d, e0Var, "hasIdentity");
            fb.b.b(userBean2.f9838m, this.f9843d, e0Var, "lastModifyTime");
            this.f9841b.f(e0Var, Long.valueOf(userBean2.f9839n));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserBean)";
    }
}
