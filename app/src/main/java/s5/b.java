package s5;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CompoundButton;
import androidx.appcompat.widget.Toolbar;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.DeviceFragment;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendDataFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendInfoFragment;
import com.topstep.fitcloudpro.R;
import d6.v;
import ei.j0;
import gm.l;
import i2.b0;
import i2.m;
import java.util.ArrayList;
import java.util.List;
import jc.a0;
import jc.x;
import o5.q0;
import s5.h;
import si.a;
import si.f;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements h.a, f.a, Toolbar.f {

    /* renamed from: a */
    public final /* synthetic */ int f26578a;

    /* renamed from: b */
    public final /* synthetic */ Object f26579b;

    /* renamed from: c */
    public final /* synthetic */ Object f26580c;

    public /* synthetic */ b(Object obj, Object obj2, int i10) {
        this.f26578a = i10;
        this.f26579b = obj;
        this.f26580c = obj2;
    }

    public final void a(a0 a0Var, List list) {
        ArrayList arrayList = (ArrayList) this.f26579b;
        l.f(arrayList, "$descriptors");
        l.f(a0Var, "scope");
        int i10 = si.a.D0;
        ((x) a0Var.f17570a).f(a0Var.f17571b, true, a.C0483a.a(0, list, arrayList, (String) this.f26580c));
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        switch (this.f26578a) {
            case 1:
                DeviceFragment deviceFragment = (DeviceFragment) this.f26579b;
                CompoundButton compoundButton = (CompoundButton) this.f26580c;
                mm.h<Object>[] hVarArr = DeviceFragment.B0;
                l.f(deviceFragment, "this$0");
                if (z10) {
                    deviceFragment.l1(true);
                    return;
                } else {
                    compoundButton.setChecked(false);
                    return;
                }
            default:
                NotificationFragment notificationFragment = (NotificationFragment) this.f26579b;
                CompoundButton compoundButton2 = (CompoundButton) this.f26580c;
                mm.h<Object>[] hVarArr2 = NotificationFragment.f11198v0;
                l.f(notificationFragment, "this$0");
                l.f(compoundButton2, "$buttonView");
                if (si.f.f27071a.e(notificationFragment.V0())) {
                    notificationFragment.f1(0, true);
                    return;
                }
                compoundButton2.setChecked(false);
                notificationFragment.k1();
                return;
        }
    }

    public final void c() {
        boolean z10;
        v vVar = (v) this.f26579b;
        String str = (String) this.f26580c;
        if (!i6.a.b(c.class)) {
            try {
                l.f(str, "$appId");
                boolean z11 = false;
                if (vVar != null && vVar.f12802h) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o5.v vVar2 = o5.v.f22837a;
                q0 q0Var = q0.f22807a;
                if (!i6.a.b(q0.class)) {
                    q0.f22807a.d();
                    z11 = q0.f22814h.a();
                }
                if (z10 && z11) {
                    c cVar = c.f26581a;
                    cVar.getClass();
                    if (!i6.a.b(cVar) && !c.f26588h) {
                        c.f26588h = true;
                        o5.v.c().execute(new androidx.activity.b(7, str));
                    }
                }
            } catch (Throwable th2) {
                i6.a.a(c.class, th2);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        switch (this.f26578a) {
            case 3:
                FriendDataFragment friendDataFragment = (FriendDataFragment) this.f26579b;
                Friend friend = (Friend) this.f26580c;
                mm.h<Object>[] hVarArr = FriendDataFragment.f11482z0;
                l.f(friendDataFragment, "this$0");
                l.f(friend, "$friend");
                if (menuItem.getItemId() == R.id.menu_friend_rename) {
                    m f10 = tb.a.f(friendDataFragment);
                    long userId = friend.getUserId();
                    b0 a10 = ih.v.d().a();
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putLong("friendId", userId);
                        f10.l(R.id.toRename, bundle, a10);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                } else if (menuItem.getItemId() == R.id.menu_friend_delete) {
                    new j0().h1(friendDataFragment.h0(), null);
                    return;
                } else {
                    return;
                }
            default:
                FriendInfoFragment friendInfoFragment = (FriendInfoFragment) this.f26579b;
                Friend friend2 = (Friend) this.f26580c;
                mm.h<Object>[] hVarArr2 = FriendInfoFragment.f11550y0;
                l.f(friendInfoFragment, "this$0");
                l.f(friend2, "$friend");
                if (menuItem.getItemId() == R.id.menu_friend_rename) {
                    m f11 = tb.a.f(friendInfoFragment);
                    long userId2 = friend2.getUserId();
                    b0 a11 = ih.v.d().a();
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("friendId", userId2);
                        f11.l(R.id.toRename, bundle2, a11);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                } else if (menuItem.getItemId() == R.id.menu_friend_delete) {
                    new j0().h1(friendInfoFragment.h0(), null);
                    return;
                } else {
                    return;
                }
        }
    }
}
