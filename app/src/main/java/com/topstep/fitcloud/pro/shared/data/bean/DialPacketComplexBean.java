package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import fb.b;
import gm.l;
import i2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DialPacketComplexBean {

    /* renamed from: a */
    public final int f9777a;

    /* renamed from: b */
    public final int f9778b;

    /* renamed from: c */
    public final String f9779c;

    /* renamed from: d */
    public final int f9780d;

    /* renamed from: e */
    public final String f9781e;

    /* renamed from: f */
    public final String f9782f;

    /* renamed from: g */
    public final String f9783g;

    /* renamed from: h */
    public final String f9784h;

    /* renamed from: i */
    public final long f9785i;

    /* renamed from: j */
    public final int f9786j;

    /* renamed from: k */
    public final int f9787k;

    /* renamed from: l */
    public final String f9788l;

    /* renamed from: m */
    public final List<Component> f9789m;

    @Metadata
    @u(generateAdapter = true)
    /* loaded from: classes2.dex */
    public static final class Component {

        /* renamed from: a */
        public final List<String> f9790a;

        public Component() {
            this(null, 1, null);
        }

        public Component(List<String> list) {
            this.f9790a = list;
        }

        public /* synthetic */ Component(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Component) && l.a(this.f9790a, ((Component) obj).f9790a);
        }

        public final int hashCode() {
            List<String> list = this.f9790a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return b.a(d.a("Component(urls="), this.f9790a, ')');
        }
    }

    public DialPacketComplexBean(int i10, int i11, String str, int i12, String str2, String str3, String str4, String str5, long j10, int i13, int i14, String str6, List<Component> list) {
        l.f(str, "toolVersion");
        l.f(str4, "binUrl");
        this.f9777a = i10;
        this.f9778b = i11;
        this.f9779c = str;
        this.f9780d = i12;
        this.f9781e = str2;
        this.f9782f = str3;
        this.f9783g = str4;
        this.f9784h = str5;
        this.f9785i = j10;
        this.f9786j = i13;
        this.f9787k = i14;
        this.f9788l = str6;
        this.f9789m = list;
    }

    public /* synthetic */ DialPacketComplexBean(int i10, int i11, String str, int i12, String str2, String str3, String str4, String str5, long j10, int i13, int i14, String str6, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, str, i12, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : str3, str4, (i15 & 128) != 0 ? null : str5, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? 0L : j10, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? 0 : i13, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14, (i15 & 2048) != 0 ? null : str6, (i15 & 4096) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialPacketComplexBean) {
            DialPacketComplexBean dialPacketComplexBean = (DialPacketComplexBean) obj;
            return this.f9777a == dialPacketComplexBean.f9777a && this.f9778b == dialPacketComplexBean.f9778b && l.a(this.f9779c, dialPacketComplexBean.f9779c) && this.f9780d == dialPacketComplexBean.f9780d && l.a(this.f9781e, dialPacketComplexBean.f9781e) && l.a(this.f9782f, dialPacketComplexBean.f9782f) && l.a(this.f9783g, dialPacketComplexBean.f9783g) && l.a(this.f9784h, dialPacketComplexBean.f9784h) && this.f9785i == dialPacketComplexBean.f9785i && this.f9786j == dialPacketComplexBean.f9786j && this.f9787k == dialPacketComplexBean.f9787k && l.a(this.f9788l, dialPacketComplexBean.f9788l) && l.a(this.f9789m, dialPacketComplexBean.f9789m);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int a10 = (t.a(this.f9779c, ((this.f9777a * 31) + this.f9778b) * 31, 31) + this.f9780d) * 31;
        String str = this.f9781e;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        String str2 = this.f9782f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a11 = t.a(this.f9783g, (i11 + hashCode2) * 31, 31);
        String str3 = this.f9784h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.f9785i;
        int i12 = (((((((a11 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f9786j) * 31) + this.f9787k) * 31;
        String str4 = this.f9788l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        List<Component> list = this.f9789m;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i13 + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("DialPacketComplexBean(dialNum=");
        a10.append(this.f9777a);
        a10.append(", lcd=");
        a10.append(this.f9778b);
        a10.append(", toolVersion=");
        a10.append(this.f9779c);
        a10.append(", binVersion=");
        a10.append(this.f9780d);
        a10.append(", imgUrl=");
        a10.append(this.f9781e);
        a10.append(", deviceImgUrl=");
        a10.append(this.f9782f);
        a10.append(", binUrl=");
        a10.append(this.f9783g);
        a10.append(", name=");
        a10.append(this.f9784h);
        a10.append(", binSize=");
        a10.append(this.f9785i);
        a10.append(", downloadCount=");
        a10.append(this.f9786j);
        a10.append(", hasComponent=");
        a10.append(this.f9787k);
        a10.append(", previewImgUrl=");
        a10.append(this.f9788l);
        a10.append(", components=");
        return b.a(a10, this.f9789m, ')');
    }
}
