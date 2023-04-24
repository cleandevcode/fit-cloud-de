package jj;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import yk.a;

/* loaded from: classes2.dex */
public final class k1 implements g {

    /* renamed from: a */
    public final wi.a f17917a;

    /* renamed from: b */
    public final b f17918b;

    /* renamed from: c */
    public final Context f17919c;

    /* renamed from: d */
    public final BluetoothAdapter f17920d;

    /* renamed from: e */
    public final HashMap<String, String> f17921e;

    /* renamed from: f */
    public final al.j f17922f;

    /* renamed from: g */
    public final al.j f17923g;

    /* renamed from: h */
    public volatile byte[] f17924h;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<bj.b, List<? extends Integer>> {

        /* renamed from: b */
        public final /* synthetic */ nj.c f17925b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nj.c cVar) {
            super(1);
            this.f17925b = cVar;
        }

        @Override // fm.l
        public final List<? extends Integer> k(bj.b bVar) {
            boolean z10;
            bj.b bVar2 = bVar;
            byte[] bArr = bVar2.f4399c;
            if (bArr != null) {
                if (bArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    ArrayList arrayList = new ArrayList();
                    if (bArr.length > 2) {
                        int length = bArr.length;
                        for (int i10 = 1; i10 < length; i10++) {
                            arrayList.add(Integer.valueOf(bArr[i10] & 255));
                        }
                    }
                    if (this.f17925b.g(295)) {
                        arrayList.add(128);
                    }
                    return arrayList;
                }
            }
            throw new yi.f(bVar2);
        }
    }

    public k1(wi.k kVar, l lVar, Application application, BluetoothAdapter bluetoothAdapter) {
        gm.l.f(application, "context");
        this.f17917a = kVar;
        this.f17918b = lVar;
        this.f17919c = application;
        this.f17920d = bluetoothAdapter;
        this.f17921e = new HashMap<>(3);
        ql.d<wi.d> dVar = kVar.f29908p;
        gm.l.e(dVar, "stateSubject");
        ph.o oVar = new ph.o(8, new n1(this));
        a.h hVar = yk.a.f31790e;
        a.c cVar = yk.a.f31788c;
        this.f17922f = dVar.y(oVar, hVar, cVar);
        this.f17923g = new fl.t(h7.a.t(kVar), new wk.f() { // from class: jj.u0
            @Override // wk.f
            public final boolean test(Object obj) {
                boolean z10;
                if (((pj.a) obj).f24277a == 10001) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10).booleanValue();
            }
        }).y(new ph.q(5, new z0(this)), hVar, cVar);
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT < 31 || y0.a.a(this.f17919c, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final String b() {
        BluetoothDevice h10 = ((wi.k) this.f17917a).h();
        if (h10 == null) {
            return null;
        }
        String str = this.f17921e.get(h10.getAddress());
        if (str != null) {
            return str;
        }
        if (!((l) this.f17918b).f17930d.g(271)) {
            return null;
        }
        return h10.getAddress();
    }

    public final tk.p<List<Integer>> c() {
        nj.c cVar = ((l) this.f17918b).f17930d;
        if (cVar.e()) {
            return tk.p.e(ul.s.f28879a);
        }
        if (cVar.g(301)) {
            return new gl.p(h7.a.w(this.f17917a, new bj.b((byte) 2, (byte) -96, null), new bj.b((byte) 2, (byte) -95, null)), new wi.f(6, new a(cVar)));
        }
        ArrayList arrayList = new ArrayList();
        if (cVar.g(291)) {
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
        }
        if (cVar.g(292)) {
            arrayList.add(33);
            arrayList.add(34);
            arrayList.add(35);
            arrayList.add(36);
            arrayList.add(37);
            arrayList.add(38);
            arrayList.add(39);
            arrayList.add(40);
            arrayList.add(41);
            arrayList.add(42);
            arrayList.add(43);
        }
        if (cVar.g(297)) {
            arrayList.add(5);
            arrayList.add(6);
            arrayList.add(7);
            arrayList.add(8);
            arrayList.add(44);
            arrayList.add(45);
            arrayList.add(46);
        }
        if (cVar.g(295)) {
            arrayList.add(128);
        }
        return tk.p.e(arrayList);
    }

    public final gl.p d() {
        return new gl.p(h7.a.w(this.f17917a, new bj.b((byte) 2, (byte) 67, null), new bj.b((byte) 2, (byte) 68, null)), new wi.j(3, m1.f17946b));
    }

    public final fl.d0 e(int i10, int i11, int i12) {
        byte[] B = bi.r.B(i10);
        byte[] B2 = bi.r.B(i11);
        byte[] B3 = bi.r.B(i12);
        byte[] bArr = new byte[12];
        System.arraycopy(B, 0, bArr, 0, 4);
        System.arraycopy(B2, 0, bArr, 4, 4);
        System.arraycopy(B3, 0, bArr, 8, 4);
        return h7.a.s(this.f17917a, new bj.b((byte) 2, (byte) 6, bArr));
    }

    public final fl.d0 f(byte b10) {
        return h7.a.s(this.f17917a, new bj.b((byte) 2, (byte) 58, new byte[]{b10, 0, 0, 0}));
    }

    public final tk.a g(String str, long j10, rj.g gVar, ArrayList arrayList) {
        boolean z10;
        int i10;
        final bj.b bVar;
        gm.l.f(str, "city");
        if (!((l) this.f17918b).f17930d.e() && ((l) this.f17918b).f17930d.g(276)) {
            z10 = true;
        } else {
            z10 = false;
        }
        byte[] bArr = null;
        int i11 = 64;
        if (!z10) {
            if (!TextUtils.isEmpty(str)) {
                bArr = str.getBytes();
                int length = bArr.length;
                if (length <= 64) {
                    i11 = length;
                }
            } else {
                i11 = 0;
            }
            int i12 = i11 + 5;
            byte[] bArr2 = new byte[i12 + 6];
            bArr2[0] = (byte) gVar.f25781d;
            bArr2[1] = (byte) gVar.f25778a;
            bArr2[2] = (byte) gVar.f25779b;
            bArr2[3] = (byte) gVar.f25780c;
            bArr2[4] = (byte) i11;
            if (i11 > 0) {
                System.arraycopy(bArr, 0, bArr2, 5, i11);
            }
            byte[] B = bi.r.B(gVar.f25782e);
            int i13 = i12 + 1;
            bArr2[i12] = B[0];
            int i14 = i13 + 1;
            bArr2[i13] = B[1];
            int i15 = i14 + 1;
            bArr2[i14] = B[2];
            int i16 = i15 + 1;
            bArr2[i15] = B[3];
            bArr2[i16] = (byte) gVar.f25783f;
            bArr2[i16 + 1] = (byte) gVar.f25784g;
            bVar = new bj.b((byte) 2, (byte) 54, bArr2);
        } else {
            if (!TextUtils.isEmpty(str)) {
                bArr = str.getBytes();
                int length2 = bArr.length;
                if (length2 <= 64) {
                    i11 = length2;
                }
            } else {
                i11 = 0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            int i17 = i11 + 5;
            int i18 = i17 + 4;
            int i19 = i18 + 1;
            byte[] bArr3 = new byte[(i10 * 3) + i19 + 6];
            bArr3[0] = (byte) gVar.f25781d;
            bArr3[1] = (byte) gVar.f25778a;
            bArr3[2] = (byte) gVar.f25779b;
            bArr3[3] = (byte) gVar.f25780c;
            bArr3[4] = (byte) i11;
            if (i11 > 0) {
                System.arraycopy(bArr, 0, bArr3, 5, i11);
            }
            System.arraycopy(xj.a.c(j10), 0, bArr3, i17, 4);
            bArr3[i18] = (byte) i10;
            if (i10 > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rj.f fVar = (rj.f) it.next();
                    int i20 = i19 + 1;
                    bArr3[i19] = (byte) fVar.f25775a;
                    int i21 = i20 + 1;
                    bArr3[i20] = (byte) fVar.f25776b;
                    i19 = i21 + 1;
                    bArr3[i21] = (byte) fVar.f25777c;
                }
            }
            byte[] B2 = bi.r.B(gVar.f25782e);
            int i22 = i19 + 1;
            bArr3[i19] = B2[0];
            int i23 = i22 + 1;
            bArr3[i22] = B2[1];
            int i24 = i23 + 1;
            bArr3[i23] = B2[2];
            int i25 = i24 + 1;
            bArr3[i24] = B2[3];
            bArr3[i25] = (byte) gVar.f25783f;
            bArr3[i25 + 1] = (byte) gVar.f25784g;
            bVar = new bj.b((byte) 2, (byte) 54, bArr3);
        }
        if (Arrays.equals(bVar.f4399c, this.f17924h)) {
            bl.b bVar2 = bl.b.f4448a;
            gm.l.e(bVar2, "{\n            //天气数据没有改变…able.complete()\n        }");
            return bVar2;
        }
        return h7.a.s(this.f17917a, bVar).d(new wk.a() { // from class: jj.v0
            @Override // wk.a
            public final void run() {
                k1 k1Var = k1.this;
                bj.b bVar3 = bVar;
                gm.l.f(k1Var, "this$0");
                gm.l.f(bVar3, "$packet");
                k1Var.f17924h = bVar3.f4399c;
            }
        });
    }

    public final tk.a h(int i10) {
        nj.c cVar = ((l) this.f17918b).f17930d;
        if (!cVar.e() && !cVar.g(279)) {
            return h7.a.e();
        }
        return h7.a.s(this.f17917a, new bj.b((byte) 2, (byte) 103, new byte[]{(byte) i10})).d(new ph.m(2, this));
    }
}
