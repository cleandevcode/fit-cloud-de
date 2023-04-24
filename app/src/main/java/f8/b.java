package f8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class b extends DialogFragment {

    /* renamed from: a */
    public Dialog f14173a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f14174b;

    /* renamed from: c */
    public AlertDialog f14175c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14174b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14173a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f14175c == null) {
                Activity activity = getActivity();
                i8.p.f(activity);
                this.f14175c = new AlertDialog.Builder(activity).create();
            }
            return this.f14175c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
