package uh;

import android.view.View;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketParentFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendListFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28747a;

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.r f28748b;

    public /* synthetic */ e(int i10, androidx.fragment.app.r rVar) {
        this.f28747a = i10;
        this.f28748b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28747a) {
            case 0:
                DeviceBindFragment deviceBindFragment = (DeviceBindFragment) this.f28748b;
                mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
                gm.l.f(deviceBindFragment, "this$0");
                si.f.f27071a.f(deviceBindFragment, new c(deviceBindFragment));
                return;
            case 1:
                i iVar = (i) this.f28748b;
                mm.h<Object>[] hVarArr2 = i.O0;
                gm.l.f(iVar, "this$0");
                iVar.j1().e();
                return;
            case 2:
                DialPacketParentFragment dialPacketParentFragment = (DialPacketParentFragment) this.f28748b;
                mm.h<Object>[] hVarArr3 = DialPacketParentFragment.f10988n0;
                gm.l.f(dialPacketParentFragment, "this$0");
                dialPacketParentFragment.d1();
                return;
            default:
                FriendListFragment friendListFragment = (FriendListFragment) this.f28748b;
                mm.h<Object>[] hVarArr4 = FriendListFragment.f11575z0;
                gm.l.f(friendListFragment, "this$0");
                friendListFragment.d1();
                return;
        }
    }
}
