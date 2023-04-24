package com.topstep.fitcloud.pro.shared.data.entity.data;

import android.support.v4.media.d;
import d4.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportTotalCache {

    /* renamed from: a */
    public final int f10079a;

    /* renamed from: b */
    public final float f10080b;

    /* renamed from: c */
    public final int f10081c;

    /* renamed from: d */
    public final long f10082d;

    public SportTotalCache(float f10, int i10, int i11, long j10) {
        this.f10079a = i10;
        this.f10080b = f10;
        this.f10081c = i11;
        this.f10082d = j10;
    }

    public /* synthetic */ SportTotalCache(int i10, float f10, int i11, long j10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 2) != 0 ? 0.0f : f10, (i12 & 1) != 0 ? 0 : i10, i11, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportTotalCache) {
            SportTotalCache sportTotalCache = (SportTotalCache) obj;
            return this.f10079a == sportTotalCache.f10079a && Float.compare(this.f10080b, sportTotalCache.f10080b) == 0 && this.f10081c == sportTotalCache.f10081c && this.f10082d == sportTotalCache.f10082d;
        }
        return false;
    }

    public final int hashCode() {
        float f10 = this.f10080b;
        long j10 = this.f10082d;
        return ((e.b(f10, this.f10079a * 31, 31) + this.f10081c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportTotalCache(count=");
        a10.append(this.f10079a);
        a10.append(", distance=");
        a10.append(this.f10080b);
        a10.append(", dirty=");
        a10.append(this.f10081c);
        a10.append(", syncSuccessTime=");
        return b.a(a10, this.f10082d, ')');
    }
}
