package com.topstep.fitcloud.pro.model.game.push;

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
public final class GameSkinJsonAdapter extends t<GameSkin> {

    /* renamed from: a */
    public final y.a f9698a;

    /* renamed from: b */
    public final t<Integer> f9699b;

    /* renamed from: c */
    public final t<String> f9700c;

    /* renamed from: d */
    public final t<Long> f9701d;

    /* renamed from: e */
    public final t<String> f9702e;

    /* renamed from: f */
    public final t<Boolean> f9703f;

    /* renamed from: g */
    public volatile Constructor<GameSkin> f9704g;

    public GameSkinJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9698a = y.a.a("skinNum", "binUrl", "binSize", "imgUrl", "existLocally");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9699b = h0Var.c(cls, uVar, "skinNum");
        this.f9700c = h0Var.c(String.class, uVar, "binUrl");
        this.f9701d = h0Var.c(Long.TYPE, uVar, "binSize");
        this.f9702e = h0Var.c(String.class, uVar, "imgUrl");
        this.f9703f = h0Var.c(Boolean.TYPE, uVar, "existLocally");
    }

    @Override // mf.t
    public final GameSkin b(y yVar) {
        l.f(yVar, "reader");
        Long l10 = 0L;
        Boolean bool = Boolean.FALSE;
        yVar.b();
        int i10 = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9698a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9699b.b(yVar);
                if (num == null) {
                    throw b.m("skinNum", "skinNum", yVar);
                }
            } else if (L == 1) {
                str = this.f9700c.b(yVar);
                if (str == null) {
                    throw b.m("binUrl", "binUrl", yVar);
                }
            } else if (L == 2) {
                l10 = this.f9701d.b(yVar);
                if (l10 == null) {
                    throw b.m("binSize", "binSize", yVar);
                }
                i10 &= -5;
            } else if (L == 3) {
                str2 = this.f9702e.b(yVar);
                i10 &= -9;
            } else if (L == 4) {
                bool = this.f9703f.b(yVar);
                if (bool == null) {
                    throw b.m("existLocally", "existLocally", yVar);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -29) {
            if (num != null) {
                int intValue = num.intValue();
                if (str != null) {
                    return new GameSkin(intValue, str, l10.longValue(), str2, bool.booleanValue());
                }
                throw b.g("binUrl", "binUrl", yVar);
            }
            throw b.g("skinNum", "skinNum", yVar);
        }
        Constructor<GameSkin> constructor = this.f9704g;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = GameSkin.class.getDeclaredConstructor(cls, String.class, Long.TYPE, String.class, Boolean.TYPE, cls, b.f22341c);
            this.f9704g = constructor;
            l.e(constructor, "GameSkin::class.java.get…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (num != null) {
            objArr[0] = Integer.valueOf(num.intValue());
            if (str != null) {
                objArr[1] = str;
                objArr[2] = l10;
                objArr[3] = str2;
                objArr[4] = bool;
                objArr[5] = Integer.valueOf(i10);
                objArr[6] = null;
                GameSkin newInstance = constructor.newInstance(objArr);
                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw b.g("binUrl", "binUrl", yVar);
        }
        throw b.g("skinNum", "skinNum", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, GameSkin gameSkin) {
        GameSkin gameSkin2 = gameSkin;
        l.f(e0Var, "writer");
        if (gameSkin2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        e0Var.b();
        e0Var.s("skinNum");
        this.f9699b.f(e0Var, Integer.valueOf(gameSkin2.getSkinNum()));
        e0Var.s("binUrl");
        this.f9700c.f(e0Var, gameSkin2.getBinUrl());
        e0Var.s("binSize");
        this.f9701d.f(e0Var, Long.valueOf(gameSkin2.getBinSize()));
        e0Var.s("imgUrl");
        this.f9702e.f(e0Var, gameSkin2.getImgUrl());
        e0Var.s("existLocally");
        this.f9703f.f(e0Var, Boolean.valueOf(gameSkin2.getExistLocally()));
        e0Var.k();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GameSkin)";
    }
}
