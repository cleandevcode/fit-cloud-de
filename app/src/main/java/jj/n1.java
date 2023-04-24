package jj;

import android.bluetooth.BluetoothDevice;
import p000do.a;

/* loaded from: classes2.dex */
public final class n1 extends gm.m implements fm.l<wi.d, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ k1 f17949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(k1 k1Var) {
        super(1);
        this.f17949b = k1Var;
    }

    @Override // fm.l
    public final tl.l k(wi.d dVar) {
        if (dVar == wi.d.CONNECTED) {
            this.f17949b.f17924h = null;
            k1 k1Var = this.f17949b;
            if (!((l) k1Var.f17918b).f17930d.g(271)) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#Settings");
                bVar.h("audio device:un support", new Object[0]);
            } else {
                BluetoothDevice h10 = ((wi.k) k1Var.f17917a).h();
                if (h10 == null) {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("Fc#Settings");
                    bVar2.h("audio device:bleDevice is null", new Object[0]);
                } else if (k1Var.f17920d == null) {
                    a.b bVar3 = p000do.a.f13275a;
                    bVar3.t("Fc#Settings");
                    bVar3.h("audio device:adapter is null", new Object[0]);
                } else if (!k1Var.a()) {
                    a.b bVar4 = p000do.a.f13275a;
                    bVar4.t("Fc#Settings");
                    bVar4.h("audio device:no permission", new Object[0]);
                } else {
                    String str = k1Var.f17921e.get(h10.getAddress());
                    a.b bVar5 = p000do.a.f13275a;
                    bVar5.t("Fc#Settings");
                    bVar5.h("audio device:%s", str);
                    if (str != null && k1Var.f17920d.getRemoteDevice(str).getBondState() == 12) {
                        bVar5.t("Fc#Settings");
                        bVar5.h("audio device:bonded", new Object[0]);
                    } else {
                        new bl.g(h7.a.s(k1Var.f17917a, new bj.b((byte) 2, (byte) -122, null))).f();
                    }
                }
            }
        }
        return tl.l.f28297a;
    }
}
