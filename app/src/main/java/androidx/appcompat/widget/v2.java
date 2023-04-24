package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a */
    public final Context f1583a;

    /* renamed from: b */
    public final View f1584b;

    /* renamed from: c */
    public final TextView f1585c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1586d;

    /* renamed from: e */
    public final Rect f1587e;

    /* renamed from: f */
    public final int[] f1588f;

    /* renamed from: g */
    public final int[] f1589g;

    public v2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1586d = layoutParams;
        this.f1587e = new Rect();
        this.f1588f = new int[2];
        this.f1589g = new int[2];
        this.f1583a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1584b = inflate;
        this.f1585c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(v2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
