package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class e implements SwipeDismissBehavior.b {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f6671a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6671a = baseTransientBottomBar;
    }

    public final void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f6671a.b(0);
    }
}
