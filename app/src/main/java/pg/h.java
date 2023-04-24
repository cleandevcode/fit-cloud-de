package pg;

import a0.a2;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import i2.t;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a */
    public final long f24046a;

    /* renamed from: b */
    public final String f24047b;

    /* renamed from: c */
    public final String f24048c;

    public h(String str, long j10, String str2) {
        gm.l.f(str, MLApplicationSetting.BundleKeyConstants.AppInfo.appName);
        gm.l.f(str2, MLApplicationSetting.BundleKeyConstants.AppInfo.packageName);
        this.f24046a = j10;
        this.f24047b = str;
        this.f24048c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f24046a == hVar.f24046a && gm.l.a(this.f24047b, hVar.f24047b) && gm.l.a(this.f24048c, hVar.f24048c);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24046a;
        return this.f24048c.hashCode() + t.a(this.f24047b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("NotificationOtherEntity(userId=");
        a10.append(this.f24046a);
        a10.append(", appName=");
        a10.append(this.f24047b);
        a10.append(", packageName=");
        return a2.a(a10, this.f24048c, ')');
    }
}
