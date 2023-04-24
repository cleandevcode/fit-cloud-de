package uh;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceQrCodeActivity;
import com.topstep.fitcloudpro.R;
import si.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Toolbar.f, f.a {

    /* renamed from: a */
    public final /* synthetic */ DeviceBindFragment f28743a;

    public /* synthetic */ c(DeviceBindFragment deviceBindFragment) {
        this.f28743a = deviceBindFragment;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        DeviceBindFragment deviceBindFragment = this.f28743a;
        mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
        gm.l.f(deviceBindFragment, "this$0");
        if (z10) {
            deviceBindFragment.V0().startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        DeviceBindFragment deviceBindFragment = this.f28743a;
        mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
        gm.l.f(deviceBindFragment, "this$0");
        if (menuItem.getItemId() == R.id.menu_qr_code_scanner) {
            deviceBindFragment.D0.b(new Intent(deviceBindFragment.V0(), DeviceQrCodeActivity.class));
        } else if (menuItem.getItemId() == R.id.menu_skip) {
            int i10 = MainActivity.E;
            MainActivity.a.a(deviceBindFragment.V0());
            deviceBindFragment.T0().finish();
        }
    }
}
