package com.huawei.hms.scankit;

import android.view.View;

/* loaded from: classes.dex */
public class w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ y f8180a;

    public w(y yVar) {
        this.f8180a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f8180a.f8152k;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
