package y1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.j;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f30820a;

    /* renamed from: b */
    public final a f30821b;

    /* loaded from: classes.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f30820a = keyListener;
        this.f30821b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f30820a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f30820a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean a10;
        boolean z10;
        this.f30821b.getClass();
        Object obj = androidx.emoji2.text.f.f2235i;
        if (i10 != 67) {
            if (i10 != 112) {
                a10 = false;
            } else {
                a10 = j.a(editable, keyEvent, true);
            }
        } else {
            a10 = j.a(editable, keyEvent, false);
        }
        if (a10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f30820a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f30820a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f30820a.onKeyUp(view, editable, i10, keyEvent);
    }
}
