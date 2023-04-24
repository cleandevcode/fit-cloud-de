package h8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g8.e;

/* loaded from: classes.dex */
public final class q implements e.a {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f16011a;

    /* renamed from: b */
    public final /* synthetic */ s f16012b;

    public q(s sVar, com.google.android.gms.common.api.internal.a aVar) {
        this.f16012b = sVar;
        this.f16011a = aVar;
    }

    @Override // g8.e.a
    public final void a(Status status) {
        this.f16012b.f16018a.remove(this.f16011a);
    }
}
