package jj;

import java.util.List;

/* loaded from: classes2.dex */
public final class i0 extends gm.m implements fm.l<List<? extends byte[]>, oj.o> {

    /* renamed from: b */
    public final /* synthetic */ Integer f17906b;

    /* renamed from: c */
    public final /* synthetic */ nj.c f17907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Integer num, nj.c cVar) {
        super(1);
        this.f17906b = num;
        this.f17907c = cVar;
    }

    @Override // fm.l
    public final oj.o k(List<? extends byte[]> list) {
        List<? extends byte[]> list2 = list;
        Integer num = this.f17906b;
        gm.l.e(num, "type");
        int intValue = num.intValue();
        gm.l.e(list2, "it");
        return new oj.o(intValue, list2, this.f17907c);
    }
}
