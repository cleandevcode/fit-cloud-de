package m2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.r2;
import androidx.appcompat.widget.s2;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.j;
import m2.k;
import m2.m;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public final String f20243a;

    /* renamed from: b */
    public final m f20244b;

    /* renamed from: c */
    public final Executor f20245c;

    /* renamed from: d */
    public int f20246d;

    /* renamed from: e */
    public m.c f20247e;

    /* renamed from: f */
    public k f20248f;

    /* renamed from: g */
    public final b f20249g;

    /* renamed from: h */
    public final AtomicBoolean f20250h;

    /* renamed from: i */
    public final r2 f20251i;

    /* renamed from: j */
    public final s2 f20252j;

    /* loaded from: classes.dex */
    public static final class a extends m.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String[] strArr) {
            super(strArr);
            o.this = r1;
        }

        @Override // m2.m.c
        public final void a(Set<String> set) {
            gm.l.f(set, "tables");
            if (o.this.f20250h.get()) {
                return;
            }
            try {
                o oVar = o.this;
                k kVar = oVar.f20248f;
                if (kVar != null) {
                    int i10 = oVar.f20246d;
                    Object[] array = set.toArray(new String[0]);
                    if (array != null) {
                        kVar.k0((String[]) array, i10);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j.a {

        /* renamed from: c */
        public static final /* synthetic */ int f20254c = 0;

        public b() {
            o.this = r1;
        }

        @Override // m2.j
        public final void f(String[] strArr) {
            gm.l.f(strArr, "tables");
            o oVar = o.this;
            oVar.f20245c.execute(new s.s(oVar, strArr, 10));
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        public c() {
            o.this = r1;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            k c0369a;
            gm.l.f(componentName, "name");
            gm.l.f(iBinder, WiseOpenHianalyticsData.UNION_SERVICE);
            o oVar = o.this;
            int i10 = k.a.f20213a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof k)) {
                c0369a = (k) queryLocalInterface;
            } else {
                c0369a = new k.a.C0369a(iBinder);
            }
            oVar.f20248f = c0369a;
            o oVar2 = o.this;
            oVar2.f20245c.execute(oVar2.f20251i);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            gm.l.f(componentName, "name");
            o oVar = o.this;
            oVar.f20245c.execute(oVar.f20252j);
            o.this.f20248f = null;
        }
    }

    public o(Context context, String str, Intent intent, m mVar, Executor executor) {
        this.f20243a = str;
        this.f20244b = mVar;
        this.f20245c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f20249g = new b();
        this.f20250h = new AtomicBoolean(false);
        c cVar = new c();
        this.f20251i = new r2(8, this);
        this.f20252j = new s2(8, this);
        Object[] array = mVar.f20221d.keySet().toArray(new String[0]);
        if (array != null) {
            this.f20247e = new a((String[]) array);
            applicationContext.bindService(intent, cVar, 1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
