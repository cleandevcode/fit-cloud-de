package i2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.e2;
import androidx.lifecycle.k;
import androidx.lifecycle.x0;
import i2.j;
import i2.s;
import i2.v;
import i2.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import nm.o;
import sm.g1;
import sm.s0;
import sm.t0;
import sm.w0;

/* loaded from: classes.dex */
public class m {
    public final ArrayList A;
    public final tl.i B;
    public final w0 C;

    /* renamed from: a */
    public final Context f16322a;

    /* renamed from: b */
    public Activity f16323b;

    /* renamed from: c */
    public x f16324c;

    /* renamed from: d */
    public Bundle f16325d;

    /* renamed from: e */
    public Parcelable[] f16326e;

    /* renamed from: f */
    public boolean f16327f;

    /* renamed from: g */
    public final ul.g<i2.j> f16328g;

    /* renamed from: h */
    public final g1 f16329h;

    /* renamed from: i */
    public final LinkedHashMap f16330i;

    /* renamed from: j */
    public final LinkedHashMap f16331j;

    /* renamed from: k */
    public final LinkedHashMap f16332k;

    /* renamed from: l */
    public final LinkedHashMap f16333l;

    /* renamed from: m */
    public androidx.lifecycle.u f16334m;

    /* renamed from: n */
    public OnBackPressedDispatcher f16335n;

    /* renamed from: o */
    public q f16336o;

    /* renamed from: p */
    public final CopyOnWriteArrayList<b> f16337p;

    /* renamed from: q */
    public k.c f16338q;

    /* renamed from: r */
    public final l f16339r;

    /* renamed from: s */
    public final e f16340s;

    /* renamed from: t */
    public boolean f16341t;

    /* renamed from: u */
    public j0 f16342u;

    /* renamed from: v */
    public final LinkedHashMap f16343v;

    /* renamed from: w */
    public fm.l<? super i2.j, tl.l> f16344w;

    /* renamed from: x */
    public fm.l<? super i2.j, tl.l> f16345x;

    /* renamed from: y */
    public final LinkedHashMap f16346y;

    /* renamed from: z */
    public int f16347z;

    /* loaded from: classes.dex */
    public final class a extends k0 {

        /* renamed from: g */
        public final h0<? extends v> f16348g;

        /* renamed from: h */
        public final /* synthetic */ m f16349h;

        /* renamed from: i2.m$a$a */
        /* loaded from: classes.dex */
        public static final class C0289a extends gm.m implements fm.a<tl.l> {

            /* renamed from: c */
            public final /* synthetic */ i2.j f16351c;

            /* renamed from: d */
            public final /* synthetic */ boolean f16352d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0289a(i2.j jVar, boolean z10) {
                super(0);
                a.this = r1;
                this.f16351c = jVar;
                this.f16352d = z10;
            }

            @Override // fm.a
            public final tl.l m() {
                a.super.c(this.f16351c, this.f16352d);
                return tl.l.f28297a;
            }
        }

        public a(m mVar, h0<? extends v> h0Var) {
            gm.l.f(h0Var, "navigator");
            this.f16349h = mVar;
            this.f16348g = h0Var;
        }

        @Override // i2.k0
        public final i2.j a(v vVar, Bundle bundle) {
            m mVar = this.f16349h;
            return j.a.a(mVar.f16322a, vVar, bundle, mVar.j(), this.f16349h.f16336o);
        }

        @Override // i2.k0
        public final void c(i2.j jVar, boolean z10) {
            gm.l.f(jVar, "popUpTo");
            h0 b10 = this.f16349h.f16342u.b(jVar.f16294b.f16403a);
            if (gm.l.a(b10, this.f16348g)) {
                m mVar = this.f16349h;
                fm.l<? super i2.j, tl.l> lVar = mVar.f16345x;
                if (lVar != null) {
                    lVar.k(jVar);
                    super.c(jVar, z10);
                    return;
                }
                C0289a c0289a = new C0289a(jVar, z10);
                int indexOf = mVar.f16328g.indexOf(jVar);
                if (indexOf < 0) {
                    Log.i("NavController", "Ignoring pop of " + jVar + " as it was not found on the current back stack");
                    return;
                }
                int i10 = indexOf + 1;
                ul.g<i2.j> gVar = mVar.f16328g;
                if (i10 != gVar.f28874c) {
                    mVar.r(gVar.get(i10).f16294b.f16410h, true, false);
                }
                m.t(mVar, jVar);
                c0289a.m();
                mVar.A();
                mVar.c();
                return;
            }
            Object obj = this.f16349h.f16343v.get(b10);
            gm.l.c(obj);
            ((a) obj).c(jVar, z10);
        }

