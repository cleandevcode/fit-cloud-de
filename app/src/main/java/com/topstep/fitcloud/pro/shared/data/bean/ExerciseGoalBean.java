package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import d4.b;
import kotlin.Metadata;
import mf.u;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ExerciseGoalBean {

    /* renamed from: a */
    public final int f9801a;

    /* renamed from: b */
    public final float f9802b;

    /* renamed from: c */
    public final int f9803c;

    /* renamed from: d */
    public final long f9804d;

    public ExerciseGoalBean(float f10, int i10, int i11, long j10) {
        this.f9801a = i10;
        this.f9802b = f10;
        this.f9803c = i11;
        this.f9804d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExerciseGoalBean) {
            ExerciseGoalBean exerciseGoalBean = (ExerciseGoalBean) obj;
            return this.f9801a == exerciseGoalBean.f9801a && Float.compare(this.f9802b, exerciseGoalBean.f9802b) == 0 && this.f9803c == exerciseGoalBean.f9803c && this.f9804d == exerciseGoalBean.f9804d;
        }
        return false;
    }

    public final int hashCode() {
        float f10 = this.f9802b;
        long j10 = this.f9804d;
        return ((e.b(f10, this.f9801a * 31, 31) + this.f9803c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("ExerciseGoalBean(stepTarget=");
        a10.append(this.f9801a);
        a10.append(", distanceTarget=");
        a10.append(this.f9802b);
        a10.append(", calorieTarget=");
        a10.append(this.f9803c);
        a10.append(", targetLastModifyTime=");
        return b.a(a10, this.f9804d, ')');
    }
}
