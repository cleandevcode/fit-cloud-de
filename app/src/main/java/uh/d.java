package uh;

import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.n0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;
import java.util.Arrays;
import si.f;
import uh.a0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements SwipeRefreshLayout.f, f.a {

    /* renamed from: a */
    public final /* synthetic */ DeviceBindFragment f28744a;

    public /* synthetic */ d(DeviceBindFragment deviceBindFragment) {
        this.f28744a = deviceBindFragment;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        DeviceBindFragment deviceBindFragment = this.f28744a;
        gm.l.f(deviceBindFragment, "this$0");
        deviceBindFragment.f10801x0 = false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void e() {
        DeviceBindFragment deviceBindFragment = this.f28744a;
        mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
        gm.l.f(deviceBindFragment, "this$0");
        a0 a0Var = deviceBindFragment.A0;
        m0<z> m0Var = a0Var.f28739d;
        int i10 = m0Var.f3145c;
        if (i10 != 0) {
            Arrays.fill(m0Var.f3143a, 0, i10, (Object) null);
            m0Var.f3145c = 0;
            ((n0) m0Var.f3144b).b(0, i10);
        }
        a0.b bVar = a0Var.f28740e;
        if (bVar != null) {
            bVar.b(i10, 0);
        }
        if (!((ScannerHelper) deviceBindFragment.B0.getValue()).b()) {
            deviceBindFragment.k1().refreshLayout.setRefreshing(false);
        }
    }
}
