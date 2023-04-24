package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;
import y1.a;
import y1.g;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final EditText f1417a;

    /* renamed from: b */
    public final y1.a f1418b;

    public m(EditText editText) {
        this.f1417a = editText;
        this.f1418b = new y1.a(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            this.f1418b.f30808a.getClass();
            if (!(keyListener instanceof y1.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new y1.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1417a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i10, 0);
        try {
            int i11 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        y1.a aVar = this.f1418b;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0566a c0566a = aVar.f30808a;
        c0566a.getClass();
        if (!(inputConnection instanceof y1.c)) {
            return new y1.c(c0566a.f30809a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void d(boolean z10) {
        y1.g gVar = this.f1418b.f30808a.f30810b;
        if (gVar.f30830d != z10) {
            if (gVar.f30829c != null) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                g.a aVar = gVar.f30829c;
                a10.getClass();
                s.h1.i(aVar, "initCallback cannot be null");
                a10.f2237a.writeLock().lock();
                try {
                    a10.f2238b.remove(aVar);
                } finally {
                    a10.f2237a.writeLock().unlock();
                }
            }
            gVar.f30830d = z10;
            if (z10) {
                y1.g.a(gVar.f30827a, androidx.emoji2.text.f.a().b());
            }
        }
    }
}
