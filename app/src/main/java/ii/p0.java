package ii;

import com.topstep.fitcloud.pro.model.version.AppUpgradeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class p0 implements u6.o {

    /* renamed from: a */
    public final u6.a<tl.l> f16975a;

    /* renamed from: b */
    public final u6.a<Boolean> f16976b;

    /* renamed from: c */
    public final u6.a<AppUpgradeInfo> f16977c;

    public p0() {
        this(null, null, null, 7, null);
    }

    public p0(u6.a<tl.l> aVar, u6.a<Boolean> aVar2, u6.a<AppUpgradeInfo> aVar3) {
        gm.l.f(aVar, "signOut");
        gm.l.f(aVar2, "syncData");
        gm.l.f(aVar3, "asyncVersion");
        this.f16975a = aVar;
        this.f16976b = aVar2;
        this.f16977c = aVar3;
    }

    public /* synthetic */ p0(u6.a aVar, u6.a aVar2, u6.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2, (i10 & 4) != 0 ? u6.b0.f28527c : aVar3);
    }

    public static p0 copy$default(p0 p0Var, u6.a aVar, u6.a aVar2, u6.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = p0Var.f16975a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = p0Var.f16976b;
        }
        if ((i10 & 4) != 0) {
            aVar3 = p0Var.f16977c;
        }
        p0Var.getClass();
        gm.l.f(aVar, "signOut");
        gm.l.f(aVar2, "syncData");
        gm.l.f(aVar3, "asyncVersion");
        return new p0(aVar, aVar2, aVar3);
    }

    public final u6.a<tl.l> component1() {
        return this.f16975a;
    }

    public final u6.a<Boolean> component2() {
        return this.f16976b;
    }

    public final u6.a<AppUpgradeInfo> component3() {
        return this.f16977c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return gm.l.a(this.f16975a, p0Var.f16975a) && gm.l.a(this.f16976b, p0Var.f16976b) && gm.l.a(this.f16977c, p0Var.f16977c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f16976b.hashCode();
        return this.f16977c.hashCode() + ((hashCode + (this.f16975a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SettingsState(signOut=");
        a10.append(this.f16975a);
        a10.append(", syncData=");
        a10.append(this.f16976b);
        a10.append(", asyncVersion=");
        a10.append(this.f16977c);
        a10.append(')');
        return a10.toString();
    }
}
