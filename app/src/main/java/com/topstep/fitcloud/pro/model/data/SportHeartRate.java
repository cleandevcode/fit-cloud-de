package com.topstep.fitcloud.pro.model.data;

import a1.b;
import android.support.v4.media.d;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportHeartRate {

    /* renamed from: a */
    public final int f9614a;

    /* renamed from: b */
    public final int f9615b;

    public SportHeartRate(int i10, int i11) {
        this.f9614a = i10;
        this.f9615b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportHeartRate) {
            SportHeartRate sportHeartRate = (SportHeartRate) obj;
            return this.f9614a == sportHeartRate.f9614a && this.f9615b == sportHeartRate.f9615b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9614a * 31) + this.f9615b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportHeartRate(duration=");
        a10.append(this.f9614a);
        a10.append(", value=");
        return b.a(a10, this.f9615b, ')');
    }
}
