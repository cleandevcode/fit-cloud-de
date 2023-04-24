package a0;

import a0.g;
import a0.h0;
import a0.u1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.ArrayMap;
import androidx.camera.core.m;
import androidx.camera.core.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a */
    public final List<e> f182a;

    /* renamed from: b */
    public final List<CameraDevice.StateCallback> f183b;

    /* renamed from: c */
    public final List<CameraCaptureSession.StateCallback> f184c;

    /* renamed from: d */
    public final List<j> f185d;

    /* renamed from: e */
    public final List<c> f186e;

    /* renamed from: f */
    public final h0 f187f;

    /* renamed from: g */
    public InputConfiguration f188g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final LinkedHashSet f189a = new LinkedHashSet();

        /* renamed from: b */
        public final h0.a f190b = new h0.a();

        /* renamed from: c */
        public final ArrayList f191c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f192d = new ArrayList();

        /* renamed from: e */
        public final ArrayList f193e = new ArrayList();

        /* renamed from: f */
        public final ArrayList f194f = new ArrayList();

        /* renamed from: g */
        public InputConfiguration f195g;
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public static b e(h2<?> h2Var) {
            d l10 = h2Var.l();
            if (l10 != null) {
                b bVar = new b();
                l10.a(h2Var, bVar);
                return bVar;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Implementation is missing option unpacker for ");
            a10.append(h2Var.n(h2Var.toString()));
            throw new IllegalStateException(a10.toString());
        }

        public final void a(j jVar) {
            this.f190b.b(jVar);
            if (this.f194f.contains(jVar)) {
                return;
            }
            this.f194f.add(jVar);
        }

        public final void b(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f192d.contains(stateCallback)) {
                return;
            }
            this.f192d.add(stateCallback);
        }

        public final void c(m0 m0Var) {
            this.f189a.add(e.a(m0Var).a());
            this.f190b.f89a.add(m0Var);
        }

        public final u1 d() {
            return new u1(new ArrayList(this.f189a), this.f191c, this.f192d, this.f194f, this.f193e, this.f190b.d(), this.f195g);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(h2<?> h2Var, b bVar);
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* loaded from: classes.dex */
        public static abstract class a {
        }

        public static g.a a(m0 m0Var) {
            g.a aVar = new g.a();
            if (m0Var != null) {
                aVar.f67a = m0Var;
                List<m0> emptyList = Collections.emptyList();
                if (emptyList != null) {
                    aVar.f68b = emptyList;
                    aVar.f69c = null;
                    aVar.f70d = -1;
                    return aVar;
                }
                throw new NullPointerException("Null sharedSurfaces");
            }
            throw new NullPointerException("Null surface");
        }

        public abstract String b();

        public abstract List<m0> c();

        public abstract m0 d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static final class f extends a {

        /* renamed from: k */
        public static final List<Integer> f196k = Arrays.asList(1, 5, 3);

        /* renamed from: h */
        public final h0.c f197h = new h0.c();

        /* renamed from: i */
        public boolean f198i = true;

        /* renamed from: j */
        public boolean f199j = false;

        public final void a(u1 u1Var) {
            Map<String, Object> map;
            h0 h0Var = u1Var.f187f;
            int i10 = h0Var.f84c;
            if (i10 != -1) {
                this.f199j = true;
                h0.a aVar = this.f190b;
                int i11 = aVar.f91c;
                List<Integer> list = f196k;
                if (list.indexOf(Integer.valueOf(i10)) < list.indexOf(Integer.valueOf(i11))) {
                    i10 = i11;
                }
                aVar.f91c = i10;
            }
            d2 d2Var = u1Var.f187f.f87f;
            Map<String, Object> map2 = this.f190b.f94f.f46a;
            if (map2 != null && (map = d2Var.f46a) != null) {
                map2.putAll(map);
            }
            this.f191c.addAll(u1Var.f183b);
            this.f192d.addAll(u1Var.f184c);
            this.f190b.a(u1Var.f187f.f85d);
            this.f194f.addAll(u1Var.f185d);
            this.f193e.addAll(u1Var.f186e);
            InputConfiguration inputConfiguration = u1Var.f188g;
            if (inputConfiguration != null) {
                this.f195g = inputConfiguration;
            }
            this.f189a.addAll(u1Var.f182a);
            this.f190b.f89a.addAll(h0Var.a());
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f189a) {
                arrayList.add(eVar.d());
                for (m0 m0Var : eVar.c()) {
                    arrayList.add(m0Var);
                }
            }
            if (!arrayList.containsAll(this.f190b.f89a)) {
                y.u0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f198i = false;
            }
            this.f190b.c(h0Var.f83b);
        }

        public final u1 b() {
            if (this.f198i) {
                ArrayList arrayList = new ArrayList(this.f189a);
                final h0.c cVar = this.f197h;
                if (cVar.f15738a) {
                    Collections.sort(arrayList, new Comparator() { // from class: h0.b
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int i10;
                            u1.e eVar = (u1.e) obj2;
                            c.this.getClass();
                            Class<?> cls = ((u1.e) obj).d().f133h;
                            int i11 = 0;
                            if (cls != MediaCodec.class && cls != u.class) {
                                if (cls == m.class) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                            } else {
                                i10 = 2;
                            }
                            Class<?> cls2 = eVar.d().f133h;
                            if (cls2 != MediaCodec.class && cls2 != u.class) {
                                if (cls2 != m.class) {
                                    i11 = 1;
                                }
                            } else {
                                i11 = 2;
                            }
                            return i10 - i11;
                        }
                    });
                }
                return new u1(arrayList, this.f191c, this.f192d, this.f194f, this.f193e, this.f190b.d(), this.f195g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
    }

    public u1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, h0 h0Var, InputConfiguration inputConfiguration) {
        this.f182a = arrayList;
        this.f183b = Collections.unmodifiableList(arrayList2);
        this.f184c = Collections.unmodifiableList(arrayList3);
        this.f185d = Collections.unmodifiableList(arrayList4);
        this.f186e = Collections.unmodifiableList(arrayList5);
        this.f187f = h0Var;
        this.f188g = inputConfiguration;
    }

    public static u1 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        ArrayList arrayList5 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        j1 B = j1.B();
        ArrayList arrayList6 = new ArrayList();
        k1 c10 = k1.c();
        ArrayList arrayList7 = new ArrayList(hashSet);
        n1 A = n1.A(B);
        d2 d2Var = d2.f45b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c10.b()) {
            arrayMap.put(str, c10.a(str));
        }
        return new u1(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, new h0(arrayList7, A, -1, arrayList6, false, new d2(arrayMap), null), null);
    }

    public final List<m0> b() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f182a) {
            arrayList.add(eVar.d());
            for (m0 m0Var : eVar.c()) {
                arrayList.add(m0Var);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
