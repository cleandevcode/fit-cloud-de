package b2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public interface b<T extends ListenableWorker> {
    T a(Context context, WorkerParameters workerParameters);
}
