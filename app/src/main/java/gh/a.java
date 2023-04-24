package gh;

import com.xinyan.algorithm.MrAlgorithm;
import java.util.TreeMap;
import p000do.a;
import sa.p;

/* loaded from: classes2.dex */
public final class a implements MrAlgorithm.Log, p {

    /* renamed from: a */
    public static final a f15343a = new a();

    @Override // sa.p
    public Object a() {
        return new TreeMap();
    }

    @Override // com.xinyan.algorithm.MrAlgorithm.Log
    public void println(String str) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("EcgAlgorithmUseCase");
        bVar.b(str, new Object[0]);
    }
}
