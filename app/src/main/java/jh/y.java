package jh;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.d1;

/* loaded from: classes2.dex */
public final class y implements y3.b0 {

    /* renamed from: a */
    public final y3.b<FillUserInfo> f17833a;

    public y() {
        this(null, 1, null);
    }

    public y(y3.b<FillUserInfo> bVar) {
        gm.l.f(bVar, WiseOpenHianalyticsData.UNION_RESULT);
        this.f17833a = bVar;
    }

    public /* synthetic */ y(y3.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d1.f30940b : bVar);
    }

    public static y a(y3.b bVar) {
        gm.l.f(bVar, WiseOpenHianalyticsData.UNION_RESULT);
        return new y(bVar);
    }

    public static /* synthetic */ y copy$default(y yVar, y3.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = yVar.f17833a;
        }
        yVar.getClass();
        return a(bVar);
    }

    public final y3.b<FillUserInfo> component1() {
        return this.f17833a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && gm.l.a(this.f17833a, ((y) obj).f17833a);
    }

    public final int hashCode() {
        return this.f17833a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SignInState(result=");
        a10.append(this.f17833a);
        a10.append(')');
        return a10.toString();
    }
}
