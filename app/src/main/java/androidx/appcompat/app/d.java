package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import f.p;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: e */
    public final AlertController f837e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final AlertController.b f838a;

        /* renamed from: b */
        public final int f839b;

        public a(Context context) {
            this(context, d.l(context, 0));
        }

        public a(Context context, int i10) {
            this.f838a = new AlertController.b(new ContextThemeWrapper(context, d.l(context, i10)));
            this.f839b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:131:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x00c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.appcompat.app.d a() {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.a.a():androidx.appcompat.app.d");
        }

        public void b(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f838a;
            bVar.f811g = bVar.f805a.getText(i10);
            this.f838a.f812h = onClickListener;
        }

        public a c(View view) {
            AlertController.b bVar = this.f838a;
            bVar.f823s = view;
            bVar.f822r = 0;
            return this;
        }
    }

    public d(Context context, int i10) {
        super(context, l(context, i10));
        this.f837e = new AlertController(getContext(), this, getWindow());
    }

    public static int l(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button j(int i10) {
        AlertController alertController = this.f837e;
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 != -1) {
                    alertController.getClass();
                    return null;
                }
                return alertController.f786k;
            }
            return alertController.f790o;
        }
        return alertController.f794s;
    }

    public final void m(String str) {
        AlertController alertController = this.f837e;
        alertController.f781f = str;
        TextView textView = alertController.B;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x02d6, code lost:
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x02df, code lost:
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x02e1, code lost:
        r3.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0342, code lost:
        if (r7 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0312  */
    @Override // f.p, androidx.activity.j, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f837e.f798w;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f837e.f798w;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // f.p, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f837e;
        alertController.f780e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
