package ji;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u6.b0;

/* loaded from: classes2.dex */
public final class b implements u6.o {

    /* renamed from: a */
    public final u6.a<rj.e> f17843a;

    /* renamed from: b */
    public final u6.a<List<qj.b>> f17844b;

    /* renamed from: c */
    public final u6.a<qj.a> f17845c;

    public b() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(u6.a<rj.e> aVar, u6.a<? extends List<qj.b>> aVar2, u6.a<? extends qj.a> aVar3) {
        gm.l.f(aVar, "asyncUiInfo");
        gm.l.f(aVar2, "asyncSleepRaw");
        gm.l.f(aVar3, "asyncAssistInfo");
        this.f17843a = aVar;
        this.f17844b = aVar2;
        this.f17845c = aVar3;
    }

    public /* synthetic */ b(u6.a aVar, u6.a aVar2, u6.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b0.f28527c : aVar, (i10 & 2) != 0 ? b0.f28527c : aVar2, (i10 & 4) != 0 ? b0.f28527c : aVar3);
    }

    public static b copy$default(b bVar, u6.a aVar, u6.a aVar2, u6.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = bVar.f17843a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = bVar.f17844b;
        }
        if ((i10 & 4) != 0) {
            aVar3 = bVar.f17845c;
        }
        bVar.getClass();
        gm.l.f(aVar, "asyncUiInfo");
        gm.l.f(aVar2, "asyncSleepRaw");
        gm.l.f(aVar3, "asyncAssistInfo");
        return new b(aVar, aVar2, aVar3);
    }

    public final u6.a<rj.e> component1() {
        return this.f17843a;
    }

    public final u6.a<List<qj.b>> component2() {
        return this.f17844b;
    }

    public final u6.a<qj.a> component3() {
        return this.f17845c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return gm.l.a(this.f17843a, bVar.f17843a) && gm.l.a(this.f17844b, bVar.f17844b) && gm.l.a(this.f17845c, bVar.f17845c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17844b.hashCode();
        return this.f17845c.hashCode() + ((hashCode + (this.f17843a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AssistState(asyncUiInfo=");
        a10.append(this.f17843a);
        a10.append(", asyncSleepRaw=");
        a10.append(this.f17844b);
        a10.append(", asyncAssistInfo=");
        a10.append(this.f17845c);
        a10.append(')');
        return a10.toString();
    }
}
