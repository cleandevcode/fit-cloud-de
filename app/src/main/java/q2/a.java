package q2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.media.d;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import gm.l;
import java.util.Iterator;
import java.util.Map;
import n.b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    public boolean f24506b;

    /* renamed from: c */
    public Bundle f24507c;

    /* renamed from: d */
    public boolean f24508d;

    /* renamed from: e */
    public Recreator.a f24509e;

    /* renamed from: a */
    public final n.b<String, b> f24505a = new n.b<>();

    /* renamed from: f */
    public boolean f24510f = true;

    /* renamed from: q2.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0442a {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f24508d) {
            Bundle bundle = this.f24507c;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                Bundle bundle3 = this.f24507c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f24507c;
                boolean z10 = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z10 = true;
                }
                if (!z10) {
                    this.f24507c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry entry;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f24505a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            l.e(entry, "components");
            bVar = (b) entry.getValue();
        } while (!l.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        l.f(str, "key");
        l.f(bVar, "provider");
        if (!(this.f24505a.e(str, bVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (this.f24510f) {
            Recreator.a aVar = this.f24509e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f24509e = aVar;
            try {
                j.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f24509e;
                if (aVar2 != null) {
                    aVar2.f3350a.add(j.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                StringBuilder a10 = d.a("Class ");
                a10.append(j.a.class.getSimpleName());
                a10.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(a10.toString(), e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
