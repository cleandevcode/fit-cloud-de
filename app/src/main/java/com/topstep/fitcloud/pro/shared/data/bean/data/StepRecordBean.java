package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import d4.b;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.u;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class StepRecordBean {

    /* renamed from: a */
    public final Date f9998a;

    /* renamed from: b */
    public final String f9999b;

    /* renamed from: c */
    public final int f10000c;

    /* renamed from: d */
    public final float f10001d;

    /* renamed from: e */
    public final float f10002e;

    /* renamed from: f */
    public final long f10003f;

    public StepRecordBean(@DateField Date date, String str, int i10, float f10, float f11, long j10) {
        l.f(date, "date");
        this.f9998a = date;
        this.f9999b = str;
        this.f10000c = i10;
        this.f10001d = f10;
        this.f10002e = f11;
        this.f10003f = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StepRecordBean) {
            StepRecordBean stepRecordBean = (StepRecordBean) obj;
            return l.a(this.f9998a, stepRecordBean.f9998a) && l.a(this.f9999b, stepRecordBean.f9999b) && this.f10000c == stepRecordBean.f10000c && Float.compare(this.f10001d, stepRecordBean.f10001d) == 0 && Float.compare(this.f10002e, stepRecordBean.f10002e) == 0 && this.f10003f == stepRecordBean.f10003f;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f9998a.hashCode() * 31;
        String str = this.f9999b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b10 = e.b(this.f10002e, e.b(this.f10001d, (((hashCode2 + hashCode) * 31) + this.f10000c) * 31, 31), 31);
        long j10 = this.f10003f;
        return b10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("StepRecordBean(date=");
        a10.append(this.f9998a);
        a10.append(", device=");
        a10.append(this.f9999b);
        a10.append(", step=");
        a10.append(this.f10000c);
        a10.append(", distance=");
        a10.append(this.f10001d);
        a10.append(", calorie=");
        a10.append(this.f10002e);
        a10.append(", lastModifyTime=");
        return b.a(a10, this.f10003f, ')');
    }
}
