package i2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import i2.v;
import i2.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public final Context f16395a;

    /* renamed from: b */
    public final Intent f16396b;

    /* renamed from: c */
    public x f16397c;

    /* renamed from: d */
    public final ArrayList f16398d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f16399a;

        /* renamed from: b */
        public final Bundle f16400b;

        public a(int i10, Bundle bundle) {
            this.f16399a = i10;
            this.f16400b = bundle;
        }
    }

    public s(m mVar) {
        Intent launchIntentForPackage;
        gm.l.f(mVar, "navController");
        Context context = mVar.f16322a;
        gm.l.f(context, "context");
        this.f16395a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f16396b = launchIntentForPackage;
        this.f16398d = new ArrayList();
        this.f16397c = mVar.i();
    }

    public final x0.i0 a() {
        if (this.f16397c != null) {
            if (!this.f16398d.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                Iterator it = this.f16398d.iterator();
                v vVar = null;
                while (true) {
                    int i10 = 0;
                    if (it.hasNext()) {
                        a aVar = (a) it.next();
                        int i11 = aVar.f16399a;
                        Bundle bundle = aVar.f16400b;
                        v b10 = b(i11);
                        if (b10 != null) {
                            int[] i12 = b10.i(vVar);
                            int length = i12.length;
                            while (i10 < length) {
                                arrayList.add(Integer.valueOf(i12[i10]));
                                arrayList2.add(bundle);
                                i10++;
                            }
                            vVar = b10;
                        } else {
                            int i13 = v.f16402j;
                            StringBuilder a10 = androidx.activity.result.d.a("Navigation destination ", v.a.b(this.f16395a, i11), " cannot be found in the navigation graph ");
                            a10.append(this.f16397c);
                            throw new IllegalArgumentException(a10.toString());
                        }
                    } else {
                        this.f16396b.putExtra("android-support-nav:controller:deepLinkIds", ul.q.X(arrayList));
                        this.f16396b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                        x0.i0 i0Var = new x0.i0(this.f16395a);
                        i0Var.b(new Intent(this.f16396b));
                        int size = i0Var.f30123a.size();
                        while (i10 < size) {
                            Intent intent = i0Var.f30123a.get(i10);
                            if (intent != null) {
                                intent.putExtra("android-support-nav:controller:deepLinkIntent", this.f16396b);
                            }
                            i10++;
                        }
                        return i0Var;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    public final v b(int i10) {
        ul.g gVar = new ul.g();
        x xVar = this.f16397c;
        gm.l.c(xVar);
        gVar.addLast(xVar);
        while (!gVar.isEmpty()) {
            v vVar = (v) gVar.removeFirst();
            if (vVar.f16410h == i10) {
                return vVar;
            }
            if (vVar instanceof x) {
                x.b bVar = new x.b();
                while (bVar.hasNext()) {
                    gVar.addLast((v) bVar.next());
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.f16398d.iterator();
        while (it.hasNext()) {
            int i10 = ((a) it.next()).f16399a;
            if (b(i10) == null) {
                int i11 = v.f16402j;
                StringBuilder a10 = androidx.activity.result.d.a("Navigation destination ", v.a.b(this.f16395a, i10), " cannot be found in the navigation graph ");
                a10.append(this.f16397c);
                throw new IllegalArgumentException(a10.toString());
            }
        }
    }
}
