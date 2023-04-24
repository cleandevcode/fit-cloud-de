package zg;

import a0.a2;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import gm.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final String f32349a;

    /* renamed from: b */
    public final eg.a f32350b;

    /* renamed from: c */
    public final String f32351c;

    public a(String str, eg.a aVar, String str2) {
        l.f(str, "projectNum");
        l.f(aVar, "type");
        l.f(str2, WiseOpenHianalyticsData.UNION_VERSION);
        this.f32349a = str;
        this.f32350b = aVar;
        this.f32351c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f32349a, aVar.f32349a) && this.f32350b == aVar.f32350b && l.a(this.f32351c, aVar.f32351c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32350b.hashCode();
        return this.f32351c.hashCode() + ((hashCode + (this.f32349a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("HardwareUpgradeVersion(projectNum=");
        a10.append(this.f32349a);
        a10.append(", type=");
        a10.append(this.f32350b);
        a10.append(", version=");
        return a2.a(a10, this.f32351c, ')');
    }
}
