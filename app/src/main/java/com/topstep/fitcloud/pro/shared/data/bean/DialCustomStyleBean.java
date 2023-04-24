package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import d4.b;
import gm.l;
import i2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DialCustomStyleBean {

    /* renamed from: a */
    public final String f9770a;

    /* renamed from: b */
    public final String f9771b;

    /* renamed from: c */
    public final long f9772c;

    public DialCustomStyleBean(String str, long j10, String str2) {
        l.f(str, "binUrl");
        l.f(str2, "styleName");
        this.f9770a = str;
        this.f9771b = str2;
        this.f9772c = j10;
    }

    public /* synthetic */ DialCustomStyleBean(String str, String str2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 4) != 0 ? 0L : j10, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialCustomStyleBean) {
            DialCustomStyleBean dialCustomStyleBean = (DialCustomStyleBean) obj;
            return l.a(this.f9770a, dialCustomStyleBean.f9770a) && l.a(this.f9771b, dialCustomStyleBean.f9771b) && this.f9772c == dialCustomStyleBean.f9772c;
        }
        return false;
    }

    public final int hashCode() {
        int a10 = t.a(this.f9771b, this.f9770a.hashCode() * 31, 31);
        long j10 = this.f9772c;
        return a10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("DialCustomStyleBean(binUrl=");
        a10.append(this.f9770a);
        a10.append(", styleName=");
        a10.append(this.f9771b);
        a10.append(", binSize=");
        return b.a(a10, this.f9772c, ')');
    }
}
