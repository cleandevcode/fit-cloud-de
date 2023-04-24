package com.topstep.fitcloud.pro.shared.data.bean;

import a0.a2;
import android.support.v4.media.d;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.p;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class VersionBean {

    /* renamed from: a */
    public final String f9846a;

    /* renamed from: b */
    public final String f9847b;

    /* renamed from: c */
    public final String f9848c;

    /* renamed from: d */
    public final String f9849d;

    /* renamed from: e */
    public final String f9850e;

    /* renamed from: f */
    public final String f9851f;

    /* renamed from: g */
    public final long f9852g;

    /* renamed from: h */
    public final boolean f9853h;

    /* renamed from: i */
    public final String f9854i;

    /* renamed from: j */
    public final String f9855j;

    public VersionBean(String str, String str2, String str3, String str4, String str5, String str6, long j10, @p(name = "forceUpgrade") boolean z10, String str7, String str8) {
        this.f9846a = str;
        this.f9847b = str2;
        this.f9848c = str3;
        this.f9849d = str4;
        this.f9850e = str5;
        this.f9851f = str6;
        this.f9852g = j10;
        this.f9853h = z10;
        this.f9854i = str7;
        this.f9855j = str8;
    }

    public /* synthetic */ VersionBean(String str, String str2, String str3, String str4, String str5, String str6, long j10, boolean z10, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i10 & 64) != 0 ? 0L : j10, (i10 & 128) != 0 ? false : z10, (i10 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : str7, (i10 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? null : str8);
    }

    public final VersionBean copy(String str, String str2, String str3, String str4, String str5, String str6, long j10, @p(name = "forceUpgrade") boolean z10, String str7, String str8) {
        return new VersionBean(str, str2, str3, str4, str5, str6, j10, z10, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VersionBean) {
            VersionBean versionBean = (VersionBean) obj;
            return l.a(this.f9846a, versionBean.f9846a) && l.a(this.f9847b, versionBean.f9847b) && l.a(this.f9848c, versionBean.f9848c) && l.a(this.f9849d, versionBean.f9849d) && l.a(this.f9850e, versionBean.f9850e) && l.a(this.f9851f, versionBean.f9851f) && this.f9852g == versionBean.f9852g && this.f9853h == versionBean.f9853h && l.a(this.f9854i, versionBean.f9854i) && l.a(this.f9855j, versionBean.f9855j);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f9846a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9847b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9848c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9849d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9850e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9851f;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        long j10 = this.f9852g;
        int i10 = (((hashCode5 + hashCode6) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z10 = this.f9853h;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        String str7 = this.f9854i;
        int hashCode7 = (i12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f9855j;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("VersionBean(androidVersion=");
        a10.append(this.f9846a);
        a10.append(", androidRemark=");
        a10.append(this.f9847b);
        a10.append(", hardwareInfo=");
        a10.append(this.f9848c);
        a10.append(", hardwareRemark=");
        a10.append(this.f9849d);
        a10.append(", hardwareUrl=");
        a10.append(this.f9850e);
        a10.append(", hardwareType=");
        a10.append(this.f9851f);
        a10.append(", hardwareSize=");
        a10.append(this.f9852g);
        a10.append(", isHardwareForce=");
        a10.append(this.f9853h);
        a10.append(", uiVersionScope=");
        a10.append(this.f9854i);
        a10.append(", appNumScope=");
        return a2.a(a10, this.f9855j, ')');
    }
}
