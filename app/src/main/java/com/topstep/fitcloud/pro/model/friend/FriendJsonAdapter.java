package com.topstep.fitcloud.pro.model.friend;

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
public final class FriendJsonAdapter extends t<Friend> {

    /* renamed from: a */
    public final y.a f9668a;

    /* renamed from: b */
    public final t<Long> f9669b;

    /* renamed from: c */
    public final t<String> f9670c;

    /* renamed from: d */
    public final t<Integer> f9671d;

    /* renamed from: e */
    public final t<String> f9672e;

    /* renamed from: f */
    public final t<Float> f9673f;

    /* renamed from: g */
    public volatile Constructor<Friend> f9674g;

    public FriendJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9668a = y.a.a("userId", "nickName", "sex", "birthday", "height", "weight", "avatar", "identityId", "mark", "lastUpdateTime");
        Class cls = Long.TYPE;
        u uVar = u.f28881a;
        this.f9669b = h0Var.c(cls, uVar, "userId");
        this.f9670c = h0Var.c(String.class, uVar, "nickName");
        this.f9671d = h0Var.c(Integer.TYPE, uVar, "sex");
        this.f9672e = h0Var.c(String.class, uVar, "birthday");
        this.f9673f = h0Var.c(Float.TYPE, uVar, "height");
    }

    @Override // mf.t
    public final Friend b(y yVar) {
        String str;
        l.f(yVar, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        yVar.b();
        Long l10 = 0L;
        int i10 = -1;
        Long l11 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Float f10 = valueOf;
        while (yVar.q()) {
            switch (yVar.L(this.f9668a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    l11 = this.f9669b.b(yVar);
                    if (l11 != null) {
                        break;
                    } else {
                        throw b.m("userId", "userId", yVar);
                    }
                case 1:
                    str2 = this.f9670c.b(yVar);
                    i10 &= -3;
                    break;
                case 2:
                    num = this.f9671d.b(yVar);
                    if (num != null) {
                        i10 &= -5;
                        break;
                    } else {
                        throw b.m("sex", "sex", yVar);
                    }
                case 3:
                    str3 = this.f9672e.b(yVar);
                    if (str3 != null) {
                        i10 &= -9;
                        break;
                    } else {
                        throw b.m("birthday", "birthday", yVar);
                    }
                case 4:
                    valueOf = this.f9673f.b(yVar);
                    if (valueOf != null) {
                        i10 &= -17;
                        break;
                    } else {
                        throw b.m("height", "height", yVar);
                    }
                case 5:
                    f10 = this.f9673f.b(yVar);
                    if (f10 != null) {
                        i10 &= -33;
                        break;
                    } else {
                        throw b.m("weight", "weight", yVar);
                    }
                case 6:
                    str4 = this.f9670c.b(yVar);
                    i10 &= -65;
                    break;
                case 7:
                    str5 = this.f9672e.b(yVar);
                    if (str5 != null) {
                        break;
                    } else {
                        throw b.m("identityId", "identityId", yVar);
                    }
                case 8:
                    str6 = this.f9670c.b(yVar);
                    i10 &= -257;
                    break;
                case 9:
                    l10 = this.f9669b.b(yVar);
                    if (l10 != null) {
                        i10 &= -513;
                        break;
                    } else {
                        throw b.m("lastUpdateTime", "lastUpdateTime", yVar);
                    }
            }
        }
        yVar.j();
        if (i10 == -895) {
            if (l11 != null) {
                long longValue = l11.longValue();
                int intValue = num.intValue();
                l.d(str3, "null cannot be cast to non-null type kotlin.String");
                float floatValue = valueOf.floatValue();
                float floatValue2 = f10.floatValue();
                if (str5 != null) {
                    return new Friend(longValue, str2, intValue, str3, floatValue, floatValue2, str4, str5, str6, l10.longValue());
                }
                throw b.g("identityId", "identityId", yVar);
            }
            throw b.g("userId", "userId", yVar);
        }
        Constructor<Friend> constructor = this.f9674g;
        if (constructor == null) {
            str = "userId";
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            constructor = Friend.class.getDeclaredConstructor(cls, String.class, cls2, String.class, cls3, cls3, String.class, String.class, String.class, cls, cls2, b.f22341c);
            this.f9674g = constructor;
            l.e(constructor, "Friend::class.java.getDe…his.constructorRef = it }");
        } else {
            str = "userId";
        }
        Object[] objArr = new Object[12];
        if (l11 == null) {
            String str7 = str;
            throw b.g(str7, str7, yVar);
        }
        objArr[0] = Long.valueOf(l11.longValue());
        objArr[1] = str2;
        objArr[2] = num;
        objArr[3] = str3;
        objArr[4] = valueOf;
        objArr[5] = f10;
        objArr[6] = str4;
        if (str5 != null) {
            objArr[7] = str5;
            objArr[8] = str6;
            objArr[9] = l10;
            objArr[10] = Integer.valueOf(i10);
            objArr[11] = null;
            Friend newInstance = constructor.newInstance(objArr);
            l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw b.g("identityId", "identityId", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, Friend friend) {
        Friend friend2 = friend;
        l.f(e0Var, "writer");
        if (friend2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        e0Var.b();
        e0Var.s("userId");
        this.f9669b.f(e0Var, Long.valueOf(friend2.getUserId()));
        e0Var.s("nickName");
        this.f9670c.f(e0Var, friend2.getNickName());
        e0Var.s("sex");
        this.f9671d.f(e0Var, Integer.valueOf(friend2.getSex()));
        e0Var.s("birthday");
        this.f9672e.f(e0Var, friend2.getBirthday());
        e0Var.s("height");
        this.f9673f.f(e0Var, Float.valueOf(friend2.getHeight()));
        e0Var.s("weight");
        this.f9673f.f(e0Var, Float.valueOf(friend2.getWeight()));
        e0Var.s("avatar");
        this.f9670c.f(e0Var, friend2.getAvatar());
        e0Var.s("identityId");
        this.f9672e.f(e0Var, friend2.getIdentityId());
        e0Var.s("mark");
        this.f9670c.f(e0Var, friend2.getMark());
        e0Var.s("lastUpdateTime");
        this.f9669b.f(e0Var, Long.valueOf(friend2.getLastUpdateTime()));
        e0Var.k();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Friend)";
    }
}
