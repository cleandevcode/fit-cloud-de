package com.topstep.fitcloud.pro.model.friend;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class FriendMsgJsonAdapter extends t<FriendMsg> {

    /* renamed from: a */
    public final y.a f9682a;

    /* renamed from: b */
    public final t<Long> f9683b;

    /* renamed from: c */
    public final t<String> f9684c;

    /* renamed from: d */
    public final t<Integer> f9685d;

    public FriendMsgJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9682a = y.a.a("applyId", "userId", "nickName", "avatar", CrashHianalyticsData.TIME, "read", CrashHianalyticsData.MESSAGE);
        Class cls = Long.TYPE;
        u uVar = u.f28881a;
        this.f9683b = h0Var.c(cls, uVar, "applyId");
        this.f9684c = h0Var.c(String.class, uVar, "nickName");
        this.f9685d = h0Var.c(Integer.TYPE, uVar, "read");
    }

    @Override // mf.t
    public final FriendMsg b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Long l10 = null;
        Long l11 = null;
        Long l12 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9682a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    l10 = this.f9683b.b(yVar);
                    if (l10 != null) {
                        break;
                    } else {
                        throw b.m("applyId", "applyId", yVar);
                    }
                case 1:
                    l11 = this.f9683b.b(yVar);
                    if (l11 != null) {
                        break;
                    } else {
                        throw b.m("userId", "userId", yVar);
                    }
                case 2:
                    str = this.f9684c.b(yVar);
                    break;
                case 3:
                    str2 = this.f9684c.b(yVar);
                    break;
                case 4:
                    l12 = this.f9683b.b(yVar);
                    if (l12 != null) {
                        break;
                    } else {
                        throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                case 5:
                    num = this.f9685d.b(yVar);
                    if (num != null) {
                        break;
                    } else {
                        throw b.m("read", "read", yVar);
                    }
                case 6:
                    str3 = this.f9684c.b(yVar);
                    break;
            }
        }
        yVar.j();
        if (l10 != null) {
            long longValue = l10.longValue();
            if (l11 != null) {
                long longValue2 = l11.longValue();
                if (l12 != null) {
                    long longValue3 = l12.longValue();
                    if (num != null) {
                        return new FriendMsg(longValue, longValue2, str, str2, longValue3, num.intValue(), str3);
                    }
                    throw b.g("read", "read", yVar);
                }
                throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
            }
            throw b.g("userId", "userId", yVar);
        }
        throw b.g("applyId", "applyId", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, FriendMsg friendMsg) {
        FriendMsg friendMsg2 = friendMsg;
        l.f(e0Var, "writer");
        if (friendMsg2 != null) {
            e0Var.b();
            e0Var.s("applyId");
            this.f9683b.f(e0Var, Long.valueOf(friendMsg2.f9675a));
            e0Var.s("userId");
            this.f9683b.f(e0Var, Long.valueOf(friendMsg2.f9676b));
            e0Var.s("nickName");
            this.f9684c.f(e0Var, friendMsg2.f9677c);
            e0Var.s("avatar");
            this.f9684c.f(e0Var, friendMsg2.f9678d);
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9683b.f(e0Var, Long.valueOf(friendMsg2.f9679e));
            e0Var.s("read");
            fb.b.b(friendMsg2.f9680f, this.f9685d, e0Var, CrashHianalyticsData.MESSAGE);
            this.f9684c.f(e0Var, friendMsg2.f9681g);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(FriendMsg)";
    }
}
