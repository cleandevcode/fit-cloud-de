package h8;

import g8.a;
import g8.a.c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a<O extends a.c> {

    /* renamed from: a */
    public final int f15892a;

    /* renamed from: b */
    public final g8.a f15893b;

    /* renamed from: c */
    public final a.c f15894c;

    /* renamed from: d */
    public final String f15895d;

    public a(g8.a aVar, a.c cVar, String str) {
        this.f15893b = aVar;
        this.f15894c = cVar;
        this.f15895d = str;
        this.f15892a = Arrays.hashCode(new Object[]{aVar, cVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return i8.n.a(this.f15893b, aVar.f15893b) && i8.n.a(this.f15894c, aVar.f15894c) && i8.n.a(this.f15895d, aVar.f15895d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15892a;
    }
}
