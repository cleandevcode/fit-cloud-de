package jj;

import java.util.ArrayList;
import p000do.a;

/* loaded from: classes2.dex */
public final class h0 extends gm.m implements fm.l<Integer, tk.l<? extends Integer>> {

    /* renamed from: b */
    public final /* synthetic */ d0 f17901b;

    /* renamed from: c */
    public final /* synthetic */ nj.c f17902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d0 d0Var, nj.c cVar) {
        super(1);
        this.f17901b = d0Var;
        this.f17902c = cVar;
    }

    @Override // fm.l
    public final tk.l<? extends Integer> k(Integer num) {
        tk.a aVar;
        Integer num2 = num;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Sync");
        bVar.h("Sync prepare total size:" + num2, new Object[0]);
        d0 d0Var = this.f17901b;
        gm.l.e(num2, "size");
        d0Var.f17886f = num2.intValue();
        d0 d0Var2 = this.f17901b;
        nj.c cVar = this.f17902c;
        int intValue = num2.intValue();
        d0Var2.getClass();
        if (intValue != 0 && cVar.g(5)) {
            aVar = new gl.m(h7.a.w(d0Var2.f17881a, new bj.b((byte) 2, (byte) 55, null), new bj.b((byte) 2, (byte) 56, null)), new wi.h(4, e0.f17891b));
        } else {
            aVar = bl.b.f4448a;
            gm.l.e(aVar, "{\n            Completable.complete()\n        }");
        }
        d0 d0Var3 = this.f17901b;
        nj.c cVar2 = this.f17902c;
        int intValue2 = num2.intValue();
        d0Var3.getClass();
        ArrayList arrayList = new ArrayList(16);
        if (intValue2 == 0) {
            arrayList.add(255);
        } else {
            arrayList.add(1);
            arrayList.add(2);
            boolean g10 = cVar2.g(22);
            if (cVar2.g(0)) {
                arrayList.add(3);
                if (g10) {
                    arrayList.add(131);
                }
            }
            if (cVar2.g(1)) {
                arrayList.add(4);
                if (g10) {
                    arrayList.add(132);
                }
            }
            if (cVar2.g(2)) {
                arrayList.add(5);
                if (g10) {
                    arrayList.add(133);
                }
            }
            if (cVar2.g(3)) {
                arrayList.add(6);
                if (g10) {
                    arrayList.add(134);
                }
            }
            if (cVar2.g(6)) {
                arrayList.add(16);
            }
            if (cVar2.g(24)) {
                arrayList.add(10);
            }
            if (cVar2.g(10)) {
                arrayList.add(17);
                if (g10) {
                    arrayList.add(145);
                }
            }
            if (cVar2.g(13)) {
                arrayList.add(18);
                if (g10) {
                    arrayList.add(146);
                }
            }
            if (cVar2.g(14)) {
                arrayList.add(19);
            }
            arrayList.add(255);
            if (cVar2.g(5)) {
                arrayList.add(7);
            }
        }
        return aVar.c(new fl.a0(arrayList));
    }
}
