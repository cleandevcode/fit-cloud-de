package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ p f6507a;

    public r(p pVar) {
        this.f6507a = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        p pVar = this.f6507a;
        pVar.V0.setEnabled(pVar.i1().u());
        this.f6507a.T0.toggle();
        p pVar2 = this.f6507a;
        CheckableImageButton checkableImageButton = pVar2.T0;
        boolean isChecked = checkableImageButton.isChecked();
        Context context = checkableImageButton.getContext();
        if (isChecked) {
            i10 = R.string.mtrl_picker_toggle_to_calendar_input_mode;
        } else {
            i10 = R.string.mtrl_picker_toggle_to_text_input_mode;
        }
        pVar2.T0.setContentDescription(context.getString(i10));
        this.f6507a.m1();
    }
}
