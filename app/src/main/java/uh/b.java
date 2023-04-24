package uh;

import android.bluetooth.BluetoothManager;
import android.content.Intent;
import cn.sharesdk.framework.InnerShareParams;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;
import java.util.ArrayList;
import si.f;
import uh.y;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements androidx.activity.result.b, f.a {

    /* renamed from: a */
    public final /* synthetic */ DeviceBindFragment f28742a;

    public /* synthetic */ b(DeviceBindFragment deviceBindFragment) {
        this.f28742a = deviceBindFragment;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        boolean z10;
        DeviceBindFragment deviceBindFragment = this.f28742a;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
        gm.l.f(deviceBindFragment, "this$0");
        if (aVar.f751a == -1) {
            Intent intent = aVar.f752b;
            if (intent != null) {
                String stringExtra = intent.getStringExtra(InnerShareParams.ADDRESS);
                String stringExtra2 = intent.getStringExtra("name");
                boolean z11 = true;
                if (stringExtra != null && stringExtra.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (stringExtra2 != null && stringExtra2.length() != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        deviceBindFragment.m1(stringExtra, stringExtra2);
                        return;
                    }
                }
            }
            ((ScannerHelper) deviceBindFragment.B0.getValue()).b();
        }
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        int i10;
        int i11;
        DeviceBindFragment deviceBindFragment = this.f28742a;
        mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
        gm.l.f(deviceBindFragment, "this$0");
        if (z10) {
            y yVar = deviceBindFragment.f10803z0;
            ArrayList a10 = y.a.a(((BluetoothManager) deviceBindFragment.f10800w0.getValue()).getAdapter().getBondedDevices());
            yVar.f28812e = a10;
            y.e eVar = yVar.f28811d;
            int i12 = 0;
            if (a10 != null) {
                eVar.getClass();
                i10 = a10.size();
            } else {
                i10 = 0;
            }
            eVar.f28817a = i10;
            int i13 = 2;
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = i10 + 1;
            }
            eVar.f28818b = i11;
            y yVar2 = deviceBindFragment.f10803z0;
            ArrayList a11 = y.a.a(((BluetoothManager) deviceBindFragment.f10800w0.getValue()).getConnectedDevices(8));
            yVar2.f28814g = a11;
            y.e eVar2 = yVar2.f28813f;
            if (a11 != null) {
                eVar2.getClass();
                i12 = a11.size();
            }
            eVar2.f28817a = i12;
            if (i12 != 0) {
                i13 = i12 + 1;
            }
            eVar2.f28818b = i13;
            deviceBindFragment.f10803z0.h();
        }
    }
}
