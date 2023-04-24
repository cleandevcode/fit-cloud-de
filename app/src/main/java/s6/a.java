package s6;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import d6.d0;
import d6.e;
import d6.h;
import d6.j;
import d6.l;
import d6.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o5.a;
import o5.n;
import o5.q0;
import o5.v;
import q6.d;
import r6.i;
import r6.j;
import r6.k;
import r6.m;
import ul.q;

/* loaded from: classes.dex */
public final class a extends l<r6.d<?, ?>, p6.a> {

    /* renamed from: h */
    public static final int f26616h = e.c.Share.a();

    /* renamed from: f */
    public boolean f26617f;

    /* renamed from: g */
    public final ArrayList f26618g;

    /* renamed from: s6.a$a */
    /* loaded from: classes.dex */
    public final class C0472a extends l<r6.d<?, ?>, p6.a>.a {

        /* renamed from: b */
        public final /* synthetic */ a f26619b;

        /* renamed from: s6.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0473a implements j.a {

            /* renamed from: a */
            public final /* synthetic */ d6.a f26620a;

            /* renamed from: b */
            public final /* synthetic */ r6.d<?, ?> f26621b;

            public C0473a(d6.a aVar, r6.d dVar) {
                this.f26620a = aVar;
                this.f26621b = dVar;
            }

            @Override // d6.j.a
            public final Bundle a() {
                return ab.b.c(this.f26620a.a(), this.f26621b, false);
            }

