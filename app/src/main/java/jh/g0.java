package jh;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.d1;

/* loaded from: classes2.dex */
public final class g0 implements y3.b0 {

    /* renamed from: a */
    public final y3.b<FillUserInfo> f17787a;

    public g0() {
        this(null, 1, null);
    }

    public g0(y3.b<FillUserInfo> bVar) {
        gm.l.f(bVar, WiseOpenHianalyticsData.UNION_RESULT);
        this.f17787a = bVar;
    }

    public /* synthetic */ g0(y3.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d1.f30940b : bVar);
    }

    public static g0 copy$default(g0 g0Var, y3.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g0Var.f17787a;
        }
        g0Var.getClass();
        gm.l.f(bVar, WiseOpenHianalyticsData.UNION_RESULT);
        return new g0(bVar);
    }

    public final y3.b<FillUserInfo> component1() {
        return this.f17787a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && gm.l.a(this.f17787a, ((g0) obj).f17787a);
    }

    public final int hashCode() {
        return this.f17787a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SignUpState(result=");
        a10.append(this.f17787a);
        a10.append(')');
        return a10.toString();
    }
}
