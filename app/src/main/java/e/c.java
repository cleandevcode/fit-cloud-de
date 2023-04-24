package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import e.a;
import gm.l;

/* loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // e.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        l.f(componentActivity, "context");
        l.f(str, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        l.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // e.a
    public final a.C0233a b(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        l.f(componentActivity, "context");
        l.f(str, "input");
        if (y0.a.a(componentActivity, str) == 0) {
            return new a.C0233a(Boolean.TRUE);
        }
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        boolean z10;
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z11 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
