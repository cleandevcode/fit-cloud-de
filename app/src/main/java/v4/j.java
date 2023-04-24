package v4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import cn.sharesdk.framework.InnerShareParams;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final int f29053a;

    /* renamed from: b */
    public final int f29054b;

    /* renamed from: c */
    public final int f29055c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e */
        public static final int f29056e;

        /* renamed from: a */
        public final Context f29057a;

        /* renamed from: b */
        public ActivityManager f29058b;

        /* renamed from: c */
        public b f29059c;

        /* renamed from: d */
        public float f29060d;

        static {
            f29056e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f29060d = f29056e;
            this.f29057a = context;
            this.f29058b = (ActivityManager) context.getSystemService(InnerShareParams.ACTIVITY);
            this.f29059c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f29058b.isLowRamDevice()) {
                this.f29060d = 0.0f;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final DisplayMetrics f29061a;

        public b(DisplayMetrics displayMetrics) {
            this.f29061a = displayMetrics;
        }
    }

    public j(a aVar) {
        int i10;
        ActivityManager activityManager;
        boolean z10;
        Context context = aVar.f29057a;
        if (aVar.f29058b.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f29055c = i10;
        int round = Math.round(activityManager.getMemoryClass() * DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED * DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED * (aVar.f29058b.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f29059c.f29061a;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(aVar.f29060d * f10);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f29054b = round3;
            this.f29053a = round2;
        } else {
            float f11 = i11 / (aVar.f29060d + 2.0f);
            this.f29054b = Math.round(2.0f * f11);
            this.f29053a = Math.round(f11 * aVar.f29060d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder a10 = android.support.v4.media.d.a("Calculation complete, Calculated memory cache size: ");
            a10.append(Formatter.formatFileSize(context, this.f29054b));
            a10.append(", pool size: ");
            a10.append(Formatter.formatFileSize(context, this.f29053a));
            a10.append(", byte array size: ");
            a10.append(Formatter.formatFileSize(context, i10));
            a10.append(", memory class limited? ");
            if (i12 > round) {
                z10 = true;
            } else {
                z10 = false;
            }
            a10.append(z10);
            a10.append(", max size: ");
            a10.append(Formatter.formatFileSize(context, round));
            a10.append(", memoryClass: ");
            a10.append(aVar.f29058b.getMemoryClass());
            a10.append(", isLowMemoryDevice: ");
            a10.append(aVar.f29058b.isLowRamDevice());
            Log.d("MemorySizeCalculator", a10.toString());
        }
    }
}
