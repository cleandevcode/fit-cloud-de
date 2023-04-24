package androidx.work;

import android.net.Uri;
import f3.h;
import f3.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p3.p;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f3627a;

    /* renamed from: b */
    public b f3628b;

    /* renamed from: c */
    public HashSet f3629c;

    /* renamed from: d */
    public int f3630d;

    /* renamed from: e */
    public Executor f3631e;

    /* renamed from: f */
    public r3.a f3632f;

    /* renamed from: g */
    public w f3633g;

    /* renamed from: h */
    public h f3634h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public List<String> f3635a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f3636b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, b bVar, List list, int i10, ExecutorService executorService, r3.a aVar, w wVar, p pVar) {
        this.f3627a = uuid;
        this.f3628b = bVar;
        this.f3629c = new HashSet(list);
        this.f3630d = i10;
        this.f3631e = executorService;
        this.f3632f = aVar;
        this.f3633g = wVar;
        this.f3634h = pVar;
    }
}
