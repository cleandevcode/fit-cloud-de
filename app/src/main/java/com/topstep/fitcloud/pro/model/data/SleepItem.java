package com.topstep.fitcloud.pro.model.data;

import ak.a;
import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SleepItem implements a {

    /* renamed from: a */
    public final int f9600a;

    /* renamed from: b */
    public final Date f9601b;

    /* renamed from: c */
    public final Date f9602c;

    public SleepItem(int i10, @TimeField Date date, @TimeField Date date2) {
        this.f9600a = i10;
        this.f9601b = date;
        this.f9602c = date2;
    }

    @Override // ak.a
    public final long a() {
        return this.f9601b.getTime();
    }

    @Override // ak.a
    public final int b() {
        return this.f9600a;
    }

    @Override // ak.a
    public final long c() {
        return this.f9602c.getTime();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepItem) {
            SleepItem sleepItem = (SleepItem) obj;
            return this.f9600a == sleepItem.f9600a && l.a(this.f9601b, sleepItem.f9601b) && l.a(this.f9602c, sleepItem.f9602c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9601b.hashCode();
        return this.f9602c.hashCode() + ((hashCode + (this.f9600a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("SleepItem(status=");
        a10.append(this.f9600a);
        a10.append(", startTime=");
        a10.append(this.f9601b);
        a10.append(", endTime=");
        a10.append(this.f9602c);
        a10.append(')');
        return a10.toString();
    }
}
