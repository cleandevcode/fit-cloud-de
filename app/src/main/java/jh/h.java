package jh;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.d1;

/* loaded from: classes2.dex */
public final class h implements y3.b0 {

    /* renamed from: a */
    public final y3.b<Boolean> f17788a;

    public h() {
        this(null, 1, null);
    }

    public h(y3.b<Boolean> bVar) {
        gm.l.f(bVar, WiseOpenHianalyticsData.UNION_RESULT);
        this.f17788a = bVar;
    }

    public /* synthetic */ h(y3.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d1.f30940b : bVar);
    }

    public static h copy$default(h hVar, y3.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = hVar.f17788a;
        }
        hVar.getClass();
        gm.l.f(bVar, WiseOpenHianalyticsData.UNION_RESULT);
        return new h(bVar);
    }

    public final y3.b<Boolean> component1() {
        return this.f17788a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && gm.l.a(this.f17788a, ((h) obj).f17788a);
    }

    public final int hashCode() {
        return this.f17788a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FillUserState(result=");
        a10.append(this.f17788a);
        a10.append(')');
        return a10.toString();
    }
}
