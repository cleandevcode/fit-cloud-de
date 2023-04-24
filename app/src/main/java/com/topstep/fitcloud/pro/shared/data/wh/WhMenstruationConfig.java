package com.topstep.fitcloud.pro.shared.data.wh;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class WhMenstruationConfig {

    /* renamed from: a */
    public final int f10104a;

    /* renamed from: b */
    public final int f10105b;

    /* renamed from: c */
    public final Date f10106c;

    public WhMenstruationConfig() {
        this(0, 0, null, 7, null);
    }

    public WhMenstruationConfig(int i10, int i11, @DateField Date date) {
        l.f(date, "latest");
        this.f10104a = i10;
        this.f10105b = i11;
        this.f10106c = date;
    }

    public /* synthetic */ WhMenstruationConfig(int i10, int i11, Date date, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 28 : i10, (i12 & 2) != 0 ? 7 : i11, (i12 & 4) != 0 ? new Date() : date);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WhMenstruationConfig) {
            WhMenstruationConfig whMenstruationConfig = (WhMenstruationConfig) obj;
            return this.f10104a == whMenstruationConfig.f10104a && this.f10105b == whMenstruationConfig.f10105b && l.a(this.f10106c, whMenstruationConfig.f10106c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10106c.hashCode() + (((this.f10104a * 31) + this.f10105b) * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("WhMenstruationConfig(cycle=");
        a10.append(this.f10104a);
        a10.append(", duration=");
        a10.append(this.f10105b);
        a10.append(", latest=");
        a10.append(this.f10106c);
        a10.append(')');
        return a10.toString();
    }
}
