package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public final b f3179a;

    /* renamed from: b */
    public a f3180b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f3181a = 0;

        /* renamed from: b */
        public int f3182b;

        /* renamed from: c */
        public int f3183c;

        /* renamed from: d */
        public int f3184d;

        /* renamed from: e */
        public int f3185e;

        public final boolean a() {
            int i10 = this.f3181a;
            int i11 = 2;
            if ((i10 & 7) != 0) {
                int i12 = this.f3184d;
                int i13 = this.f3182b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 0) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 112) != 0) {
                int i14 = this.f3184d;
                int i15 = this.f3183c;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 1792) != 0) {
                int i16 = this.f3185e;
                int i17 = this.f3182b;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 28672) != 0) {
                int i18 = this.f3185e;
                int i19 = this.f3183c;
                if (i18 > i19) {
                    i11 = 1;
                } else if (i18 != i19) {
                    i11 = 4;
                }
                if ((i10 & (i11 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public p0(b bVar) {
        this.f3179a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        int b10 = this.f3179a.b();
        int c10 = this.f3179a.c();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View d10 = this.f3179a.d(i10);
            int a10 = this.f3179a.a(d10);
            int e10 = this.f3179a.e(d10);
            a aVar = this.f3180b;
            aVar.f3182b = b10;
            aVar.f3183c = c10;
            aVar.f3184d = a10;
            aVar.f3185e = e10;
            if (i12 != 0) {
                aVar.f3181a = i12 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f3180b;
                aVar2.f3181a = i13 | 0;
                if (aVar2.a()) {
                    view = d10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        a aVar = this.f3180b;
        int b10 = this.f3179a.b();
        int c10 = this.f3179a.c();
        int a10 = this.f3179a.a(view);
        int e10 = this.f3179a.e(view);
        aVar.f3182b = b10;
        aVar.f3183c = c10;
        aVar.f3184d = a10;
        aVar.f3185e = e10;
        a aVar2 = this.f3180b;
        aVar2.f3181a = 24579 | 0;
        return aVar2.a();
    }
}
