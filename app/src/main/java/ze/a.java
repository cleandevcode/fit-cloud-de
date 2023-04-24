package ze;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public String f32227a;

    /* renamed from: b */
    public String f32228b;

    /* renamed from: c */
    public long f32229c;

    /* renamed from: e */
    public boolean f32231e;

    /* renamed from: f */
    public int f32232f;

    /* renamed from: g */
    public int f32233g;

    /* renamed from: l */
    public ArrayList f32238l;

    /* renamed from: m */
    public ArrayList f32239m;

    /* renamed from: n */
    public ArrayList f32240n;

    /* renamed from: o */
    public ArrayList f32241o;

    /* renamed from: p */
    public ArrayList f32242p;

    /* renamed from: q */
    public SparseIntArray f32243q;

    /* renamed from: d */
    public int f32230d = 1;

    /* renamed from: h */
    public int f32234h = 4096;

    /* renamed from: i */
    public boolean f32235i = true;

    /* renamed from: j */
    public int f32236j = 0;

    /* renamed from: k */
    public int f32237k = 15;

    public final boolean a(int i10) {
        int i11;
        boolean z10 = i10 > 3 ? i10 == 4 || i10 == 8 || i10 == 6 ? (i11 = this.f32232f) == 4 || i11 == 8 || i11 == 6 : i10 == this.f32232f : this.f32232f <= 3;
        if (!z10) {
            ge.b.p(String.format("ic conflict: 0x%02X, 0x%02X", Integer.valueOf(i10), Integer.valueOf(this.f32232f)));
            this.f32235i = false;
            this.f32234h = DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED;
        }
        return z10;
    }

    public final void b(int i10, int i11) {
        ge.b.n(String.format(Locale.US, "nonConfigVersionFlag=%d, configVersionFlag=%d", Integer.valueOf(i10), Integer.valueOf(i11)));
        if (i10 < 0) {
            ge.b.p("all code image version must >= active image version");
            this.f32235i = false;
            this.f32234h = 4114;
        } else if (i10 != 0 || i11 > 0) {
        } else {
            ge.b.d("there must be at least one data image version> active image version");
            this.f32235i = false;
            this.f32234h = 4113;
        }
    }

    public final void c(int i10, int i11, boolean z10) {
        ge.b.n(String.format(Locale.US, "nonConfigVersionFlag=%d, configVersionFlag=%d", Integer.valueOf(i10), Integer.valueOf(i11)));
        if (i10 < 0) {
            ge.b.p("all code image version must >= active image version");
            this.f32235i = false;
            this.f32234h = 4114;
        } else if (i10 == 0) {
            if (i11 >= 0 && (i11 != 0 || z10)) {
                return;
            }
            ge.b.d("there must be at least one data image version> active image version");
            this.f32235i = false;
            this.f32234h = 4113;
        }
    }

    public final String toString() {
        int i10;
        int i11;
        String format;
        int i12;
        int i13;
        StringBuilder a10 = android.support.v4.media.d.a("BinInfo{\n");
        a10.append(String.format("path=%s\n", this.f32227a));
        Locale locale = Locale.US;
        a10.append(String.format(locale, "fileName=%s, fileSize=%d\n", this.f32228b, Long.valueOf(this.f32229c)));
        a10.append(String.format(locale, "fileType=0x%02X, isPackFile=%b, bankIndicator=0x%02X, updateBank=0x%02X\n", Integer.valueOf(this.f32230d), Boolean.valueOf(this.f32231e), Integer.valueOf(this.f32236j), Integer.valueOf(this.f32237k)));
        a10.append(String.format(locale, "icType=0x%02X, updateEnabled=%b, status=%d\n", Integer.valueOf(this.f32232f), Boolean.valueOf(this.f32235i), Integer.valueOf(this.f32234h)));
        if (this.f32231e) {
            Object[] objArr = new Object[1];
            ArrayList arrayList = this.f32238l;
            if (arrayList != null) {
                i12 = arrayList.size();
            } else {
                i12 = 0;
            }
            objArr[0] = Integer.valueOf(i12);
            a10.append(String.format(locale, "subFileInfos.size=%d\n", objArr));
            Object[] objArr2 = new Object[1];
            ArrayList arrayList2 = this.f32241o;
            if (arrayList2 != null) {
                i13 = arrayList2.size();
            } else {
                i13 = 0;
            }
            objArr2[0] = Integer.valueOf(i13);
            format = String.format(locale, "supportSubFileInfos.size=%d\n", objArr2);
        } else {
            Object[] objArr3 = new Object[1];
            ArrayList arrayList3 = this.f32239m;
            if (arrayList3 != null) {
                i10 = arrayList3.size();
            } else {
                i10 = 0;
            }
            objArr3[0] = Integer.valueOf(i10);
            a10.append(String.format(locale, "subBinInputStreams.size=%d\n", objArr3));
            Object[] objArr4 = new Object[1];
            ArrayList arrayList4 = this.f32242p;
            if (arrayList4 != null) {
                i11 = arrayList4.size();
            } else {
                i11 = 0;
            }
            objArr4[0] = Integer.valueOf(i11);
            a10.append(String.format(locale, "supportBinInputStreams.size=%d\n", objArr4));
            format = String.format(locale, "version=%d\n", Integer.valueOf(this.f32233g));
        }
        return androidx.activity.e.b(a10, format, "}");
    }
}
