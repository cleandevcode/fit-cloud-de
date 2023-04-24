package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final f.i f2263a;

    /* renamed from: b */
    public final n f2264b;

    /* renamed from: c */
    public f.d f2265c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f2266a = 1;

        /* renamed from: b */
        public final n.a f2267b;

        /* renamed from: c */
        public n.a f2268c;

        /* renamed from: d */
        public n.a f2269d;

        /* renamed from: e */
        public int f2270e;

        /* renamed from: f */
        public int f2271f;

        public a(n.a aVar) {
            this.f2267b = aVar;
            this.f2268c = aVar;
        }

        public final int a(int i10) {
            n.a aVar;
            boolean z10;
            SparseArray<n.a> sparseArray = this.f2268c.f2289a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 3;
            if (this.f2266a != 2) {
                if (aVar != null) {
                    this.f2266a = 2;
                    this.f2268c = aVar;
                    this.f2271f = 1;
                    i11 = 2;
                }
                b();
                i11 = 1;
            } else {
                if (aVar != null) {
                    this.f2268c = aVar;
                    this.f2271f++;
                } else {
                    boolean z11 = false;
                    if (i10 == 65038) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (i10 == 65039) {
                            z11 = true;
                        }
                        if (!z11) {
                            n.a aVar2 = this.f2268c;
                            if (aVar2.f2290b != null) {
                                if (this.f2271f == 1) {
                                    if (c()) {
                                        aVar2 = this.f2268c;
                                    }
                                }
                                this.f2269d = aVar2;
                                b();
                            }
                        }
                    }
                    b();
                    i11 = 1;
                }
                i11 = 2;
            }
            this.f2270e = i10;
            return i11;
        }

        public final void b() {
            this.f2266a = 1;
            this.f2268c = this.f2267b;
            this.f2271f = 0;
        }

        public final boolean c() {
            boolean z10;
            boolean z11;
            x1.a c10 = this.f2268c.f2290b.c();
            int a10 = c10.a(6);
            if (a10 != 0 && c10.f30165b.get(a10 + c10.f30164a) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            if (this.f2270e == 65039) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
            return false;
        }
    }

    public j(n nVar, f.i iVar, d dVar) {
        this.f2263a = iVar;
        this.f2264b = nVar;
        this.f2265c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00b5, code lost:
        if (r6 >= r7) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.i r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.b(java.lang.CharSequence, int, int, androidx.emoji2.text.i):boolean");
    }
}