        @Override // i2.k0
        public final void d(i2.j jVar) {
            gm.l.f(jVar, "backStackEntry");
            h0 b10 = this.f16349h.f16342u.b(jVar.f16294b.f16403a);
            if (gm.l.a(b10, this.f16348g)) {
                fm.l<? super i2.j, tl.l> lVar = this.f16349h.f16344w;
                if (lVar != null) {
                    lVar.k(jVar);
                    super.d(jVar);
                    return;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Ignoring add of destination ");
                a10.append(jVar.f16294b);
                a10.append(" outside of the call to navigate(). ");
                Log.i("NavController", a10.toString());
                return;
            }
            Object obj = this.f16349h.f16343v.get(b10);
            if (obj != null) {
                ((a) obj).d(jVar);
                return;
            }
            throw new IllegalStateException(androidx.activity.e.b(android.support.v4.media.d.a("NavigatorBackStack for "), jVar.f16294b.f16403a, " should already be created").toString());
        }

        public final void f(i2.j jVar) {
            super.d(jVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(m mVar, v vVar);
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.l<Context, Context> {

        /* renamed from: b */
        public static final c f16353b = new c();

        public c() {
            super(1);
        }

        @Override // fm.l
        public final Context k(Context context) {
            Context context2 = context;
            gm.l.f(context2, "it");
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends gm.m implements fm.a<a0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            m.this = r1;
        }

        @Override // fm.a
        public final a0 m() {
            m.this.getClass();
            m mVar = m.this;
            return new a0(mVar.f16322a, mVar.f16342u);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends androidx.activity.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(false);
            m.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            m.this.p();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends gm.m implements fm.l<i2.j, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ gm.x f16356b;

        /* renamed from: c */
        public final /* synthetic */ gm.x f16357c;

        /* renamed from: d */
        public final /* synthetic */ m f16358d;

        /* renamed from: e */
        public final /* synthetic */ boolean f16359e;

        /* renamed from: f */
        public final /* synthetic */ ul.g<k> f16360f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(gm.x xVar, gm.x xVar2, m mVar, boolean z10, ul.g<k> gVar) {
            super(1);
            this.f16356b = xVar;
            this.f16357c = xVar2;
            this.f16358d = mVar;
            this.f16359e = z10;
            this.f16360f = gVar;
        }

        @Override // fm.l
        public final tl.l k(i2.j jVar) {
            i2.j jVar2 = jVar;
            gm.l.f(jVar2, "entry");
            this.f16356b.f15506a = true;
            this.f16357c.f15506a = true;
            this.f16358d.s(jVar2, this.f16359e, this.f16360f);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends gm.m implements fm.l<v, v> {

        /* renamed from: b */
        public static final g f16361b = new g();

        public g() {
            super(1);
        }

        @Override // fm.l
        public final v k(v vVar) {
            v vVar2 = vVar;
            gm.l.f(vVar2, "destination");
            x xVar = vVar2.f16404b;
            boolean z10 = false;
            if (xVar != null && xVar.f16419l == vVar2.f16410h) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            return xVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends gm.m implements fm.l<v, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(1);
            m.this = r1;
        }

        @Override // fm.l
        public final Boolean k(v vVar) {
            v vVar2 = vVar;
            gm.l.f(vVar2, "destination");
            return Boolean.valueOf(!m.this.f16332k.containsKey(Integer.valueOf(vVar2.f16410h)));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends gm.m implements fm.l<v, v> {

        /* renamed from: b */
        public static final i f16363b = new i();

        public i() {
            super(1);
        }

        @Override // fm.l
        public final v k(v vVar) {
            v vVar2 = vVar;
            gm.l.f(vVar2, "destination");
            x xVar = vVar2.f16404b;
            boolean z10 = false;
            if (xVar != null && xVar.f16419l == vVar2.f16410h) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            return xVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends gm.m implements fm.l<v, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(1);
            m.this = r1;
        }

        @Override // fm.l
        public final Boolean k(v vVar) {
            v vVar2 = vVar;
            gm.l.f(vVar2, "destination");
            return Boolean.valueOf(!m.this.f16332k.containsKey(Integer.valueOf(vVar2.f16410h)));
        }
    }

    public m(Context context) {
        Object obj;
        this.f16322a = context;
        Iterator it = nm.j.H(context, c.f16353b).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f16323b = (Activity) obj;
        this.f16328g = new ul.g<>();
        g1 c10 = bi.r.c(ul.s.f28879a);
        this.f16329h = c10;
        bi.r.f(c10);
        this.f16330i = new LinkedHashMap();
        this.f16331j = new LinkedHashMap();
        this.f16332k = new LinkedHashMap();
        this.f16333l = new LinkedHashMap();
        this.f16337p = new CopyOnWriteArrayList<>();
        this.f16338q = k.c.INITIALIZED;
        this.f16339r = new l(0, this);
        this.f16340s = new e();
        this.f16341t = true;
        this.f16342u = new j0();
        this.f16343v = new LinkedHashMap();
        this.f16346y = new LinkedHashMap();
        j0 j0Var = this.f16342u;
        j0Var.a(new y(j0Var));
        this.f16342u.a(new i2.b(this.f16322a));
        this.A = new ArrayList();
        this.B = new tl.i(new d());
        w0 c11 = qi.h.c(1, 0, rm.f.DROP_OLDEST);
        this.C = c11;
        new s0(c11, null);
    }

    public static v e(v vVar, int i10) {
        x xVar;
        if (vVar.f16410h == i10) {
            return vVar;
        }
        if (vVar instanceof x) {
            xVar = (x) vVar;
        } else {
            xVar = vVar.f16404b;
            gm.l.c(xVar);
        }
        return xVar.q(i10, true);
    }

    public static /* synthetic */ void t(m mVar, i2.j jVar) {
        mVar.s(jVar, false, new ul.g<>());
    }

    public final void A() {
        boolean z10 = true;
        this.f16340s.f745a = (!this.f16341t || h() <= 1) ? false : false;
    }

    public final void a(v vVar, Bundle bundle, i2.j jVar, List<i2.j> list) {
        v vVar2;
        Object obj;
        v vVar3;
        Object obj2;
        i2.j jVar2;
        i2.j jVar3;
        v vVar4 = jVar.f16294b;
        if (!(vVar4 instanceof i2.d)) {
            while (!this.f16328g.isEmpty() && (this.f16328g.last().f16294b instanceof i2.d) && r(this.f16328g.last().f16294b.f16410h, true, false)) {
            }
        }
        ul.g gVar = new ul.g();
        i2.j jVar4 = null;
        if (vVar instanceof x) {
            v vVar5 = vVar4;
            do {
                gm.l.c(vVar5);
                vVar5 = vVar5.f16404b;
                if (vVar5 != null) {
                    ListIterator<i2.j> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            jVar3 = listIterator.previous();
                            if (gm.l.a(jVar3.f16294b, vVar5)) {
                                break;
                            }
                        } else {
                            jVar3 = null;
                            break;
                        }
                    }
                    i2.j jVar5 = jVar3;
                    if (jVar5 == null) {
                        jVar5 = j.a.a(this.f16322a, vVar5, bundle, j(), this.f16336o);
                    }
                    gVar.addFirst(jVar5);
                    if ((!this.f16328g.isEmpty()) && this.f16328g.last().f16294b == vVar5) {
                        t(this, this.f16328g.last());
                    }
                }
                if (vVar5 == null) {
                    break;
                }
            } while (vVar5 != vVar);
        }
        if (gVar.isEmpty()) {
            vVar2 = vVar4;
        } else {
            vVar2 = ((i2.j) gVar.first()).f16294b;
        }
        while (vVar2 != null && d(vVar2.f16410h) == null) {
            vVar2 = vVar2.f16404b;
            if (vVar2 != null) {
                ListIterator<i2.j> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        jVar2 = listIterator2.previous();
                        if (gm.l.a(jVar2.f16294b, vVar2)) {
                            break;
                        }
                    } else {
                        jVar2 = null;
                        break;
                    }
                }
                i2.j jVar6 = jVar2;
                if (jVar6 == null) {
                    jVar6 = j.a.a(this.f16322a, vVar2, vVar2.f(bundle), j(), this.f16336o);
                }
                gVar.addFirst(jVar6);
            }
        }
        if (!gVar.isEmpty()) {
            vVar4 = ((i2.j) gVar.first()).f16294b;
        }
        while (!this.f16328g.isEmpty() && (this.f16328g.last().f16294b instanceof x) && ((x) this.f16328g.last().f16294b).q(vVar4.f16410h, false) == null) {
            t(this, this.f16328g.last());
        }
        ul.g<i2.j> gVar2 = this.f16328g;
        if (gVar2.isEmpty()) {
            obj = null;
        } else {
            obj = gVar2.f28873b[gVar2.f28872a];
        }
        i2.j jVar7 = (i2.j) obj;
        if (jVar7 == null) {
            if (gVar.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = gVar.f28873b[gVar.f28872a];
            }
            jVar7 = (i2.j) obj2;
        }
        if (jVar7 != null) {
            vVar3 = jVar7.f16294b;
        } else {
            vVar3 = null;
        }
        if (!gm.l.a(vVar3, this.f16324c)) {
            ListIterator<i2.j> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                i2.j previous = listIterator3.previous();
                v vVar6 = previous.f16294b;
                x xVar = this.f16324c;
                gm.l.c(xVar);
                if (gm.l.a(vVar6, xVar)) {
                    jVar4 = previous;
                    break;
                }
            }
            i2.j jVar8 = jVar4;
            if (jVar8 == null) {
                Context context = this.f16322a;
                x xVar2 = this.f16324c;
                gm.l.c(xVar2);
                x xVar3 = this.f16324c;
                gm.l.c(xVar3);
                jVar8 = j.a.a(context, xVar2, xVar3.f(bundle), j(), this.f16336o);
            }
            gVar.addFirst(jVar8);
        }
        Iterator<E> it = gVar.iterator();
        while (it.hasNext()) {
            i2.j jVar9 = (i2.j) it.next();
            Object obj3 = this.f16343v.get(this.f16342u.b(jVar9.f16294b.f16403a));
            if (obj3 != null) {
                ((a) obj3).f(jVar9);
            } else {
                throw new IllegalStateException(androidx.activity.e.b(android.support.v4.media.d.a("NavigatorBackStack for "), vVar.f16403a, " should already be created").toString());
            }
        }
        this.f16328g.addAll(gVar);
        this.f16328g.addLast(jVar);
        Iterator it2 = ul.q.R(gVar, jVar).iterator();
        while (it2.hasNext()) {
            i2.j jVar10 = (i2.j) it2.next();
            x xVar4 = jVar10.f16294b.f16404b;
            if (xVar4 != null) {
                k(jVar10, f(xVar4.f16410h));
            }
        }
    }

    public final void b(b bVar) {
        this.f16337p.add(bVar);
        if (!this.f16328g.isEmpty()) {
            bVar.a(this, this.f16328g.last().f16294b);
        }
    }

    public final boolean c() {
        while (!this.f16328g.isEmpty() && (this.f16328g.last().f16294b instanceof x)) {
            t(this, this.f16328g.last());
        }
        i2.j n10 = this.f16328g.n();
        if (n10 != null) {
            this.A.add(n10);
        }
        this.f16347z++;
        z();
        int i10 = this.f16347z - 1;
        this.f16347z = i10;
        if (i10 == 0) {
            ArrayList Z = ul.q.Z(this.A);
            this.A.clear();
            Iterator it = Z.iterator();
            while (it.hasNext()) {
                i2.j jVar = (i2.j) it.next();
                Iterator<b> it2 = this.f16337p.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, jVar.f16294b);
                }
                this.C.d(jVar);
            }
            this.f16329h.setValue(u());
        }
        if (n10 != null) {
            return true;
        }
        return false;
    }

    public final v d(int i10) {
        v vVar;
        x xVar = this.f16324c;
        if (xVar == null) {
            return null;
        }
        if (xVar.f16410h == i10) {
            return xVar;
        }
        i2.j n10 = this.f16328g.n();
        if (n10 == null || (vVar = n10.f16294b) == null) {
            vVar = this.f16324c;
            gm.l.c(vVar);
        }
        return e(vVar, i10);
    }

    public final i2.j f(int i10) {
        i2.j jVar;
        boolean z10;
        ul.g<i2.j> gVar = this.f16328g;
        ListIterator<i2.j> listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                jVar = listIterator.previous();
                if (jVar.f16294b.f16410h == i10) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                jVar = null;
                break;
            }
        }
        i2.j jVar2 = jVar;
        if (jVar2 != null) {
            return jVar2;
        }
        StringBuilder a10 = e2.a("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        a10.append(g());
        throw new IllegalArgumentException(a10.toString().toString());
    }

