package of;

import com.topstep.fitcloud.pro.MyApplication;

/* loaded from: classes2.dex */
public abstract class p extends h2.b implements lk.b {

    /* renamed from: a */
    public boolean f23208a = false;

    /* renamed from: b */
    public final dagger.hilt.android.internal.managers.d f23209b = new dagger.hilt.android.internal.managers.d(new a());

    /* loaded from: classes2.dex */
    public class a implements dagger.hilt.android.internal.managers.e {
        public a() {
            p.this = r1;
        }
    }

    @Override // lk.b
    public final Object h() {
        return this.f23209b.h();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f23208a) {
            this.f23208a = true;
            ((s) h()).c((MyApplication) this);
        }
        super.onCreate();
    }
}
