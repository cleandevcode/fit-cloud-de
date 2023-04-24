package vg;

import java.util.List;

/* loaded from: classes2.dex */
public final class h<T> extends i<T> {
    public h(int i10, String str, List<? extends T> list) {
        super(i10, str, list);
    }

    @Override // vg.i
    public final List<T> a() {
        List<T> list = this.f29380c;
        gm.l.d(list, "null cannot be cast to non-null type kotlin.collections.List<T of com.topstep.fitcloud.pro.shared.data.net.ListNonNull>");
        return list;
    }
}
