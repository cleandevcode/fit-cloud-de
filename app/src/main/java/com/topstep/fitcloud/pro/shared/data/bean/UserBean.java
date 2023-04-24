package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import gm.l;
import hh.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.p;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;
import pg.m;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class UserBean {

    /* renamed from: a */
    public final long f9826a;

    /* renamed from: b */
    public final String f9827b;

    /* renamed from: c */
    public final String f9828c;

    /* renamed from: d */
    public final String f9829d;

    /* renamed from: e */
    public final int f9830e;

    /* renamed from: f */
    public final String f9831f;

    /* renamed from: g */
    public final float f9832g;

    /* renamed from: h */
    public final float f9833h;

    /* renamed from: i */
    public final String f9834i;

    /* renamed from: j */
    public final String f9835j;

    /* renamed from: k */
    public final int f9836k;

    /* renamed from: l */
    public final int f9837l;

    /* renamed from: m */
    public final int f9838m;

    /* renamed from: n */
    public final long f9839n;

    public UserBean(long j10, String str, String str2, String str3, int i10, String str4, float f10, float f11, String str5, String str6, int i11, int i12, int i13, long j11) {
        this.f9826a = j10;
        this.f9827b = str;
        this.f9828c = str2;
        this.f9829d = str3;
        this.f9830e = i10;
        this.f9831f = str4;
        this.f9832g = f10;
        this.f9833h = f11;
        this.f9834i = str5;
        this.f9835j = str6;
        this.f9836k = i11;
        this.f9837l = i12;
        this.f9838m = i13;
        this.f9839n = j11;
    }

    public /* synthetic */ UserBean(long j10, String str, String str2, String str3, int i10, String str4, float f10, float f11, String str5, String str6, int i11, int i12, int i13, long j11, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? 0 : i10, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? 170.0f : f10, (i14 & 128) != 0 ? 70.0f : f11, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : str5, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? null : str6, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i11, (i14 & 2048) != 0 ? 0 : i12, (i14 & 4096) != 0 ? 0 : i13, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0L : j11);
    }

    @p(ignore = true)
    private static /* synthetic */ void getRequireBirthday$annotations() {
    }

    @p(ignore = true)
    private static /* synthetic */ void getRequireHeight$annotations() {
    }

    @p(ignore = true)
    private static /* synthetic */ void getRequireNickname$annotations() {
    }

    @p(ignore = true)
    private static /* synthetic */ void getRequireWeight$annotations() {
    }

    public final String a() {
        boolean z10;
        String str = this.f9829d;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            StringBuilder a10 = d.a("User");
            a10.append(this.f9826a);
            return a10.toString();
        }
        return this.f9829d;
    }

    public final m b() {
        boolean z10;
        String str;
        boolean z11;
        float f10;
        float f11;
        long j10 = this.f9826a;
        String str2 = this.f9827b;
        String str3 = this.f9828c;
        String a10 = a();
        int i10 = this.f9830e;
        String str4 = this.f9831f;
        boolean z12 = true;
        if (str4 != null && str4.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str = b.a();
        } else {
            str = this.f9831f;
        }
        String str5 = str;
        float f12 = this.f9832g;
        if (30.0f <= f12 && f12 <= 242.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            f10 = 170.0f;
        } else {
            f10 = f12;
        }
        float f13 = this.f9833h;
        if (!((20.0f > f13 || f13 > 350.0f) ? false : false)) {
            f11 = 70.0f;
        } else {
            f11 = f13;
        }
        m mVar = new m(j10, str2, str3, a10, i10, str5, f10, f11, this.f9834i, this.f9835j, this.f9836k, this.f9837l, this.f9838m, this.f9839n);
        mVar.f24053b = 0;
        mVar.f24054c = System.currentTimeMillis();
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserBean) {
            UserBean userBean = (UserBean) obj;
            return this.f9826a == userBean.f9826a && l.a(this.f9827b, userBean.f9827b) && l.a(this.f9828c, userBean.f9828c) && l.a(this.f9829d, userBean.f9829d) && this.f9830e == userBean.f9830e && l.a(this.f9831f, userBean.f9831f) && Float.compare(this.f9832g, userBean.f9832g) == 0 && Float.compare(this.f9833h, userBean.f9833h) == 0 && l.a(this.f9834i, userBean.f9834i) && l.a(this.f9835j, userBean.f9835j) && this.f9836k == userBean.f9836k && this.f9837l == userBean.f9837l && this.f9838m == userBean.f9838m && this.f9839n == userBean.f9839n;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        long j10 = this.f9826a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f9827b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        String str2 = this.f9828c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.f9829d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (((i13 + hashCode3) * 31) + this.f9830e) * 31;
        String str4 = this.f9831f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int b10 = e.b(this.f9833h, e.b(this.f9832g, (i14 + hashCode4) * 31, 31), 31);
        String str5 = this.f9834i;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (b10 + hashCode5) * 31;
        String str6 = this.f9835j;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        long j11 = this.f9839n;
        return ((((((((i15 + i11) * 31) + this.f9836k) * 31) + this.f9837l) * 31) + this.f9838m) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder a10 = d.a("UserBean(userId=");
        a10.append(this.f9826a);
        a10.append(", phone=");
        a10.append(this.f9827b);
        a10.append(", email=");
        a10.append(this.f9828c);
        a10.append(", nickName=");
        a10.append(this.f9829d);
        a10.append(", sex=");
        a10.append(this.f9830e);
        a10.append(", birthday=");
        a10.append(this.f9831f);
        a10.append(", height=");
        a10.append(this.f9832g);
        a10.append(", weight=");
        a10.append(this.f9833h);
        a10.append(", avatar=");
        a10.append(this.f9834i);
        a10.append(", identityId=");
        a10.append(this.f9835j);
        a10.append(", hasProfile=");
        a10.append(this.f9836k);
        a10.append(", hasPassword=");
        a10.append(this.f9837l);
        a10.append(", hasIdentity=");
        a10.append(this.f9838m);
        a10.append(", lastModifyTime=");
        return d4.b.a(a10, this.f9839n, ')');
    }
}
