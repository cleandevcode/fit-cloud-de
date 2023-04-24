package jj;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.concurrent.TimeUnit;
import p000do.a;

/* loaded from: classes2.dex */
public final class o1 extends gm.m implements fm.l<Boolean, tk.t<? extends Boolean>> {

    /* renamed from: b */
    public final /* synthetic */ boolean f17954b = true;

    /* renamed from: c */
    public final /* synthetic */ k1 f17955c;

    /* renamed from: d */
    public final /* synthetic */ String f17956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(k1 k1Var, String str) {
        super(1);
        this.f17955c = k1Var;
        this.f17956d = str;
    }

    @Override // fm.l
    public final tk.t<? extends Boolean> k(Boolean bool) {
        boolean z10;
        tk.c aVar;
        Boolean bool2 = bool;
        gm.l.e(bool2, "it");
        if (!bool2.booleanValue() && !this.f17954b) {
            return tk.p.e(bool2);
        }
        final k1 k1Var = this.f17955c;
        final String str = this.f17956d;
        k1Var.getClass();
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            aVar = bl.b.f4448a;
            gm.l.e(aVar, "complete()");
        } else {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar = new bl.a(new bl.f(new bl.a(new bl.a(tk.a.h(1L, timeUnit), new tk.c() { // from class: jj.x0
                @Override // tk.c
                public final void a(tk.b bVar) {
                    k1 k1Var2 = k1.this;
                    gm.l.f(k1Var2, "this$0");
                    ((wi.k) k1Var2.f17917a).e();
                    bVar.onComplete();
                }
            }), tk.a.h(1L, timeUnit)), sk.c.a()), new tk.c() { // from class: jj.y0
                @Override // tk.c
                public final void a(tk.b bVar) {
                    boolean z11;
                    k1 k1Var2 = k1.this;
                    String str2 = str;
                    gm.l.f(k1Var2, "this$0");
                    BluetoothAdapter bluetoothAdapter = k1Var2.f17920d;
                    if (bluetoothAdapter == null) {
                        a.b bVar2 = p000do.a.f13275a;
                        bVar2.t("Fc#Settings");
                        bVar2.p("clear bond(%s) error:adapter is null", str2);
                    } else {
                        BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str2);
                        int i10 = 0;
                        while (i10 < 3 && remoteDevice.getBondState() != 10) {
                            try {
                                z11 = ((Boolean) BluetoothDevice.class.getMethod("removeBond", new Class[0]).invoke(remoteDevice, new Object[0])).booleanValue();
                            } catch (Exception e10) {
                                p000do.a.f13275a.r(e10, "removeBond %s error", remoteDevice.getAddress());
                                z11 = false;
                            }
                            a.b bVar3 = p000do.a.f13275a;
                            bVar3.t("Fc#Settings");
                            bVar3.p("removeBond %s result:%b", str2, Boolean.valueOf(z11));
                            i10++;
                            try {
                                Thread.sleep(1000L);
                            } catch (InterruptedException e11) {
                                a.b bVar4 = p000do.a.f13275a;
                                bVar4.t("Fc#Settings");
                                bVar4.q(e11);
                            }
                        }
                        a.b bVar5 = p000do.a.f13275a;
                        bVar5.t("Fc#Settings");
                        bVar5.h("clear bond end state:%d", Integer.valueOf(remoteDevice.getBondState()));
                    }
                    bVar.onComplete();
                }
            });
        }
        return new gl.e(tk.p.e(bool2), aVar);
    }
}
