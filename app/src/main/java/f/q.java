package f;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class q extends androidx.fragment.app.o {
    @Override // androidx.fragment.app.o
    public Dialog d1(Bundle bundle) {
        return new p(i0(), this.f2471q0);
    }

    @Override // androidx.fragment.app.o
    public final void g1(Dialog dialog, int i10) {
        if (!(dialog instanceof p)) {
            super.g1(dialog, i10);
            return;
        }
        p pVar = (p) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        pVar.h();
    }
}
