package ka;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f18214a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.textfield.b f18215b;

    public j(com.google.android.material.textfield.b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f18215b = bVar;
        this.f18214a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 1) {
            com.google.android.material.textfield.b bVar = this.f18215b;
            bVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - bVar.f6859n;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f18215b.f6857l = false;
            }
            com.google.android.material.textfield.b.d(this.f18215b, this.f18214a);
            com.google.android.material.textfield.b bVar2 = this.f18215b;
            bVar2.f6857l = true;
            bVar2.f6859n = System.currentTimeMillis();
        }
        return false;
    }
}
