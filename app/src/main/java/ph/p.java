package ph;

import android.bluetooth.BluetoothGattCharacteristic;
import android.net.Uri;
import ij.c;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements wk.e {

    /* renamed from: a */
    public final /* synthetic */ int f24202a;

    /* renamed from: b */
    public final /* synthetic */ Object f24203b;

    public /* synthetic */ p(int i10, Object obj) {
        this.f24202a = i10;
        this.f24203b = obj;
    }

    @Override // wk.e
    public final Object apply(Object obj) {
        switch (this.f24202a) {
            case 0:
                fm.l lVar = (fm.l) this.f24203b;
                gm.l.f(lVar, "$tmp0");
                return (Integer) lVar.k(obj);
            case 1:
                fm.l lVar2 = (fm.l) this.f24203b;
                AtomicInteger atomicInteger = wi.k.E;
                gm.l.f(lVar2, "$tmp0");
                return (tk.l) lVar2.k(obj);
            case 2:
                fm.l lVar3 = (fm.l) this.f24203b;
                AtomicInteger atomicInteger2 = wi.k.E;
                gm.l.f(lVar3, "$tmp0");
                return (tk.t) lVar3.k(obj);
            case 3:
                fm.l lVar4 = (fm.l) this.f24203b;
                gm.l.f(lVar4, "$tmp0");
                return (dj.a) lVar4.k(obj);
            case 4:
                fm.l lVar5 = (fm.l) this.f24203b;
                gm.l.f(lVar5, "$tmp0");
                return (tk.l) lVar5.k(obj);
            case 5:
                fm.l lVar6 = (fm.l) this.f24203b;
                gm.l.f(lVar6, "$tmp0");
                return (Uri) lVar6.k(obj);
            case 6:
                fm.l lVar7 = (fm.l) this.f24203b;
                gm.l.f(lVar7, "$tmp0");
                return (c.C0298c) lVar7.k(obj);
            case 7:
                fm.l lVar8 = (fm.l) this.f24203b;
                gm.l.f(lVar8, "$tmp0");
                return (Throwable) lVar8.k(obj);
            case 8:
                fm.l lVar9 = (fm.l) this.f24203b;
                gm.l.f(lVar9, "$tmp0");
                return (tk.c) lVar9.k(obj);
            case 9:
                fm.l lVar10 = (fm.l) this.f24203b;
                gm.l.f(lVar10, "$tmp0");
                return (tk.t) lVar10.k(obj);
            case 10:
                fm.l lVar11 = (fm.l) this.f24203b;
                gm.l.f(lVar11, "$tmp0");
                return (oj.o) lVar11.k(obj);
            case 11:
                fm.l lVar12 = (fm.l) this.f24203b;
                gm.l.f(lVar12, "$tmp0");
                return (tk.t) lVar12.k(obj);
            case 12:
                fm.l lVar13 = (fm.l) this.f24203b;
                gm.l.f(lVar13, "$tmp0");
                return (sj.d) lVar13.k(obj);
            default:
                UUID uuid = oc.x0.f23059h;
                return new bl.c(new lc.c((BluetoothGattCharacteristic) this.f24203b, 3, (Throwable) obj));
        }
    }
}