            @Override // d6.j.a
            public final Bundle b() {
                return q6.c.b(this.f26620a.a(), this.f26621b, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0472a(a aVar) {
            super(aVar);
            gm.l.f(aVar, "this$0");
            this.f26619b = aVar;
        }

        @Override // d6.l.a
        public final boolean a(r6.d dVar) {
            if (dVar instanceof r6.c) {
                int i10 = a.f26616h;
                if (b.a(dVar.getClass())) {
                    return true;
                }
            }
            return false;
        }

        @Override // d6.l.a
        public final d6.a b(r6.d dVar) {
            q6.d.b(dVar, q6.d.f24607b);
            d6.a a10 = this.f26619b.a();
            this.f26619b.getClass();
            int i10 = a.f26616h;
            h c10 = b.c(dVar.getClass());
            if (c10 == null) {
                return null;
            }
            j.c(a10, new C0473a(a10, dVar), c10);
            return a10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(Class cls) {
            h c10 = c(cls);
            return c10 != null && j.a(c10);
        }

        public static boolean b(Class cls) {
            if (!r6.f.class.isAssignableFrom(cls)) {
                if (r6.j.class.isAssignableFrom(cls)) {
                    Date date = o5.a.f22664l;
                    if (a.c.c()) {
                    }
                }
                return false;
            }
            return true;
        }

        public static h c(Class cls) {
            if (r6.f.class.isAssignableFrom(cls)) {
                return q6.e.SHARE_DIALOG;
            }
            if (r6.j.class.isAssignableFrom(cls)) {
                return q6.e.PHOTOS;
            }
            if (m.class.isAssignableFrom(cls)) {
                return q6.e.VIDEO;
            }
            if (r6.h.class.isAssignableFrom(cls)) {
                return q6.e.MULTIMEDIA;
            }
            if (r6.c.class.isAssignableFrom(cls)) {
                return q6.a.f24602b;
            }
            if (k.class.isAssignableFrom(cls)) {
                return q6.j.f24626b;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends l<r6.d<?, ?>, p6.a>.a {

        /* renamed from: b */
        public final /* synthetic */ a f26622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(aVar);
            gm.l.f(aVar, "this$0");
            this.f26622b = aVar;
        }

        @Override // d6.l.a
        public final boolean a(r6.d dVar) {
            return (dVar instanceof r6.f) || (dVar instanceof q6.f);
        }

        @Override // d6.l.a
        public final d6.a b(r6.d dVar) {
            Bundle bundle;
            String uri;
            a aVar = this.f26622b;
            Activity activity = aVar.f12703a;
            String str = null;
            if (activity == null) {
                activity = null;
            }
            a.f(aVar, activity, dVar, d.FEED);
            d6.a a10 = this.f26622b.a();
            if (dVar instanceof r6.f) {
                q6.d.b(dVar, q6.d.f24606a);
                r6.f fVar = (r6.f) dVar;
                bundle = new Bundle();
                m0 m0Var = m0.f12709a;
                Uri uri2 = fVar.f25353a;
                if (uri2 == null) {
                    uri = null;
                } else {
                    uri = uri2.toString();
                }
                m0.I(bundle, "link", uri);
                m0.I(bundle, "quote", fVar.f25367g);
                r6.e eVar = fVar.f25358f;
                if (eVar != null) {
                    str = eVar.f25365a;
                }
                m0.I(bundle, "hashtag", str);
            } else if (!(dVar instanceof q6.f)) {
                return null;
            } else {
                q6.f fVar2 = (q6.f) dVar;
                bundle = new Bundle();
                m0 m0Var2 = m0.f12709a;
                m0.I(bundle, "to", fVar2.f24615g);
                m0.I(bundle, "link", fVar2.f24616h);
                m0.I(bundle, "picture", fVar2.f24620l);
                m0.I(bundle, "source", fVar2.f24621m);
                m0.I(bundle, "name", fVar2.f24617i);
                m0.I(bundle, "caption", fVar2.f24618j);
                m0.I(bundle, "description", fVar2.f24619k);
            }
            j.e(a10, "feed", bundle);
            return a10;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            return (d[]) Arrays.copyOf(values(), 4);
        }
    }

    /* loaded from: classes.dex */
    public final class e extends l<r6.d<?, ?>, p6.a>.a {

        /* renamed from: b */
        public final /* synthetic */ a f26628b;

        /* renamed from: s6.a$e$a */
        /* loaded from: classes.dex */
        public static final class C0474a implements j.a {

            /* renamed from: a */
            public final /* synthetic */ d6.a f26629a;

            /* renamed from: b */
            public final /* synthetic */ r6.d<?, ?> f26630b;

            public C0474a(d6.a aVar, r6.d dVar) {
                this.f26629a = aVar;
                this.f26630b = dVar;
            }

            @Override // d6.j.a
            public final Bundle a() {
                return ab.b.c(this.f26629a.a(), this.f26630b, false);
            }

            @Override // d6.j.a
            public final Bundle b() {
                return q6.c.b(this.f26629a.a(), this.f26630b, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar) {
            super(aVar);
            gm.l.f(aVar, "this$0");
            this.f26628b = aVar;
        }

        @Override // d6.l.a
        public final boolean a(r6.d dVar) {
            if (!(dVar instanceof r6.c) && !(dVar instanceof k)) {
                int i10 = a.f26616h;
                if (b.a(dVar.getClass())) {
                    return true;
                }
            }
            return false;
        }

        @Override // d6.l.a
        public final d6.a b(r6.d dVar) {
            a aVar = this.f26628b;
            Activity activity = aVar.f12703a;
            if (activity == null) {
                activity = null;
            }
            a.f(aVar, activity, dVar, d.NATIVE);
            q6.d.b(dVar, q6.d.f24607b);
            d6.a a10 = this.f26628b.a();
            this.f26628b.getClass();
            h c10 = b.c(dVar.getClass());
            if (c10 == null) {
                return null;
            }
            j.c(a10, new C0474a(a10, dVar), c10);
            return a10;
        }
    }

    /* loaded from: classes.dex */
    public final class f extends l<r6.d<?, ?>, p6.a>.a {

        /* renamed from: b */
        public final /* synthetic */ a f26631b;

        /* renamed from: s6.a$f$a */
        /* loaded from: classes.dex */
        public static final class C0475a implements j.a {

            /* renamed from: a */
            public final /* synthetic */ d6.a f26632a;

            /* renamed from: b */
            public final /* synthetic */ r6.d<?, ?> f26633b;

            public C0475a(d6.a aVar, r6.d dVar) {
                this.f26632a = aVar;
                this.f26633b = dVar;
            }

            @Override // d6.j.a
            public final Bundle a() {
                return ab.b.c(this.f26632a.a(), this.f26633b, false);
            }

            @Override // d6.j.a
            public final Bundle b() {
                return q6.c.b(this.f26632a.a(), this.f26633b, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar) {
            super(aVar);
            gm.l.f(aVar, "this$0");
            this.f26631b = aVar;
        }

        @Override // d6.l.a
        public final boolean a(r6.d dVar) {
            if (dVar instanceof k) {
                int i10 = a.f26616h;
                if (b.a(dVar.getClass())) {
                    return true;
                }
            }
            return false;
        }

        @Override // d6.l.a
        public final d6.a b(r6.d dVar) {
            d.C0447d c0447d = q6.d.f24606a;
            q6.d.b(dVar, q6.d.f24608c);
            d6.a a10 = this.f26631b.a();
            this.f26631b.getClass();
            int i10 = a.f26616h;
            h c10 = b.c(dVar.getClass());
            if (c10 == null) {
                return null;
            }
            j.c(a10, new C0475a(a10, dVar), c10);
            return a10;
        }
    }

    /* loaded from: classes.dex */
    public final class g extends l<r6.d<?, ?>, p6.a>.a {

        /* renamed from: b */
        public final /* synthetic */ a f26634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(aVar);
            gm.l.f(aVar, "this$0");
            this.f26634b = aVar;
        }

        @Override // d6.l.a
        public final boolean a(r6.d dVar) {
            int i10 = a.f26616h;
            return b.b(dVar.getClass());
        }

        @Override // d6.l.a
        public final d6.a b(r6.d dVar) {
            List<String> unmodifiableList;
            String str;
            Bundle bundle;
            String str2;
            a aVar = this.f26634b;
            Activity activity = aVar.f12703a;
            String str3 = null;
            if (activity == null) {
                activity = null;
            }
            a.f(aVar, activity, dVar, d.WEB);
            d6.a a10 = this.f26634b.a();
            q6.d.b(dVar, q6.d.f24606a);
            boolean z10 = dVar instanceof r6.f;
            if (z10) {
                r6.f fVar = (r6.f) dVar;
                bundle = new Bundle();
                m0 m0Var = m0.f12709a;
                r6.e eVar = fVar.f25358f;
                if (eVar == null) {
                    str2 = null;
                } else {
                    str2 = eVar.f25365a;
                }
                m0.I(bundle, "hashtag", str2);
                m0.J(bundle, "href", fVar.f25353a);
                m0.I(bundle, "quote", fVar.f25367g);
            } else if (!(dVar instanceof r6.j)) {
                return null;
            } else {
                r6.j jVar = (r6.j) dVar;
                UUID a11 = a10.a();
                j.a aVar2 = new j.a();
                aVar2.f25359a = jVar.f25353a;
                List<String> list = jVar.f25354b;
                if (list == null) {
                    unmodifiableList = null;
                } else {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                aVar2.f25360b = unmodifiableList;
                aVar2.f25361c = jVar.f25355c;
                aVar2.f25362d = jVar.f25356d;
                aVar2.f25363e = jVar.f25357e;
                aVar2.f25364f = jVar.f25358f;
                List<i> list2 = jVar.f25384g;
                if (list2 != null) {
                    for (i iVar : list2) {
                        aVar2.a(iVar);
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size = jVar.f25384g.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        i iVar2 = jVar.f25384g.get(i10);
                        Bitmap bitmap = iVar2.f25375b;
                        if (bitmap != null) {
                            d0.a b10 = d0.b(a11, bitmap);
                            i.a a12 = new i.a().a(iVar2);
                            a12.f25381c = Uri.parse(b10.f12657d);
                            a12.f25380b = null;
                            iVar2 = new i(a12);
                            arrayList2.add(b10);
                        }
                        arrayList.add(iVar2);
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                aVar2.f25385g.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aVar2.a((i) it.next());
                }
                d0.a(arrayList2);
                r6.e eVar2 = aVar2.f25364f;
                List<i> Y = q.Y(aVar2.f25385g);
                Bundle bundle2 = new Bundle();
                m0 m0Var2 = m0.f12709a;
                if (eVar2 == null) {
                    str = null;
                } else {
                    str = eVar2.f25365a;
                }
                m0.I(bundle2, "hashtag", str);
                ArrayList arrayList3 = new ArrayList(ul.l.B(Y, 10));
                for (i iVar3 : Y) {
                    arrayList3.add(String.valueOf(iVar3.f25376c));
                }
                Object[] array = arrayList3.toArray(new String[0]);
                if (array != null) {
                    bundle2.putStringArray("media", (String[]) array);
                    bundle = bundle2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            d6.j.e(a10, (z10 || (dVar instanceof r6.j)) ? "share" : "share", bundle);
            return a10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            gm.l.f(r5, r0)
            int r0 = s6.a.f26616h
            r4.<init>(r5, r0)
            r5 = 1
            r4.f26617f = r5
            r1 = 5
            d6.l$a[] r1 = new d6.l.a[r1]
            s6.a$e r2 = new s6.a$e
            r2.<init>(r4)
            r3 = 0
            r1[r3] = r2
            s6.a$c r2 = new s6.a$c
            r2.<init>(r4)
            r1[r5] = r2
            s6.a$g r5 = new s6.a$g
            r5.<init>(r4)
            r2 = 2
            r1[r2] = r5
            s6.a$a r5 = new s6.a$a
            r5.<init>(r4)
            r2 = 3
            r1[r2] = r5
            s6.a$f r5 = new s6.a$f
            r5.<init>(r4)
            r2 = 4
            r1[r2] = r5
            java.util.ArrayList r5 = h7.a.f(r1)
            r4.f26618g = r5
            d6.e$b r5 = d6.e.f12661b
            q6.g r1 = new q6.g
            r1.<init>()
            r5.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.<init>(android.app.Activity):void");
    }

    public static final void f(a aVar, Activity activity, r6.d dVar, d dVar2) {
        String str;
        if (aVar.f26617f) {
            dVar2 = d.AUTOMATIC;
        }
        int ordinal = dVar2.ordinal();
        String str2 = "unknown";
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    str = "unknown";
                } else {
                    str = "web";
                }
            } else {
                str = "native";
            }
        } else {
            str = "automatic";
        }
        h c10 = b.c(dVar.getClass());
        if (c10 == q6.e.SHARE_DIALOG) {
            str2 = "status";
        } else if (c10 == q6.e.PHOTOS) {
            str2 = "photo";
        } else if (c10 == q6.e.VIDEO) {
            str2 = "video";
        }
        p5.m mVar = new p5.m(activity, v.b());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        if (q0.b()) {
            mVar.f("fb_share_dialog_show", bundle);
        }
    }

    public static boolean g(Class<? extends r6.d<?, ?>> cls) {
        return b.b(cls) || b.a(cls);
    }

    @Override // d6.l
    public final d6.a a() {
        return new d6.a(this.f12705c);
    }

    @Override // d6.l
    public final ArrayList b() {
        return this.f26618g;
    }

    @Override // d6.l
    public final void d(d6.e eVar, final n<p6.a> nVar) {
        gm.l.f(eVar, "callbackManager");
        gm.l.f(nVar, "callback");
        final int i10 = this.f12705c;
        eVar.f12663a.put(Integer.valueOf(i10), new e.a() { // from class: q6.h
            @Override // d6.e.a
            public final boolean a(Intent intent, int i11) {
                return ge.b.j(i10, intent, new i(nVar));
            }
        });
    }
}
