package x0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.k;
import k1.g;

/* loaded from: classes.dex */
public class n extends Activity implements androidx.lifecycle.u, g.a {

    /* renamed from: a */
    public androidx.lifecycle.v f30125a;

    public n() {
        new o0.h();
        this.f30125a = new androidx.lifecycle.v(this);
    }

    public androidx.lifecycle.v a0() {
        return this.f30125a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k1.g.a(decorView, keyEvent)) {
            return k1.g.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k1.g.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.i0.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.v vVar = this.f30125a;
        k.c cVar = k.c.CREATED;
        vVar.e("markState");
        vVar.h(cVar);
        super.onSaveInstanceState(bundle);
    }

    @Override // k1.g.a
    public final boolean u(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
