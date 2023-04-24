package d6;

import android.content.Intent;
import android.util.Pair;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class k extends e.a<Intent, Pair<Integer, Intent>> {
    @Override // e.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        gm.l.f(componentActivity, "context");
        gm.l.f(intent, "input");
        return intent;
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        Pair create = Pair.create(Integer.valueOf(i10), intent);
        gm.l.e(create, "create(resultCode, intent)");
        return create;
    }
}
