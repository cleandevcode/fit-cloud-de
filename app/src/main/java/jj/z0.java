package jj;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.TimeUnit;
import p000do.a;

/* loaded from: classes2.dex */
public final class z0 extends gm.m implements fm.l<pj.a, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ k1 f17991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(k1 k1Var) {
        super(1);
        this.f17991b = k1Var;
    }

    @Override // fm.l
    public final tl.l k(pj.a aVar) {
        String address;
        pj.a aVar2 = aVar;
        if (aVar2.f24277a == 10001) {
            Object obj = aVar2.f24278b;
            gm.l.d(obj, "null cannot be cast to non-null type kotlin.String");
            final String str = (String) obj;
            BluetoothDevice h10 = ((wi.k) this.f17991b.f17917a).h();
            if (h10 != null && (address = h10.getAddress()) != null) {
                this.f17991b.f17921e.put(address, str);
            }
            this.f17991b.getClass();
            final k1 k1Var = this.f17991b;
            k1Var.getClass();
            new bl.g(new bl.a(new bl.f(tk.a.h(3L, TimeUnit.SECONDS), sk.c.a()), new tk.c() { // from class: jj.w0
                @Override // tk.c
                public final void a(tk.b bVar) {
                    boolean createBond;
                    k1 k1Var2 = k1.this;
                    String str2 = str;
                    gm.l.f(k1Var2, "this$0");
                    gm.l.f(str2, "$address");
                    if (k1Var2.f17920d == null) {
                        a.b bVar2 = p000do.a.f13275a;
                        bVar2.t("Fc#Settings");
                        bVar2.p("bond(%s) error:adapter is null", str2);
                    } else if (!k1Var2.a()) {
                        a.b bVar3 = p000do.a.f13275a;
                        bVar3.t("Fc#Settings");
                        bVar3.h("bond(%s) error:no permission", str2);
                    } else {
                        BluetoothDevice remoteDevice = k1Var2.f17920d.getRemoteDevice(str2);
                        int bondState = remoteDevice.getBondState();
                        if (bondState == 10) {
                            try {
                                createBond = ((Boolean) BluetoothDevice.class.getMethod("createBond", Integer.TYPE).invoke(remoteDevice, 1)).booleanValue();
                            } catch (Exception e10) {
                                p000do.a.f13275a.r(e10, "createBond %s error", remoteDevice.getAddress());
                                createBond = remoteDevice.createBond();
                            }
                            a.b bVar4 = p000do.a.f13275a;
                            bVar4.t("Fc#Settings");
                            bVar4.p("bond(%s) result:%b", str2, Boolean.valueOf(createBond));
                        } else {
                            a.b bVar5 = p000do.a.f13275a;
                            bVar5.t("Fc#Settings");
                            bVar5.p("bond(%s) skip:bondState %d", str2, Integer.valueOf(bondState));
                        }
                    }
                    bVar.onComplete();
                }
            })).f();
        }
        return tl.l.f28297a;
    }
}
