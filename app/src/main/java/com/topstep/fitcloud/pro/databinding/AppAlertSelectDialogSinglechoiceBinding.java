package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class AppAlertSelectDialogSinglechoiceBinding implements a {
    private final CheckedTextView rootView;
    public final CheckedTextView text1;

    private AppAlertSelectDialogSinglechoiceBinding(CheckedTextView checkedTextView, CheckedTextView checkedTextView2) {
        this.rootView = checkedTextView;
        this.text1 = checkedTextView2;
    }

    public static AppAlertSelectDialogSinglechoiceBinding bind(View view) {
        if (view != null) {
            CheckedTextView checkedTextView = (CheckedTextView) view;
            return new AppAlertSelectDialogSinglechoiceBinding(checkedTextView, checkedTextView);
        }
        throw new NullPointerException("rootView");
    }

    public static AppAlertSelectDialogSinglechoiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppAlertSelectDialogSinglechoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.app_alert_select_dialog_singlechoice, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public CheckedTextView getRoot() {
        return this.rootView;
    }
}
