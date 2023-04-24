package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public static x2.a f3441a = new x2.a();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<o0.b<ViewGroup, ArrayList<i>>>> f3442b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f3443c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public i f3444a;

        /* renamed from: b */
        public ViewGroup f3445b;

        /* renamed from: androidx.transition.k$a$a */
        /* loaded from: classes.dex */
        public class C0035a extends j {

            /* renamed from: a */
            public final /* synthetic */ o0.b f3446a;

            public C0035a(o0.b bVar) {
                a.this = r1;
                this.f3446a = bVar;
            }

            @Override // androidx.transition.i.d
            public final void d(i iVar) {
                ((ArrayList) this.f3446a.get(a.this.f3445b)).remove(iVar);
                iVar.z(this);
            }
        }

        public a(ViewGroup viewGroup, i iVar) {
            this.f3444a = iVar;
            this.f3445b = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:204:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:290:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:333:0x01ef A[EDGE_INSN: B:333:0x01ef->B:280:0x01ef ?: BREAK  , SYNTHETIC] */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 710
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.k.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.f3445b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3445b.removeOnAttachStateChangeListener(this);
            k.f3443c.remove(this.f3445b);
            ArrayList<i> arrayList = k.b().get(this.f3445b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<i> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().B(this.f3445b);
                }
            }
            this.f3444a.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, i iVar) {
        if (!f3443c.contains(viewGroup)) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.c(viewGroup)) {
                f3443c.add(viewGroup);
                if (iVar == null) {
                    iVar = f3441a;
                }
                i clone = iVar.clone();
                ArrayList<i> arrayList = b().get(viewGroup);
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator<i> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().y(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.h(viewGroup, true);
                }
                int i10 = R.id.transition_current_scene;
                if (((h) viewGroup.getTag(i10)) == null) {
                    viewGroup.setTag(i10, null);
                    if (clone != null) {
                        a aVar = new a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static o0.b<ViewGroup, ArrayList<i>> b() {
        o0.b<ViewGroup, ArrayList<i>> bVar;
        WeakReference<o0.b<ViewGroup, ArrayList<i>>> weakReference = f3442b.get();
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            o0.b<ViewGroup, ArrayList<i>> bVar2 = new o0.b<>();
            f3442b.set(new WeakReference<>(bVar2));
            return bVar2;
        }
        return bVar;
    }
}
