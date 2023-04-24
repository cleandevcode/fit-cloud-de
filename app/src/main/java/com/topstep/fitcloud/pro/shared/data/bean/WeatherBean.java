package com.topstep.fitcloud.pro.shared.data.bean;

import a0.a2;
import android.support.v4.media.d;
import fb.b;
import gm.l;
import i2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class WeatherBean {

    /* renamed from: a */
    public final Now f9861a;

    /* renamed from: b */
    public final List<Day> f9862b;

    @Metadata
    @u(generateAdapter = true)
    /* loaded from: classes2.dex */
    public static final class Day {

        /* renamed from: a */
        public final String f9863a;

        /* renamed from: b */
        public final String f9864b;

        /* renamed from: c */
        public final String f9865c;

        /* renamed from: d */
        public final String f9866d;

        /* renamed from: e */
        public final String f9867e;

        public Day(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "fxDate");
            l.f(str2, "weatherDayType");
            l.f(str4, "tempMin");
            l.f(str5, "tempMax");
            this.f9863a = str;
            this.f9864b = str2;
            this.f9865c = str3;
            this.f9866d = str4;
            this.f9867e = str5;
        }

        public /* synthetic */ Day(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, str4, str5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Day) {
                Day day = (Day) obj;
                return l.a(this.f9863a, day.f9863a) && l.a(this.f9864b, day.f9864b) && l.a(this.f9865c, day.f9865c) && l.a(this.f9866d, day.f9866d) && l.a(this.f9867e, day.f9867e);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a10 = t.a(this.f9864b, this.f9863a.hashCode() * 31, 31);
            String str = this.f9865c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.f9867e.hashCode() + t.a(this.f9866d, (a10 + hashCode) * 31, 31);
        }

        public final String toString() {
            StringBuilder a10 = d.a("Day(fxDate=");
            a10.append(this.f9863a);
            a10.append(", weatherDayType=");
            a10.append(this.f9864b);
            a10.append(", textDay=");
            a10.append(this.f9865c);
            a10.append(", tempMin=");
            a10.append(this.f9866d);
            a10.append(", tempMax=");
            return a2.a(a10, this.f9867e, ')');
        }
    }

    @Metadata
    @u(generateAdapter = true)
    /* loaded from: classes2.dex */
    public static final class Now {

        /* renamed from: a */
        public final String f9868a;

        /* renamed from: b */
        public final String f9869b;

        /* renamed from: c */
        public final String f9870c;

        /* renamed from: d */
        public final String f9871d;

        /* renamed from: e */
        public final String f9872e;

        /* renamed from: f */
        public final String f9873f;

        public Now(String str, String str2, String str3, String str4, String str5, String str6) {
            l.f(str, "cond_type");
            l.f(str3, "tmp");
            this.f9868a = str;
            this.f9869b = str2;
            this.f9870c = str3;
            this.f9871d = str4;
            this.f9872e = str5;
            this.f9873f = str6;
        }

        public /* synthetic */ Now(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Now) {
                Now now = (Now) obj;
                return l.a(this.f9868a, now.f9868a) && l.a(this.f9869b, now.f9869b) && l.a(this.f9870c, now.f9870c) && l.a(this.f9871d, now.f9871d) && l.a(this.f9872e, now.f9872e) && l.a(this.f9873f, now.f9873f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f9868a.hashCode() * 31;
            String str = this.f9869b;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a10 = t.a(this.f9870c, (hashCode4 + hashCode) * 31, 31);
            String str2 = this.f9871d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i11 = (a10 + hashCode2) * 31;
            String str3 = this.f9872e;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (i11 + hashCode3) * 31;
            String str4 = this.f9873f;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return i12 + i10;
        }

        public final String toString() {
            StringBuilder a10 = d.a("Now(cond_type=");
            a10.append(this.f9868a);
            a10.append(", cond_txt=");
            a10.append(this.f9869b);
            a10.append(", tmp=");
            a10.append(this.f9870c);
            a10.append(", pres=");
            a10.append(this.f9871d);
            a10.append(", vis=");
            a10.append(this.f9872e);
            a10.append(", wind_sc=");
            return a2.a(a10, this.f9873f, ')');
        }
    }

    public WeatherBean() {
        this(null, null, 3, null);
    }

    public WeatherBean(Now now, List<Day> list) {
        this.f9861a = now;
        this.f9862b = list;
    }

    public /* synthetic */ WeatherBean(Now now, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : now, (i10 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeatherBean) {
            WeatherBean weatherBean = (WeatherBean) obj;
            return l.a(this.f9861a, weatherBean.f9861a) && l.a(this.f9862b, weatherBean.f9862b);
        }
        return false;
    }

    public final int hashCode() {
        Now now = this.f9861a;
        int hashCode = (now == null ? 0 : now.hashCode()) * 31;
        List<Day> list = this.f9862b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("WeatherBean(now=");
        a10.append(this.f9861a);
        a10.append(", daily=");
        return b.a(a10, this.f9862b, ')');
    }
}
