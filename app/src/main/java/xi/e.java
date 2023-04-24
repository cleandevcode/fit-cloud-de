package xi;

import android.app.Application;
import android.content.SharedPreferences;
import gm.l;

/* loaded from: classes2.dex */
public final class e implements vi.c {

    /* renamed from: a */
    public final SharedPreferences f30603a;

    public e(Application application) {
        l.f(application, "context");
        SharedPreferences sharedPreferences = application.getSharedPreferences("fc_internal_storage", 0);
        l.e(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        this.f30603a = sharedPreferences;
    }

    @Override // vi.c
    public final boolean a() {
        return this.f30603a.getBoolean("scannableAnyTime", false);
    }

    @Override // vi.c
    public final SharedPreferences b() {
        return this.f30603a;
    }

    @Override // vi.c
    public final void c(boolean z10) {
        this.f30603a.edit().putBoolean("scannableAnyTime", z10).apply();
    }
}
