package rh;

import com.topstep.fitcloud.pro.model.data.EcgRecord;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class h0 implements u6.o {

    /* renamed from: a */
    public final u6.a<EcgRecord> f25695a;

    public h0() {
        this(null, 1, null);
    }

    public h0(u6.a<EcgRecord> aVar) {
        gm.l.f(aVar, "asyncDetail");
        this.f25695a = aVar;
    }

    public /* synthetic */ h0(u6.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar);
    }

    public static h0 copy$default(h0 h0Var, u6.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = h0Var.f25695a;
        }
        h0Var.getClass();
        gm.l.f(aVar, "asyncDetail");
        return new h0(aVar);
    }

    public final u6.a<EcgRecord> component1() {
        return this.f25695a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && gm.l.a(this.f25695a, ((h0) obj).f25695a);
    }

    public final int hashCode() {
        return this.f25695a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EcgViewState(asyncDetail=");
        a10.append(this.f25695a);
        a10.append(')');
        return a10.toString();
    }
}
