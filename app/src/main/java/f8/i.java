package f8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.j0;

/* loaded from: classes.dex */
public class i extends androidx.fragment.app.o {
    public Dialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Dialog dialog = this.B0;
        if (dialog == null) {
            this.f2473s0 = false;
            if (this.D0 == null) {
                Context i02 = i0();
                i8.p.f(i02);
                this.D0 = new AlertDialog.Builder(i02).create();
            }
            return this.D0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.o
    public final void h1(j0 j0Var, String str) {
        super.h1(j0Var, str);
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
