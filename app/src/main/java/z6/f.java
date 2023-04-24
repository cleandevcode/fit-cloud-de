package z6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.location.Location;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import d9.k;
import gm.l;
import i8.p;
import java.util.ArrayList;
import java.util.List;
import s.h1;
import tl.i;
import z6.c;

/* loaded from: classes.dex */
public final class f extends a<b9.b> implements b9.d {

    /* renamed from: i */
    public final ArrayList f32001i;

    /* renamed from: j */
    public b9.a f32002j;

    /* renamed from: k */
    public boolean f32003k;

    /* renamed from: l */
    public LatLng f32004l;

    /* renamed from: m */
    public d9.e f32005m;

    /* renamed from: n */
    public final i f32006n;

    public f(c.a aVar, FrameLayout frameLayout) {
        super(aVar, frameLayout);
        this.f32001i = new ArrayList(125);
        this.f32006n = new i(e.f32000b);
    }

    @Override // b9.d
    public final void a(b9.a aVar) {
        this.f32002j = aVar;
        LatLng latLng = this.f32004l;
        w.d d10 = aVar.d();
        d10.getClass();
        try {
            ((c9.e) d10.f29489a).w0();
            if (!this.f32001i.isEmpty()) {
                d();
            } else if (!this.f32003k && latLng != null) {
                c(latLng.f6153a, latLng.f6154b);
            }
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }

    @Override // z6.a
    public final h b(Context context, y6.c cVar) {
        l.f(context, "context");
        if (cVar == null) {
            return new h(context);
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        LatLng latLng = new LatLng(cVar.f31164a, cVar.f31165b);
        cVar.getClass();
        googleMapOptions.f6133d = new CameraPosition(latLng, 0.0f, 0.0f, 0.0f);
        return new h(context, googleMapOptions);
    }

    public final void c(double d10, double d11) {
        LatLng latLng = new LatLng(d10, d11);
        b9.a aVar = this.f32002j;
        if (aVar != null) {
            d9.e eVar = this.f32005m;
            if (eVar != null) {
                try {
                    eVar.f12874a.t0(latLng);
                } catch (RemoteException e10) {
                    throw new k(e10);
                }
            } else {
                d9.f fVar = new d9.f();
                fVar.e(latLng);
                fVar.f12878d = h1.m(BitmapFactory.decodeResource(((b9.b) this.f31978d).getResources(), this.f31975a.f31988d));
                eVar = aVar.a(fVar);
            }
            this.f32005m = eVar;
            try {
                try {
                    CameraPosition cameraPosition = new CameraPosition(latLng, ((aVar.f4036a.n0() - aVar.f4036a.s()) / 4) * 3, 0.0f, 0.0f);
                    try {
                        c9.a aVar2 = p.b.f23722a;
                        p.g(aVar2, "CameraUpdateFactory is not initialized");
                        aVar.e(new x2.i(aVar2.b0(cameraPosition)));
                        this.f32003k = true;
                    } catch (RemoteException e11) {
                        throw new k(e11);
                    }
                } catch (RemoteException e12) {
                    throw new k(e12);
                }
            } catch (RemoteException e13) {
                throw new k(e13);
            }
        }
        this.f32004l = latLng;
    }

    public final void d() {
        ArrayList arrayList;
        List list;
        Resources resources;
        int i10;
        List list2;
        int i11;
        ArrayList arrayList2;
        float[] fArr;
        int i12;
        int i13;
        ArrayList arrayList3;
        b9.a aVar = this.f32002j;
        if (aVar != null && this.f31977c) {
            try {
                aVar.f4036a.clear();
                if (!this.f31980f) {
                    for (d9.h hVar : (List) this.f32006n.getValue()) {
                        try {
                            p.g(hVar, "PolygonOptions must not be null");
                            p.f(aVar.f4036a.O(hVar));
                        } catch (RemoteException e10) {
                            throw new k(e10);
                        }
                    }
                }
                if (this.f32001i.isEmpty()) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(10);
                d9.i iVar = null;
                if (this.f31981g) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                double d10 = 0.0d;
                boolean z10 = true;
                float[] fArr2 = new float[1];
                int size = this.f32001i.size();
                int i14 = 0;
                while (i14 < size) {
                    y6.f fVar = (y6.f) this.f32001i.get(i14);
                    if (!fVar.f31192e && iVar == null) {
                        fVar.f31192e = z10;
                    }
                    if (fVar.f31192e) {
                        iVar = new d9.i();
                        c.a aVar2 = this.f31975a;
                        iVar.f12903b = aVar2.f31987c;
                        iVar.f12904c = aVar2.f31986b;
                        arrayList4.add(iVar);
                        i11 = i14;
                        LatLng latLng = new LatLng(fVar.f31164a, fVar.f31165b);
                        p.g(iVar.f12902a, "point must not be null.");
                        iVar.f12902a.add(latLng);
                        arrayList2 = arrayList4;
                        fArr = fArr2;
                    } else {
                        i11 = i14;
                        l.c(iVar);
                        float[] fArr3 = fArr2;
                        LatLng latLng2 = new LatLng(fVar.f31164a, fVar.f31165b);
                        p.g(iVar.f12902a, "point must not be null.");
                        iVar.f12902a.add(latLng2);
                        if (arrayList != null) {
                            y6.f fVar2 = (y6.f) this.f32001i.get(i11 - 1);
                            arrayList2 = arrayList4;
                            ArrayList arrayList5 = arrayList;
                            i12 = size;
                            fArr = fArr3;
                            Location.distanceBetween(fVar.f31164a, fVar.f31165b, fVar2.f31164a, fVar2.f31165b, fArr);
                            d10 += fArr[0] / 1000;
                            if (this.f31979e) {
                                i13 = (int) d10;
                            } else {
                                i13 = (int) (0.6213712f * d10);
                            }
                            int i15 = i13;
                            if (i15 > 0) {
                                if (!arrayList5.isEmpty()) {
                                    arrayList3 = arrayList5;
                                    if (((y6.b) arrayList3.get(arrayList5.size() - 1)).f31166c == i15) {
                                    }
                                } else {
                                    arrayList3 = arrayList5;
                                }
                                arrayList3.add(new y6.b(fVar.f31164a, fVar.f31165b, i15));
                            } else {
                                arrayList3 = arrayList5;
                            }
                            i14 = i11 + 1;
                            fArr2 = fArr;
                            arrayList4 = arrayList2;
                            z10 = true;
                            ArrayList arrayList6 = arrayList3;
                            size = i12;
                            arrayList = arrayList6;
                        } else {
                            arrayList2 = arrayList4;
                            fArr = fArr3;
                        }
                    }
                    int i16 = size;
                    arrayList3 = arrayList;
                    i12 = i16;
                    i14 = i11 + 1;
                    fArr2 = fArr;
                    arrayList4 = arrayList2;
                    z10 = true;
                    ArrayList arrayList62 = arrayList3;
                    size = i12;
                    arrayList = arrayList62;
                }
                ArrayList arrayList7 = arrayList4;
                ArrayList<y6.b> arrayList8 = arrayList;
                int size2 = arrayList7.size();
                int i17 = 0;
                while (i17 < size2) {
                    ArrayList arrayList9 = arrayList7;
                    d9.i iVar2 = (d9.i) arrayList9.get(i17);
                    try {
                        p.g(iVar2, "PolylineOptions must not be null");
                        p.f(aVar.f4036a.M(iVar2));
                        if (i17 == 0) {
                            l.e(iVar2.f12902a, "op.points");
                            if (!list2.isEmpty()) {
                                d9.f fVar3 = new d9.f();
                                fVar3.e((LatLng) iVar2.f12902a.get(0));
                                fVar3.f12878d = h1.m(BitmapFactory.decodeResource(((b9.b) this.f31978d).getResources(), this.f31975a.f31989e));
                                aVar.a(fVar3);
                            }
                        }
                        if (i17 == arrayList9.size() - 1) {
                            l.e(iVar2.f12902a, "op.points");
                            if (!list.isEmpty()) {
                                List list3 = iVar2.f12902a;
                                LatLng latLng3 = (LatLng) list3.get(list3.size() - 1);
                                d9.f fVar4 = new d9.f();
                                fVar4.e(latLng3);
                                if (this.f31982h) {
                                    resources = ((b9.b) this.f31978d).getResources();
                                    i10 = this.f31975a.f31990f;
                                } else {
                                    resources = ((b9.b) this.f31978d).getResources();
                                    i10 = this.f31975a.f31988d;
                                }
                                fVar4.f12878d = h1.m(BitmapFactory.decodeResource(resources, i10));
                                aVar.a(fVar4);
                                if (this.f32003k) {
                                    continue;
                                } else {
                                    try {
                                        try {
                                            CameraPosition cameraPosition = new CameraPosition(latLng3, ((aVar.f4036a.n0() - aVar.f4036a.s()) / 4) * 3, 0.0f, 0.0f);
                                            try {
                                                c9.a aVar3 = p.b.f23722a;
                                                p.g(aVar3, "CameraUpdateFactory is not initialized");
                                                aVar.e(new x2.i(aVar3.b0(cameraPosition)));
                                                this.f32003k = true;
                                            } catch (RemoteException e11) {
                                                throw new k(e11);
                                            }
                                        } catch (RemoteException e12) {
                                            throw new k(e12);
                                        }
                                    } catch (RemoteException e13) {
                                        throw new k(e13);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i17++;
                        arrayList7 = arrayList9;
                    } catch (RemoteException e14) {
                        throw new k(e14);
                    }
                }
                if (arrayList8 != null && (!arrayList8.isEmpty())) {
                    for (y6.b bVar : arrayList8) {
                        d9.f fVar5 = new d9.f();
                        fVar5.e(new LatLng(bVar.f31164a, bVar.f31165b));
                        d dVar = (d) this.f31976b.getValue();
                        dVar.getClass();
                        int i18 = dVar.f31995a;
                        Bitmap createBitmap = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawColor(0);
                        dVar.f31998d.setColor(dVar.f31996b);
                        float f10 = dVar.f31995a / 2.0f;
                        canvas.drawCircle(f10, f10, f10, dVar.f31998d);
                        dVar.f31998d.setColor(dVar.f31997c);
                        String valueOf = String.valueOf(bVar.f31166c);
                        float measureText = dVar.f31998d.measureText(valueOf);
                        float f11 = dVar.f31995a;
                        canvas.drawText(valueOf, (f11 - measureText) / 2.0f, (dVar.f31999e / 2.0f) + (f11 / 2.0f), dVar.f31998d);
                        l.e(createBitmap, "bitmap");
                        fVar5.f12878d = h1.m(createBitmap);
                        aVar.a(fVar5);
                    }
                }
            } catch (RemoteException e15) {
                throw new k(e15);
            }
        }
    }
}
