package f;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class p extends androidx.activity.j implements h {

    /* renamed from: c */
    public j f13960c;

    /* renamed from: d */
    public final o f13961d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v2, types: [f.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = androidx.appcompat.R.attr.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r6
        L15:
            r4.<init>(r5, r1)
            f.o r1 = new f.o
            r1.<init>()
            r4.f13961d = r1
            f.i r1 = r4.f()
            if (r6 != 0) goto L35
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = androidx.appcompat.R.attr.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L35:
            r5 = r1
            f.j r5 = (f.j) r5
            r5.Y = r6
            r1.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.p.<init>(android.content.Context, int):void");
    }

    @Override // f.h
    public final void B() {
    }

    @Override // androidx.activity.j, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return k1.g.b(this.f13961d, getWindow().getDecorView(), this, keyEvent);
    }

    public final i f() {
        if (this.f13960c == null) {
            int i10 = i.f13880a;
            this.f13960c = new j(getContext(), getWindow(), this, this);
        }
        return this.f13960c;
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) f().f(i10);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void h() {
        f().r(1);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().j();
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().i();
        super.onCreate(bundle);
        f().l();
    }

    @Override // androidx.activity.j, android.app.Dialog
    public final void onStop() {
        super.onStop();
        f().p();
    }

    @Override // f.h
    public final void p() {
    }

    @Override // androidx.activity.j, android.app.Dialog
    public final void setContentView(int i10) {
        f().s(i10);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public final void setContentView(View view) {
        f().t(view);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().u(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        f().w(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().w(charSequence);
    }

    @Override // f.h
    public final void w() {
    }
}
