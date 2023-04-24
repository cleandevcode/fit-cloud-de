package ka;

import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public final class g implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.b f18211a;

    public g(com.google.android.material.textfield.b bVar) {
        this.f18211a = bVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        com.google.android.material.textfield.b bVar = this.f18211a;
        bVar.f6857l = true;
        bVar.f6859n = System.currentTimeMillis();
        this.f18211a.g(false);
    }
}
