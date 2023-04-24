package h8;

import i8.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final a f15940a;

    /* renamed from: b */
    public final f8.c f15941b;

    public /* synthetic */ d0(a aVar, f8.c cVar) {
        this.f15940a = aVar;
        this.f15941b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof d0)) {
            d0 d0Var = (d0) obj;
            if (i8.n.a(this.f15940a, d0Var.f15940a) && i8.n.a(this.f15941b, d0Var.f15941b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15940a, this.f15941b});
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        aVar.a(this.f15940a, "key");
        aVar.a(this.f15941b, "feature");
        return aVar.toString();
    }
}
