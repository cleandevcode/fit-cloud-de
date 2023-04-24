package eg;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.version.AppUpgradeInfo;
import com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo;
import gm.l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final AppUpgradeInfo f13617a;

    /* renamed from: b */
    public final HardwareUpgradeInfo f13618b;

    public b(AppUpgradeInfo appUpgradeInfo, HardwareUpgradeInfo hardwareUpgradeInfo) {
        this.f13617a = appUpgradeInfo;
        this.f13618b = hardwareUpgradeInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return l.a(this.f13617a, bVar.f13617a) && l.a(this.f13618b, bVar.f13618b);
        }
        return false;
    }

    public final int hashCode() {
        AppUpgradeInfo appUpgradeInfo = this.f13617a;
        int hashCode = (appUpgradeInfo == null ? 0 : appUpgradeInfo.hashCode()) * 31;
        HardwareUpgradeInfo hardwareUpgradeInfo = this.f13618b;
        return hashCode + (hardwareUpgradeInfo != null ? hardwareUpgradeInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("VersionUpgradeInfo(app=");
        a10.append(this.f13617a);
        a10.append(", hardware=");
        a10.append(this.f13618b);
        a10.append(')');
        return a10.toString();
    }
}
