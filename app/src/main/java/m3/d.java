package m3;

import android.content.Context;
import f3.m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f */
    public static final String f20334f = m.e("ConstraintTracker");

    /* renamed from: a */
    public final r3.a f20335a;

    /* renamed from: b */
    public final Context f20336b;

    /* renamed from: c */
    public final Object f20337c = new Object();

    /* renamed from: d */
    public final LinkedHashSet f20338d = new LinkedHashSet();

    /* renamed from: e */
    public T f20339e;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f20340a;

        public a(ArrayList arrayList) {
            d.this = r1;
            this.f20340a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (k3.a aVar : this.f20340a) {
                aVar.a(d.this.f20339e);
            }
        }
    }

    public d(Context context, r3.a aVar) {
        this.f20336b = context.getApplicationContext();
        this.f20335a = aVar;
    }

    public abstract T a();

    public final void b(T t10) {
        synchronized (this.f20337c) {
            T t11 = this.f20339e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f20339e = t10;
                ((r3.b) this.f20335a).f25197c.execute(new a(new ArrayList(this.f20338d)));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
