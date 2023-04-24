package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import gm.l;

/* loaded from: classes.dex */
public final class d extends a<Intent, androidx.activity.result.a> {
    @Override // e.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        l.f(componentActivity, "context");
        l.f(intent, "input");
        return intent;
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        return new androidx.activity.result.a(intent, i10);
    }
}
