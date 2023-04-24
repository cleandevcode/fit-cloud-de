package com.topstep.fitcloud.pro.model.game.push;

import android.support.v4.media.d;
import fb.b;
import gm.l;
import i2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class GamePacket {

    /* renamed from: a */
    public final int f9686a;

    /* renamed from: b */
    public final String f9687b;

    /* renamed from: c */
    public final String f9688c;

    /* renamed from: d */
    public final int f9689d;

    /* renamed from: e */
    public final String f9690e;

    /* renamed from: f */
    public final List<GameSkin> f9691f;

    public GamePacket(int i10, String str, String str2, int i11, String str3, List<GameSkin> list) {
        l.f(str, "name");
        this.f9686a = i10;
        this.f9687b = str;
        this.f9688c = str2;
        this.f9689d = i11;
        this.f9690e = str3;
        this.f9691f = list;
    }

    public /* synthetic */ GamePacket(int i10, String str, String str2, int i11, String str3, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GamePacket) {
            GamePacket gamePacket = (GamePacket) obj;
            return this.f9686a == gamePacket.f9686a && l.a(this.f9687b, gamePacket.f9687b) && l.a(this.f9688c, gamePacket.f9688c) && this.f9689d == gamePacket.f9689d && l.a(this.f9690e, gamePacket.f9690e) && l.a(this.f9691f, gamePacket.f9691f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int a10 = t.a(this.f9687b, this.f9686a * 31, 31);
        String str = this.f9688c;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (((a10 + hashCode) * 31) + this.f9689d) * 31;
        String str2 = this.f9690e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        List<GameSkin> list = this.f9691f;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i12 + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("GamePacket(type=");
        a10.append(this.f9686a);
        a10.append(", name=");
        a10.append(this.f9687b);
        a10.append(", description=");
        a10.append(this.f9688c);
        a10.append(", downloadCount=");
        a10.append(this.f9689d);
        a10.append(", imgUrl=");
        a10.append(this.f9690e);
        a10.append(", gameSkins=");
        return b.a(a10, this.f9691f, ')');
    }
}
