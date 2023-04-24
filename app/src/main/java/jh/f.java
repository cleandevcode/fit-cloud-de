package jh;

import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class f implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ e f17783a;

    public f(e eVar) {
        this.f17783a = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x002c, code lost:
        if (r1 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0050, code lost:
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0052, code lost:
        r0 = true;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void afterTextChanged(android.text.Editable r7) {
        /*
            r6 = this;
            jh.e r7 = r6.f17783a
            android.widget.EditText r0 = r7.f17773a
            java.lang.String r0 = qi.h.h(r0)
            boolean r1 = r7.f17776d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r0 == 0) goto L19
            int r1 = r0.length()
            if (r1 != 0) goto L17
            goto L19
        L17:
            r1 = 0
            goto L1a
        L19:
            r1 = 1
        L1a:
            if (r1 == 0) goto L1e
            r1 = 0
            goto L2c
        L1e:
            java.lang.String r1 = "^1[3-9][0-9]\\d{8}$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
        L2c:
            if (r1 != 0) goto L52
        L2e:
            boolean r1 = r7.f17777e
            if (r1 == 0) goto L54
            if (r0 == 0) goto L3d
            int r1 = r0.length()
            if (r1 != 0) goto L3b
            goto L3d
        L3b:
            r1 = 0
            goto L3e
        L3d:
            r1 = 1
        L3e:
            if (r1 == 0) goto L42
            r0 = 0
            goto L50
        L42:
            java.lang.String r1 = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
        L50:
            if (r0 == 0) goto L54
        L52:
            r0 = 1
            goto L55
        L54:
            r0 = 0
        L55:
            android.widget.EditText r1 = r7.f17775c
            if (r1 == 0) goto L68
            java.lang.String r1 = qi.h.h(r1)
            if (r1 == 0) goto L68
            int r1 = r1.length()
            if (r1 <= 0) goto L66
            goto L68
        L66:
            r1 = 0
            goto L69
        L68:
            r1 = 1
        L69:
            android.widget.EditText r4 = r7.f17774b
            if (r4 != 0) goto L6e
            goto L84
        L6e:
            boolean r5 = r7.f17778f
            java.lang.String r4 = qi.h.h(r4)
            int r4 = r4.length()
            if (r5 == 0) goto L82
            r5 = 6
            if (r5 > r4) goto L86
            r5 = 17
            if (r4 >= r5) goto L86
            goto L84
        L82:
            if (r4 <= 0) goto L86
        L84:
            r4 = 1
            goto L87
        L86:
            r4 = 0
        L87:
            android.widget.EditText r5 = r7.f17775c
            if (r5 == 0) goto L8f
            if (r0 == 0) goto L8f
            r5 = 1
            goto L90
        L8f:
            r5 = 0
        L90:
            r7.f17781i = r5
            jh.e$a r7 = r7.f17779g
            if (r0 == 0) goto L9b
            if (r1 == 0) goto L9b
            if (r4 == 0) goto L9b
            goto L9c
        L9b:
            r2 = 0
        L9c:
            r7.a(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.f.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
