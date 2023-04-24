package mg;

import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class y7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ StepRecordEntity f21723a;

    /* renamed from: b */
    public final /* synthetic */ s8 f21724b;

    public y7(s8 s8Var, StepRecordEntity stepRecordEntity) {
        this.f21724b = s8Var;
        this.f21723a = stepRecordEntity;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21724b.f21418a.c();
        try {
            this.f21724b.f21420c.e(this.f21723a);
            this.f21724b.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f21724b.f21418a.l();
        }
    }
}
