package th;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.topstep.fitcloud.pro.ui.dialog.MessageDialogFragment;
import th.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28177a;

    /* renamed from: b */
    public final /* synthetic */ f.q f28178b;

    public /* synthetic */ a(f.q qVar, int i10) {
        this.f28177a = i10;
        this.f28178b = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Intent intent;
        MessageDialogFragment.b bVar = null;
        b.a aVar = null;
        switch (this.f28177a) {
            case 0:
                b bVar2 = (b) this.f28178b;
                int i11 = b.B0;
                gm.l.f(bVar2, "this$0");
                androidx.fragment.app.r rVar = bVar2.f2537v;
                if (rVar instanceof b.a) {
                    aVar = (b.a) rVar;
                }
                if (aVar != null) {
                    aVar.P();
                    return;
                }
                return;
            case 1:
                bi.h hVar = (bi.h) this.f28178b;
                int i12 = bi.h.B0;
                gm.l.f(hVar, "this$0");
                Context V0 = hVar.V0();
                try {
                    if (Build.VERSION.SDK_INT < 22) {
                        intent = new Intent("android.settings.NOTIFICATION_LISTENER_SETTINGS");
                    } else {
                        intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                    }
                    V0.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    return;
                }
            default:
                MessageDialogFragment messageDialogFragment = (MessageDialogFragment) this.f28178b;
                int i13 = MessageDialogFragment.B0;
                gm.l.f(messageDialogFragment, "this$0");
                androidx.fragment.app.r rVar2 = messageDialogFragment.f2537v;
                if (rVar2 instanceof MessageDialogFragment.b) {
                    bVar = (MessageDialogFragment.b) rVar2;
                }
                if (bVar != null) {
                    bVar.j(messageDialogFragment.f2540y);
                    return;
                }
                return;
        }
    }
}
