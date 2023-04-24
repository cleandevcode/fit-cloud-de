package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j8.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s8.b;

/* loaded from: classes.dex */
public final class DataType extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<DataType> CREATOR = new b();

    /* renamed from: e */
    public static final DataType f6084e;

    /* renamed from: f */
    public static final DataType f6085f;

    /* renamed from: g */
    public static final DataType f6086g;

    /* renamed from: h */
    public static final DataType f6087h;

    /* renamed from: i */
    public static final DataType f6088i;

    /* renamed from: a */
    public final String f6089a;

    /* renamed from: b */
    public final List f6090b;

    /* renamed from: c */
    public final String f6091c;

    /* renamed from: d */
    public final String f6092d;

    static {
        s8.a aVar = s8.a.f26698f;
        f6084e = new DataType("com.google.step_count.delta", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar);
        new DataType("com.google.step_count.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar);
        s8.a aVar2 = s8.a.f26722r;
        new DataType("com.google.step_count.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar2);
        new DataType("com.google.internal.goal", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26693c0);
        s8.a aVar3 = s8.a.f26694d;
        f6085f = new DataType("com.google.activity.segment", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar3);
        new DataType("com.google.sleep.segment", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", s8.a.f26696e);
        s8.a aVar4 = s8.a.f26726t;
        f6086g = new DataType("com.google.calories.expended", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar4);
        new DataType("com.google.calories.bmr", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar4);
        new DataType("com.google.power.sample", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26728u);
        new DataType("com.google.sensor.events", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26695d0, s8.a.f26697e0, s8.a.f26699f0);
        new DataType("com.google.heart_rate.bpm", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", s8.a.f26702h);
        new DataType("com.google.respiratory_rate", "https://www.googleapis.com/auth/fitness.respiratory_rate.read", "https://www.googleapis.com/auth/fitness.respiratory_rate.write", s8.a.Z);
        s8.a aVar5 = s8.a.f26704i;
        s8.a aVar6 = s8.a.f26706j;
        s8.a aVar7 = s8.a.f26708k;
        s8.a aVar8 = s8.a.f26710l;
        new DataType("com.google.location.sample", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", aVar5, aVar6, aVar7, aVar8);
        new DataType("com.google.location.track", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", aVar5, aVar6, aVar7, aVar8);
        f6087h = new DataType("com.google.distance.delta", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", s8.a.f26712m);
        new DataType("com.google.speed", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", s8.a.f26720q);
        s8.a aVar9 = s8.a.f26724s;
        new DataType("com.google.cycling.wheel_revolution.cumulative", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", aVar9);
        new DataType("com.google.cycling.wheel_revolution.rpm", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", aVar2);
        new DataType("com.google.cycling.pedaling.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar9);
        new DataType("com.google.cycling.pedaling.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar2);
        new DataType("com.google.height", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", s8.a.f26714n);
        new DataType("com.google.weight", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", s8.a.f26716o);
        new DataType("com.google.body.fat.percentage", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", s8.a.f26718p);
        s8.a aVar10 = s8.a.f26735y;
        s8.a aVar11 = s8.a.f26732w;
        new DataType("com.google.nutrition", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", aVar10, aVar11, s8.a.f26734x);
        new DataType("com.google.hydration", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", s8.a.f26730v);
        new DataType("com.google.activity.exercise", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26736z, s8.a.A, s8.a.Y, s8.a.C, s8.a.B);
        s8.a aVar12 = s8.a.f26700g;
        new DataType("com.google.active_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar12);
        new DataType("com.google.device_on_body", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26703h0);
        new DataType("com.google.activity.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar3, aVar12, s8.a.D);
        s8.a aVar13 = s8.a.E;
        s8.a aVar14 = s8.a.F;
        s8.a aVar15 = s8.a.H;
        new DataType("com.google.calories.bmr.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar13, aVar14, aVar15);
        s8.a aVar16 = s8.a.V;
        new DataType("com.google.heart_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar16);
        new DataType("com.google.heart_minutes.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar16, aVar12);
        f6088i = new DataType("com.google.heart_rate.summary", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", aVar13, aVar14, aVar15);
        new DataType("com.google.location.bounding_box", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", s8.a.L, s8.a.M, s8.a.Q, s8.a.U);
        new DataType("com.google.power.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", aVar13, aVar14, aVar15);
        new DataType("com.google.speed.summary", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", aVar13, aVar14, aVar15);
        new DataType("com.google.body.fat.percentage.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", aVar13, aVar14, aVar15);
        new DataType("com.google.weight.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", aVar13, aVar14, aVar15);
        new DataType("com.google.height.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", aVar13, aVar14, aVar15);
        new DataType("com.google.nutrition.summary", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", aVar10, aVar11);
        new DataType("com.google.activity.samples", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26701g0);
        new DataType("com.google.internal.sleep_attributes", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", s8.a.f26705i0);
        new DataType("com.google.internal.sleep_schedule", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", s8.a.f26707j0);
        new DataType("com.google.internal.paced_walking_attributes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26709k0);
        new DataType("com.google.time_zone_change", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", s8.a.f26711l0);
        new DataType("com.google.internal.met", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26713m0);
        new DataType("com.google.internal.internal_device_temperature", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", s8.a.f26715n0);
        new DataType("com.google.internal.skin_temperature", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", s8.a.f26717o0);
        s8.a aVar17 = s8.a.W;
        new DataType("com.google.internal.custom_heart_rate_zone", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", s8.a.f26719p0, aVar17, aVar17);
        new DataType("com.google.internal.active_minutes_combined", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26721q0, s8.a.f26723r0, s8.a.f26725s0);
        new DataType("com.google.internal.sedentary_time", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26727t0);
        new DataType("com.google.internal.custom_max_heart_rate", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.X);
        new DataType("com.google.internal.momentary_stress_algorithm", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", s8.a.f26729u0);
        new DataType("com.google.internal.magnetic_field_presence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", s8.a.f26731v0);
        new DataType("com.google.internal.momentary_stress_algorithm_windows", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", s8.a.f26733w0);
    }

    public DataType(String str, String str2, String str3, ArrayList arrayList) {
        this.f6089a = str;
        this.f6090b = Collections.unmodifiableList(arrayList);
        this.f6091c = str2;
        this.f6092d = str3;
    }

    public DataType(String str, String str2, String str3, s8.a... aVarArr) {
        this.f6089a = str;
        this.f6090b = Collections.unmodifiableList(Arrays.asList(aVarArr));
        this.f6091c = str2;
        this.f6092d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataType) {
            DataType dataType = (DataType) obj;
            return this.f6089a.equals(dataType.f6089a) && this.f6090b.equals(dataType.f6090b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6089a.hashCode();
    }

    public final String toString() {
        return String.format("DataType{%s%s}", this.f6089a, this.f6090b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.C(parcel, 1, this.f6089a);
        o8.b.E(parcel, 2, this.f6090b);
        o8.b.C(parcel, 3, this.f6091c);
        o8.b.C(parcel, 4, this.f6092d);
        o8.b.J(parcel, F);
    }
}
