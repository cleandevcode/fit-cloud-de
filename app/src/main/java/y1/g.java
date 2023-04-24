package y1;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a */
    public final EditText f30827a;

    /* renamed from: c */
    public a f30829c;

    /* renamed from: b */
    public final boolean f30828b = false;

    /* renamed from: d */
    public boolean f30830d = true;

    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a */
        public final WeakReference f30831a;

        public a(EditText editText) {
            this.f30831a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            g.a((EditText) this.f30831a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f30827a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0019, code lost:
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            android.widget.EditText r0 = r3.f30827a
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L56
            boolean r0 = r3.f30830d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            boolean r0 = r3.f30828b
            if (r0 != 0) goto L1c
            androidx.emoji2.text.f r0 = androidx.emoji2.text.f.f2236j
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            if (r1 == 0) goto L1f
            goto L56
        L1f:
            if (r6 > r7) goto L56
            boolean r6 = r4 instanceof android.text.Spannable
            if (r6 == 0) goto L56
            androidx.emoji2.text.f r6 = androidx.emoji2.text.f.a()
            int r6 = r6.b()
            if (r6 == 0) goto L40
            if (r6 == r2) goto L35
            r4 = 3
            if (r6 == r4) goto L40
            goto L56
        L35:
            android.text.Spannable r4 = (android.text.Spannable) r4
            androidx.emoji2.text.f r6 = androidx.emoji2.text.f.a()
            int r7 = r7 + r5
            r6.f(r5, r7, r4)
            goto L56
        L40:
            androidx.emoji2.text.f r4 = androidx.emoji2.text.f.a()
            y1.g$a r5 = r3.f30829c
            if (r5 != 0) goto L51
            y1.g$a r5 = new y1.g$a
            android.widget.EditText r6 = r3.f30827a
            r5.<init>(r6)
            r3.f30829c = r5
        L51:
            y1.g$a r5 = r3.f30829c
            r4.g(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
