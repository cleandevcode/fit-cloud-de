package n6;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum o {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: a */
    public final boolean f22105a;

    /* renamed from: b */
    public final boolean f22106b;

    /* renamed from: c */
    public final boolean f22107c;

    /* renamed from: d */
    public final boolean f22108d;

    /* renamed from: e */
    public final boolean f22109e;

    /* renamed from: f */
    public final boolean f22110f;

    o(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f22105a = z10;
        this.f22106b = z11;
        this.f22107c = z12;
        this.f22108d = z13;
        this.f22109e = z14;
        this.f22110f = z15;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        return (o[]) Arrays.copyOf(values(), 7);
    }
}
