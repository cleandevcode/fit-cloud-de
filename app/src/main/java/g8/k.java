package g8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g8.h;

/* loaded from: classes.dex */
public final class k<R extends h> extends BasePendingResult<R> {

    /* renamed from: k */
    public final h f15032k;

    public k(Status status) {
        super(null);
        this.f15032k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R b(Status status) {
        return (R) this.f15032k;
    }
}
