package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.g;
import e.a;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f735a;

    /* renamed from: b */
    public final /* synthetic */ a.C0233a f736b;

    /* renamed from: c */
    public final /* synthetic */ ComponentActivity.b f737c;

    public f(ComponentActivity.b bVar, int i10, a.C0233a c0233a) {
        this.f737c = bVar;
        this.f735a = i10;
        this.f736b = c0233a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b<O> bVar;
        ComponentActivity.b bVar2 = this.f737c;
        int i10 = this.f735a;
        T t10 = this.f736b.f13281a;
        String str = (String) bVar2.f760b.get(Integer.valueOf(i10));
        if (str != null) {
            g.a aVar = (g.a) bVar2.f764f.get(str);
            if (aVar != null && (bVar = aVar.f767a) != 0) {
                if (bVar2.f763e.remove(str)) {
                    bVar.a(t10);
                    return;
                }
                return;
            }
            bVar2.f766h.remove(str);
            bVar2.f765g.put(str, t10);
        }
    }
}
