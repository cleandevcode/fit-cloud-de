package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import d4.b;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class UnitConfigBean {

    /* renamed from: a */
    public final int f9819a;

    /* renamed from: b */
    public final int f9820b;

    /* renamed from: c */
    public final int f9821c;

    /* renamed from: d */
    public final long f9822d;

    public UnitConfigBean(int i10, int i11, int i12, long j10) {
        this.f9819a = i10;
        this.f9820b = i11;
        this.f9821c = i12;
        this.f9822d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnitConfigBean) {
            UnitConfigBean unitConfigBean = (UnitConfigBean) obj;
            return this.f9819a == unitConfigBean.f9819a && this.f9820b == unitConfigBean.f9820b && this.f9821c == unitConfigBean.f9821c && this.f9822d == unitConfigBean.f9822d;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9822d;
        return (((((this.f9819a * 31) + this.f9820b) * 31) + this.f9821c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("UnitConfigBean(lengthUnit=");
        a10.append(this.f9819a);
        a10.append(", weightUnit=");
        a10.append(this.f9820b);
        a10.append(", temperatureUnit=");
        a10.append(this.f9821c);
        a10.append(", unitLastModifyTime=");
        return b.a(a10, this.f9822d, ')');
    }
}
