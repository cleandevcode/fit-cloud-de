package f3;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import f3.u;

/* loaded from: classes.dex */
public final class o extends u {

    /* loaded from: classes.dex */
    public static final class a extends u.a<a, o> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f14117c.f22628d = OverwritingInputMerger.class.getName();
        }

        @Override // f3.u.a
        public final o b() {
            if (this.f14115a && Build.VERSION.SDK_INT >= 23 && this.f14117c.f22634j.f14068c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new o(this);
        }

        @Override // f3.u.a
        public final a c() {
            return this;
        }
    }

    public o(a aVar) {
        super(aVar.f14116b, aVar.f14117c, aVar.f14118d);
    }
}
