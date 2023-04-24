package gh;

import com.xinyan.algorithm.MrAlgorithm;
import com.xinyan.algorithm.SummaryInfo;
import gm.l;
import java.util.ArrayList;
import p000do.a;
import pm.i;
import pm.j;

/* loaded from: classes2.dex */
public final class c implements MrAlgorithm.CallBack {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<Integer> f15350a;

    /* renamed from: b */
    public final /* synthetic */ d f15351b;

    /* renamed from: c */
    public final /* synthetic */ i<vf.d> f15352c;

    public c(ArrayList arrayList, d dVar, j jVar) {
        this.f15350a = arrayList;
        this.f15351b = dVar;
        this.f15352c = jVar;
    }

    @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
    public final void onECGData(int[] iArr) {
    }

    @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
    public final void onEvent(int i10, int i11, String str, boolean z10) {
        l.f(str, "typeId");
        a.b bVar = p000do.a.f13275a;
        bVar.t("EcgAlgorithmUseCase");
        bVar.p("onEvent:begin=%d , end=%d , typeId=%s , bBegin=%b", Integer.valueOf(i10), Integer.valueOf(i11), str, Boolean.valueOf(z10));
        try {
            int parseInt = Integer.parseInt(str);
            if (this.f15350a.contains(Integer.valueOf(parseInt))) {
                return;
            }
            this.f15350a.add(Integer.valueOf(parseInt));
        } catch (Exception e10) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("EcgAlgorithmUseCase");
            bVar2.q(e10);
        }
    }

    @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
    public final void onHR(int i10) {
    }

    @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
    public final void onSummaryInfo(SummaryInfo summaryInfo) {
        l.f(summaryInfo, "info");
        this.f15351b.getClass();
        this.f15352c.l(new vf.d((int) summaryInfo.hravg, this.f15350a));
    }
}
