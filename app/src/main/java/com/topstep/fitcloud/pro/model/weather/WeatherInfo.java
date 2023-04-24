package com.topstep.fitcloud.pro.model.weather;

import a1.b;
import android.support.v4.media.d;
import gm.l;
import i2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class WeatherInfo {

    /* renamed from: a */
    public final long f9733a;

    /* renamed from: b */
    public final String f9734b;

    /* renamed from: c */
    public final String f9735c;

    /* renamed from: d */
    public final int f9736d;

    /* renamed from: e */
    public final int f9737e;

    /* renamed from: f */
    public final String f9738f;

    /* renamed from: g */
    public final List<ForecastInfo> f9739g;

    /* renamed from: h */
    public final int f9740h;

    /* renamed from: i */
    public final int f9741i;

    /* renamed from: j */
    public final int f9742j;

    /* renamed from: k */
    public final int f9743k;

    /* renamed from: l */
    public final int f9744l;

    public WeatherInfo(long j10, String str, String str2, int i10, int i11, String str3, List<ForecastInfo> list, int i12, int i13, int i14, int i15, int i16) {
        l.f(str, "cid");
        l.f(str2, "locality");
        this.f9733a = j10;
        this.f9734b = str;
        this.f9735c = str2;
        this.f9736d = i10;
        this.f9737e = i11;
        this.f9738f = str3;
        this.f9739g = list;
        this.f9740h = i12;
        this.f9741i = i13;
        this.f9742j = i14;
        this.f9743k = i15;
        this.f9744l = i16;
    }

    public /* synthetic */ WeatherInfo(long j10, String str, String str2, int i10, int i11, String str3, List list, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, i10, i11, (i17 & 32) != 0 ? null : str3, (i17 & 64) != 0 ? null : list, i12, i13, i14, i15, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeatherInfo) {
            WeatherInfo weatherInfo = (WeatherInfo) obj;
            return this.f9733a == weatherInfo.f9733a && l.a(this.f9734b, weatherInfo.f9734b) && l.a(this.f9735c, weatherInfo.f9735c) && this.f9736d == weatherInfo.f9736d && this.f9737e == weatherInfo.f9737e && l.a(this.f9738f, weatherInfo.f9738f) && l.a(this.f9739g, weatherInfo.f9739g) && this.f9740h == weatherInfo.f9740h && this.f9741i == weatherInfo.f9741i && this.f9742j == weatherInfo.f9742j && this.f9743k == weatherInfo.f9743k && this.f9744l == weatherInfo.f9744l;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f9733a;
        int a10 = (((t.a(this.f9735c, t.a(this.f9734b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31) + this.f9736d) * 31) + this.f9737e) * 31;
        String str = this.f9738f;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        List<ForecastInfo> list = this.f9739g;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((((((((((i11 + i10) * 31) + this.f9740h) * 31) + this.f9741i) * 31) + this.f9742j) * 31) + this.f9743k) * 31) + this.f9744l;
    }

    public final String toString() {
        StringBuilder a10 = d.a("WeatherInfo(time=");
        a10.append(this.f9733a);
        a10.append(", cid=");
        a10.append(this.f9734b);
        a10.append(", locality=");
        a10.append(this.f9735c);
        a10.append(", tmp=");
        a10.append(this.f9736d);
        a10.append(", code=");
        a10.append(this.f9737e);
        a10.append(", codeText=");
        a10.append(this.f9738f);
        a10.append(", forecasts=");
        a10.append(this.f9739g);
        a10.append(", min=");
        a10.append(this.f9740h);
        a10.append(", max=");
        a10.append(this.f9741i);
        a10.append(", pressure=");
        a10.append(this.f9742j);
        a10.append(", windForce=");
        a10.append(this.f9743k);
        a10.append(", visibility=");
        return b.a(a10, this.f9744l, ')');
    }
}
