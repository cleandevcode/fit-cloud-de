package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends f {
    public e(b bVar) {
        super(bVar);
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        b bVar = this.f24319a;
        long m10 = bVar.f24299g.m(bVar.f24298f);
        if (m10 >= 0) {
            this.f24319a.f24295c = SystemClock.uptimeMillis() + m10;
            if (this.f24319a.isVisible() && this.f24319a.f24294b) {
                b bVar2 = this.f24319a;
                if (!bVar2.f24304l) {
                    bVar2.f24293a.remove(this);
                    b bVar3 = this.f24319a;
                    bVar3.f24308p = bVar3.f24293a.schedule(this, m10, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f24319a.f24300h.isEmpty() && this.f24319a.f24299g.a() == this.f24319a.f24299g.h() - 1) {
                b bVar4 = this.f24319a;
                yn.d dVar = bVar4.f24305m;
                int b10 = bVar4.f24299g.b();
                if (b10 != 0 && b10 >= bVar4.f24299g.f()) {
                    b10--;
                }
                dVar.sendEmptyMessageAtTime(b10, this.f24319a.f24295c);
            }
        } else {
            b bVar5 = this.f24319a;
            bVar5.f24295c = Long.MIN_VALUE;
            bVar5.f24294b = false;
        }
        if (this.f24319a.isVisible() && !this.f24319a.f24305m.hasMessages(-1)) {
            this.f24319a.f24305m.sendEmptyMessageAtTime(-1, 0L);
        }
    }
}
