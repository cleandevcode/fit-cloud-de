package y1;

import android.widget.EditText;
import s.h1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final C0566a f30808a;

    /* renamed from: y1.a$a */
    /* loaded from: classes.dex */
    public static class C0566a extends b {

        /* renamed from: a */
        public final EditText f30809a;

        /* renamed from: b */
        public final g f30810b;

        public C0566a(EditText editText) {
            this.f30809a = editText;
            g gVar = new g(editText);
            this.f30810b = gVar;
            editText.addTextChangedListener(gVar);
            if (y1.b.f30812b == null) {
                synchronized (y1.b.f30811a) {
                    if (y1.b.f30812b == null) {
                        y1.b.f30812b = new y1.b();
                    }
                }
            }
            editText.setEditableFactory(y1.b.f30812b);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        h1.i(editText, "editText cannot be null");
        this.f30808a = new C0566a(editText);
    }
}
