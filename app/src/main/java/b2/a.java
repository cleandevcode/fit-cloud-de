package b2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import f3.w;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends w {

    /* renamed from: b */
    public final Map<String, sl.a<b<? extends ListenableWorker>>> f3993b;

    public a(Map<String, sl.a<b<? extends ListenableWorker>>> map) {
        this.f3993b = map;
    }

    @Override // f3.w
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        sl.a<b<? extends ListenableWorker>> aVar = this.f3993b.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.get().a(context, workerParameters);
    }
}
