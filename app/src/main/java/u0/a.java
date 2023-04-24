package u0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.u0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public final class a {
    public static String a(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                return u0.a("?", i10);
            }
        }
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
