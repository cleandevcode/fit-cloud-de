package vh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import bi.z0;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;
import com.topstep.fitcloud.pro.ui.dialog.e;
import com.topstep.fitcloud.pro.ui.settings.EditIdentityIdViewModel;
import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;
import f.q;
import ii.i0;
import ii.s0;
import ii.t;
import ii.y0;
import pm.z1;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f29418a;

    /* renamed from: b */
    public final /* synthetic */ q f29419b;

    public /* synthetic */ l(q qVar, int i10) {
        this.f29418a = i10;
        this.f29419b = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        cg.a aVar;
        switch (this.f29418a) {
            case 0:
                m mVar = (m) this.f29419b;
                int i11 = m.C0;
                gm.l.f(mVar, "this$0");
                ContactsViewModel.a aVar2 = mVar.i1().f10904i;
                z1 z1Var = aVar2.f24879d;
                if (z1Var != null) {
                    z1Var.h(null);
                }
                z0.g(aVar2.f24876a, null, 0, new qi.q(aVar2, null), 3);
                return;
            case 1:
                ci.g gVar = (ci.g) this.f29419b;
                int i12 = ci.g.H0;
                gm.l.f(gVar, "this$0");
                z1 z1Var2 = ((SongPushViewModel) gVar.G0.getValue()).f11394v;
                if (z1Var2 != null) {
                    z1Var2.h(null);
                    return;
                }
                return;
            case 2:
                com.topstep.fitcloud.pro.ui.dialog.a aVar3 = (com.topstep.fitcloud.pro.ui.dialog.a) this.f29419b;
                int i13 = com.topstep.fitcloud.pro.ui.dialog.a.I0;
                gm.l.f(aVar3, "this$0");
                Context V0 = aVar3.V0();
                String packageName = V0.getPackageName();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
                intent.setPackage("com.android.vending");
                try {
                    V0.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    try {
                        V0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                        return;
                    } catch (Exception e11) {
                        p000do.a.f13275a.q(e11);
                        Toast.makeText(V0, "You don't have an app market installed, not even a browser!", 0).show();
                        return;
                    }
                }
            case 3:
                com.topstep.fitcloud.pro.ui.dialog.e eVar = (com.topstep.fitcloud.pro.ui.dialog.e) this.f29419b;
                int i14 = com.topstep.fitcloud.pro.ui.dialog.e.I0;
                gm.l.f(eVar, "this$0");
                try {
                    z0.n(new e.a(null));
                    return;
                } catch (Exception e12) {
                    p000do.a.f13275a.q(e12);
                    return;
                }
            case 4:
                ii.f.i1((ii.f) this.f29419b);
                return;
            case 5:
                i0 i0Var = (i0) this.f29419b;
                int i15 = i0.C0;
                gm.l.f(i0Var, "this$0");
                EditIdentityIdViewModel editIdentityIdViewModel = (EditIdentityIdViewModel) i0Var.B0.getValue();
                String string = i0Var.U0().getString("id");
                gm.l.c(string);
                editIdentityIdViewModel.getClass();
                editIdentityIdViewModel.h(new t(editIdentityIdViewModel, string, null), 0L);
                return;
            default:
                y0 y0Var = (y0) this.f29419b;
                int i16 = y0.I0;
                gm.l.f(y0Var, "this$0");
                ArrayAdapter<y0.a> arrayAdapter = y0Var.H0;
                if (arrayAdapter != null) {
                    y0.a item = arrayAdapter.getItem(i10);
                    if (item != null && (aVar = item.f17006a) != null) {
                        SettingsViewModel settingsViewModel = (SettingsViewModel) y0Var.G0.getValue();
                        settingsViewModel.getClass();
                        z0.g(rm.l.h(settingsViewModel), null, 0, new s0(settingsViewModel, aVar, null), 3);
                    }
                    dialogInterface.dismiss();
                    return;
                }
                gm.l.l("listAdapter");
                throw null;
        }
    }
}
