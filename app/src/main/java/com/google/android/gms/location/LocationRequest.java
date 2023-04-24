package com.google.android.gms.location;

import a9.q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.support.v4.media.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i8.n;
import i8.p;
import java.util.Arrays;
import o8.b;
import org.checkerframework.dataflow.qual.Pure;
import x8.b0;
import x8.t;

/* loaded from: classes.dex */
public final class LocationRequest extends j8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new q();

    /* renamed from: a */
    public int f6098a;

    /* renamed from: b */
    public long f6099b;

    /* renamed from: c */
    public long f6100c;

    /* renamed from: d */
    public long f6101d;

    /* renamed from: e */
    public long f6102e;

    /* renamed from: f */
    public int f6103f;

    /* renamed from: g */
    public float f6104g;

    /* renamed from: h */
    public boolean f6105h;

    /* renamed from: i */
    public long f6106i;

    /* renamed from: j */
    public final int f6107j;

    /* renamed from: k */
    public final int f6108k;

    /* renamed from: l */
    public final String f6109l;

    /* renamed from: m */
    public final boolean f6110m;

    /* renamed from: n */
    public final WorkSource f6111n;

    /* renamed from: o */
    public final t f6112o;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f6113a;

        /* renamed from: b */
        public long f6114b;

        /* renamed from: c */
        public long f6115c;

        /* renamed from: d */
        public long f6116d;

        /* renamed from: e */
        public long f6117e;

        /* renamed from: f */
        public int f6118f;

        /* renamed from: g */
        public float f6119g;

        /* renamed from: h */
        public boolean f6120h;

        /* renamed from: i */
        public long f6121i;

        /* renamed from: j */
        public int f6122j;

        /* renamed from: k */
        public int f6123k;

        /* renamed from: l */
        public String f6124l;

        /* renamed from: m */
        public boolean f6125m;

        /* renamed from: n */
        public WorkSource f6126n;

        /* renamed from: o */
        public t f6127o;

        public a(int i10, long j10) {
            p.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
            b.H(i10);
            this.f6113a = i10;
            this.f6114b = j10;
            this.f6115c = -1L;
            this.f6116d = 0L;
            this.f6117e = Long.MAX_VALUE;
            this.f6118f = Integer.MAX_VALUE;
            this.f6119g = 0.0f;
            this.f6120h = true;
            this.f6121i = -1L;
            this.f6122j = 0;
            this.f6123k = 0;
            this.f6124l = null;
            this.f6125m = false;
            this.f6126n = null;
            this.f6127o = null;
        }

        public a(LocationRequest locationRequest) {
            this.f6113a = locationRequest.f6098a;
            this.f6114b = locationRequest.f6099b;
            this.f6115c = locationRequest.f6100c;
            this.f6116d = locationRequest.f6101d;
            this.f6117e = locationRequest.f6102e;
            this.f6118f = locationRequest.f6103f;
            this.f6119g = locationRequest.f6104g;
            this.f6120h = locationRequest.f6105h;
            this.f6121i = locationRequest.f6106i;
            this.f6122j = locationRequest.f6107j;
            this.f6123k = locationRequest.f6108k;
            this.f6124l = locationRequest.f6109l;
            this.f6125m = locationRequest.f6110m;
            this.f6126n = locationRequest.f6111n;
            this.f6127o = locationRequest.f6112o;
        }

        public final LocationRequest a() {
            int i10 = this.f6113a;
            long j10 = this.f6114b;
            long j11 = this.f6115c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f6116d, this.f6114b);
            long j12 = this.f6117e;
            int i11 = this.f6118f;
            float f10 = this.f6119g;
            boolean z10 = this.f6120h;
            long j13 = this.f6121i;
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j13 == -1 ? this.f6114b : j13, this.f6122j, this.f6123k, this.f6124l, this.f6125m, new WorkSource(this.f6126n), this.f6127o);
        }

        public final void b(int i10) {
            boolean z10;
            int i11 = 2;
            if (i10 != 0 && i10 != 1) {
                if (i10 != 2) {
                    i11 = i10;
                    z10 = false;
                    p.b(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i11));
                    this.f6122j = i10;
                }
            } else {
                i11 = i10;
            }
            z10 = true;
            p.b(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i11));
            this.f6122j = i10;
        }

        public final void c(int i10) {
            boolean z10;
            int i11;
            int i12 = 2;
            if (i10 == 0 || i10 == 1) {
                i12 = i10;
            } else if (i10 != 2) {
                i11 = i10;
                z10 = false;
                p.b(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                this.f6123k = i11;
            } else {
                i10 = 2;
            }
            z10 = true;
            int i13 = i12;
            i11 = i10;
            i10 = i13;
            p.b(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f6123k = i11;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, t tVar) {
        this.f6098a = i10;
        long j16 = j10;
        this.f6099b = j16;
        this.f6100c = j11;
        this.f6101d = j12;
        this.f6102e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f6103f = i11;
        this.f6104g = f10;
        this.f6105h = z10;
        this.f6106i = j15 != -1 ? j15 : j16;
        this.f6107j = i12;
        this.f6108k = i13;
        this.f6109l = str;
        this.f6110m = z11;
        this.f6111n = workSource;
        this.f6112o = tVar;
    }

    public static String f(long j10) {
        String sb2;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = b0.f30399a;
        synchronized (sb3) {
            sb3.setLength(0);
            b0.a(j10, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    @Pure
    public final boolean e() {
        long j10 = this.f6101d;
        return j10 > 0 && (j10 >> 1) >= this.f6099b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i10 = this.f6098a;
            if (i10 == locationRequest.f6098a) {
                if (((i10 == 105) || this.f6099b == locationRequest.f6099b) && this.f6100c == locationRequest.f6100c && e() == locationRequest.e() && ((!e() || this.f6101d == locationRequest.f6101d) && this.f6102e == locationRequest.f6102e && this.f6103f == locationRequest.f6103f && this.f6104g == locationRequest.f6104g && this.f6105h == locationRequest.f6105h && this.f6107j == locationRequest.f6107j && this.f6108k == locationRequest.f6108k && this.f6110m == locationRequest.f6110m && this.f6111n.equals(locationRequest.f6111n) && n.a(this.f6109l, locationRequest.f6109l) && n.a(this.f6112o, locationRequest.f6112o))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6098a), Long.valueOf(this.f6099b), Long.valueOf(this.f6100c), this.f6111n});
    }

    public final String toString() {
        boolean z10;
        boolean z11;
        String str;
        StringBuilder a10 = d.a("Request[");
        boolean z12 = false;
        if (this.f6098a == 105) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a10.append("@");
            boolean e10 = e();
            long j10 = this.f6099b;
            if (e10) {
                b0.a(j10, a10);
                a10.append("/");
                j10 = this.f6101d;
            }
            b0.a(j10, a10);
            a10.append(" ");
        }
        a10.append(b.I(this.f6098a));
        if (this.f6098a == 105) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || this.f6100c != this.f6099b) {
            a10.append(", minUpdateInterval=");
            a10.append(f(this.f6100c));
        }
        if (this.f6104g > 0.0d) {
            a10.append(", minUpdateDistance=");
            a10.append(this.f6104g);
        }
        if (this.f6098a == 105) {
            z12 = true;
        }
        long j11 = this.f6106i;
        if (!z12 ? j11 != this.f6099b : j11 != Long.MAX_VALUE) {
            a10.append(", maxUpdateAge=");
            a10.append(f(this.f6106i));
        }
        if (this.f6102e != Long.MAX_VALUE) {
            a10.append(", duration=");
            b0.a(this.f6102e, a10);
        }
        if (this.f6103f != Integer.MAX_VALUE) {
            a10.append(", maxUpdates=");
            a10.append(this.f6103f);
        }
        if (this.f6108k != 0) {
            a10.append(", ");
            int i10 = this.f6108k;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            a10.append(str);
        }
        if (this.f6107j != 0) {
            a10.append(", ");
            a10.append(tb.a.x(this.f6107j));
        }
        if (this.f6105h) {
            a10.append(", waitForAccurateLocation");
        }
        if (this.f6110m) {
            a10.append(", bypass");
        }
        if (this.f6109l != null) {
            a10.append(", moduleId=");
            a10.append(this.f6109l);
        }
        if (!n8.b.a(this.f6111n)) {
            a10.append(", ");
            a10.append(this.f6111n);
        }
        if (this.f6112o != null) {
            a10.append(", impersonation=");
            a10.append(this.f6112o);
        }
        a10.append(']');
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.z(parcel, 1, this.f6098a);
        b.A(parcel, 2, this.f6099b);
        b.A(parcel, 3, this.f6100c);
        b.z(parcel, 6, this.f6103f);
        b.w(parcel, 7, this.f6104g);
        b.A(parcel, 8, this.f6101d);
        b.t(parcel, 9, this.f6105h);
        b.A(parcel, 10, this.f6102e);
        b.A(parcel, 11, this.f6106i);
        b.z(parcel, 12, this.f6107j);
        b.z(parcel, 13, this.f6108k);
        b.C(parcel, 14, this.f6109l);
        b.t(parcel, 15, this.f6110m);
        b.B(parcel, 16, this.f6111n, i10);
        b.B(parcel, 17, this.f6112o, i10);
        b.J(parcel, F);
    }
}
