package s8;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import i8.p;

/* loaded from: classes.dex */
public final class a extends j8.a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a H;
    public static final a L;
    public static final a M;
    public static final a Q;
    public static final a U;
    public static final a V;
    public static final a W;
    public static final a X;
    public static final a Y;
    public static final a Z;

    /* renamed from: c0 */
    public static final a f26693c0;

    /* renamed from: d0 */
    public static final a f26695d0;

    /* renamed from: e0 */
    public static final a f26697e0;

    /* renamed from: f */
    public static final a f26698f;

    /* renamed from: f0 */
    public static final a f26699f0;

    /* renamed from: g */
    public static final a f26700g;

    /* renamed from: g0 */
    public static final a f26701g0;

    /* renamed from: h */
    public static final a f26702h;

    /* renamed from: h0 */
    public static final a f26703h0;

    /* renamed from: i */
    public static final a f26704i;

    /* renamed from: i0 */
    public static final a f26705i0;

    /* renamed from: j */
    public static final a f26706j;

    /* renamed from: j0 */
    public static final a f26707j0;

    /* renamed from: k */
    public static final a f26708k;

    /* renamed from: k0 */
    public static final a f26709k0;

    /* renamed from: l */
    public static final a f26710l;

    /* renamed from: l0 */
    public static final a f26711l0;

    /* renamed from: m */
    public static final a f26712m;

    /* renamed from: m0 */
    public static final a f26713m0;

    /* renamed from: n */
    public static final a f26714n;

    /* renamed from: n0 */
    public static final a f26715n0;

    /* renamed from: o */
    public static final a f26716o;

    /* renamed from: o0 */
    public static final a f26717o0;

    /* renamed from: p */
    public static final a f26718p;

    /* renamed from: p0 */
    public static final a f26719p0;

    /* renamed from: q */
    public static final a f26720q;

    /* renamed from: q0 */
    public static final a f26721q0;

    /* renamed from: r */
    public static final a f26722r;

    /* renamed from: r0 */
    public static final a f26723r0;

    /* renamed from: s */
    public static final a f26724s;

    /* renamed from: s0 */
    public static final a f26725s0;

    /* renamed from: t */
    public static final a f26726t;

    /* renamed from: t0 */
    public static final a f26727t0;

    /* renamed from: u */
    public static final a f26728u;

    /* renamed from: u0 */
    public static final a f26729u0;

    /* renamed from: v */
    public static final a f26730v;

    /* renamed from: v0 */
    public static final a f26731v0;

    /* renamed from: w */
    public static final a f26732w;

    /* renamed from: w0 */
    public static final a f26733w0;

    /* renamed from: x */
    public static final a f26734x;

    /* renamed from: y */
    public static final a f26735y;

    /* renamed from: z */
    public static final a f26736z;

    /* renamed from: a */
    public final String f26737a;

    /* renamed from: b */
    public final int f26738b;

    /* renamed from: c */
    public final Boolean f26739c;
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: d */
    public static final a f26694d = g(InnerShareParams.ACTIVITY);

    /* renamed from: e */
    public static final a f26696e = g("sleep_segment_type");

    static {
        f("confidence");
        f26698f = g("steps");
        f("step_length");
        f26700g = g("duration");
        Y = h("duration");
        new a("activity_duration.ascending", 4, null);
        new a("activity_duration.descending", 4, null);
        f26702h = f("bpm");
        Z = f("respiratory_rate");
        f26704i = f(InnerShareParams.LATITUDE);
        f26706j = f(InnerShareParams.LONGITUDE);
        f26708k = f("accuracy");
        Boolean bool = Boolean.TRUE;
        f26710l = new a("altitude", 2, bool);
        f26712m = f("distance");
        f26714n = f("height");
        f26716o = f("weight");
        f26718p = f("percentage");
        f26720q = f("speed");
        f26722r = f("rpm");
        f26693c0 = e("google.android.fitness.GoalV2");
        e("google.android.fitness.Device");
        f26724s = g("revolutions");
        f26726t = f("calories");
        f26728u = f("watts");
        f26730v = f("volume");
        f26732w = h("meal_type");
        f26734x = new a("food_item", 3, bool);
        f26735y = new a("nutrients", 4, null);
        f26736z = new a("exercise", 3, null);
        A = h("repetitions");
        B = new a("resistance", 2, bool);
        C = h("resistance_type");
        D = g("num_segments");
        E = f("average");
        F = f("max");
        H = f("min");
        L = f("low_latitude");
        M = f("low_longitude");
        Q = f("high_latitude");
        U = f("high_longitude");
        g("occurrences");
        f26695d0 = g("sensor_type");
        f26697e0 = new a("timestamps", 5, null);
        f26699f0 = new a("sensor_values", 6, null);
        V = f("intensity");
        f26701g0 = new a("activity_confidence", 4, null);
        f26703h0 = f("probability");
        f26705i0 = e("google.android.fitness.SleepAttributes");
        f26707j0 = e("google.android.fitness.SleepSchedule");
        f("circumference");
        f26709k0 = e("google.android.fitness.PacedWalkingAttributes");
        f26711l0 = new a("zone_id", 3, null);
        f26713m0 = f("met");
        f26715n0 = f("internal_device_temperature");
        f26717o0 = f("skin_temperature");
        f26719p0 = g("custom_heart_rate_zone_status");
        W = g("min_int");
        X = g("max_int");
        f26721q0 = h("lightly_active_duration");
        f26723r0 = h("moderately_active_duration");
        f26725s0 = h("very_active_duration");
        f26727t0 = e("google.android.fitness.SedentaryTime");
        f26729u0 = e("google.android.fitness.MomentaryStressAlgorithm");
        f26731v0 = g("magnet_presence");
        f26733w0 = e("google.android.fitness.MomentaryStressAlgorithmWindows");
    }

    public a(String str, int i10, Boolean bool) {
        p.f(str);
        this.f26737a = str;
        this.f26738b = i10;
        this.f26739c = bool;
    }

    public static a e(String str) {
        return new a(str, 7, null);
    }

    public static a f(String str) {
        return new a(str, 2, null);
    }

    public static a g(String str) {
        return new a(str, 1, null);
    }

    public static a h(String str) {
        return new a(str, 1, Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f26737a.equals(aVar.f26737a) && this.f26738b == aVar.f26738b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26737a.hashCode();
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f26737a;
        objArr[1] = this.f26738b == 1 ? "i" : "f";
        return String.format("%s(%s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F2 = o8.b.F(parcel, 20293);
        o8.b.C(parcel, 1, this.f26737a);
        o8.b.z(parcel, 2, this.f26738b);
        Boolean bool = this.f26739c;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        o8.b.J(parcel, F2);
    }
}
