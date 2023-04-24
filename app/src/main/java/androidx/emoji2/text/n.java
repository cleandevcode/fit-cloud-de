package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.h1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final x1.b f2285a;

    /* renamed from: b */
    public final char[] f2286b;

    /* renamed from: c */
    public final a f2287c = new a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);

    /* renamed from: d */
    public final Typeface f2288d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final SparseArray<a> f2289a;

        /* renamed from: b */
        public i f2290b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f2289a = new SparseArray<>(i10);
        }

        public final void a(i iVar, int i10, int i11) {
            a aVar;
            int a10 = iVar.a(i10);
            SparseArray<a> sparseArray = this.f2289a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                this.f2289a.put(iVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(iVar, i10 + 1, i11);
            } else {
                aVar.f2290b = iVar;
            }
        }
    }

    public n(Typeface typeface, x1.b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f2288d = typeface;
        this.f2285a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f30164a;
            i10 = bVar.f30165b.getInt(bVar.f30165b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f2286b = new char[i10 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f30164a;
            i11 = bVar.f30165b.getInt(bVar.f30165b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            i iVar = new i(this, i15);
            x1.a c10 = iVar.c();
            int a12 = c10.a(4);
            if (a12 != 0) {
                i12 = c10.f30165b.getInt(a12 + c10.f30164a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f2286b, i15 * 2);
            if (iVar.b() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1.e("invalid metadata codepoint length", z10);
            this.f2287c.a(iVar, 0, iVar.b() - 1);
        }
    }
}
