package z6;

import com.google.android.gms.maps.model.LatLng;
import gm.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends m implements fm.a<ArrayList<d9.h>> {

    /* renamed from: b */
    public static final e f32000b = new e();

    public e() {
        super(0);
    }

    @Override // fm.a
    public final ArrayList<d9.h> m() {
        ArrayList<d9.h> arrayList = new ArrayList<>(4);
        d9.h hVar = new d9.h();
        hVar.f12895e = -3355444;
        hVar.f12894d = 0;
        hVar.f12893c = 0.0f;
        hVar.e(new LatLng(0.0d, 0.0d));
        hVar.e(new LatLng(0.0d, -179.9d));
        hVar.e(new LatLng(89.9d, -179.9d));
        hVar.e(new LatLng(89.9d, 0.0d));
        arrayList.add(hVar);
        d9.h hVar2 = new d9.h();
        hVar2.f12895e = -3355444;
        hVar2.f12894d = 0;
        hVar2.f12893c = 0.0f;
        hVar2.e(new LatLng(0.0d, 0.0d));
        hVar2.e(new LatLng(0.0d, -179.9d));
        hVar2.e(new LatLng(-89.9d, -179.9d));
        hVar2.e(new LatLng(-89.9d, 0.0d));
        arrayList.add(hVar2);
        d9.h hVar3 = new d9.h();
        hVar3.f12895e = -3355444;
        hVar3.f12894d = 0;
        hVar3.f12893c = 0.0f;
        hVar3.e(new LatLng(0.0d, 0.0d));
        hVar3.e(new LatLng(0.0d, 179.9d));
        hVar3.e(new LatLng(89.9d, 179.9d));
        hVar3.e(new LatLng(89.9d, 0.0d));
        arrayList.add(hVar3);
        d9.h hVar4 = new d9.h();
        hVar4.f12895e = -3355444;
        hVar4.f12894d = 0;
        hVar4.f12893c = 0.0f;
        hVar4.e(new LatLng(0.0d, 0.0d));
        hVar4.e(new LatLng(0.0d, 179.9d));
        hVar4.e(new LatLng(-89.9d, 179.9d));
        hVar4.e(new LatLng(-89.9d, 0.0d));
        arrayList.add(hVar4);
        return arrayList;
    }
}
