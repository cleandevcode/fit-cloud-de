package x0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import y0.a;

/* loaded from: classes.dex */
public final class i0 implements Iterable<Intent> {

    /* renamed from: a */
    public final ArrayList<Intent> f30123a = new ArrayList<>();

    /* renamed from: b */
    public final Context f30124b;

    public i0(Context context) {
        this.f30124b = context;
    }

    public final void b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f30124b.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        this.f30123a.add(intent);
    }

    public final void e(ComponentName componentName) {
        int size = this.f30123a.size();
        try {
            Context context = this.f30124b;
            while (true) {
                Intent b10 = p.b(context, componentName);
                if (b10 == null) {
                    return;
                }
                this.f30123a.add(size, b10);
                context = this.f30124b;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void f() {
        if (!this.f30123a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f30123a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.f30124b;
            Object obj = y0.a.f30807a;
            a.C0565a.a(context, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f30123a.iterator();
    }
}
