package rh;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class v implements u6.o {

    /* renamed from: a */
    public final u6.a<vf.d> f25744a;

    /* renamed from: b */
    public final u6.a<File> f25745b;

    /* renamed from: c */
    public final u6.a<File> f25746c;

    public v() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(u6.a<vf.d> aVar, u6.a<? extends File> aVar2, u6.a<? extends File> aVar3) {
        gm.l.f(aVar, "asyncResult");
        gm.l.f(aVar2, "asyncPdf");
        gm.l.f(aVar3, "asyncTxt");
        this.f25744a = aVar;
        this.f25745b = aVar2;
        this.f25746c = aVar3;
    }

    public /* synthetic */ v(u6.a aVar, u6.a aVar2, u6.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2, (i10 & 4) != 0 ? u6.b0.f28527c : aVar3);
    }

    public static v copy$default(v vVar, u6.a aVar, u6.a aVar2, u6.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = vVar.f25744a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = vVar.f25745b;
        }
        if ((i10 & 4) != 0) {
            aVar3 = vVar.f25746c;
        }
        vVar.getClass();
        gm.l.f(aVar, "asyncResult");
        gm.l.f(aVar2, "asyncPdf");
        gm.l.f(aVar3, "asyncTxt");
        return new v(aVar, aVar2, aVar3);
    }

    public final u6.a<vf.d> component1() {
        return this.f25744a;
    }

    public final u6.a<File> component2() {
        return this.f25745b;
    }

    public final u6.a<File> component3() {
        return this.f25746c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return gm.l.a(this.f25744a, vVar.f25744a) && gm.l.a(this.f25745b, vVar.f25745b) && gm.l.a(this.f25746c, vVar.f25746c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f25745b.hashCode();
        return this.f25746c.hashCode() + ((hashCode + (this.f25744a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EcgHealthReportViewState(asyncResult=");
        a10.append(this.f25744a);
        a10.append(", asyncPdf=");
        a10.append(this.f25745b);
        a10.append(", asyncTxt=");
        a10.append(this.f25746c);
        a10.append(')');
        return a10.toString();
    }
}
