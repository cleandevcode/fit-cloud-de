package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class q2 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        u2 u2Var = u2.f1554k;
        if (u2Var != null && u2Var.f1556a == view) {
            u2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new u2(view, charSequence);
            return;
        }
        u2 u2Var2 = u2.f1555l;
        if (u2Var2 != null && u2Var2.f1556a == view) {
            u2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
