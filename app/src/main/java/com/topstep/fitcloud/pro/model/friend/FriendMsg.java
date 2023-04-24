package com.topstep.fitcloud.pro.model.friend;

import a0.a2;
import android.support.v4.media.d;
import gm.l;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class FriendMsg {

    /* renamed from: a */
    public final long f9675a;

    /* renamed from: b */
    public final long f9676b;

    /* renamed from: c */
    public final String f9677c;

    /* renamed from: d */
    public final String f9678d;

    /* renamed from: e */
    public final long f9679e;

    /* renamed from: f */
    public final int f9680f;

    /* renamed from: g */
    public final String f9681g;

    public FriendMsg(long j10, long j11, String str, String str2, long j12, int i10, String str3) {
        this.f9675a = j10;
        this.f9676b = j11;
        this.f9677c = str;
        this.f9678d = str2;
        this.f9679e = j12;
        this.f9680f = i10;
        this.f9681g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FriendMsg) {
            FriendMsg friendMsg = (FriendMsg) obj;
            return this.f9675a == friendMsg.f9675a && this.f9676b == friendMsg.f9676b && l.a(this.f9677c, friendMsg.f9677c) && l.a(this.f9678d, friendMsg.f9678d) && this.f9679e == friendMsg.f9679e && this.f9680f == friendMsg.f9680f && l.a(this.f9681g, friendMsg.f9681g);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9675a;
        long j11 = this.f9676b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        String str = this.f9677c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9678d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        long j12 = this.f9679e;
        int i11 = (((((hashCode + hashCode2) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f9680f) * 31;
        String str3 = this.f9681g;
        return i11 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("FriendMsg(applyId=");
        a10.append(this.f9675a);
        a10.append(", userId=");
        a10.append(this.f9676b);
        a10.append(", nickName=");
        a10.append(this.f9677c);
        a10.append(", avatar=");
        a10.append(this.f9678d);
        a10.append(", time=");
        a10.append(this.f9679e);
        a10.append(", read=");
        a10.append(this.f9680f);
        a10.append(", message=");
        return a2.a(a10, this.f9681g, ')');
    }
}
