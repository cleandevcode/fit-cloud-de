package l2;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class g3<T> {

    /* renamed from: e */
    public static final g3<Object> f18899e = new g3<>(0, ul.s.f28879a);

    /* renamed from: a */
    public final int[] f18900a;

    /* renamed from: b */
    public final List<T> f18901b;

    /* renamed from: c */
    public final int f18902c;

    /* renamed from: d */
    public final List<Integer> f18903d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g3(int i10, List<? extends T> list) {
        this(new int[]{i10}, list, i10, null);
        gm.l.f(list, "data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g3(int[] iArr, List<? extends T> list, int i10, List<Integer> list2) {
        gm.l.f(iArr, "originalPageOffsets");
        gm.l.f(list, "data");
        this.f18900a = iArr;
        this.f18901b = list;
        this.f18902c = i10;
        this.f18903d = list2;
        boolean z10 = false;
        if (!(!(iArr.length == 0))) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
        }
        if ((list2 == null || list2.size() == list.size()) ? true : true) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("If originalIndices (size = ");
        gm.l.c(list2);
        sb2.append(list2.size());
        sb2.append(") is provided, it must be same length as data (size = ");
        sb2.append(list.size());
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (gm.l.a(g3.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                g3 g3Var = (g3) obj;
                return Arrays.equals(this.f18900a, g3Var.f18900a) && gm.l.a(this.f18901b, g3Var.f18901b) && this.f18902c == g3Var.f18902c && gm.l.a(this.f18903d, g3Var.f18903d);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f18901b.hashCode() + (Arrays.hashCode(this.f18900a) * 31)) * 31) + this.f18902c) * 31;
        List<Integer> list = this.f18903d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("TransformablePage(originalPageOffsets=");
        a10.append(Arrays.toString(this.f18900a));
        a10.append(", data=");
        a10.append(this.f18901b);
        a10.append(", hintOriginalPageOffset=");
        a10.append(this.f18902c);
        a10.append(", hintOriginalIndices=");
        return fb.b.a(a10, this.f18903d, ')');
    }
}
