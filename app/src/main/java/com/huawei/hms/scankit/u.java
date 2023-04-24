package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public class u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ v f8176a;

    public u(v vVar) {
        this.f8176a = vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context = this.f8176a.f8146e;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}
