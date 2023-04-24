package com.huawei.hms.scankit;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ProviderRemoteView extends LinearLayout {
    public ProviderRemoteView(Context context, boolean z10) {
        this(context, z10, true);
    }

    public ProviderRemoteView(Context context, boolean z10, boolean z11) {
        super(context);
        a(z10, z11);
    }

    private void a(boolean z10, boolean z11) {
        LayoutInflater from;
        int i10;
        if (z10) {
            from = LayoutInflater.from(getContext());
            i10 = R.layout.scankit_zxl_capture_customed;
        } else {
            from = LayoutInflater.from(getContext());
            i10 = z11 ? R.layout.scankit_zxl_capture : R.layout.scankit_zxl_capture_new;
        }
        from.inflate(i10, this);
    }
}
