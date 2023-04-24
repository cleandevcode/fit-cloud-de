package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import i8.n;
import j8.a;
import o8.b;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new e();

    /* renamed from: a */
    public Boolean f6130a;

    /* renamed from: b */
    public Boolean f6131b;

    /* renamed from: c */
    public int f6132c;

    /* renamed from: d */
    public CameraPosition f6133d;

    /* renamed from: e */
    public Boolean f6134e;

    /* renamed from: f */
    public Boolean f6135f;

    /* renamed from: g */
    public Boolean f6136g;

    /* renamed from: h */
    public Boolean f6137h;

    /* renamed from: i */
    public Boolean f6138i;

    /* renamed from: j */
    public Boolean f6139j;

    /* renamed from: k */
    public Boolean f6140k;

    /* renamed from: l */
    public Boolean f6141l;

    /* renamed from: m */
    public Boolean f6142m;

    /* renamed from: n */
    public Float f6143n;

    /* renamed from: o */
    public Float f6144o;

    /* renamed from: p */
    public LatLngBounds f6145p;

    /* renamed from: q */
    public Boolean f6146q;

    /* renamed from: r */
    public Integer f6147r;

    /* renamed from: s */
    public String f6148s;

    static {
        Color.argb(255, 236, 233, 225);
    }

    public GoogleMapOptions() {
        this.f6132c = -1;
        this.f6143n = null;
        this.f6144o = null;
        this.f6145p = null;
        this.f6147r = null;
        this.f6148s = null;
    }

    public GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str) {
        this.f6132c = -1;
        this.f6143n = null;
        this.f6144o = null;
        this.f6145p = null;
        this.f6147r = null;
        this.f6148s = null;
        this.f6130a = tb.a.w(b10);
        this.f6131b = tb.a.w(b11);
        this.f6132c = i10;
        this.f6133d = cameraPosition;
        this.f6134e = tb.a.w(b12);
        this.f6135f = tb.a.w(b13);
        this.f6136g = tb.a.w(b14);
        this.f6137h = tb.a.w(b15);
        this.f6138i = tb.a.w(b16);
        this.f6139j = tb.a.w(b17);
        this.f6140k = tb.a.w(b18);
        this.f6141l = tb.a.w(b19);
        this.f6142m = tb.a.w(b20);
        this.f6143n = f10;
        this.f6144o = f11;
        this.f6145p = latLngBounds;
        this.f6146q = tb.a.w(b21);
        this.f6147r = num;
        this.f6148s = str;
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        aVar.a(Integer.valueOf(this.f6132c), "MapType");
        aVar.a(this.f6140k, "LiteMode");
        aVar.a(this.f6133d, "Camera");
        aVar.a(this.f6135f, "CompassEnabled");
        aVar.a(this.f6134e, "ZoomControlsEnabled");
        aVar.a(this.f6136g, "ScrollGesturesEnabled");
        aVar.a(this.f6137h, "ZoomGesturesEnabled");
        aVar.a(this.f6138i, "TiltGesturesEnabled");
        aVar.a(this.f6139j, "RotateGesturesEnabled");
        aVar.a(this.f6146q, "ScrollGesturesEnabledDuringRotateOrZoom");
        aVar.a(this.f6141l, "MapToolbarEnabled");
        aVar.a(this.f6142m, "AmbientEnabled");
        aVar.a(this.f6143n, "MinZoomPreference");
        aVar.a(this.f6144o, "MaxZoomPreference");
        aVar.a(this.f6147r, "BackgroundColor");
        aVar.a(this.f6145p, "LatLngBoundsForCameraTarget");
        aVar.a(this.f6130a, "ZOrderOnTop");
        aVar.a(this.f6131b, "UseViewLifecycleInFragment");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.v(parcel, 2, tb.a.v(this.f6130a));
        b.v(parcel, 3, tb.a.v(this.f6131b));
        b.z(parcel, 4, this.f6132c);
        b.B(parcel, 5, this.f6133d, i10);
        b.v(parcel, 6, tb.a.v(this.f6134e));
        b.v(parcel, 7, tb.a.v(this.f6135f));
        b.v(parcel, 8, tb.a.v(this.f6136g));
        b.v(parcel, 9, tb.a.v(this.f6137h));
        b.v(parcel, 10, tb.a.v(this.f6138i));
        b.v(parcel, 11, tb.a.v(this.f6139j));
        b.v(parcel, 12, tb.a.v(this.f6140k));
        b.v(parcel, 14, tb.a.v(this.f6141l));
        b.v(parcel, 15, tb.a.v(this.f6142m));
        b.x(parcel, 16, this.f6143n);
        b.x(parcel, 17, this.f6144o);
        b.B(parcel, 18, this.f6145p, i10);
        b.v(parcel, 19, tb.a.v(this.f6146q));
        Integer num = this.f6147r;
        if (num != null) {
            parcel.writeInt(262164);
            parcel.writeInt(num.intValue());
        }
        b.C(parcel, 21, this.f6148s);
        b.J(parcel, F);
    }
}
