package ei;

import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class u implements u6.o {

    /* renamed from: a */
    public final u6.a<List<SimpleEcgRecord>> f13789a;

    /* renamed from: b */
    public final u6.a<EcgRecord> f13790b;

    public u() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(u6.a<? extends List<SimpleEcgRecord>> aVar, u6.a<EcgRecord> aVar2) {
        gm.l.f(aVar, "asyncList");
        gm.l.f(aVar2, "asyncDetail");
        this.f13789a = aVar;
        this.f13790b = aVar2;
    }

    public /* synthetic */ u(u6.a aVar, u6.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2);
    }

    public static u copy$default(u uVar, u6.a aVar, u6.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = uVar.f13789a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = uVar.f13790b;
        }
        uVar.getClass();
        gm.l.f(aVar, "asyncList");
        gm.l.f(aVar2, "asyncDetail");
        return new u(aVar, aVar2);
    }

    public final u6.a<List<SimpleEcgRecord>> component1() {
        return this.f13789a;
    }

    public final u6.a<EcgRecord> component2() {
        return this.f13790b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return gm.l.a(this.f13789a, uVar.f13789a) && gm.l.a(this.f13790b, uVar.f13790b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13790b.hashCode() + (this.f13789a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendEcgViewState(asyncList=");
        a10.append(this.f13789a);
        a10.append(", asyncDetail=");
        a10.append(this.f13790b);
        a10.append(')');
        return a10.toString();
    }
}
