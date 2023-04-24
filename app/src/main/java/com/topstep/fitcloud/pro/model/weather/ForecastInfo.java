package com.topstep.fitcloud.pro.model.weather;

import a0.a2;
import android.support.v4.media.d;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ForecastInfo {

    /* renamed from: a */
    public final int f9725a;

    /* renamed from: b */
    public final int f9726b;

    /* renamed from: c */
    public final int f9727c;

    /* renamed from: d */
    public final String f9728d;

    public /* synthetic */ ForecastInfo(int i10, int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 8) != 0 ? null : str, i11, i12);
    }

    public ForecastInfo(int i10, String str, int i11, int i12) {
        this.f9725a = i10;
        this.f9726b = i11;
        this.f9727c = i12;
        this.f9728d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForecastInfo) {
            ForecastInfo forecastInfo = (ForecastInfo) obj;
            return this.f9725a == forecastInfo.f9725a && this.f9726b == forecastInfo.f9726b && this.f9727c == forecastInfo.f9727c && l.a(this.f9728d, forecastInfo.f9728d);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f9725a * 31) + this.f9726b) * 31) + this.f9727c) * 31;
        String str = this.f9728d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = d.a("ForecastInfo(min=");
        a10.append(this.f9725a);
        a10.append(", max=");
        a10.append(this.f9726b);
        a10.append(", code=");
        a10.append(this.f9727c);
        a10.append(", codeText=");
        return a2.a(a10, this.f9728d, ')');
    }
}
