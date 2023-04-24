package com.topstep.fitcloud.pro.model.data;

import android.support.v4.media.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportTotal {

    /* renamed from: a */
    public final int f9646a;

    /* renamed from: b */
    public final float f9647b;

    public SportTotal() {
        this(0, 0.0f, 3, null);
    }

    public SportTotal(float f10, int i10) {
        this.f9646a = i10;
        this.f9647b = f10;
    }

    public /* synthetic */ SportTotal(int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 2) != 0 ? 0.0f : f10, (i11 & 1) != 0 ? 0 : i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportTotal) {
            SportTotal sportTotal = (SportTotal) obj;
            return this.f9646a == sportTotal.f9646a && Float.compare(this.f9647b, sportTotal.f9647b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9647b) + (this.f9646a * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportTotal(count=");
        a10.append(this.f9646a);
        a10.append(", distance=");
        a10.append(this.f9647b);
        a10.append(')');
        return a10.toString();
    }
}