    public final v g() {
        i2.j n10 = this.f16328g.n();
        if (n10 != null) {
            return n10.f16294b;
        }
        return null;
    }

    public final int h() {
        ul.g<i2.j> gVar = this.f16328g;
        int i10 = 0;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            Iterator<i2.j> it = gVar.iterator();
            while (it.hasNext()) {
                if ((!(it.next().f16294b instanceof x)) && (i10 = i10 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i10;
    }

    public final x i() {
        x xVar = this.f16324c;
        if (xVar != null) {
            if (xVar != null) {
                return xVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final k.c j() {
        return this.f16334m == null ? k.c.CREATED : this.f16338q;
    }

    public final void k(i2.j jVar, i2.j jVar2) {
        this.f16330i.put(jVar, jVar2);
        if (this.f16331j.get(jVar2) == null) {
            this.f16331j.put(jVar2, new AtomicInteger(0));
        }
        Object obj = this.f16331j.get(jVar2);
        gm.l.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void l(int i10, Bundle bundle, b0 b0Var) {
        v vVar;
        int i11;
        boolean z10;
        int i12;
        if (this.f16328g.isEmpty()) {
            vVar = this.f16324c;
        } else {
            vVar = this.f16328g.last().f16294b;
        }
        if (vVar != null) {
            i2.e j10 = vVar.j(i10);
            Bundle bundle2 = null;
            if (j10 != null) {
                if (b0Var == null) {
                    b0Var = j10.f16275b;
                }
                i11 = j10.f16274a;
                Bundle bundle3 = j10.f16276c;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                }
            } else {
                i11 = i10;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i11 == 0 && b0Var != null && (i12 = b0Var.f16233c) != -1) {
                q(i12, b0Var.f16234d);
                return;
            }
            boolean z11 = true;
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                v d10 = d(i11);
                if (d10 == null) {
                    int i13 = v.f16402j;
                    String b10 = v.a.b(this.f16322a, i11);
                    if (j10 != null) {
                        z11 = false;
                    }
                    if (!z11) {
                        StringBuilder a10 = androidx.activity.result.d.a("Navigation destination ", b10, " referenced from action ");
                        a10.append(v.a.b(this.f16322a, i10));
                        a10.append(" cannot be found from the current destination ");
                        a10.append(vVar);
                        throw new IllegalArgumentException(a10.toString().toString());
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + b10 + " cannot be found from the current destination " + vVar);
                }
                m(d10, bundle2, b0Var);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("no current navigation node");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0103 A[LOOP:1: B:102:0x00fd->B:104:0x0103, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(i2.v r17, android.os.Bundle r18, i2.b0 r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.m(i2.v, android.os.Bundle, i2.b0):void");
    }

    public final void n(w wVar) {
        l(wVar.b(), wVar.a(), null);
    }

    public final void o() {
        Bundle bundle;
        int[] iArr;
        int i10;
        x xVar;
        int i11;
        boolean z10;
        Bundle bundle2;
        Intent intent;
        if (h() == 1) {
            Activity activity = this.f16323b;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            if (iArr != null) {
                if (this.f16327f) {
                    Activity activity2 = this.f16323b;
                    gm.l.c(activity2);
                    Intent intent2 = activity2.getIntent();
                    Bundle extras = intent2.getExtras();
                    gm.l.c(extras);
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    gm.l.c(intArray);
                    ArrayList arrayList = new ArrayList(intArray.length);
                    int i12 = 0;
                    for (int i13 : intArray) {
                        arrayList.add(Integer.valueOf(i13));
                    }
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    if (!arrayList.isEmpty()) {
                        int intValue = ((Number) arrayList.remove(h7.a.k(arrayList))).intValue();
                        if (parcelableArrayList != null) {
                            if (!parcelableArrayList.isEmpty()) {
                                Bundle bundle3 = (Bundle) parcelableArrayList.remove(h7.a.k(parcelableArrayList));
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            v e10 = e(i(), intValue);
                            if (e10 instanceof x) {
                                int i14 = x.f16417o;
                                intValue = x.a.a((x) e10).f16410h;
                            }
                            v g10 = g();
                            if (g10 != null && intValue == g10.f16410h) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                s sVar = new s(this);
                                Bundle e11 = tb.a.e(new tl.f("android-support-nav:controller:deepLinkIntent", intent2));
                                Bundle bundle4 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                                if (bundle4 != null) {
                                    e11.putAll(bundle4);
                                }
                                sVar.f16396b.putExtra("android-support-nav:controller:deepLinkExtras", e11);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i15 = i12 + 1;
                                    if (i12 >= 0) {
                                        int intValue2 = ((Number) next).intValue();
                                        if (parcelableArrayList != null) {
                                            bundle2 = (Bundle) parcelableArrayList.get(i12);
                                        } else {
                                            bundle2 = null;
                                        }
                                        sVar.f16398d.add(new s.a(intValue2, bundle2));
                                        if (sVar.f16397c != null) {
                                            sVar.c();
                                        }
                                        i12 = i15;
                                    } else {
                                        h7.a.z();
                                        throw null;
                                    }
                                }
                                sVar.a().f();
                                Activity activity3 = this.f16323b;
                                if (activity3 != null) {
                                    activity3.finish();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NoSuchElementException("List is empty.");
                }
                return;
            }
            v g11 = g();
            gm.l.c(g11);
            x xVar2 = g11;
            do {
                i10 = xVar2.f16410h;
                xVar = xVar2.f16404b;
                if (xVar != null) {
                    i11 = xVar.f16419l;
                    xVar2 = xVar;
                } else {
                    return;
                }
            } while (i11 == i10);
            Bundle bundle5 = new Bundle();
            Activity activity4 = this.f16323b;
            if (activity4 != null && activity4.getIntent() != null) {
                Activity activity5 = this.f16323b;
                gm.l.c(activity5);
                if (activity5.getIntent().getData() != null) {
                    Activity activity6 = this.f16323b;
                    gm.l.c(activity6);
                    bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", activity6.getIntent());
                    x xVar3 = this.f16324c;
                    gm.l.c(xVar3);
                    Activity activity7 = this.f16323b;
                    gm.l.c(activity7);
                    Intent intent3 = activity7.getIntent();
                    gm.l.e(intent3, "activity!!.intent");
                    v.b n10 = xVar3.n(new j4.j(intent3));
                    if (n10 != null) {
                        bundle5.putAll(n10.f16412a.f(n10.f16413b));
                    }
                }
            }
            s sVar2 = new s(this);
            int i16 = xVar.f16410h;
            sVar2.f16398d.clear();
            sVar2.f16398d.add(new s.a(i16, null));
            if (sVar2.f16397c != null) {
                sVar2.c();
            }
            sVar2.f16396b.putExtra("android-support-nav:controller:deepLinkExtras", bundle5);
            sVar2.a().f();
            Activity activity8 = this.f16323b;
            if (activity8 != null) {
                activity8.finish();
                return;
            }
            return;
        }
        p();
    }

    public final boolean p() {
        if (this.f16328g.isEmpty()) {
            return false;
        }
        v g10 = g();
        gm.l.c(g10);
        return q(g10.f16410h, true);
    }

    public final boolean q(int i10, boolean z10) {
        return r(i10, z10, false) && c();
    }

    public final boolean r(int i10, boolean z10, boolean z11) {
        v vVar;
        String str;
        String str2;
        String str3;
        if (this.f16328g.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ul.q.S(this.f16328g).iterator();
        while (true) {
            if (it.hasNext()) {
                v vVar2 = ((i2.j) it.next()).f16294b;
                h0 b10 = this.f16342u.b(vVar2.f16403a);
                if (z10 || vVar2.f16410h != i10) {
                    arrayList.add(b10);
                }
                if (vVar2.f16410h == i10) {
                    vVar = vVar2;
                    break;
                }
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar == null) {
            int i11 = v.f16402j;
            String b11 = v.a.b(this.f16322a, i10);
            Log.i("NavController", "Ignoring popBackStack to destination " + b11 + " as it was not found on the current back stack");
            return false;
        }
        gm.x xVar = new gm.x();
        ul.g gVar = new ul.g();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                gm.x xVar2 = new gm.x();
                this.f16345x = new f(xVar2, xVar, this, z11, gVar);
                ((h0) it2.next()).i(this.f16328g.last(), z11);
                str = null;
                this.f16345x = null;
                if (!xVar2.f15506a) {
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (z11) {
            if (!z10) {
                o.a aVar = new o.a(new nm.o(nm.j.H(vVar, g.f16361b), new h()));
                while (aVar.hasNext()) {
                    LinkedHashMap linkedHashMap = this.f16332k;
                    Integer valueOf = Integer.valueOf(((v) aVar.next()).f16410h);
                    if (gVar.isEmpty()) {
                        str2 = str;
                    } else {
                        str2 = gVar.f28873b[gVar.f28872a];
                    }
                    k kVar = (k) str2;
                    if (kVar != null) {
                        str3 = kVar.f16310a;
                    } else {
                        str3 = str;
                    }
                    linkedHashMap.put(valueOf, str3);
                }
            }
            if (!gVar.isEmpty()) {
                k kVar2 = (k) gVar.first();
                o.a aVar2 = new o.a(new nm.o(nm.j.H(d(kVar2.f16311b), i.f16363b), new j()));
                while (aVar2.hasNext()) {
                    this.f16332k.put(Integer.valueOf(((v) aVar2.next()).f16410h), kVar2.f16310a);
                }
                this.f16333l.put(kVar2.f16310a, gVar);
            }
        }
        A();
        return xVar.f15506a;
    }

    public final void s(i2.j jVar, boolean z10, ul.g<k> gVar) {
        boolean z11;
        q qVar;
        t0 t0Var;
        Set set;
        i2.j last = this.f16328g.last();
        if (gm.l.a(last, jVar)) {
            this.f16328g.removeLast();
            a aVar = (a) this.f16343v.get(this.f16342u.b(last.f16294b.f16403a));
            boolean z12 = false;
            if (aVar != null && (t0Var = aVar.f16319f) != null && (set = (Set) t0Var.getValue()) != null && set.contains(last)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (z11 || this.f16331j.containsKey(last)) ? true : true;
            k.c cVar = last.f16300h.f2790c;
            k.c cVar2 = k.c.CREATED;
            if (cVar.a(cVar2)) {
                if (z10) {
                    last.c(cVar2);
                    gVar.addFirst(new k(last));
                }
                if (!z12) {
                    last.c(k.c.DESTROYED);
                    y(last);
                } else {
                    last.c(cVar2);
                }
            }
            if (!z10 && !z12 && (qVar = this.f16336o) != null) {
                String str = last.f16298f;
                gm.l.f(str, "backStackEntryId");
                x0 x0Var = (x0) qVar.f16377d.remove(str);
                if (x0Var != null) {
                    x0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Attempted to pop ");
        a10.append(jVar.f16294b);
        a10.append(", which is not the top of the back stack (");
        a10.append(last.f16294b);
        a10.append(')');
        throw new IllegalStateException(a10.toString().toString());
    }

    public final ArrayList u() {
        boolean z10;
        boolean z11;
        k.c cVar = k.c.STARTED;
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f16343v.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) aVar.f16319f.getValue()) {
                i2.j jVar = (i2.j) obj;
                if (!arrayList.contains(jVar) && !jVar.f16304l.a(cVar)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList2.add(obj);
                }
            }
            ul.n.D(arrayList2, arrayList);
        }
        ul.g<i2.j> gVar = this.f16328g;
        ArrayList arrayList3 = new ArrayList();
        Iterator<i2.j> it = gVar.iterator();
        while (it.hasNext()) {
            i2.j next = it.next();
            i2.j jVar2 = next;
            if (!arrayList.contains(jVar2) && jVar2.f16304l.a(cVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList3.add(next);
            }
        }
        ul.n.D(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!(((i2.j) next2).f16294b instanceof x)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean v(int i10, Bundle bundle, b0 b0Var) {
        v i11;
        String str;
        i2.j jVar;
        v vVar;
        if (!this.f16332k.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str2 = (String) this.f16332k.get(Integer.valueOf(i10));
        Collection values = this.f16332k.values();
        gm.l.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (Boolean.valueOf(gm.l.a((String) it.next(), str2)).booleanValue()) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap = this.f16333l;
        if ((linkedHashMap instanceof hm.a) && !(linkedHashMap instanceof hm.d)) {
            gm.e0.d(linkedHashMap, "kotlin.collections.MutableMap");
            throw null;
        }
        ul.g gVar = (ul.g) linkedHashMap.remove(str2);
        ArrayList arrayList = new ArrayList();
        i2.j n10 = this.f16328g.n();
        if (n10 == null || (i11 = n10.f16294b) == null) {
            i11 = i();
        }
        if (gVar != null) {
            Iterator<E> it2 = gVar.iterator();
            while (it2.hasNext()) {
                k kVar = (k) it2.next();
                v e10 = e(i11, kVar.f16311b);
                if (e10 != null) {
                    arrayList.add(kVar.a(this.f16322a, e10, j(), this.f16336o));
                    i11 = e10;
                } else {
                    int i12 = v.f16402j;
                    throw new IllegalStateException(("Restore State failed: destination " + v.a.b(this.f16322a, kVar.f16311b) + " cannot be found from the current destination " + i11).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((i2.j) next).f16294b instanceof x)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            i2.j jVar2 = (i2.j) it4.next();
            List list = (List) ul.q.O(arrayList2);
            if (list != null && (jVar = (i2.j) ul.q.N(list)) != null && (vVar = jVar.f16294b) != null) {
                str = vVar.f16403a;
            } else {
                str = null;
            }
            if (gm.l.a(str, jVar2.f16294b.f16403a)) {
                list.add(jVar2);
            } else {
                arrayList2.add(h7.a.r(jVar2));
            }
        }
        gm.x xVar = new gm.x();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            h0 b10 = this.f16342u.b(((i2.j) ul.q.H(list2)).f16294b.f16403a);
            this.f16344w = new p(xVar, arrayList, new gm.z(), this, bundle);
            b10.d(list2, b0Var);
            this.f16344w = null;
        }
        return xVar.f15506a;
    }

    public final void w(int i10) {
        x(((a0) this.B.getValue()).b(i10), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x01c7, code lost:
        if (r6 != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0391, code lost:
        if (r1 == false) goto L220;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(i2.x r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.x(i2.x, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0101, code lost:
        if (r0.f16317d == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(i2.j r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.y(i2.j):void");
    }

    public final void z() {
        v vVar;
        Boolean bool;
        t0 t0Var;
        Set set;
        k.c cVar = k.c.RESUMED;
        k.c cVar2 = k.c.STARTED;
        ArrayList Z = ul.q.Z(this.f16328g);
        if (Z.isEmpty()) {
            return;
        }
        v vVar2 = ((i2.j) ul.q.N(Z)).f16294b;
        if (vVar2 instanceof i2.d) {
            for (i2.j jVar : ul.q.S(Z)) {
                vVar = jVar.f16294b;
                if (!(vVar instanceof x) && !(vVar instanceof i2.d)) {
                    break;
                }
            }
        }
        vVar = null;
        HashMap hashMap = new HashMap();
        for (i2.j jVar2 : ul.q.S(Z)) {
            k.c cVar3 = jVar2.f16304l;
            v vVar3 = jVar2.f16294b;
            if (vVar2 != null && vVar3.f16410h == vVar2.f16410h) {
                if (cVar3 != cVar) {
                    a aVar = (a) this.f16343v.get(this.f16342u.b(vVar3.f16403a));
                    if (aVar != null && (t0Var = aVar.f16319f) != null && (set = (Set) t0Var.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(jVar2));
                    } else {
                        bool = null;
                    }
                    if (!gm.l.a(bool, Boolean.TRUE)) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f16331j.get(jVar2);
                        boolean z10 = false;
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z10 = true;
                        }
                        if (!z10) {
                            hashMap.put(jVar2, cVar);
                        }
                    }
                    hashMap.put(jVar2, cVar2);
                }
                vVar2 = vVar2.f16404b;
            } else if (vVar != null && vVar3.f16410h == vVar.f16410h) {
                if (cVar3 == cVar) {
                    jVar2.c(cVar2);
                } else if (cVar3 != cVar2) {
                    hashMap.put(jVar2, cVar2);
                }
                vVar = vVar.f16404b;
            } else {
                jVar2.c(k.c.CREATED);
            }
        }
        Iterator it = Z.iterator();
        while (it.hasNext()) {
            i2.j jVar3 = (i2.j) it.next();
            k.c cVar4 = (k.c) hashMap.get(jVar3);
            if (cVar4 != null) {
                jVar3.c(cVar4);
            } else {
                jVar3.d();
            }
        }
    }
}
