package v9;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import com.google.android.material.R;
import ga.f;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import vh.l;

/* loaded from: classes.dex */
public final class b extends d.a {

    /* renamed from: e */
    public static final int f29180e = R.attr.alertDialogStyle;

    /* renamed from: f */
    public static final int f29181f = R.style.MaterialAlertDialog_MaterialComponents;

    /* renamed from: g */
    public static final int f29182g = R.attr.materialAlertDialogTheme;

    /* renamed from: c */
    public f f29183c;

    /* renamed from: d */
    public final Rect f29184d;

    public b(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r14, int r15) {
        /*
            r13 = this;
            int r0 = v9.b.f29182g
            android.util.TypedValue r1 = da.b.a(r14, r0)
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = 0
            goto Ld
        Lb:
            int r1 = r1.data
        Ld:
            int r9 = v9.b.f29180e
            int r10 = v9.b.f29181f
            r11 = 0
            android.content.Context r3 = la.a.a(r14, r11, r9, r10)
            if (r1 != 0) goto L19
            goto L1f
        L19:
            k.c r4 = new k.c
            r4.<init>(r3, r1)
            r3 = r4
        L1f:
            if (r15 != 0) goto L2c
            android.util.TypedValue r14 = da.b.a(r14, r0)
            if (r14 != 0) goto L29
            r15 = 0
            goto L2c
        L29:
            int r14 = r14.data
            r15 = r14
        L2c:
            r13.<init>(r3, r15)
            androidx.appcompat.app.AlertController$b r14 = r13.f838a
            android.content.Context r14 = r14.f805a
            android.content.res.Resources$Theme r15 = r14.getTheme()
            int[] r5 = com.google.android.material.R.styleable.MaterialAlertDialog
            int[] r8 = new int[r2]
            r4 = 0
            r3 = r14
            r6 = r9
            r7 = r10
            android.content.res.TypedArray r0 = z9.o.d(r3, r4, r5, r6, r7, r8)
            int r1 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetStart
            android.content.res.Resources r2 = r14.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_start
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = r0.getDimensionPixelSize(r1, r2)
            int r2 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetTop
            android.content.res.Resources r3 = r14.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_top
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r0.getDimensionPixelSize(r2, r3)
            int r3 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetEnd
            android.content.res.Resources r4 = r14.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_end
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r0.getDimensionPixelSize(r3, r4)
            int r4 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetBottom
            android.content.res.Resources r5 = r14.getResources()
            int r6 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_bottom
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r0.getDimensionPixelSize(r4, r5)
            r0.recycle()
            android.content.res.Resources r0 = r14.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r5 = 1
            if (r0 != r5) goto L98
            r12 = r3
            r3 = r1
            r1 = r12
        L98:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r2, r3, r4)
            r13.f29184d = r0
            int r0 = com.google.android.material.R.attr.colorSurface
            java.lang.Class<v9.b> r1 = v9.b.class
            java.lang.String r1 = r1.getCanonicalName()
            int r0 = da.b.b(r14, r0, r1)
            ga.f r1 = new ga.f
            r1.<init>(r14, r11, r9, r10)
            r1.i(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r14 < r0) goto Lf0
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r15.resolveAttribute(r0, r14, r5)
            androidx.appcompat.app.AlertController$b r15 = r13.f838a
            android.content.Context r15 = r15.f805a
            android.content.res.Resources r15 = r15.getResources()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r14.getDimension(r15)
            int r14 = r14.type
            r0 = 5
            if (r14 != r0) goto Lf0
            r14 = 0
            int r14 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r14 < 0) goto Lf0
            ga.f$b r14 = r1.f15069a
            ga.i r14 = r14.f15093a
            ga.i r14 = r14.d(r15)
            r1.setShapeAppearanceModel(r14)
        Lf0:
            r13.f29183c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.b.<init>(android.content.Context, int):void");
    }

    @Override // androidx.appcompat.app.d.a
    public final d a() {
        d a10 = super.a();
        Window window = a10.getWindow();
        View decorView = window.getDecorView();
        f fVar = this.f29183c;
        if (fVar instanceof f) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            fVar.j(o0.i.i(decorView));
        }
        f fVar2 = this.f29183c;
        Rect rect = this.f29184d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) fVar2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(a10, this.f29184d));
        return a10;
    }

    @Override // androidx.appcompat.app.d.a
    public final void b(int i10, DialogInterface.OnClickListener onClickListener) {
        super.b(17039370, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    public final d.a c(View view) {
        super.c(view);
        return this;
    }

    public final void d(int i10) {
        AlertController.b bVar = this.f838a;
        bVar.f810f = bVar.f805a.getText(i10);
    }

    public final void e(String str) {
        this.f838a.f810f = str;
    }

    public final void f(DialogInterface.OnClickListener onClickListener) {
        AlertController.b bVar = this.f838a;
        bVar.f813i = bVar.f805a.getText(17039360);
        this.f838a.f814j = onClickListener;
    }

    public final void g(int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.b bVar = this.f838a;
        bVar.f815k = bVar.f805a.getText(i10);
        this.f838a.f816l = onClickListener;
    }

    public final void h(int i10, DialogInterface.OnClickListener onClickListener) {
        super.b(i10, onClickListener);
    }

    public final void i(ArrayAdapter arrayAdapter, l lVar) {
        AlertController.b bVar = this.f838a;
        bVar.f820p = arrayAdapter;
        bVar.f821q = lVar;
        bVar.f827w = 0;
        bVar.f826v = true;
    }

    public final void j(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.b bVar = this.f838a;
        bVar.f819o = charSequenceArr;
        bVar.f821q = onClickListener;
        bVar.f827w = i10;
        bVar.f826v = true;
    }

    public final void k(int i10) {
        AlertController.b bVar = this.f838a;
        bVar.f808d = bVar.f805a.getText(i10);
    }

    public final void l(String str) {
        this.f838a.f808d = str;
    }

    public final void m(View view) {
        super.c(view);
    }
}
