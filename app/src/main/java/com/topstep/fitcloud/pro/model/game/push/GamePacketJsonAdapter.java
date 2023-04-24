package com.topstep.fitcloud.pro.model.game.push;

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
public final class GamePacketJsonAdapter extends t<GamePacket> {

    /* renamed from: a */
    public final y.a f9692a;

    /* renamed from: b */
    public final t<Integer> f9693b;

    /* renamed from: c */
    public final t<String> f9694c;

    /* renamed from: d */
    public final t<String> f9695d;

    /* renamed from: e */
    public final t<List<GameSkin>> f9696e;

    /* renamed from: f */
    public volatile Constructor<GamePacket> f9697f;

    public GamePacketJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9692a = y.a.a("type", "name", "description", "downloadCount", "imgUrl", "gameSkins");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9693b = h0Var.c(cls, uVar, "type");
        this.f9694c = h0Var.c(String.class, uVar, "name");
        this.f9695d = h0Var.c(String.class, uVar, "description");
        this.f9696e = h0Var.c(l0.d(List.class, GameSkin.class), uVar, "gameSkins");
    }

    @Override // mf.t
    public final GamePacket b(y yVar) {
        l.f(yVar, "reader");
        Integer num = 0;
        yVar.b();
        int i10 = -1;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<GameSkin> list = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9692a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    num2 = this.f9693b.b(yVar);
                    if (num2 != null) {
                        break;
                    } else {
                        throw b.m("type", "type", yVar);
                    }
                case 1:
                    str = this.f9694c.b(yVar);
                    if (str != null) {
                        break;
                    } else {
                        throw b.m("name", "name", yVar);
                    }
                case 2:
                    str2 = this.f9695d.b(yVar);
                    i10 &= -5;
                    break;
                case 3:
                    num = this.f9693b.b(yVar);
                    if (num != null) {
                        i10 &= -9;
                        break;
                    } else {
                        throw b.m("downloadCount", "downloadCount", yVar);
                    }
                case 4:
                    str3 = this.f9695d.b(yVar);
                    i10 &= -17;
                    break;
                case 5:
                    list = this.f9696e.b(yVar);
                    i10 &= -33;
                    break;
            }
        }
        yVar.j();
        if (i10 == -61) {
            if (num2 != null) {
                int intValue = num2.intValue();
                if (str != null) {
                    return new GamePacket(intValue, str, str2, num.intValue(), str3, list);
                }
                throw b.g("name", "name", yVar);
            }
            throw b.g("type", "type", yVar);
        }
        Constructor<GamePacket> constructor = this.f9697f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = GamePacket.class.getDeclaredConstructor(cls, String.class, String.class, cls, String.class, List.class, cls, b.f22341c);
            this.f9697f = constructor;
            l.e(constructor, "GamePacket::class.java.g…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        if (num2 != null) {
            objArr[0] = Integer.valueOf(num2.intValue());
            if (str != null) {
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = num;
                objArr[4] = str3;
                objArr[5] = list;
                objArr[6] = Integer.valueOf(i10);
                objArr[7] = null;
                GamePacket newInstance = constructor.newInstance(objArr);
                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw b.g("name", "name", yVar);
        }
        throw b.g("type", "type", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, GamePacket gamePacket) {
        GamePacket gamePacket2 = gamePacket;
        l.f(e0Var, "writer");
        if (gamePacket2 != null) {
            e0Var.b();
            e0Var.s("type");
            fb.b.b(gamePacket2.f9686a, this.f9693b, e0Var, "name");
            this.f9694c.f(e0Var, gamePacket2.f9687b);
            e0Var.s("description");
            this.f9695d.f(e0Var, gamePacket2.f9688c);
            e0Var.s("downloadCount");
            fb.b.b(gamePacket2.f9689d, this.f9693b, e0Var, "imgUrl");
            this.f9695d.f(e0Var, gamePacket2.f9690e);
            e0Var.s("gameSkins");
            this.f9696e.f(e0Var, gamePacket2.f9691f);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GamePacket)";
    }
}
