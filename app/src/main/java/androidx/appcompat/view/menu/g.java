package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a */
    public f f956a;

    /* renamed from: b */
    public androidx.appcompat.app.d f957b;

    /* renamed from: c */
    public d f958c;

    public g(f fVar) {
        this.f956a = fVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void c(f fVar, boolean z10) {
        androidx.appcompat.app.d dVar;
        if ((z10 || fVar == this.f956a) && (dVar = this.f957b) != null) {
            dVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean d(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        f fVar = this.f956a;
        d dVar = this.f958c;
        if (dVar.f922g == null) {
            dVar.f922g = new d.a();
        }
        fVar.q(dVar.f922g.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f958c.c(this.f956a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f957b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f957b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f956a.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f956a.performShortcut(i10, keyEvent, 0);
    }
}
