package d6;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.z0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.topstep.fitcloud.pro.databinding.PermissionDialogItemBinding;
import com.topstep.fitcloud.pro.ui.MineFragment;
import com.topstep.fitcloud.pro.ui.MineViewModel;
import com.topstep.fitcloud.pro.ui.device.song.push.AudioSelectFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f12727a;

    /* renamed from: b */
    public final /* synthetic */ Object f12728b;

    public /* synthetic */ q0(int i10, Object obj) {
        this.f12727a = i10;
        this.f12728b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10;
        boolean z11;
        int i11 = 0;
        switch (this.f12727a) {
            case 0:
                r0 r0Var = (r0) this.f12728b;
                gm.l.f(r0Var, "this$0");
                r0Var.cancel();
                return;
            case 1:
                MineFragment mineFragment = (MineFragment) this.f12728b;
                mm.h<Object>[] hVarArr = MineFragment.f10260z0;
                gm.l.f(mineFragment, "this$0");
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mineFragment.f10263w0 > 300) {
                    mineFragment.f10264x0 = 0;
                }
                mineFragment.f10263w0 = currentTimeMillis;
                int i12 = mineFragment.f10264x0 + 1;
                mineFragment.f10264x0 = i12;
                if (i12 > 5) {
                    mineFragment.f10264x0 = 0;
                    PreferenceItem preferenceItem = mineFragment.j1().itemAssist;
                    gm.l.e(preferenceItem, "viewBind.itemAssist");
                    if (preferenceItem.getVisibility() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    MineViewModel g12 = mineFragment.g1();
                    boolean z12 = true ^ z11;
                    g12.getClass();
                    z0.g(rm.l.h(g12), null, 0, new ih.b0(g12, z12, null), 3);
                    PreferenceItem preferenceItem2 = mineFragment.j1().itemAssist;
                    gm.l.e(preferenceItem2, "viewBind.itemAssist");
                    if (!z12) {
                        i11 = 8;
                    }
                    preferenceItem2.setVisibility(i11);
                    return;
                }
                return;
            case 2:
                lh.c cVar = (lh.c) this.f12728b;
                int i13 = lh.c.f20000l0;
                gm.l.f(cVar, "this$0");
                tb.a.f(cVar).o();
                return;
            case 3:
                uh.i iVar = (uh.i) this.f12728b;
                mm.h<Object>[] hVarArr2 = uh.i.O0;
                gm.l.f(iVar, "this$0");
                iVar.j1().F();
                return;
            case 4:
                AudioSelectFragment audioSelectFragment = (AudioSelectFragment) this.f12728b;
                mm.h<Object>[] hVarArr3 = AudioSelectFragment.C0;
                gm.l.f(audioSelectFragment, "this$0");
                if (audioSelectFragment.f11326w0 == 1 && audioSelectFragment.f11327x0 != -1) {
                    audioSelectFragment.f11327x0 = -1;
                    audioSelectFragment.j1();
                    return;
                }
                tb.a.f(audioSelectFragment).p();
                return;
            default:
                PermissionDialogItemBinding permissionDialogItemBinding = (PermissionDialogItemBinding) this.f12728b;
                int i14 = si.a.D0;
                gm.l.f(permissionDialogItemBinding, "$itemBinding");
                TextView textView = permissionDialogItemBinding.permissionExplain;
                gm.l.e(textView, "itemBinding.permissionExplain");
                if (textView.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = permissionDialogItemBinding.permissionInfo;
                gm.l.e(linearLayout, "itemBinding.permissionInfo");
                boolean z13 = true ^ z10;
                if (z13) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                linearLayout.setVisibility(i10);
                TextView textView2 = permissionDialogItemBinding.permissionExplain;
                gm.l.e(textView2, "itemBinding.permissionExplain");
                if (!z13) {
                    i11 = 8;
                }
                textView2.setVisibility(i11);
                return;
        }
    }
}
